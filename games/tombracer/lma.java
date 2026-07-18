/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lma extends dg {
    private int field_A;
    private int field_v;
    private int field_y;
    private boolean field_z;
    private int field_q;
    private int field_m;
    private int field_w;
    private boolean field_s;
    private fla field_o;
    private boolean field_n;
    static jea field_r;
    private boolean field_p;
    private int field_u;
    private boolean field_t;
    private fh[][] field_x;

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lma.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int m(byte param0) {
        if (param0 > -63) {
            ((lma) this).field_q = 91;
        }
        if (this.k(10)) {
            return -1;
        }
        return 0;
    }

    private final int b(fh param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (-1 == ((lma) this).field_y) {
              L1: {
                if (-1 == param0.field_a) {
                  break L1;
                } else {
                  if (param0.field_a == 3) {
                    break L1;
                  } else {
                    if (param0.field_a == 4) {
                      break L1;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  }
                }
              }
              L2: {
                if (param1 == -94) {
                  break L2;
                } else {
                  var4 = null;
                  ((lma) this).a((byte) -105, 15, (uw) null);
                  break L2;
                }
              }
              stackOut_10_0 = ((lma) this).a(40).e(true).a(100, 0);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("lma.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    lma(int param0) {
        super(param0);
        ((lma) this).field_p = true;
    }

    final void d(int param0) {
        fsa var3 = null;
        int var4 = 0;
        Object var5 = null;
        w var6 = null;
        L0: {
          super.d(param0);
          if (param0 == -1) {
            break L0;
          } else {
            var5 = null;
            int discarded$35 = this.b((fh) null, (byte) 19);
            break L0;
          }
        }
        var6 = (w) (Object) ((lma) this).a(param0 + 58).field_G;
        if (var6 != null) {
          L1: {
            if (((lma) this).field_h instanceof fsa) {
              L2: {
                L3: {
                  var3 = (fsa) (Object) ((lma) this).field_h;
                  var4 = var3.d(param0 + 51, false) ? 1 : 0;
                  if (((lma) this).field_o != null) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      ((lma) this).field_o = var6.a(new fm(17, ((lma) this).b((byte) -105), ((lma) this).c((byte) 94), ((lma) this).e((byte) -114)), -58);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((lma) this).field_o == null) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    fla discarded$36 = var6.a(new fm(18, ((lma) this).b((byte) 101), ((lma) this).c((byte) 109), ((lma) this).e((byte) -89)), -58);
                    ((lma) this).field_o.a(14, var6);
                    ((lma) this).field_o = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (((lma) this).field_o != null) {
                ((lma) this).field_o.a(((lma) this).b((byte) -93), var6.field_c, -128, var6.field_h, ((lma) this).c((byte) 110));
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int f(byte param0) {
        if (this.k(10)) {
            return -1;
        }
        int var2 = 116 % ((param0 - 15) / 45);
        return 0;
    }

    final ka a(fh param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        ka stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_43_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 76) {
                break L1;
              } else {
                var6 = null;
                int discarded$1 = this.b((fh) null, (byte) -30);
                break L1;
              }
            }
            L2: {
              if (((lma) this).field_y == 0) {
                L3: {
                  var4 = param0.field_a;
                  if (var4 != 0) {
                    if (var4 == 1) {
                      var3_int = 4;
                      break L2;
                    } else {
                      if (2 != var4) {
                        if (var4 != 3) {
                          if (var4 != 4) {
                            if (5 != var4) {
                              if (var4 != 6) {
                                if (var4 != 7) {
                                  if (var4 == 8) {
                                    var3_int = 19;
                                    break L2;
                                  } else {
                                    if (var4 != 9) {
                                      if (var4 != 10) {
                                        if (11 == var4) {
                                          var3_int = 12;
                                          break L2;
                                        } else {
                                          if (var4 == 12) {
                                            var3_int = 13;
                                            break L2;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var3_int = 16;
                                        break L2;
                                      }
                                    } else {
                                      var3_int = 18;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var3_int = 17;
                                  break L2;
                                }
                              } else {
                                var3_int = 15;
                                break L2;
                              }
                            } else {
                              var3_int = 14;
                              break L2;
                            }
                          } else {
                            var3_int = 10;
                            break L2;
                          }
                        } else {
                          var3_int = 8;
                          break L2;
                        }
                      } else {
                        var3_int = 6;
                        break L2;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (75 > param0.field_d) {
                  var3_int = 0;
                  break L2;
                } else {
                  var3_int = 2;
                  break L2;
                }
              } else {
                var3_int = 8;
                break L2;
              }
            }
            stackOut_43_0 = ta.field_ub[param0.field_p + var3_int];
            stackIn_44_0 = stackOut_43_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var3;
            stackOut_45_1 = new StringBuilder().append("lma.R(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L4;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ')');
        }
        return stackIn_44_0;
    }

    final void a(uw param0, int param1) {
        try {
            super.a(param0, 115);
            if (param1 <= 82) {
                boolean discarded$0 = ((lma) this).o((byte) 33);
            }
            ((lma) this).field_x = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lma.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, fh param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
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
              if (param3.field_a == 0) {
                break L1;
              } else {
                if (1 == param3.field_a) {
                  break L1;
                } else {
                  if (param3.field_a == 2) {
                    break L1;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0;
                  }
                }
              }
            }
            stackOut_5_0 = (param0 / 2097152 + param1 / 2097152) % 2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("lma.P(").append(param0).append(',').append(param1).append(',').append(-1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((lma) this).field_x != null) {
                var4_int = 0;
                L2: while (true) {
                  if (((lma) this).field_q <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((lma) this).field_w) {
                        var4_int++;
                        continue L2;
                      } else {
                        param2.a((byte) 88, param1, (fo) (Object) ((lma) this).field_x[var4_int][var5]);
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 >= 50) {
                break L4;
              } else {
                var7 = null;
                ((lma) this).a(101, (la) null, (kh) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("lma.V(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                ((lma) this).field_m = -87;
                break L1;
              }
            }
            L2: {
              super.a(127, param1, param2);
              if (17 <= param1.field_E) {
                L3: {
                  ((lma) this).field_y = param2.b((byte) 44, 4);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (param2.b((byte) 44, 1) != 1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                ((lma) this).field_p = stackIn_7_1 != 0;
                break L2;
              } else {
                ((lma) this).field_p = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("lma.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        fh var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.h(109);
        if (((lma) this).field_x == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (~((lma) this).field_q >= ~var2) {
              L1: {
                if (param0 > 0) {
                  break L1;
                } else {
                  int discarded$2 = ((lma) this).m((byte) 122);
                  break L1;
                }
              }
              return;
            } else {
              var3 = 0;
              L2: while (true) {
                if (~((lma) this).field_w >= ~var3) {
                  var2++;
                  continue L0;
                } else {
                  L3: {
                    var4 = ((lma) this).field_x[var2][var3];
                    var5 = bl.field_c[var4.field_a];
                    var4.field_o = dfa.a(-var4.field_o + var5, 2048, -73);
                    var4.field_l = -var4.field_l;
                    var4.field_i = sw.a(var4.field_i, 6);
                    if (var4.field_a == 11) {
                      var4.field_a = 12;
                      break L3;
                    } else {
                      if (var4.field_a != 12) {
                        break L3;
                      } else {
                        var4.field_a = 11;
                        break L3;
                      }
                    }
                  }
                  var4.a(0);
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final boolean k(int param0) {
        if (((lma) this).field_h.b(true)) {
            return true;
        }
        if (!(!(((lma) this).field_h instanceof fsa))) {
            return true;
        }
        if (param0 != 10) {
            return true;
        }
        return false;
    }

    private final void j() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fh var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        la var38 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_244_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_243_0 = 0;
        var37 = TombRacer.field_G ? 1 : 0;
        var38 = ((lma) this).field_h.f((byte) 68);
        var3 = var38.m((byte) -86);
        var4 = var38.s(86);
        var5 = ((lma) this).field_h.c(-121);
        var6 = ((lma) this).field_h.a((byte) 55);
        ((lma) this).field_v = ((lma) this).field_h.d(3) - var5 / 2;
        ((lma) this).field_A = ((lma) this).field_v - -var5;
        ((lma) this).field_u = ((lma) this).field_h.e(9648) + -(var6 / 2);
        ((lma) this).field_m = var6 + ((lma) this).field_u;
        var7 = this.k(10) ? 1 : 0;
        var8 = ((lma) this).field_h.d(3);
        var9 = ((lma) this).field_h.e(9648);
        ((lma) this).field_w = (-((lma) this).field_u + ((lma) this).field_m) / 2097152;
        ((lma) this).field_q = (-((lma) this).field_v + ((lma) this).field_A) / 2097152;
        ((lma) this).field_x = new fh[((lma) this).field_q][((lma) this).field_w];
        var10 = 1048576 + ((lma) this).field_u;
        var11 = 0;
        L0: while (true) {
          if (~var11 <= ~((lma) this).field_w) {
            return;
          } else {
            var12 = 1048576 + ((lma) this).field_v;
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((lma) this).field_q) {
                var10 = var10 + 2097152;
                var11++;
                continue L0;
              } else {
                L2: {
                  var14 = new fh();
                  ((lma) this).field_x[var13][var11] = var14;
                  if (var13 <= 0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var15 = stackIn_7_0;
                  if (~var13 <= ~(-1 + ((lma) this).field_q)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var16 = stackIn_10_0;
                  if (var11 <= 0) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var17 = stackIn_13_0;
                  if (~var11 <= ~(-1 + ((lma) this).field_w)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var18 = stackIn_16_0;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      if (~var12 >= ~var3) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var16 = 1;
                  var15 = 1;
                  break L6;
                }
                L8: {
                  L9: {
                    if (var10 < 0) {
                      break L9;
                    } else {
                      if (var4 < var10) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var17 = 1;
                  var18 = 1;
                  break L8;
                }
                L10: {
                  var19 = var15;
                  var20 = var16;
                  var21 = var17;
                  var22 = var18;
                  var23 = za.a(1048576, (byte) 62, -1048576 + var3, var12);
                  var24 = za.a(1048576, (byte) 96, var4 - 1048576, var10);
                  if (var7 == 0) {
                    L11: {
                      if (!((lma) this).field_p) {
                        break L11;
                      } else {
                        L12: {
                          L13: {
                            if (var22 != 0) {
                              break L13;
                            } else {
                              if (~var10 >= ~(-2097152 + var4)) {
                                stackOut_31_0 = 0;
                                stackIn_32_0 = stackOut_31_0;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L12;
                        }
                        L14: {
                          L15: {
                            var22 = stackIn_32_0;
                            if (var19 != 0) {
                              break L15;
                            } else {
                              if (var12 >= 2097152) {
                                stackOut_36_0 = 0;
                                stackIn_37_0 = stackOut_36_0;
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          stackOut_35_0 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          break L14;
                        }
                        L16: {
                          L17: {
                            var19 = stackIn_37_0;
                            if (var21 != 0) {
                              break L17;
                            } else {
                              if (var10 >= 2097152) {
                                stackOut_41_0 = 0;
                                stackIn_42_0 = stackOut_41_0;
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L16;
                        }
                        L18: {
                          L19: {
                            var21 = stackIn_42_0;
                            if (var20 != 0) {
                              break L19;
                            } else {
                              if (~(var3 + -2097152) <= ~var12) {
                                stackOut_46_0 = 0;
                                stackIn_47_0 = stackOut_46_0;
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L18;
                        }
                        var20 = stackIn_47_0;
                        break L11;
                      }
                    }
                    L20: {
                      L21: {
                        if (var19 != 0) {
                          break L21;
                        } else {
                          if (!var38.a(var23 - 2097152, 2097152, var24, 2097152, true, 0, (byte) 102)) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      stackOut_51_0 = 1;
                      stackIn_53_0 = stackOut_51_0;
                      break L20;
                    }
                    L22: {
                      L23: {
                        var19 = stackIn_53_0;
                        if (var20 != 0) {
                          break L23;
                        } else {
                          if (!var38.a(2097152 + var23, 2097152, var24, 2097152, true, 0, (byte) -99)) {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      stackOut_56_0 = 1;
                      stackIn_58_0 = stackOut_56_0;
                      break L22;
                    }
                    L24: {
                      L25: {
                        var20 = stackIn_58_0;
                        if (var21 != 0) {
                          break L25;
                        } else {
                          if (!var38.a(var23, 2097152, var24 + -2097152, 2097152, true, 0, (byte) -103)) {
                            stackOut_62_0 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L24;
                    }
                    L26: {
                      L27: {
                        var21 = stackIn_63_0;
                        if (var22 != 0) {
                          break L27;
                        } else {
                          if (!var38.a(var23, 2097152, var24 - -2097152, 2097152, true, 0, (byte) 72)) {
                            stackOut_67_0 = 0;
                            stackIn_68_0 = stackOut_67_0;
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      stackOut_66_0 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      break L26;
                    }
                    var22 = stackIn_68_0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L28: {
                  if (((lma) this).field_z) {
                    var19 = 1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (((lma) this).field_n) {
                    var22 = 1;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (((lma) this).field_t) {
                    var20 = 1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (!((lma) this).field_s) {
                    break L31;
                  } else {
                    var21 = 1;
                    break L31;
                  }
                }
                L32: {
                  var25 = 0;
                  if (var19 != 0) {
                    var25++;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (var20 == 0) {
                    break L33;
                  } else {
                    var25++;
                    break L33;
                  }
                }
                L34: {
                  if (var21 == 0) {
                    break L34;
                  } else {
                    var25++;
                    break L34;
                  }
                }
                L35: {
                  if (var22 != 0) {
                    var25++;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  var26 = 0;
                  var27 = 0;
                  if (var25 == 4) {
                    L37: {
                      L38: {
                        L39: {
                          if (var15 == 0) {
                            break L39;
                          } else {
                            if (var17 != 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        if (var12 < 2097152) {
                          break L38;
                        } else {
                          if (var10 < 2097152) {
                            break L38;
                          } else {
                            if (!var38.a(var12 + -2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 72)) {
                              stackOut_140_0 = 0;
                              stackIn_141_0 = stackOut_140_0;
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      stackOut_139_0 = 1;
                      stackIn_141_0 = stackOut_139_0;
                      break L37;
                    }
                    L40: {
                      L41: {
                        L42: {
                          var28 = stackIn_141_0;
                          if (var16 == 0) {
                            break L42;
                          } else {
                            if (var17 != 0) {
                              break L41;
                            } else {
                              break L42;
                            }
                          }
                        }
                        if (~var12 < ~(var3 - 2097152)) {
                          break L41;
                        } else {
                          if (var10 < 2097152) {
                            break L41;
                          } else {
                            if (!var38.a(var12 + 2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 103)) {
                              stackOut_149_0 = 0;
                              stackIn_150_0 = stackOut_149_0;
                              break L40;
                            } else {
                              break L41;
                            }
                          }
                        }
                      }
                      stackOut_148_0 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      break L40;
                    }
                    L43: {
                      L44: {
                        L45: {
                          var29 = stackIn_150_0;
                          if (var15 == 0) {
                            break L45;
                          } else {
                            if (var18 != 0) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (var12 < 2097152) {
                          break L44;
                        } else {
                          if (~(-2097152 + var4) > ~var10) {
                            break L44;
                          } else {
                            if (!var38.a(-2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) -55)) {
                              stackOut_158_0 = 0;
                              stackIn_159_0 = stackOut_158_0;
                              break L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      stackOut_157_0 = 1;
                      stackIn_159_0 = stackOut_157_0;
                      break L43;
                    }
                    L46: {
                      L47: {
                        L48: {
                          var30 = stackIn_159_0;
                          if (var16 == 0) {
                            break L48;
                          } else {
                            if (var18 != 0) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        if (-2097152 + var3 < var12) {
                          break L47;
                        } else {
                          if (~var10 < ~(-2097152 + var4)) {
                            break L47;
                          } else {
                            if (!var38.a(2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) 55)) {
                              stackOut_167_0 = 0;
                              stackIn_168_0 = stackOut_167_0;
                              break L46;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                      stackOut_166_0 = 1;
                      stackIn_168_0 = stackOut_166_0;
                      break L46;
                    }
                    L49: {
                      var31 = stackIn_168_0;
                      if (var28 == 0) {
                        break L49;
                      } else {
                        if (var29 == 0) {
                          break L49;
                        } else {
                          if (var30 == 0) {
                            break L49;
                          } else {
                            if (var31 == 0) {
                              break L49;
                            } else {
                              var14.field_a = 5;
                              break L36;
                            }
                          }
                        }
                      }
                    }
                    L50: {
                      if (var28 != 0) {
                        if (var30 != 0) {
                          if (var29 != 0) {
                            var26 = 1024;
                            break L50;
                          } else {
                            var26 = 512;
                            break L50;
                          }
                        } else {
                          var26 = -512;
                          break L50;
                        }
                      } else {
                        var26 = 0;
                        break L50;
                      }
                    }
                    var14.field_a = 6;
                    break L36;
                  } else {
                    if (3 == var25) {
                      L51: {
                        if (var21 != 0) {
                          if (var22 != 0) {
                            if (var20 == 0) {
                              var26 = 512;
                              var27 = 2;
                              break L51;
                            } else {
                              var27 = 6;
                              var26 = -512;
                              break L51;
                            }
                          } else {
                            var26 = 1024;
                            var27 = 4;
                            break L51;
                          }
                        } else {
                          var26 = 0;
                          var27 = 0;
                          break L51;
                        }
                      }
                      var14.field_a = 0;
                      break L36;
                    } else {
                      if (var25 != 2) {
                        if (var25 == 1) {
                          L52: {
                            if (var21 == 0) {
                              if (var22 == 0) {
                                if (var20 == 0) {
                                  var27 = 2;
                                  var26 = 0;
                                  break L52;
                                } else {
                                  var26 = 1024;
                                  var27 = 6;
                                  break L52;
                                }
                              } else {
                                var27 = 0;
                                var26 = -512;
                                break L52;
                              }
                            } else {
                              var27 = 4;
                              var26 = 512;
                              break L52;
                            }
                          }
                          var14.field_a = 2;
                          break L36;
                        } else {
                          var14.field_a = 3;
                          break L36;
                        }
                      } else {
                        L53: {
                          if (var21 != 0) {
                            break L53;
                          } else {
                            if (var22 == 0) {
                              var27 = 0;
                              var14.field_a = 1;
                              var26 = 0;
                              break L36;
                            } else {
                              break L53;
                            }
                          }
                        }
                        L54: {
                          if (var19 != 0) {
                            break L54;
                          } else {
                            if (var20 != 0) {
                              break L54;
                            } else {
                              var14.field_a = 1;
                              var26 = -512;
                              var27 = 2;
                              break L36;
                            }
                          }
                        }
                        L55: {
                          L56: {
                            if (var19 != 0) {
                              break L56;
                            } else {
                              if (var21 == 0) {
                                var27 = 7;
                                var26 = -512;
                                break L55;
                              } else {
                                break L56;
                              }
                            }
                          }
                          L57: {
                            if (var19 != 0) {
                              break L57;
                            } else {
                              if (var22 != 0) {
                                break L57;
                              } else {
                                var26 = 1024;
                                var27 = 5;
                                break L55;
                              }
                            }
                          }
                          L58: {
                            if (var20 != 0) {
                              break L58;
                            } else {
                              if (var21 != 0) {
                                break L58;
                              } else {
                                var27 = 1;
                                var26 = 0;
                                break L55;
                              }
                            }
                          }
                          if (var20 != 0) {
                            break L55;
                          } else {
                            if (var22 != 0) {
                              break L55;
                            } else {
                              var27 = 3;
                              var26 = 512;
                              break L55;
                            }
                          }
                        }
                        var14.field_a = 4;
                        break L36;
                      }
                    }
                  }
                }
                L59: {
                  if (!var38.a(-2097152 + var23, 2097152, var24, 2097152, false, 2, (byte) 98)) {
                    stackOut_183_0 = 0;
                    stackIn_184_0 = stackOut_183_0;
                    break L59;
                  } else {
                    stackOut_182_0 = 1;
                    stackIn_184_0 = stackOut_182_0;
                    break L59;
                  }
                }
                L60: {
                  var28 = stackIn_184_0;
                  if (!var38.a(var23 + 2097152, 2097152, var24, 2097152, false, 2, (byte) -108)) {
                    stackOut_186_0 = 0;
                    stackIn_187_0 = stackOut_186_0;
                    break L60;
                  } else {
                    stackOut_185_0 = 1;
                    stackIn_187_0 = stackOut_185_0;
                    break L60;
                  }
                }
                L61: {
                  var29 = stackIn_187_0;
                  if (!var38.a(var23, 2097152, var24 + -2097152, 2097152, false, 2, (byte) 118)) {
                    stackOut_189_0 = 0;
                    stackIn_190_0 = stackOut_189_0;
                    break L61;
                  } else {
                    stackOut_188_0 = 1;
                    stackIn_190_0 = stackOut_188_0;
                    break L61;
                  }
                }
                L62: {
                  var30 = stackIn_190_0;
                  if (!var38.a(var23, 2097152, 2097152 + var24, 2097152, false, 2, (byte) 116)) {
                    stackOut_192_0 = 0;
                    stackIn_193_0 = stackOut_192_0;
                    break L62;
                  } else {
                    stackOut_191_0 = 1;
                    stackIn_193_0 = stackOut_191_0;
                    break L62;
                  }
                }
                L63: {
                  L64: {
                    var31 = stackIn_193_0;
                    if (var28 != 0) {
                      break L64;
                    } else {
                      if (var29 != 0) {
                        break L64;
                      } else {
                        if (var30 != 0) {
                          break L64;
                        } else {
                          if (var31 == 0) {
                            stackOut_199_0 = 0;
                            stackIn_200_0 = stackOut_199_0;
                            break L63;
                          } else {
                            break L64;
                          }
                        }
                      }
                    }
                  }
                  stackOut_198_0 = 1;
                  stackIn_200_0 = stackOut_198_0;
                  break L63;
                }
                L65: {
                  var32 = stackIn_200_0;
                  if (var32 == 0) {
                    break L65;
                  } else {
                    if (4 == var14.field_a) {
                      L66: {
                        if (var28 != 0) {
                          if (var27 != 7) {
                            if (5 != var27) {
                              break L66;
                            } else {
                              var14.field_a = 12;
                              var26 = 1024;
                              break L66;
                            }
                          } else {
                            var26 = 0;
                            var14.field_a = 11;
                            break L66;
                          }
                        } else {
                          break L66;
                        }
                      }
                      if (var29 == 0) {
                        break L65;
                      } else {
                        if (var27 != 1) {
                          if (3 != var27) {
                            break L65;
                          } else {
                            var26 = 1024;
                            var14.field_a = 11;
                            break L65;
                          }
                        } else {
                          var26 = 0;
                          var14.field_a = 12;
                          break L65;
                        }
                      }
                    } else {
                      break L65;
                    }
                  }
                }
                L67: {
                  var14.field_o = dfa.a(var26 + bl.field_c[var14.field_a], 2048, 120);
                  var14.field_i = var27;
                  var14.field_f = var10 + -var9;
                  var14.field_l = var12 + -var8;
                  var14.field_g = (lma) this;
                  if (((lma) this).field_y != 0) {
                    break L67;
                  } else {
                    var14.field_p = this.a(var10, var12, -1, var14);
                    var14.field_d = this.b(var14, (byte) -94);
                    break L67;
                  }
                }
                L68: {
                  L69: {
                    if (var7 != 0) {
                      break L69;
                    } else {
                      L70: {
                        if (var21 == 0) {
                          break L70;
                        } else {
                          if (var19 != 0) {
                            break L69;
                          } else {
                            break L70;
                          }
                        }
                      }
                      if (!var38.a(var23 - 2097152, 2097152, var24 + -2097152, 2097152, true, 0, (byte) 98)) {
                        break L69;
                      } else {
                        stackOut_221_0 = 1;
                        stackIn_223_0 = stackOut_221_0;
                        break L68;
                      }
                    }
                  }
                  stackOut_222_0 = 0;
                  stackIn_223_0 = stackOut_222_0;
                  break L68;
                }
                L71: {
                  L72: {
                    var33 = stackIn_223_0;
                    if (var7 != 0) {
                      break L72;
                    } else {
                      L73: {
                        if (var21 == 0) {
                          break L73;
                        } else {
                          if (var20 != 0) {
                            break L72;
                          } else {
                            break L73;
                          }
                        }
                      }
                      if (!var38.a(2097152 + var23, 2097152, -2097152 + var24, 2097152, true, 0, (byte) 79)) {
                        break L72;
                      } else {
                        stackOut_228_0 = 1;
                        stackIn_230_0 = stackOut_228_0;
                        break L71;
                      }
                    }
                  }
                  stackOut_229_0 = 0;
                  stackIn_230_0 = stackOut_229_0;
                  break L71;
                }
                L74: {
                  L75: {
                    var34 = stackIn_230_0;
                    if (var7 != 0) {
                      break L75;
                    } else {
                      L76: {
                        if (var22 == 0) {
                          break L76;
                        } else {
                          if (var19 != 0) {
                            break L75;
                          } else {
                            break L76;
                          }
                        }
                      }
                      if (!var38.a(var23 - 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) -88)) {
                        break L75;
                      } else {
                        stackOut_235_0 = 1;
                        stackIn_237_0 = stackOut_235_0;
                        break L74;
                      }
                    }
                  }
                  stackOut_236_0 = 0;
                  stackIn_237_0 = stackOut_236_0;
                  break L74;
                }
                L77: {
                  L78: {
                    var35 = stackIn_237_0;
                    if (var7 != 0) {
                      break L78;
                    } else {
                      L79: {
                        if (var22 == 0) {
                          break L79;
                        } else {
                          if (var20 != 0) {
                            break L78;
                          } else {
                            break L79;
                          }
                        }
                      }
                      if (!var38.a(var23 + 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) 117)) {
                        break L78;
                      } else {
                        stackOut_242_0 = 1;
                        stackIn_244_0 = stackOut_242_0;
                        break L77;
                      }
                    }
                  }
                  stackOut_243_0 = 0;
                  stackIn_244_0 = stackOut_243_0;
                  break L77;
                }
                var36 = stackIn_244_0;
                var12 = var12 + 2097152;
                var14.a(var33 != 0, (byte) 24, var34 != 0, var36 != 0, var35 != 0);
                var13++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 40) {
                break L1;
              } else {
                this.l(-14);
                break L1;
              }
            }
            L2: {
              if (null == ((lma) this).field_x) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((lma) this).field_q) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((lma) this).field_w) {
                        var4_int++;
                        continue L3;
                      } else {
                        param1.a(param0, (fo) (Object) ((lma) this).field_x[var4_int][var5], (byte) -33);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("lma.FA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 86, param1);
            int var3_int = -57 / ((param0 - -8) / 40);
            param1.a((byte) -19, ((lma) this).field_y, 4);
            param1.a((byte) 111, !((lma) this).field_p ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, uw param1) {
        try {
            if (null == ((lma) this).field_x) {
                int discarded$0 = 2097152;
                this.j();
                if (hb.d(67)) {
                    this.l(32166);
                }
            }
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lma.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fh var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean[][] var23 = null;
        boolean[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        boolean[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        boolean[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        boolean[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        boolean[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        boolean[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        boolean[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        boolean[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        boolean[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          if (param0 == 32166) {
            break L0;
          } else {
            this.l(-80);
            break L0;
          }
        }
        var2 = this.k(param0 ^ 32172) ? 1 : 0;
        var3 = ((lma) this).a(param0 + -32121);
        var4 = 4194304;
        var5 = ((lma) this).field_h.d(3);
        var6 = ((lma) this).field_h.e(9648);
        var10 = 0;
        L1: while (true) {
          if (var10 >= ((lma) this).field_q) {
            return;
          } else {
            var11 = 0;
            L2: while (true) {
              if (((lma) this).field_w <= var11) {
                var10++;
                continue L1;
              } else {
                L3: {
                  var12 = ((lma) this).field_x[var10][var11];
                  if (var12.field_a != 5) {
                    break L3;
                  } else {
                    L4: {
                      var8 = var12.field_f + var6;
                      var7 = var5 - -var12.field_l;
                      var9 = 0;
                      var23 = new boolean[5][5];
                      var14 = 0;
                      if (var2 != 0) {
                        var15 = 0;
                        L5: while (true) {
                          if (var15 >= 5) {
                            break L4;
                          } else {
                            var16 = 0;
                            L6: while (true) {
                              if (5 <= var16) {
                                var15++;
                                continue L5;
                              } else {
                                L7: {
                                  L8: {
                                    if (var15 == 0) {
                                      break L8;
                                    } else {
                                      if (var16 == 0) {
                                        break L8;
                                      } else {
                                        if (var15 == 4) {
                                          break L8;
                                        } else {
                                          if (var16 != 4) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    L10: {
                                      var17 = var10 + (var15 - 2);
                                      var18 = var11 + (var16 + -2);
                                      stackOut_33_0 = var23[var15];
                                      stackOut_33_1 = var16;
                                      stackIn_38_0 = stackOut_33_0;
                                      stackIn_38_1 = stackOut_33_1;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      if (var17 < 0) {
                                        break L10;
                                      } else {
                                        stackOut_34_0 = (boolean[]) (Object) stackIn_34_0;
                                        stackOut_34_1 = stackIn_34_1;
                                        stackIn_38_0 = stackOut_34_0;
                                        stackIn_38_1 = stackOut_34_1;
                                        stackIn_35_0 = stackOut_34_0;
                                        stackIn_35_1 = stackOut_34_1;
                                        if (0 > var18) {
                                          break L10;
                                        } else {
                                          stackOut_35_0 = (boolean[]) (Object) stackIn_35_0;
                                          stackOut_35_1 = stackIn_35_1;
                                          stackIn_38_0 = stackOut_35_0;
                                          stackIn_38_1 = stackOut_35_1;
                                          stackIn_36_0 = stackOut_35_0;
                                          stackIn_36_1 = stackOut_35_1;
                                          if (((lma) this).field_q <= var17) {
                                            break L10;
                                          } else {
                                            stackOut_36_0 = (boolean[]) (Object) stackIn_36_0;
                                            stackOut_36_1 = stackIn_36_1;
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            stackIn_37_0 = stackOut_36_0;
                                            stackIn_37_1 = stackOut_36_1;
                                            if (((lma) this).field_w <= var18) {
                                              break L10;
                                            } else {
                                              stackOut_37_0 = (boolean[]) (Object) stackIn_37_0;
                                              stackOut_37_1 = stackIn_37_1;
                                              stackOut_37_2 = 1;
                                              stackIn_39_0 = stackOut_37_0;
                                              stackIn_39_1 = stackOut_37_1;
                                              stackIn_39_2 = stackOut_37_2;
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_38_0 = (boolean[]) (Object) stackIn_38_0;
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    stackIn_39_2 = stackOut_38_2;
                                    break L9;
                                  }
                                  stackIn_39_0[stackIn_39_1] = stackIn_39_2 != 0;
                                  if (!var23[var15][var16]) {
                                    break L7;
                                  } else {
                                    var14++;
                                    break L7;
                                  }
                                }
                                var16++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var15 = 0;
                        L11: while (true) {
                          if (var15 >= 5) {
                            var15 = 0;
                            L12: while (true) {
                              if (var15 >= 3) {
                                break L4;
                              } else {
                                L13: {
                                  var16 = var15 - 1;
                                  var23[0][1 + var15] = var3.a(-var4 + var7, 2097152, 2097152 * var16 + var8, 2097152, true, 0, (byte) -20);
                                  if (var23[0][var15 - -1]) {
                                    var14++;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  var23[4][1 + var15] = var3.a(var7 + var4, 2097152, var8 - -(2097152 * var16), 2097152, true, 0, (byte) 88);
                                  if (!var23[4][var15 - -1]) {
                                    break L14;
                                  } else {
                                    var14++;
                                    break L14;
                                  }
                                }
                                var15++;
                                continue L12;
                              }
                            }
                          } else {
                            L15: {
                              var16 = -2 + var15;
                              var23[var15][0] = var3.a(var7 + 2097152 * var16, 2097152, -var4 + var8, 2097152, true, 0, (byte) -39);
                              if (!var23[var15][0]) {
                                break L15;
                              } else {
                                var14++;
                                break L15;
                              }
                            }
                            L16: {
                              var23[var15][4] = var3.a(2097152 * var16 + var7, 2097152, var8 + var4, 2097152, true, 0, (byte) 91);
                              if (var23[var15][4]) {
                                var14++;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var15++;
                            continue L11;
                          }
                        }
                      }
                    }
                    L17: {
                      if (16 == var14) {
                        var12.field_a = 10;
                        break L17;
                      } else {
                        if (var14 != 15) {
                          if (11 <= var14) {
                            L18: {
                              if (!var23[1][0]) {
                                break L18;
                              } else {
                                if (!var23[2][0]) {
                                  break L18;
                                } else {
                                  if (var23[3][0]) {
                                    L19: {
                                      if (!var23[4][1]) {
                                        break L19;
                                      } else {
                                        if (!var23[4][2]) {
                                          break L19;
                                        } else {
                                          if (!var23[4][3]) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (!var23[1][4]) {
                                                break L20;
                                              } else {
                                                if (!var23[2][4]) {
                                                  break L20;
                                                } else {
                                                  if (!var23[3][4]) {
                                                    break L20;
                                                  } else {
                                                    L21: {
                                                      if (!var23[0][1]) {
                                                        break L21;
                                                      } else {
                                                        if (!var23[0][2]) {
                                                          break L21;
                                                        } else {
                                                          if (var23[0][3]) {
                                                            break L17;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var12.field_a = 7;
                                                    var9 = -512;
                                                    break L17;
                                                  }
                                                }
                                              }
                                            }
                                            var9 = 1024;
                                            var12.field_a = 7;
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    var12.field_a = 7;
                                    var9 = 512;
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var12.field_a = 7;
                            var9 = 0;
                            break L17;
                          } else {
                            if (var14 >= 5) {
                              L22: {
                                if (var23[0][0]) {
                                  break L22;
                                } else {
                                  if (var23[1][0]) {
                                    break L22;
                                  } else {
                                    if (var23[0][1]) {
                                      break L22;
                                    } else {
                                      var9 = 0;
                                      var12.field_a = 8;
                                      break L17;
                                    }
                                  }
                                }
                              }
                              L23: {
                                if (var23[4][0]) {
                                  break L23;
                                } else {
                                  if (var23[3][0]) {
                                    break L23;
                                  } else {
                                    if (var23[4][1]) {
                                      break L23;
                                    } else {
                                      var9 = 512;
                                      var12.field_a = 8;
                                      break L17;
                                    }
                                  }
                                }
                              }
                              L24: {
                                if (var23[4][4]) {
                                  break L24;
                                } else {
                                  if (var23[4][3]) {
                                    break L24;
                                  } else {
                                    if (var23[3][4]) {
                                      break L24;
                                    } else {
                                      var9 = 1024;
                                      var12.field_a = 8;
                                      break L17;
                                    }
                                  }
                                }
                              }
                              if (var23[0][4]) {
                                break L17;
                              } else {
                                if (var23[1][4]) {
                                  break L17;
                                } else {
                                  if (var23[0][1]) {
                                    break L17;
                                  } else {
                                    var12.field_a = 8;
                                    var9 = -512;
                                    break L17;
                                  }
                                }
                              }
                            } else {
                              var12.field_o = var9 + bl.field_c[var12.field_a];
                              var12.field_d = 0;
                              var12.field_p = 0;
                              var11++;
                              continue L2;
                            }
                          }
                        } else {
                          if (var23[0][0]) {
                            if (!var23[4][0]) {
                              var12.field_a = 9;
                              var9 = -512;
                              break L17;
                            } else {
                              if (!var23[4][4]) {
                                var9 = 0;
                                var12.field_a = 9;
                                break L17;
                              } else {
                                if (var23[0][4]) {
                                  break L17;
                                } else {
                                  var9 = 512;
                                  var12.field_a = 9;
                                  break L17;
                                }
                              }
                            }
                          } else {
                            var12.field_a = 9;
                            var9 = 1024;
                            break L17;
                          }
                        }
                      }
                    }
                    var12.field_o = var9 + bl.field_c[var12.field_a];
                    var12.field_d = 0;
                    var12.field_p = 0;
                    break L3;
                  }
                }
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final boolean o(byte param0) {
        int var2 = 66 % ((25 - param0) / 57);
        if (!(((lma) this).field_h instanceof fsa)) {
            return false;
        }
        return true;
    }

    lma(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    public static void n() {
        field_r = null;
        int var1 = -1;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 89 % ((-38 - param4) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lma.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int i(int param0) {
        if (param0 > -28) {
            ((lma) this).field_u = -21;
        }
        return ((lma) this).field_y;
    }

    static {
    }
}
