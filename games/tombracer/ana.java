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
        return param1 / 8 >> 16;
    }

    public final void m(int param0) {
        int var2 = 0;
        if (((ana) this).field_k) {
          return;
        } else {
          L0: {
            super.m(82);
            var2 = -79 % ((28 - param0) / 49);
            if (!((ana) this).field_f) {
              ((ana) this).e(false);
              break L0;
            } else {
              if (((ana) this).b(true).o((byte) -82)) {
                this.a((byte) -115, ((ana) this).field_p);
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
            ((ana) this).field_p = 110;
        }
        return param0;
    }

    final int a(int param0, ep param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param0 == 25940) {
                break L1;
              } else {
                ((ana) this).field_q = 56;
                break L1;
              }
            }
            var4_int = param1.i(-1);
            stackOut_2_0 = ((ana) this).a(var4_int, var4_int, param2, param1.d(3), (byte) -36, param1.e(9648));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ana.BC(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            int discarded$0 = 0;
            this.b();
            param1.a(26492, true, 1);
            param1.a(param0, 35);
            param1.b((byte) 112, 8);
            param1.a(true, (byte) 109, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ana.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          if (param4 > 79) {
            break L0;
          } else {
            ((ana) this).field_r = null;
            break L0;
          }
        }
        if (2 == param3) {
          if (null != ((ana) this).field_r) {
            nm.a(((ana) this).field_r, (byte) 89);
            var7 = 0;
            var8 = param5 - (param0 / 2 - -((ana) this).field_g.d(3) + -(((ana) this).field_g.c(-15) / 2));
            var9 = -((ana) this).field_g.e(9648) + ((ana) this).field_g.a((byte) 55) / 2 + (param2 - param1 / 2);
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
                var18 = ((ana) this).field_r.field_m * var17 + var12;
                var19 = var12;
                L2: while (true) {
                  if (var14 < var19) {
                    var17++;
                    continue L1;
                  } else {
                    if (var18 >= 0) {
                      if (var18 < bea.field_l.length) {
                        if (((ana) this).field_q <= bea.field_l[var18]) {
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
                          var20 = jqa.a(var9 >> 16, 1, 8 * var17, var17 * 8 + 8, var11 >> 16, 0, 8 * var19, var10 >> 16, 8 + var19 * 8, var8 >> 16);
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
            ((ana) this).k(2);
        }
        return 3;
    }

    ana(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
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
        ((ana) this).field_q = 240;
        ((ana) this).field_n = 2621440;
        ((ana) this).field_p = 255;
        try {
          L0: {
            L1: {
              if (param0.field_E < 4) {
                break L1;
              } else {
                ((ana) this).field_n = param1.b((byte) 44, 10) << 16;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ana.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              param3.setLength(param0);
              if (param2 == -11) {
                break L1;
              } else {
                var7 = null;
                StringBuilder discarded$2 = ana.a(101, 'ﾘ', -14, (StringBuilder) null);
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (param0 <= var5) {
                stackOut_6_0 = (StringBuilder) param3;
                stackIn_7_0 = stackOut_6_0;
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
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ana.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    public static void d() {
        field_o = null;
    }

    final void a(boolean param0, kh param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              param1.a((byte) 59, ((ana) this).field_n >> 16, 10);
              if (!param0) {
                break L1;
              } else {
                var4 = null;
                ((ana) this).a(true, (kh) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ana.F(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param2.field_j != 1) {
                break L1;
              } else {
                var7_int = et.b(param0, param1, -48) / 2;
                this.a(param3, (byte) 90, param2.field_b, var7_int, param5);
                break L1;
              }
            }
            var7_int = -5 / ((param4 - 62) / 52);
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("ana.UB(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_3_0;
    }

    final void k(int param0) {
        int[] var2 = null;
        int var3_int = 0;
        hca var3 = null;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((ana) this).field_r == null) {
          return;
        } else {
          if (!((ana) this).field_f) {
            return;
          } else {
            L0: {
              var8 = ((ana) this).field_r.field_r;
              var7 = var8;
              var6 = var7;
              var2 = var6;
              if (param0 == 5418) {
                break L0;
              } else {
                var5 = null;
                ((ana) this).a(true, (kh) null);
                break L0;
              }
            }
            var3_int = -1 + var8.length;
            L1: while (true) {
              if (var3_int < 0) {
                L2: {
                  if (((ana) this).field_n > 0) {
                    var3 = ((ana) this).m((byte) 19);
                    this.a(var3.d(3), (byte) 86, 10, ((ana) this).field_n, var3.e(param0 ^ 12442));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  if (var8[var3_int] >= ((ana) this).field_p) {
                    break L3;
                  } else {
                    var6[var3_int] = var6[var3_int] + 8;
                    break L3;
                  }
                }
                if (var8[var3_int] > ((ana) this).field_p) {
                  var6[var3_int] = ((ana) this).field_p;
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_6_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param0 <= -85) {
                break L1;
              } else {
                var10 = null;
                int discarded$1 = ((ana) this).a(26, (up) null, (pc) null);
                break L1;
              }
            }
            L2: {
              var4_int = param2.field_d - ((ana) this).field_g.d(3) + ((ana) this).field_g.c(-67) / 2;
              var5 = param2.field_e - (((ana) this).field_g.d(3) + -(((ana) this).field_g.c(-63) / 2));
              var6 = param2.field_k + -((ana) this).field_g.e(9648) - -(((ana) this).field_g.a((byte) 55) / 2);
              var7 = param2.field_a + (-((ana) this).field_g.e(9648) - -(((ana) this).field_g.a((byte) 55) / 2));
              var8 = param1.field_b;
              if (var8 >= 10) {
                var8 = 9;
                break L2;
              } else {
                break L2;
              }
            }
            var9 = var8 * sl.field_e.length / 10;
            nm.a(((ana) this).field_r, (byte) 110);
            iha.a(var4_int / 8 >> 16, var6 / 8 >> 16, var5 / 8 >> 16, var7 / 8 >> 16, 2, var9, sl.field_e);
            pfa.a(1);
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ana.S(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final void e(boolean param0) {
        if (param0) {
            return;
        }
        this.a((byte) -125, 0);
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          var2 = ((ana) this).field_g.c(-21) >> 16;
          var3 = ((ana) this).field_g.a((byte) 55) >> 16;
          if (((ana) this).b(true).o((byte) -82)) {
            ((ana) this).field_p = 128;
            break L0;
          } else {
            ((ana) this).field_p = 255;
            break L0;
          }
        }
        L1: {
          ((ana) this).field_r = null;
          if (var2 < 32) {
            break L1;
          } else {
            L2: {
              if (var3 < 32) {
                break L2;
              } else {
                if (var2 >= 1024) {
                  break L2;
                } else {
                  if (var3 < 1024) {
                    L3: {
                      ((ana) this).field_r = new iu(var2 / 8, var3 / 8);
                      stackOut_8_0 = this;
                      stackOut_8_1 = -117;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (!((ana) this).field_f) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L3;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 255;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L3;
                      }
                    }
                    this.a((byte) stackIn_11_1, stackIn_11_2);
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
    }

    ana(la param0, boolean param1) {
        super(param0, param1);
        ((ana) this).field_q = 240;
        ((ana) this).field_n = 2621440;
        ((ana) this).field_p = 255;
    }

    private final void a(byte param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((ana) this).field_r)) {
            return;
        }
        if (((ana) this).b(true).o((byte) -82)) {
            param1 = param1 / 2;
        }
        int[] var6 = ((ana) this).field_r.field_r;
        int[] var3 = var6;
        int var4 = -1 + var6.length;
        if (param0 >= -93) {
            field_o = null;
        }
        while (var4 >= 0) {
            var3[var4] = param1;
            var4--;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = -106 % ((-24 - param1) / 60);
        if (null == ((ana) this).field_r) {
            return;
        }
    }

    static {
    }
}
