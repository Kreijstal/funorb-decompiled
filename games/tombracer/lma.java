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
            throw tba.a((Throwable) ((Object) runtimeException), "lma.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int m(byte param0) {
        if (param0 > -63) {
            this.field_q = 91;
        }
        if (this.k(10)) {
            return -1;
        }
        return 0;
    }

    private final int b(fh param0, byte param1) {
        RuntimeException var3 = null;
        uw var4 = null;
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
        int decompiledRegionSelector0 = 0;
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
            if (-1 == (this.field_y ^ -1)) {
              L1: {
                if (-1 == (param0.field_a ^ -1)) {
                  break L1;
                } else {
                  if (-4 == (param0.field_a ^ -1)) {
                    break L1;
                  } else {
                    if ((param0.field_a ^ -1) == -5) {
                      break L1;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              L2: {
                if (param1 == -94) {
                  break L2;
                } else {
                  var4 = (uw) null;
                  this.a((byte) -105, 15, (uw) null);
                  break L2;
                }
              }
              stackOut_10_0 = this.a(40).e(true).a(100, 0);
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("lma.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    lma(int param0) {
        super(param0);
        this.field_p = true;
    }

    final void d(int param0) {
        int discarded$2 = 0;
        fla discarded$3 = null;
        fsa var3 = null;
        int var4 = 0;
        fh var5 = null;
        w var6 = null;
        L0: {
          super.d(param0 ^ 0);
          if (param0 == -1) {
            break L0;
          } else {
            var5 = (fh) null;
            discarded$2 = this.b((fh) null, (byte) 19);
            break L0;
          }
        }
        var6 = (w) ((Object) this.a(param0 + 58).field_G);
        if (var6 == null) {
          return;
        } else {
          L1: {
            if (this.field_h instanceof fsa) {
              L2: {
                L3: {
                  L4: {
                    var3 = (fsa) ((Object) this.field_h);
                    var4 = var3.d(param0 + 51, false) ? 1 : 0;
                    if (this.field_o != null) {
                      break L4;
                    } else {
                      if (var4 != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (this.field_o == null) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      discarded$3 = var6.a(new fm(18, this.b((byte) 101), this.c((byte) 109), this.e((byte) -89)), -58);
                      this.field_o.a(14, var6);
                      this.field_o = null;
                      if (!TombRacer.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_o = var6.a(new fm(17, this.b((byte) -105), this.c((byte) 94), this.e((byte) -114)), -58);
                break L2;
              }
              if (this.field_o != null) {
                this.field_o.a(this.b((byte) -93), var6.field_c, -128, var6.field_h, this.c((byte) 110));
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
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
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        fh var6 = null;
        ka stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_52_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 76) {
                break L1;
              } else {
                var6 = (fh) null;
                discarded$1 = this.b((fh) null, (byte) -30);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_y == 0) {
                  break L3;
                } else {
                  var3_int = 8;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  L14: {
                                    L15: {
                                      L16: {
                                        L17: {
                                          var4 = param0.field_a;
                                          if (var4 != 0) {
                                            break L17;
                                          } else {
                                            if (var5 == 0) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        if ((var4 ^ -1) == -2) {
                                          break L15;
                                        } else {
                                          L18: {
                                            if (2 != var4) {
                                              break L18;
                                            } else {
                                              if (var5 == 0) {
                                                break L14;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if ((var4 ^ -1) != -4) {
                                              break L19;
                                            } else {
                                              if (var5 == 0) {
                                                break L13;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            if (-5 != (var4 ^ -1)) {
                                              break L20;
                                            } else {
                                              if (var5 == 0) {
                                                break L12;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          L21: {
                                            if (5 != var4) {
                                              break L21;
                                            } else {
                                              if (var5 == 0) {
                                                break L11;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          L22: {
                                            if ((var4 ^ -1) != -7) {
                                              break L22;
                                            } else {
                                              if (var5 == 0) {
                                                break L10;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (var4 != 7) {
                                              break L23;
                                            } else {
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          if (var4 == 8) {
                                            break L8;
                                          } else {
                                            L24: {
                                              if (var4 != 9) {
                                                break L24;
                                              } else {
                                                if (var5 == 0) {
                                                  break L7;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                            L25: {
                                              if (-11 != (var4 ^ -1)) {
                                                break L25;
                                              } else {
                                                if (var5 == 0) {
                                                  break L6;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                            if (11 == var4) {
                                              break L5;
                                            } else {
                                              if (-13 == (var4 ^ -1)) {
                                                break L4;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L26: {
                                        if (75 > param0.field_d) {
                                          break L26;
                                        } else {
                                          var3_int = 2;
                                          if (var5 == 0) {
                                            break L2;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var3_int = 0;
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var3_int = 4;
                                    if (var5 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var3_int = 6;
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                }
                                var3_int = 8;
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              }
                              var3_int = 10;
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L11;
                              }
                            }
                            var3_int = 14;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                          var3_int = 15;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                        var3_int = 17;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                      var3_int = 19;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                    var3_int = 18;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                  var3_int = 16;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
                var3_int = 12;
                if (var5 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
              var3_int = 13;
              break L2;
            }
            stackOut_52_0 = ta.field_ub[param0.field_p + var3_int];
            stackIn_53_0 = stackOut_52_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var3 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var3);
            stackOut_54_1 = new StringBuilder().append("lma.R(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L27;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L27;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ')');
        }
        return stackIn_53_0;
    }

    final void a(uw param0, int param1) {
        boolean discarded$0 = false;
        try {
            super.a(param0, 115);
            if (param1 <= 82) {
                discarded$0 = this.o((byte) 33);
            }
            this.field_x = (fh[][]) null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lma.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        int decompiledRegionSelector0 = 0;
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
              if ((param3.field_a ^ -1) == param2) {
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
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            stackOut_5_0 = (param0 / 2097152 + param1 / 2097152) % 2;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("lma.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        byte stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_x != null) {
                  var4_int = 0;
                  L3: while (true) {
                    if (this.field_q <= var4_int) {
                      break L2;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_14_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        var5 = stackIn_6_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var5 >= this.field_w) {
                                break L6;
                              } else {
                                param2.a((byte) 88, param1, this.field_x[var4_int][var5]);
                                var5++;
                                if (var6 != 0) {
                                  break L5;
                                } else {
                                  if (var6 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4_int++;
                            break L5;
                          }
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_13_0 = param0;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            L7: {
              if (stackIn_14_0 >= 50) {
                break L7;
              } else {
                var7 = (kh) null;
                this.a(101, (la) null, (kh) null);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("lma.V(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                this.field_m = -87;
                break L1;
              }
            }
            L2: {
              L3: {
                super.a(127, param1, param2);
                if (17 <= param1.field_E) {
                  break L3;
                } else {
                  this.field_p = true;
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                this.field_y = param2.b((byte) 44, 4);
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L4;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L4;
                }
              }
              ((lma) (this)).field_p = stackIn_8_1 != 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("lma.G(").append(param0).append(',');
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
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void h(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        fh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_17_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.h(109);
        if (this.field_x == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            stackOut_4_0 = this.field_q;
            stackOut_4_1 = var2;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_5_0 <= stackIn_5_1) {
                    break L3;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_18_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_7_0;
                      L4: while (true) {
                        L5: {
                          if (this.field_w <= var3) {
                            break L5;
                          } else {
                            var4 = this.field_x[var2][var3];
                            var5 = bl.field_c[var4.field_a];
                            var4.field_o = dfa.a(-var4.field_o + var5, 2048, -73);
                            var4.field_l = -var4.field_l;
                            var4.field_i = sw.a(var4.field_i, 6);
                            stackOut_9_0 = var4.field_a ^ -1;
                            stackOut_9_1 = -12;
                            stackIn_5_0 = stackOut_9_0;
                            stackIn_5_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var6 != 0) {
                              continue L1;
                            } else {
                              L6: {
                                L7: {
                                  if (stackIn_10_0 == stackIn_10_1) {
                                    break L7;
                                  } else {
                                    if (-13 != (var4.field_a ^ -1)) {
                                      break L6;
                                    } else {
                                      var4.field_a = 11;
                                      if (var6 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                var4.field_a = 12;
                                break L6;
                              }
                              var4.a(0);
                              var3++;
                              if (var6 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2++;
                        if (var6 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_17_0 = param0;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              L8: {
                if (stackIn_18_0 > 0) {
                  break L8;
                } else {
                  discarded$2 = this.m((byte) 122);
                  break L8;
                }
              }
              return;
            }
          }
        }
    }

    private final boolean k(int param0) {
        if (!this.field_h.b(true)) {
          if (this.field_h instanceof fsa) {
            return true;
          } else {
            if (param0 != 10) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void j(int param0) {
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_235_0 = 0;
        int stackIn_238_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_277_0 = 0;
        int stackIn_286_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_304_0 = 0;
        int stackIn_306_0 = 0;
        int stackIn_306_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_243_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_276_0 = 0;
        int stackOut_275_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_287_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_303_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_305_0 = 0;
        int stackOut_305_1 = 0;
        var37 = TombRacer.field_G ? 1 : 0;
        var38 = this.field_h.f((byte) 68);
        var3 = var38.m((byte) -86);
        var4 = var38.s(param0 ^ 2097238);
        var5 = this.field_h.c(param0 + -2097273);
        var6 = this.field_h.a((byte) 55);
        this.field_v = this.field_h.d(3) - var5 / 2;
        this.field_A = this.field_v - -var5;
        this.field_u = this.field_h.e(9648) + -(var6 / 2);
        this.field_m = var6 + this.field_u;
        var7 = this.k(10) ? 1 : 0;
        var8 = this.field_h.d(3);
        var9 = this.field_h.e(9648);
        this.field_w = (-this.field_u + this.field_m) / 2097152;
        this.field_q = (-this.field_v + this.field_A) / param0;
        this.field_x = new fh[this.field_q][this.field_w];
        var10 = 1048576 + this.field_u;
        var11 = 0;
        L0: while (true) {
          L1: {
            if (var11 >= this.field_w) {
              break L1;
            } else {
              var12 = 1048576 + this.field_v;
              if (var37 != 0) {
                break L1;
              } else {
                var13 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var13 >= this.field_q) {
                        break L4;
                      } else {
                        var14 = new fh();
                        this.field_x[var13][var11] = var14;
                        stackOut_5_0 = var13 ^ -1;
                        stackOut_5_1 = -1;
                        stackIn_306_0 = stackOut_5_0;
                        stackIn_306_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var37 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_6_0 >= stackIn_6_1) {
                              stackOut_8_0 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              break L5;
                            } else {
                              stackOut_7_0 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              break L5;
                            }
                          }
                          L6: {
                            var15 = stackIn_9_0;
                            if (var13 >= -1 + this.field_q) {
                              stackOut_11_0 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              break L6;
                            } else {
                              stackOut_10_0 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              break L6;
                            }
                          }
                          L7: {
                            var16 = stackIn_12_0;
                            if (var11 <= 0) {
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              break L7;
                            } else {
                              stackOut_13_0 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              break L7;
                            }
                          }
                          L8: {
                            var17 = stackIn_15_0;
                            if (var11 >= -1 + this.field_w) {
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              break L8;
                            } else {
                              stackOut_16_0 = 1;
                              stackIn_18_0 = stackOut_16_0;
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              var18 = stackIn_18_0;
                              if ((var12 ^ -1) > -1) {
                                break L10;
                              } else {
                                if (var12 <= var3) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var16 = 1;
                            var15 = 1;
                            break L9;
                          }
                          L11: {
                            L12: {
                              if (var10 < 0) {
                                break L12;
                              } else {
                                if (var4 < var10) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var17 = 1;
                            var18 = 1;
                            break L11;
                          }
                          L13: {
                            var19 = var15;
                            var20 = var16;
                            var21 = var17;
                            var22 = var18;
                            var23 = za.a(1048576, (byte) 62, -1048576 + var3, var12);
                            var24 = za.a(1048576, (byte) 96, var4 - 1048576, var10);
                            if (var7 == 0) {
                              L14: {
                                if (!this.field_p) {
                                  break L14;
                                } else {
                                  L15: {
                                    if (var22 == 0) {
                                      if (var10 > -2097152 + var4) {
                                        stackOut_33_0 = 1;
                                        stackIn_35_0 = stackOut_33_0;
                                        break L15;
                                      } else {
                                        stackOut_32_0 = 0;
                                        stackIn_35_0 = stackOut_32_0;
                                        break L15;
                                      }
                                    } else {
                                      stackOut_30_0 = 1;
                                      stackIn_35_0 = stackOut_30_0;
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    var22 = stackIn_35_0;
                                    if (var19 == 0) {
                                      if ((var12 ^ -1) > -2097153) {
                                        stackOut_39_0 = 1;
                                        stackIn_41_0 = stackOut_39_0;
                                        break L16;
                                      } else {
                                        stackOut_38_0 = 0;
                                        stackIn_41_0 = stackOut_38_0;
                                        break L16;
                                      }
                                    } else {
                                      stackOut_36_0 = 1;
                                      stackIn_41_0 = stackOut_36_0;
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    var19 = stackIn_41_0;
                                    if (var21 != 0) {
                                      stackOut_45_0 = 1;
                                      stackIn_47_0 = stackOut_45_0;
                                      break L17;
                                    } else {
                                      if (-2097153 < (var10 ^ -1)) {
                                        stackOut_44_0 = 1;
                                        stackIn_47_0 = stackOut_44_0;
                                        break L17;
                                      } else {
                                        stackOut_43_0 = 0;
                                        stackIn_47_0 = stackOut_43_0;
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    var21 = stackIn_47_0;
                                    if (var20 == 0) {
                                      if (var3 + -2097152 < var12) {
                                        stackOut_51_0 = 1;
                                        stackIn_53_0 = stackOut_51_0;
                                        break L18;
                                      } else {
                                        stackOut_50_0 = 0;
                                        stackIn_53_0 = stackOut_50_0;
                                        break L18;
                                      }
                                    } else {
                                      stackOut_48_0 = 1;
                                      stackIn_53_0 = stackOut_48_0;
                                      break L18;
                                    }
                                  }
                                  var20 = stackIn_53_0;
                                  break L14;
                                }
                              }
                              L19: {
                                if (var19 == 0) {
                                  if (var38.a(var23 - 2097152, 2097152, var24, 2097152, true, 0, (byte) 102)) {
                                    stackOut_58_0 = 1;
                                    stackIn_60_0 = stackOut_58_0;
                                    break L19;
                                  } else {
                                    stackOut_57_0 = 0;
                                    stackIn_60_0 = stackOut_57_0;
                                    break L19;
                                  }
                                } else {
                                  stackOut_55_0 = 1;
                                  stackIn_60_0 = stackOut_55_0;
                                  break L19;
                                }
                              }
                              L20: {
                                var19 = stackIn_60_0;
                                if (var20 == 0) {
                                  L21: {
                                    if (var38.a(2097152 + var23, 2097152, var24, 2097152, true, 0, (byte) -99)) {
                                      stackOut_66_0 = 1;
                                      stackIn_68_0 = stackOut_66_0;
                                      break L21;
                                    } else {
                                      stackOut_65_0 = 0;
                                      stackIn_68_0 = stackOut_65_0;
                                      break L21;
                                    }
                                  }
                                  var20 = stackIn_68_0;
                                  break L20;
                                } else {
                                  stackOut_61_0 = 1;
                                  stackIn_63_0 = stackOut_61_0;
                                  var20 = stackIn_63_0;
                                  break L20;
                                }
                              }
                              L22: {
                                if (var21 == 0) {
                                  L23: {
                                    if (var38.a(var23, 2097152, var24 + -2097152, 2097152, true, 0, (byte) -103)) {
                                      stackOut_75_0 = 1;
                                      stackIn_77_0 = stackOut_75_0;
                                      break L23;
                                    } else {
                                      stackOut_74_0 = 0;
                                      stackIn_77_0 = stackOut_74_0;
                                      break L23;
                                    }
                                  }
                                  var21 = stackIn_77_0;
                                  break L22;
                                } else {
                                  stackOut_70_0 = 1;
                                  stackIn_72_0 = stackOut_70_0;
                                  var21 = stackIn_72_0;
                                  break L22;
                                }
                              }
                              if (var22 == 0) {
                                L24: {
                                  if (var38.a(var23, 2097152, var24 - -2097152, 2097152, true, 0, (byte) 72)) {
                                    stackOut_84_0 = 1;
                                    stackIn_86_0 = stackOut_84_0;
                                    break L24;
                                  } else {
                                    stackOut_83_0 = 0;
                                    stackIn_86_0 = stackOut_83_0;
                                    break L24;
                                  }
                                }
                                var22 = stackIn_86_0;
                                break L13;
                              } else {
                                stackOut_79_0 = 1;
                                stackIn_81_0 = stackOut_79_0;
                                var22 = stackIn_81_0;
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L25: {
                            if (this.field_z) {
                              var19 = 1;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          L26: {
                            if (this.field_n) {
                              var22 = 1;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (this.field_t) {
                              var20 = 1;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (!this.field_s) {
                              break L28;
                            } else {
                              var21 = 1;
                              break L28;
                            }
                          }
                          L29: {
                            var25 = 0;
                            if (var19 != 0) {
                              var25++;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (var20 == 0) {
                              break L30;
                            } else {
                              var25++;
                              break L30;
                            }
                          }
                          L31: {
                            if (var21 == 0) {
                              break L31;
                            } else {
                              var25++;
                              break L31;
                            }
                          }
                          L32: {
                            if (var22 != 0) {
                              var25++;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              var26 = 0;
                              var27 = 0;
                              if (-5 == (var25 ^ -1)) {
                                break L34;
                              } else {
                                L35: {
                                  if (3 == var25) {
                                    break L35;
                                  } else {
                                    L36: {
                                      if ((var25 ^ -1) != -3) {
                                        break L36;
                                      } else {
                                        L37: {
                                          L38: {
                                            if (var21 != 0) {
                                              break L38;
                                            } else {
                                              if (var22 == 0) {
                                                break L37;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          L39: {
                                            if (var19 != 0) {
                                              break L39;
                                            } else {
                                              if (var20 != 0) {
                                                break L39;
                                              } else {
                                                var14.field_a = 1;
                                                var26 = -512;
                                                var27 = 2;
                                                if (var37 == 0) {
                                                  break L33;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                          }
                                          L40: {
                                            L41: {
                                              L42: {
                                                if (var19 != 0) {
                                                  break L42;
                                                } else {
                                                  if (var21 == 0) {
                                                    break L41;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              L43: {
                                                if (var19 != 0) {
                                                  break L43;
                                                } else {
                                                  if (var22 != 0) {
                                                    break L43;
                                                  } else {
                                                    var26 = 1024;
                                                    var27 = 5;
                                                    if (var37 == 0) {
                                                      break L40;
                                                    } else {
                                                      break L43;
                                                    }
                                                  }
                                                }
                                              }
                                              L44: {
                                                if (var20 != 0) {
                                                  break L44;
                                                } else {
                                                  if (var21 != 0) {
                                                    break L44;
                                                  } else {
                                                    var27 = 1;
                                                    var26 = 0;
                                                    if (var37 == 0) {
                                                      break L40;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var20 != 0) {
                                                break L40;
                                              } else {
                                                if (var22 != 0) {
                                                  break L40;
                                                } else {
                                                  var27 = 3;
                                                  var26 = 512;
                                                  if (var37 == 0) {
                                                    break L40;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                            }
                                            var27 = 7;
                                            var26 = -512;
                                            break L40;
                                          }
                                          var14.field_a = 4;
                                          if (var37 == 0) {
                                            break L33;
                                          } else {
                                            break L37;
                                          }
                                        }
                                        var27 = 0;
                                        var14.field_a = 1;
                                        var26 = 0;
                                        if (var37 == 0) {
                                          break L33;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    L45: {
                                      if ((var25 ^ -1) == -2) {
                                        break L45;
                                      } else {
                                        var14.field_a = 3;
                                        if (var37 == 0) {
                                          break L33;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                    L46: {
                                      L47: {
                                        if (var21 == 0) {
                                          break L47;
                                        } else {
                                          var27 = 4;
                                          var26 = 512;
                                          if (var37 == 0) {
                                            break L46;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                      L48: {
                                        if (var22 == 0) {
                                          break L48;
                                        } else {
                                          var27 = 0;
                                          var26 = -512;
                                          if (var37 == 0) {
                                            break L46;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                      L49: {
                                        if (var20 == 0) {
                                          break L49;
                                        } else {
                                          var26 = 1024;
                                          var27 = 6;
                                          if (var37 == 0) {
                                            break L46;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      var27 = 2;
                                      var26 = 0;
                                      break L46;
                                    }
                                    var14.field_a = 2;
                                    if (var37 == 0) {
                                      break L33;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                L50: {
                                  L51: {
                                    if (var21 != 0) {
                                      break L51;
                                    } else {
                                      var26 = 0;
                                      var27 = 0;
                                      if (var37 == 0) {
                                        break L50;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    if (var22 != 0) {
                                      break L52;
                                    } else {
                                      var26 = 1024;
                                      var27 = 4;
                                      if (var37 == 0) {
                                        break L50;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  L53: {
                                    if (var20 == 0) {
                                      break L53;
                                    } else {
                                      var27 = 6;
                                      var26 = -512;
                                      if (var37 == 0) {
                                        break L50;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                  var26 = 512;
                                  var27 = 2;
                                  break L50;
                                }
                                var14.field_a = 0;
                                if (var37 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L54: {
                              L55: {
                                if (var15 == 0) {
                                  break L55;
                                } else {
                                  if (var17 == 0) {
                                    break L55;
                                  } else {
                                    stackOut_153_0 = 1;
                                    stackIn_155_0 = stackOut_153_0;
                                    var28 = stackIn_155_0;
                                    break L54;
                                  }
                                }
                              }
                              L56: {
                                if (-2097153 >= (var12 ^ -1)) {
                                  if (var10 >= 2097152) {
                                    if (var38.a(var12 + -2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 72)) {
                                      stackOut_163_0 = 1;
                                      stackIn_165_0 = stackOut_163_0;
                                      break L56;
                                    } else {
                                      stackOut_162_0 = 0;
                                      stackIn_165_0 = stackOut_162_0;
                                      break L56;
                                    }
                                  } else {
                                    stackOut_160_0 = 1;
                                    stackIn_165_0 = stackOut_160_0;
                                    break L56;
                                  }
                                } else {
                                  stackOut_158_0 = 1;
                                  stackIn_165_0 = stackOut_158_0;
                                  break L56;
                                }
                              }
                              var28 = stackIn_165_0;
                              break L54;
                            }
                            L57: {
                              L58: {
                                if (var16 == 0) {
                                  break L58;
                                } else {
                                  if (var17 == 0) {
                                    break L58;
                                  } else {
                                    stackOut_168_0 = 1;
                                    stackIn_170_0 = stackOut_168_0;
                                    var29 = stackIn_170_0;
                                    break L57;
                                  }
                                }
                              }
                              if (var12 <= var3 - 2097152) {
                                if (var10 >= 2097152) {
                                  L59: {
                                    if (var38.a(var12 + 2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 103)) {
                                      stackOut_182_0 = 1;
                                      stackIn_184_0 = stackOut_182_0;
                                      break L59;
                                    } else {
                                      stackOut_181_0 = 0;
                                      stackIn_184_0 = stackOut_181_0;
                                      break L59;
                                    }
                                  }
                                  var29 = stackIn_184_0;
                                  break L57;
                                } else {
                                  stackOut_177_0 = 1;
                                  stackIn_179_0 = stackOut_177_0;
                                  var29 = stackIn_179_0;
                                  break L57;
                                }
                              } else {
                                stackOut_173_0 = 1;
                                stackIn_175_0 = stackOut_173_0;
                                var29 = stackIn_175_0;
                                break L57;
                              }
                            }
                            L60: {
                              L61: {
                                if (var15 == 0) {
                                  break L61;
                                } else {
                                  if (var18 == 0) {
                                    break L61;
                                  } else {
                                    stackOut_187_0 = 1;
                                    stackIn_189_0 = stackOut_187_0;
                                    var30 = stackIn_189_0;
                                    break L60;
                                  }
                                }
                              }
                              L62: {
                                if ((var12 ^ -1) <= -2097153) {
                                  if (-2097152 + var4 >= var10) {
                                    if (var38.a(-2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) -55)) {
                                      stackOut_197_0 = 1;
                                      stackIn_199_0 = stackOut_197_0;
                                      break L62;
                                    } else {
                                      stackOut_196_0 = 0;
                                      stackIn_199_0 = stackOut_196_0;
                                      break L62;
                                    }
                                  } else {
                                    stackOut_194_0 = 1;
                                    stackIn_199_0 = stackOut_194_0;
                                    break L62;
                                  }
                                } else {
                                  stackOut_192_0 = 1;
                                  stackIn_199_0 = stackOut_192_0;
                                  break L62;
                                }
                              }
                              var30 = stackIn_199_0;
                              break L60;
                            }
                            L63: {
                              L64: {
                                if (var16 == 0) {
                                  break L64;
                                } else {
                                  if (var18 == 0) {
                                    break L64;
                                  } else {
                                    stackOut_202_0 = 1;
                                    stackIn_212_0 = stackOut_202_0;
                                    break L63;
                                  }
                                }
                              }
                              if (-2097152 + var3 >= var12) {
                                if (var10 <= -2097152 + var4) {
                                  if (var38.a(2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) 55)) {
                                    stackOut_210_0 = 1;
                                    stackIn_212_0 = stackOut_210_0;
                                    break L63;
                                  } else {
                                    stackOut_209_0 = 0;
                                    stackIn_212_0 = stackOut_209_0;
                                    break L63;
                                  }
                                } else {
                                  stackOut_207_0 = 1;
                                  stackIn_212_0 = stackOut_207_0;
                                  break L63;
                                }
                              } else {
                                stackOut_205_0 = 1;
                                stackIn_212_0 = stackOut_205_0;
                                break L63;
                              }
                            }
                            L65: {
                              var31 = stackIn_212_0;
                              if (var28 == 0) {
                                break L65;
                              } else {
                                if (var29 == 0) {
                                  break L65;
                                } else {
                                  if (var30 == 0) {
                                    break L65;
                                  } else {
                                    if (var31 == 0) {
                                      break L65;
                                    } else {
                                      var14.field_a = 5;
                                      if (var37 == 0) {
                                        break L33;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L66: {
                              L67: {
                                if (var28 != 0) {
                                  break L67;
                                } else {
                                  var26 = 0;
                                  if (var37 == 0) {
                                    break L66;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                              L68: {
                                if (var30 != 0) {
                                  break L68;
                                } else {
                                  var26 = -512;
                                  if (var37 == 0) {
                                    break L66;
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              L69: {
                                if (var29 != 0) {
                                  break L69;
                                } else {
                                  var26 = 512;
                                  if (var37 == 0) {
                                    break L66;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              var26 = 1024;
                              break L66;
                            }
                            var14.field_a = 6;
                            break L33;
                          }
                          L70: {
                            if (!var38.a(-2097152 + var23, 2097152, var24, 2097152, false, 2, (byte) 98)) {
                              stackOut_228_0 = 0;
                              stackIn_229_0 = stackOut_228_0;
                              break L70;
                            } else {
                              stackOut_227_0 = 1;
                              stackIn_229_0 = stackOut_227_0;
                              break L70;
                            }
                          }
                          L71: {
                            var28 = stackIn_229_0;
                            if (!var38.a(var23 + 2097152, 2097152, var24, 2097152, false, 2, (byte) -108)) {
                              stackOut_231_0 = 0;
                              stackIn_232_0 = stackOut_231_0;
                              break L71;
                            } else {
                              stackOut_230_0 = 1;
                              stackIn_232_0 = stackOut_230_0;
                              break L71;
                            }
                          }
                          L72: {
                            var29 = stackIn_232_0;
                            if (!var38.a(var23, 2097152, var24 + -2097152, 2097152, false, 2, (byte) 118)) {
                              stackOut_234_0 = 0;
                              stackIn_235_0 = stackOut_234_0;
                              break L72;
                            } else {
                              stackOut_233_0 = 1;
                              stackIn_235_0 = stackOut_233_0;
                              break L72;
                            }
                          }
                          L73: {
                            var30 = stackIn_235_0;
                            if (!var38.a(var23, 2097152, 2097152 + var24, 2097152, false, 2, (byte) 116)) {
                              stackOut_237_0 = 0;
                              stackIn_238_0 = stackOut_237_0;
                              break L73;
                            } else {
                              stackOut_236_0 = 1;
                              stackIn_238_0 = stackOut_236_0;
                              break L73;
                            }
                          }
                          L74: {
                            var31 = stackIn_238_0;
                            if (var28 == 0) {
                              if (var29 == 0) {
                                L75: {
                                  if (var30 != 0) {
                                    stackOut_249_0 = 1;
                                    stackIn_251_0 = stackOut_249_0;
                                    break L75;
                                  } else {
                                    if (var31 == 0) {
                                      stackOut_250_0 = 0;
                                      stackIn_251_0 = stackOut_250_0;
                                      break L75;
                                    } else {
                                      stackOut_248_0 = 1;
                                      stackIn_251_0 = stackOut_248_0;
                                      break L75;
                                    }
                                  }
                                }
                                var32 = stackIn_251_0;
                                break L74;
                              } else {
                                stackOut_243_0 = 1;
                                stackIn_245_0 = stackOut_243_0;
                                var32 = stackIn_245_0;
                                break L74;
                              }
                            } else {
                              stackOut_239_0 = 1;
                              stackIn_241_0 = stackOut_239_0;
                              var32 = stackIn_241_0;
                              break L74;
                            }
                          }
                          L76: {
                            if (var32 == 0) {
                              break L76;
                            } else {
                              if (4 == var14.field_a) {
                                L77: {
                                  if (var28 != 0) {
                                    L78: {
                                      if (var27 != 7) {
                                        break L78;
                                      } else {
                                        var26 = 0;
                                        var14.field_a = 11;
                                        if (var37 == 0) {
                                          break L77;
                                        } else {
                                          break L78;
                                        }
                                      }
                                    }
                                    if (5 != var27) {
                                      break L77;
                                    } else {
                                      var14.field_a = 12;
                                      var26 = 1024;
                                      break L77;
                                    }
                                  } else {
                                    break L77;
                                  }
                                }
                                if (var29 == 0) {
                                  break L76;
                                } else {
                                  L79: {
                                    if (-2 != (var27 ^ -1)) {
                                      break L79;
                                    } else {
                                      var26 = 0;
                                      var14.field_a = 12;
                                      if (var37 == 0) {
                                        break L76;
                                      } else {
                                        break L79;
                                      }
                                    }
                                  }
                                  if (3 != var27) {
                                    break L76;
                                  } else {
                                    var26 = 1024;
                                    var14.field_a = 11;
                                    break L76;
                                  }
                                }
                              } else {
                                break L76;
                              }
                            }
                          }
                          L80: {
                            var14.field_o = dfa.a(var26 + bl.field_c[var14.field_a], 2048, 120);
                            var14.field_i = var27;
                            var14.field_f = var10 + -var9;
                            var14.field_l = var12 + -var8;
                            var14.field_g = (lma) (this);
                            if (this.field_y != 0) {
                              break L80;
                            } else {
                              var14.field_p = this.a(var10, var12, param0 + -2097153, var14);
                              var14.field_d = this.b(var14, (byte) -94);
                              break L80;
                            }
                          }
                          L81: {
                            if (var7 == 0) {
                              L82: {
                                if (var21 == 0) {
                                  break L82;
                                } else {
                                  if (var19 == 0) {
                                    break L82;
                                  } else {
                                    stackOut_272_0 = 0;
                                    stackIn_277_0 = stackOut_272_0;
                                    break L81;
                                  }
                                }
                              }
                              if (!var38.a(var23 - 2097152, 2097152, var24 + -2097152, 2097152, true, 0, (byte) 98)) {
                                stackOut_276_0 = 0;
                                stackIn_277_0 = stackOut_276_0;
                                break L81;
                              } else {
                                stackOut_275_0 = 1;
                                stackIn_277_0 = stackOut_275_0;
                                break L81;
                              }
                            } else {
                              stackOut_269_0 = 0;
                              stackIn_277_0 = stackOut_269_0;
                              break L81;
                            }
                          }
                          L83: {
                            var33 = stackIn_277_0;
                            if (var7 == 0) {
                              L84: {
                                if (var21 == 0) {
                                  break L84;
                                } else {
                                  if (var20 == 0) {
                                    break L84;
                                  } else {
                                    stackOut_281_0 = 0;
                                    stackIn_286_0 = stackOut_281_0;
                                    break L83;
                                  }
                                }
                              }
                              if (!var38.a(2097152 + var23, 2097152, -2097152 + var24, 2097152, true, 0, (byte) 79)) {
                                stackOut_285_0 = 0;
                                stackIn_286_0 = stackOut_285_0;
                                break L83;
                              } else {
                                stackOut_284_0 = 1;
                                stackIn_286_0 = stackOut_284_0;
                                break L83;
                              }
                            } else {
                              stackOut_278_0 = 0;
                              stackIn_286_0 = stackOut_278_0;
                              break L83;
                            }
                          }
                          L85: {
                            var34 = stackIn_286_0;
                            if (var7 == 0) {
                              L86: {
                                if (var22 == 0) {
                                  break L86;
                                } else {
                                  if (var19 == 0) {
                                    break L86;
                                  } else {
                                    stackOut_290_0 = 0;
                                    stackIn_295_0 = stackOut_290_0;
                                    break L85;
                                  }
                                }
                              }
                              if (!var38.a(var23 - 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) -88)) {
                                stackOut_294_0 = 0;
                                stackIn_295_0 = stackOut_294_0;
                                break L85;
                              } else {
                                stackOut_293_0 = 1;
                                stackIn_295_0 = stackOut_293_0;
                                break L85;
                              }
                            } else {
                              stackOut_287_0 = 0;
                              stackIn_295_0 = stackOut_287_0;
                              break L85;
                            }
                          }
                          L87: {
                            var35 = stackIn_295_0;
                            if (var7 == 0) {
                              L88: {
                                if (var22 == 0) {
                                  break L88;
                                } else {
                                  if (var20 == 0) {
                                    break L88;
                                  } else {
                                    stackOut_299_0 = 0;
                                    stackIn_304_0 = stackOut_299_0;
                                    break L87;
                                  }
                                }
                              }
                              if (!var38.a(var23 + 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) 117)) {
                                stackOut_303_0 = 0;
                                stackIn_304_0 = stackOut_303_0;
                                break L87;
                              } else {
                                stackOut_302_0 = 1;
                                stackIn_304_0 = stackOut_302_0;
                                break L87;
                              }
                            } else {
                              stackOut_296_0 = 0;
                              stackIn_304_0 = stackOut_296_0;
                              break L87;
                            }
                          }
                          var36 = stackIn_304_0;
                          var12 = var12 + 2097152;
                          var14.a(var33 != 0, (byte) 24, var34 != 0, var36 != 0, var35 != 0);
                          var13++;
                          if (var37 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_305_0 = var10;
                    stackOut_305_1 = 2097152;
                    stackIn_306_0 = stackOut_305_0;
                    stackIn_306_1 = stackOut_305_1;
                    break L3;
                  }
                  var10 = stackIn_306_0 + stackIn_306_1;
                  var11++;
                  if (var37 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, uw param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
              if (null == this.field_x) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= this.field_q) {
                    break L2;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var5 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var5 >= this.field_w) {
                              break L6;
                            } else {
                              param1.a(param0, this.field_x[var4_int][var5], (byte) -33);
                              var5++;
                              if (var6 != 0) {
                                break L5;
                              } else {
                                if (var6 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var4_int++;
                          break L5;
                        }
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
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
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("lma.FA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 86, param1);
            int var3_int = -57 / ((param0 - -8) / 40);
            param1.a((byte) -19, this.field_y, 4);
            param1.a((byte) 111, !this.field_p ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, uw param1) {
        try {
            if (null == this.field_x) {
                this.j(2097152);
                if (hb.d(67)) {
                    this.l(32166);
                }
            }
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lma.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_21_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        boolean[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        boolean[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        boolean[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        boolean[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        boolean[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_54_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_20_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        boolean[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        boolean[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        boolean[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        boolean[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        boolean[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        boolean[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_53_0 = 0;
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
        var3 = this.a(param0 + -32121);
        var4 = 4194304;
        var5 = this.field_h.d(3);
        var6 = this.field_h.e(9648);
        var10 = 0;
        L1: while (true) {
          stackOut_3_0 = var10;
          stackOut_3_1 = this.field_q;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          L2: while (true) {
            L3: {
              if (stackIn_4_0 >= stackIn_4_1) {
                break L3;
              } else {
                if (var19 != 0) {
                  break L3;
                } else {
                  var11 = 0;
                  L4: while (true) {
                    L5: {
                      if (this.field_w <= var11) {
                        break L5;
                      } else {
                        var12 = this.field_x[var10][var11];
                        stackOut_8_0 = -6;
                        stackOut_8_1 = var12.field_a ^ -1;
                        stackIn_4_0 = stackOut_8_0;
                        stackIn_4_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var19 != 0) {
                          continue L2;
                        } else {
                          L6: {
                            if (stackIn_9_0 != stackIn_9_1) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  L9: {
                                    var8 = var12.field_f + var6;
                                    var7 = var5 - -var12.field_l;
                                    var9 = 0;
                                    var23 = new boolean[5][5];
                                    var14 = 0;
                                    if (var2 != 0) {
                                      break L9;
                                    } else {
                                      var15 = 0;
                                      L10: while (true) {
                                        L11: {
                                          L12: {
                                            if (-6 >= (var15 ^ -1)) {
                                              break L12;
                                            } else {
                                              var16 = -2 + var15;
                                              var23[var15][0] = var3.a(var7 + 2097152 * var16, 2097152, -var4 + var8, 2097152, true, 0, (byte) -39);
                                              stackOut_13_0 = var23[var15][0];
                                              stackIn_21_0 = stackOut_13_0 ? 1 : 0;
                                              stackIn_14_0 = stackOut_13_0;
                                              if (var19 != 0) {
                                                break L11;
                                              } else {
                                                L13: {
                                                  if (!stackIn_14_0) {
                                                    break L13;
                                                  } else {
                                                    var14++;
                                                    break L13;
                                                  }
                                                }
                                                L14: {
                                                  var23[var15][4] = var3.a(2097152 * var16 + var7, 2097152, var8 + var4, 2097152, true, 0, (byte) 91);
                                                  if (var23[var15][4]) {
                                                    var14++;
                                                    break L14;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                                var15++;
                                                if (var19 == 0) {
                                                  continue L10;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_20_0 = 0;
                                          stackIn_21_0 = stackOut_20_0;
                                          break L11;
                                        }
                                        var15 = stackIn_21_0;
                                        L15: while (true) {
                                          L16: {
                                            if (-4 >= (var15 ^ -1)) {
                                              break L16;
                                            } else {
                                              var16 = var15 - 1;
                                              var23[0][1 + var15] = var3.a(-var4 + var7, 2097152, 2097152 * var16 + var8, 2097152, true, 0, (byte) -20);
                                              stackOut_23_0 = var23[0][var15 - -1];
                                              stackIn_54_0 = stackOut_23_0 ? 1 : 0;
                                              stackIn_24_0 = stackOut_23_0;
                                              if (var19 != 0) {
                                                break L7;
                                              } else {
                                                L17: {
                                                  if (stackIn_24_0) {
                                                    var14++;
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                L18: {
                                                  var23[4][1 + var15] = var3.a(var7 + var4, 2097152, var8 - -(2097152 * var16), 2097152, true, 0, (byte) 88);
                                                  if (!var23[4][var15 - -1]) {
                                                    break L18;
                                                  } else {
                                                    var14++;
                                                    break L18;
                                                  }
                                                }
                                                var15++;
                                                if (var19 == 0) {
                                                  continue L15;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                          if (var19 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var15 = 0;
                                  L19: while (true) {
                                    stackOut_32_0 = var15 ^ -1;
                                    stackIn_33_0 = stackOut_32_0;
                                    L20: while (true) {
                                      if (stackIn_33_0 <= -6) {
                                        break L8;
                                      } else {
                                        stackOut_34_0 = 0;
                                        stackIn_54_0 = stackOut_34_0;
                                        stackIn_35_0 = stackOut_34_0;
                                        if (var19 != 0) {
                                          break L7;
                                        } else {
                                          var16 = stackIn_35_0;
                                          L21: while (true) {
                                            L22: {
                                              if (5 <= var16) {
                                                break L22;
                                              } else {
                                                stackOut_37_0 = var15;
                                                stackIn_33_0 = stackOut_37_0;
                                                stackIn_38_0 = stackOut_37_0;
                                                if (var19 != 0) {
                                                  continue L20;
                                                } else {
                                                  L23: {
                                                    L24: {
                                                      if (stackIn_38_0 == 0) {
                                                        break L24;
                                                      } else {
                                                        if (-1 == (var16 ^ -1)) {
                                                          break L24;
                                                        } else {
                                                          if (var15 == 4) {
                                                            break L24;
                                                          } else {
                                                            if (-5 != (var16 ^ -1)) {
                                                              break L23;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      L26: {
                                                        var17 = var10 + (var15 - 2);
                                                        var18 = var11 + (var16 + -2);
                                                        stackOut_43_0 = var23[var15];
                                                        stackOut_43_1 = var16;
                                                        stackIn_48_0 = stackOut_43_0;
                                                        stackIn_48_1 = stackOut_43_1;
                                                        stackIn_44_0 = stackOut_43_0;
                                                        stackIn_44_1 = stackOut_43_1;
                                                        if (var17 < 0) {
                                                          break L26;
                                                        } else {
                                                          stackOut_44_0 = (boolean[]) ((Object) stackIn_44_0);
                                                          stackOut_44_1 = stackIn_44_1;
                                                          stackIn_48_0 = stackOut_44_0;
                                                          stackIn_48_1 = stackOut_44_1;
                                                          stackIn_45_0 = stackOut_44_0;
                                                          stackIn_45_1 = stackOut_44_1;
                                                          if (0 > var18) {
                                                            break L26;
                                                          } else {
                                                            stackOut_45_0 = (boolean[]) ((Object) stackIn_45_0);
                                                            stackOut_45_1 = stackIn_45_1;
                                                            stackIn_48_0 = stackOut_45_0;
                                                            stackIn_48_1 = stackOut_45_1;
                                                            stackIn_46_0 = stackOut_45_0;
                                                            stackIn_46_1 = stackOut_45_1;
                                                            if (this.field_q <= var17) {
                                                              break L26;
                                                            } else {
                                                              stackOut_46_0 = (boolean[]) ((Object) stackIn_46_0);
                                                              stackOut_46_1 = stackIn_46_1;
                                                              stackIn_48_0 = stackOut_46_0;
                                                              stackIn_48_1 = stackOut_46_1;
                                                              stackIn_47_0 = stackOut_46_0;
                                                              stackIn_47_1 = stackOut_46_1;
                                                              if (this.field_w <= var18) {
                                                                break L26;
                                                              } else {
                                                                stackOut_47_0 = (boolean[]) ((Object) stackIn_47_0);
                                                                stackOut_47_1 = stackIn_47_1;
                                                                stackOut_47_2 = 1;
                                                                stackIn_49_0 = stackOut_47_0;
                                                                stackIn_49_1 = stackOut_47_1;
                                                                stackIn_49_2 = stackOut_47_2;
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      stackOut_48_0 = (boolean[]) ((Object) stackIn_48_0);
                                                      stackOut_48_1 = stackIn_48_1;
                                                      stackOut_48_2 = 0;
                                                      stackIn_49_0 = stackOut_48_0;
                                                      stackIn_49_1 = stackOut_48_1;
                                                      stackIn_49_2 = stackOut_48_2;
                                                      break L25;
                                                    }
                                                    stackIn_49_0[stackIn_49_1] = stackIn_49_2 != 0;
                                                    if (!var23[var15][var16]) {
                                                      break L23;
                                                    } else {
                                                      var14++;
                                                      break L23;
                                                    }
                                                  }
                                                  var16++;
                                                  if (var19 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                            }
                                            var15++;
                                            if (var19 == 0) {
                                              continue L19;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_53_0 = 16;
                                stackIn_54_0 = stackOut_53_0;
                                break L7;
                              }
                              L27: {
                                L28: {
                                  if (stackIn_54_0 == var14) {
                                    break L28;
                                  } else {
                                    L29: {
                                      if (var14 != 15) {
                                        break L29;
                                      } else {
                                        L30: {
                                          if (var23[0][0]) {
                                            break L30;
                                          } else {
                                            var12.field_a = 9;
                                            var9 = 1024;
                                            if (var19 == 0) {
                                              break L27;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                        L31: {
                                          if (!var23[4][0]) {
                                            break L31;
                                          } else {
                                            L32: {
                                              if (!var23[4][4]) {
                                                break L32;
                                              } else {
                                                if (var23[0][4]) {
                                                  break L27;
                                                } else {
                                                  var9 = 512;
                                                  var12.field_a = 9;
                                                  if (var19 == 0) {
                                                    break L27;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                            }
                                            var9 = 0;
                                            var12.field_a = 9;
                                            if (var19 == 0) {
                                              break L27;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                        var12.field_a = 9;
                                        var9 = -512;
                                        if (var19 == 0) {
                                          break L27;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    L33: {
                                      if (11 <= var14) {
                                        break L33;
                                      } else {
                                        if (-6 >= (var14 ^ -1)) {
                                          L34: {
                                            if (var23[0][0]) {
                                              break L34;
                                            } else {
                                              if (var23[1][0]) {
                                                break L34;
                                              } else {
                                                if (var23[0][1]) {
                                                  break L34;
                                                } else {
                                                  var9 = 0;
                                                  var12.field_a = 8;
                                                  if (var19 == 0) {
                                                    break L27;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L35: {
                                            if (var23[4][0]) {
                                              break L35;
                                            } else {
                                              if (var23[3][0]) {
                                                break L35;
                                              } else {
                                                if (var23[4][1]) {
                                                  break L35;
                                                } else {
                                                  var9 = 512;
                                                  var12.field_a = 8;
                                                  if (var19 == 0) {
                                                    break L27;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L36: {
                                            if (var23[4][4]) {
                                              break L36;
                                            } else {
                                              if (var23[4][3]) {
                                                break L36;
                                              } else {
                                                if (var23[3][4]) {
                                                  break L36;
                                                } else {
                                                  var9 = 1024;
                                                  var12.field_a = 8;
                                                  if (var19 == 0) {
                                                    break L27;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var23[0][4]) {
                                            break L27;
                                          } else {
                                            if (var23[1][4]) {
                                              break L27;
                                            } else {
                                              if (var23[0][1]) {
                                                break L27;
                                              } else {
                                                var12.field_a = 8;
                                                var9 = -512;
                                                if (var19 == 0) {
                                                  break L27;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    L37: {
                                      L38: {
                                        if (!var23[1][0]) {
                                          break L38;
                                        } else {
                                          if (!var23[2][0]) {
                                            break L38;
                                          } else {
                                            if (var23[3][0]) {
                                              break L37;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      var12.field_a = 7;
                                      var9 = 0;
                                      if (var19 == 0) {
                                        break L27;
                                      } else {
                                        break L37;
                                      }
                                    }
                                    L39: {
                                      if (!var23[4][1]) {
                                        break L39;
                                      } else {
                                        if (!var23[4][2]) {
                                          break L39;
                                        } else {
                                          if (!var23[4][3]) {
                                            break L39;
                                          } else {
                                            L40: {
                                              if (!var23[1][4]) {
                                                break L40;
                                              } else {
                                                if (!var23[2][4]) {
                                                  break L40;
                                                } else {
                                                  if (!var23[3][4]) {
                                                    break L40;
                                                  } else {
                                                    L41: {
                                                      if (!var23[0][1]) {
                                                        break L41;
                                                      } else {
                                                        if (!var23[0][2]) {
                                                          break L41;
                                                        } else {
                                                          if (var23[0][3]) {
                                                            break L27;
                                                          } else {
                                                            break L41;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var12.field_a = 7;
                                                    var9 = -512;
                                                    if (var19 == 0) {
                                                      break L27;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var9 = 1024;
                                            var12.field_a = 7;
                                            if (var19 == 0) {
                                              break L27;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var12.field_a = 7;
                                    var9 = 512;
                                    if (var19 == 0) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var12.field_a = 10;
                                break L27;
                              }
                              var12.field_o = var9 + bl.field_c[var12.field_a];
                              var12.field_d = 0;
                              var12.field_p = 0;
                              break L6;
                            }
                          }
                          var11++;
                          if (var19 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var10++;
                    if (var19 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final boolean o(byte param0) {
        int var2 = 66 % ((25 - param0) / 57);
        if (!(this.field_h instanceof fsa)) {
            return false;
        }
        return true;
    }

    lma(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    public static void n(byte param0) {
        field_r = null;
        int var1 = -22 % ((param0 - 6) / 42);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 89 % ((-38 - param4) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lma.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int i(int param0) {
        if (param0 > -28) {
            this.field_u = -21;
        }
        return this.field_y;
    }

    static {
    }
}
