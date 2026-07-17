/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends dg {
    private sea field_p;
    private int field_q;
    private int field_o;
    private bt[] field_s;
    private lca[][] field_r;
    static String field_m;
    static jua field_t;
    private int field_u;
    static byte[] field_n;

    final static kg a(cn param0, cn param1, boolean param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        kg stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        kg stackOut_2_0 = null;
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
        try {
          L0: {
            L1: {
              var5_int = param0.b(param3, -7768);
              if (!param2) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            var6 = param0.a(true, param4, var5_int);
            stackOut_2_0 = sv.a(param1, var5_int, param0, 24876, var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("oo.I(");
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (((oo) this).field_r != null) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= ((oo) this).field_o) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (((oo) this).field_q <= var5) {
                        var4_int++;
                        continue L2;
                      } else {
                        param1.a(param0, (fo) (Object) ((oo) this).field_r[var4_int][var5], (byte) -33);
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
              if (null != ((oo) this).field_s) {
                var7 = 0;
                var4_int = var7;
                L5: while (true) {
                  if (var7 >= ((oo) this).field_s.length) {
                    break L4;
                  } else {
                    param1.a(2, (fo) (Object) ((oo) this).field_s[var7], (byte) -33);
                    var7++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            L6: {
              if (param2 > 40) {
                break L6;
              } else {
                field_m = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("oo.FA(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
            return -82;
        }
        return 0;
    }

    private final void k(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lca var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        la var17 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        var17 = ((oo) this).a(54);
        var3 = ((oo) this).field_h.d(3);
        var4 = ((oo) this).field_h.e(9648);
        ((oo) this).field_o = ((oo) this).field_h.c(-37) / dba.field_a;
        ((oo) this).field_q = ((oo) this).field_h.a((byte) 55) / dba.field_a;
        ((oo) this).field_r = new lca[((oo) this).field_o][((oo) this).field_q];
        var5 = -(((oo) this).field_h.a((byte) 55) / 2) + (var4 - -(dba.field_a / 2));
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((oo) this).field_q) {
            return;
          } else {
            var7 = var3 - ((oo) this).field_h.c(-60) / 2 + dba.field_a / 2;
            var8 = 0;
            L1: while (true) {
              if (((oo) this).field_o <= var8) {
                var5 = var5 + dba.field_a;
                var6++;
                continue L0;
              } else {
                L2: {
                  var9 = new lca();
                  ((oo) this).field_r[var8][var6] = var9;
                  if (var8 <= 0) {
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
                  var10 = stackIn_7_0;
                  if (var8 >= ((oo) this).field_o + -1) {
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
                  var11 = stackIn_10_0;
                  if (var6 <= 0) {
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
                  var12 = stackIn_13_0;
                  if (((oo) this).field_q - 1 <= var6) {
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
                  var13 = stackIn_16_0;
                  var14 = 0;
                  if (var10 != 0) {
                    var14++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var11 == 0) {
                    break L7;
                  } else {
                    var14++;
                    break L7;
                  }
                }
                L8: {
                  if (var12 == 0) {
                    break L8;
                  } else {
                    var14++;
                    break L8;
                  }
                }
                L9: {
                  if (var13 == 0) {
                    break L9;
                  } else {
                    var14++;
                    break L9;
                  }
                }
                L10: {
                  var15 = 0;
                  if (var14 == 4) {
                    var9.field_f = 2;
                    break L10;
                  } else {
                    if (3 == var14) {
                      var9.field_f = 0;
                      if (var12 == 0) {
                        var15 = 1024;
                        break L10;
                      } else {
                        if (var13 == 0) {
                          var15 = 0;
                          break L10;
                        } else {
                          if (var11 == 0) {
                            var15 = -512;
                            break L10;
                          } else {
                            var15 = 512;
                            break L10;
                          }
                        }
                      }
                    } else {
                      if (var14 != 2) {
                        var9.field_f = 2;
                        break L10;
                      } else {
                        L11: {
                          L12: {
                            if (var10 != 0) {
                              break L12;
                            } else {
                              if (var12 == 0) {
                                var15 = 512;
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              if (var13 == 0) {
                                var15 = 0;
                                var9.field_f = 1;
                                break L10;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var11 != 0) {
                              break L14;
                            } else {
                              if (var12 == 0) {
                                var15 = 1024;
                                var9.field_f = 1;
                                break L10;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (var11 != 0) {
                            break L11;
                          } else {
                            if (var13 == 0) {
                              var15 = -512;
                              var9.field_f = 1;
                              break L10;
                            } else {
                              var9.field_f = 1;
                              break L10;
                            }
                          }
                        }
                        var9.field_f = 1;
                        break L10;
                      }
                    }
                  }
                }
                var9.field_c = var17.e(true).a(100, 0);
                var9.field_a = (oo) this;
                var9.field_e = dfa.a(var15 + tfa.field_d[var9.field_f], 2048, -78);
                var9.field_d = -var4 + var5;
                var9.field_b = var7 - var3;
                var7 = var7 + dba.field_a;
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            field_m = null;
        }
        return param1 / (1 << param0) * param3;
    }

    oo(int param0) {
        super(param0);
        ((oo) this).field_u = 20;
    }

    final int k(byte param0) {
        if (param0 != -99) {
            return -7;
        }
        return 2;
    }

    final void b(int param0, uw param1) {
        try {
            if (!(((oo) this).field_r != null)) {
                this.k(-3440);
            }
            if (!(null != ((oo) this).field_s)) {
                this.i(-20687);
            }
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oo.WA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 50) {
                break L1;
              } else {
                int discarded$2 = ((oo) this).k((byte) -70);
                break L1;
              }
            }
            L2: {
              if (((oo) this).field_r == null) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (((oo) this).field_o <= var4_int) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (((oo) this).field_q <= var5) {
                        var4_int++;
                        continue L3;
                      } else {
                        param2.a((byte) -100, param1, (fo) (Object) ((oo) this).field_r[var4_int][var5]);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              if (null != ((oo) this).field_s) {
                var7 = 0;
                var4_int = var7;
                L6: while (true) {
                  if (var7 >= ((oo) this).field_s.length) {
                    break L5;
                  } else {
                    param2.a((byte) -88, 2, (fo) (Object) ((oo) this).field_s[var7]);
                    var7++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("oo.V(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    public static void j(int param0) {
        field_n = null;
        field_m = null;
        int var1 = 93;
        field_t = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 23 % ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oo.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        lca var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(106);
        if (((oo) this).field_r == null) {
            return;
        }
        if (param0 < 0) {
            return;
        }
        for (var2 = 0; ((oo) this).field_o > var2; var2++) {
            for (var3 = 0; ((oo) this).field_q > var3; var3++) {
                var4 = ((oo) this).field_r[var2][var3];
                var5 = tfa.field_d[var4.field_f];
                var4.field_e = dfa.a(var5 + -var4.field_e, 2048, -102);
                var4.field_b = -var4.field_b;
            }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 8 + param3 + 8 + (param2 - -487);
              v.field_i.a(var6_int + -6, -6 + era.field_e.field_t, -23776, 3, 3);
              var7 = -5 + v.field_i.field_t;
              if (param1 == -104) {
                break L1;
              } else {
                int discarded$1 = oo.a(-101, -90, 0, -88);
                break L1;
              }
            }
            L2: {
              sua.field_K.a(2 + (485 + param2 - -param3), param5, param1 + -23672, var7 + -param5, 5);
              pq.field_g.a(-param2 + sua.field_K.field_G - mka.field_b.field_G, param5, -23776, 0, param2);
              var7 = var7 - (2 + param5);
              mka.field_b.a(mka.field_b.field_G, param5, -23776, 0, param2 - -pq.field_g.field_G);
              ne.field_d.a(param3 + (2 + param2) + 485, 2, (byte) 127, 5, param3, -5 + var7, 5);
              if (apa.field_c == null) {
                break L2;
              } else {
                apa.field_c.a((byte) -31, ne.field_d.field_G, ne.field_d.field_t, ne.field_d.field_qb, ne.field_d.field_T);
                break L2;
              }
            }
            var8 = era.field_e.field_G - (param2 + var6_int);
            var9 = var8 / 2;
            var10 = var9 + (param0 - -param2);
            var11 = 0;
            var12 = 0;
            L3: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L4: {
                  L5: {
                    if (var12 >= 5) {
                      break L5;
                    } else {
                      if (null == wba.field_p[var12]) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var13 = 3 + var11 * (era.field_e.field_t - 4) / (gka.field_g - -1);
                  var11++;
                  var7 = -2 + (3 + var11 * (era.field_e.field_t - 4) / (1 + gka.field_g)) - var13;
                  if (var12 >= 5) {
                    ara.field_ub.a(var8, var7, -23776, var13, var6_int);
                    break L4;
                  } else {
                    wba.field_p[var12].a(var8, var7, -23776, var13, var6_int);
                    bt.field_c[var12].a(var9 + -param2, var7, -23776, 0, param2);
                    oka.field_y[var12].a(param0, -param4 + (var7 + -param4), -23776, param4, var9);
                    kva.field_p[var12].a(-var10 + (var8 + -param2), -param4 + (var7 - param4), -23776, param4, var10);
                    break L4;
                  }
                }
                var12++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "oo.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    oo(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((oo) this).field_u = 20;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (((oo) this).field_p == null) {
            ((oo) this).field_s = new bt[]{};
            return;
        }
        ((oo) this).field_s = new bt[((oo) this).field_p.c(3)];
        for (var2 = 0; var2 < ((oo) this).field_s.length; var2++) {
            ((oo) this).field_s[var2] = new bt();
            ((oo) this).field_s[var2].field_a = (oo) this;
            ((oo) this).field_s[var2].field_e = ((oo) this).field_p.b(45, var2);
        }
    }

    final void d(int param0) {
        w var2 = null;
        int var3_int = 0;
        fsa var3 = null;
        hca var4 = null;
        ac var5 = null;
        int var6 = 0;
        w var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        super.d(param0);
        if (((oo) this).field_s != null) {
          var7 = (w) (Object) ((oo) this).a(47).field_G;
          var2 = var7;
          if (var2 == null) {
            return;
          } else {
            L0: {
              if (0 < ((oo) this).field_u) {
                ((oo) this).field_u = ((oo) this).field_u - 1;
                break L0;
              } else {
                ((oo) this).field_u = uca.field_c.a(100, 0) + 50;
                var3_int = uca.field_c.a(((oo) this).field_s.length, ~param0);
                if (((oo) this).field_s[var3_int].field_e.a(0)) {
                  fla discarded$2 = var2.a(new fm(24, ((oo) this).field_s[var3_int].b((byte) -123), ((oo) this).field_s[var3_int].c((byte) 94), ((oo) this).field_s[var3_int].e((byte) -112)), param0 + -57);
                  break L0;
                } else {
                  fla discarded$3 = var7.a(new fm(23, ((oo) this).field_s[var3_int].b((byte) -83), ((oo) this).field_s[var3_int].c((byte) 122), ((oo) this).field_s[var3_int].e((byte) -107)), param0 + -57);
                  break L0;
                }
              }
            }
            var3 = (fsa) (Object) ((oo) this).field_h;
            if (var3 == null) {
              return;
            } else {
              L1: {
                var4 = var3.H(3);
                if (param0 == -1) {
                  break L1;
                } else {
                  ((oo) this).field_q = -26;
                  break L1;
                }
              }
              if (var4 != null) {
                L2: {
                  if (var3.a((byte) 110, var4.e(param0 ^ -9649), var4.d(3), var4.a((byte) 55), var4.c(-30))) {
                    var5 = var4.n((byte) -98);
                    if (var5 == null) {
                      return;
                    } else {
                      ((hf) (Object) var5).field_k = 1;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final ka a(boolean param0, lca param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        ka stackIn_9_0 = null;
        ka stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_12_0 = null;
        ka stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var4 = null;
                ((oo) this).a((byte) -92, -110, (uw) null);
                break L1;
              }
            }
            L2: {
              var3_int = param1.field_f;
              if (var3_int == 0) {
                break L2;
              } else {
                if (1 == var3_int) {
                  if (param1.field_c < 50) {
                    stackOut_12_0 = df.field_J[42];
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return df.field_J[43];
                  }
                } else {
                  if (var3_int != 2) {
                    break L2;
                  } else {
                    return df.field_J[44];
                  }
                }
              }
            }
            if (param1.field_c < 50) {
              stackOut_8_0 = df.field_J[40];
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              return df.field_J[41];
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("oo.B(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final int f(byte param0) {
        int var2 = 94 / ((param0 - 15) / 45);
        return -1;
    }

    final void a(uw param0, int param1) {
        super.a(param0, 118);
        if (param1 <= 82) {
            return;
        }
        try {
            ((oo) this).field_r = null;
            ((oo) this).field_s = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oo.RA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(param0 instanceof sea)) {
                break L1;
              } else {
                ((oo) this).field_p = (sea) (Object) param0;
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
            stackOut_3_1 = new StringBuilder().append("oo.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Status";
    }
}
