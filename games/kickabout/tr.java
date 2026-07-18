/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr implements hc {
    private int field_a;
    static String field_g;
    static int[] field_e;
    private int field_h;
    static long field_d;
    static String field_c;
    static hh field_b;
    static String[] field_f;

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        qg var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1 = (qg) (Object) tk.field_Ab.h(-125);
              if (null == var1) {
                var1 = new qg();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -12974) {
                break L2;
              } else {
                tr.a(true);
                break L2;
              }
            }
            var1.a((byte) -96, on.field_e, on.field_b, on.field_a, on.field_g, on.field_f, on.field_h, on.field_c);
            ik.field_C.a((gn) (Object) var1, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "tr.E(" + param0 + ')');
        }
    }

    public final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 63) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!od.field_n) {
                  break L3;
                } else {
                  if (!sf.c(-3, -1)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "tr.O(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public final void a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!pn.g(2368)) {
                  break L2;
                } else {
                  if ((8 & ((tr) this).field_h) != 0) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            L3: {
              var2_int = stackIn_7_0;
              var4 = 125 / ((param0 - 50) / 45);
              sr.a(var2_int != 0, (byte) -89);
              var3 = g.field_a.field_T;
              if (((tr) this).a((byte) 103)) {
                break L3;
              } else {
                if (480 <= var3) {
                  break L3;
                } else {
                  on.c(0, var3, 640, 0, 128);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "tr.L(" + param0 + ')');
        }
    }

    final static String b(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + dj.field_A + " " + wb.field_n + " " + kq.field_Ab + ") " + so.field_b;
                if (ms.field_b <= 0) {
                  break L3;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (var2 >= ms.field_b) {
                      break L3;
                    } else {
                      stackOut_7_0 = var1_ref + ' ';
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_8_0;
                            var3 = un.field_e.field_f[var2] & 255;
                            var4 = var3 >> 99833380;
                            var3 = var3 & 15;
                            if (10 > var4) {
                              break L6;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 48;
                          break L5;
                        }
                        L7: {
                          L8: {
                            if (var3 < 10) {
                              break L8;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 48;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = (String) var1_ref;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "tr.B(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final static int a(ea param0, boolean param1, ea param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_17_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var13 = fr.a(param2, ra.field_F, true);
                  var14 = fr.a(param2, tf.field_g, true);
                  var15 = fr.a(param2, gm.field_fb, true);
                  var16 = fr.a(param2, ao.field_i, true);
                  var7 = rq.a(2, param2.field_l, (byte) -99, var15, param2, var13, var16, param2.field_c + 1, var14);
                  var4 = jr.field_Mb;
                  var9 = rq.a(1, param2.field_d, (byte) -99, var15, param2, var13, var16, 1 + param2.field_i, var14);
                  var5 = jr.field_Mb;
                  var11 = rq.a(0, param2.field_e, (byte) -99, var15, param2, var13, var16, 1 + param2.field_k, var14);
                  var6 = jr.field_Mb;
                  if (var9 > var7) {
                    break L3;
                  } else {
                    if (var7 >= var11) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var7 > var9) {
                      break L5;
                    } else {
                      if (var9 >= var11) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3_int = 0;
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
                var3_int = 1;
                if (var17 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var3_int = 2;
              if (var4 < 0) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              } else {
                break L1;
              }
            }
            L6: {
              param0.field_l = param2.field_l;
              param0.field_e = param2.field_e;
              param0.field_d = param2.field_d;
              if (var3_int == 2) {
                param0.field_k = param2.field_k;
                param2.field_l = var4;
                param0.field_c = var4;
                param0.field_i = param2.field_i;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!param1) {
                break L7;
              } else {
                tr.a(true);
                break L7;
              }
            }
            L8: {
              if (var3_int != 1) {
                break L8;
              } else {
                param0.field_k = param2.field_k;
                param0.field_c = param2.field_c;
                param2.field_d = var5;
                param0.field_i = var5;
                break L8;
              }
            }
            L9: {
              if (var3_int != 0) {
                break L9;
              } else {
                param0.field_c = param2.field_c;
                param0.field_i = param2.field_i;
                param2.field_e = var6;
                param0.field_k = var6;
                break L9;
              }
            }
            param2.field_h = (param2.field_e - param2.field_k) * (-param2.field_c + param2.field_l) * (-param2.field_i + param2.field_d);
            param0.field_h = (-param0.field_k + param0.field_e) * (param0.field_l + -param0.field_c) * (-param0.field_i + param0.field_d);
            stackOut_31_0 = 1;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("tr.A(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L10;
            }
          }
          L11: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_32_0;
    }

    final static gg a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        gg var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        gg stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_23_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (kw.field_b == null) {
                break L1;
              } else {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length() == 0) {
                    break L1;
                  } else {
                    L2: {
                      var2 = mo.a(0, (CharSequence) (Object) param0);
                      if (param1 == 40) {
                        break L2;
                      } else {
                        field_g = null;
                        break L2;
                      }
                    }
                    if (var2 != null) {
                      var3 = (gg) (Object) kw.field_b.a(param1 ^ -3635, (long)var2.hashCode());
                      L3: while (true) {
                        L4: {
                          if (var3 == null) {
                            break L4;
                          } else {
                            var4 = mo.a(param1 ^ 40, (CharSequence) (Object) var3.field_Gb);
                            if (var4.equals((Object) (Object) var2)) {
                              stackOut_23_0 = (gg) var3;
                              stackIn_24_0 = stackOut_23_0;
                              return stackIn_24_0;
                            } else {
                              var3 = (gg) (Object) kw.field_b.a((byte) 103);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      }
                    } else {
                      stackOut_16_0 = null;
                      stackIn_17_0 = stackOut_16_0;
                      return (gg) (Object) stackIn_17_0;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = null;
            stackIn_11_0 = stackOut_10_0;
            return (gg) (Object) stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2_ref;
            stackOut_28_1 = new StringBuilder().append("tr.D(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ')');
        }
        return (gg) (Object) stackIn_27_0;
    }

    private final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((tr) this).field_a = -6;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((tr) this).a((byte) 94)) {
                  break L3;
                } else {
                  L4: {
                    if (!bt.field_e) {
                      break L4;
                    } else {
                      if (sf.c(-1, -1)) {
                        break L3;
                      } else {
                        if (!sf.c(-2, -1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "tr.F(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        boolean stackIn_37_7 = false;
        int stackIn_37_8 = 0;
        int stackIn_37_9 = 0;
        int stackIn_37_10 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        int stackIn_39_6 = 0;
        boolean stackIn_39_7 = false;
        int stackIn_39_8 = 0;
        int stackIn_39_9 = 0;
        int stackIn_39_10 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        int stackIn_40_6 = 0;
        boolean stackIn_40_7 = false;
        int stackIn_40_8 = 0;
        int stackIn_40_9 = 0;
        int stackIn_40_10 = 0;
        int stackIn_40_11 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        boolean stackOut_36_7 = false;
        int stackOut_36_8 = 0;
        int stackOut_36_9 = 0;
        int stackOut_36_10 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        int stackOut_39_5 = 0;
        int stackOut_39_6 = 0;
        boolean stackOut_39_7 = false;
        int stackOut_39_8 = 0;
        int stackOut_39_9 = 0;
        int stackOut_39_10 = 0;
        int stackOut_39_11 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        boolean stackOut_37_7 = false;
        int stackOut_37_8 = 0;
        int stackOut_37_9 = 0;
        int stackOut_37_10 = 0;
        int stackOut_37_11 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -25) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (od.field_n) {
                  break L3;
                } else {
                  ll.c((byte) 51);
                  ((tr) this).field_a = 0;
                  if (Kickabout.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!this.c(-1)) {
                  break L4;
                } else {
                  if (((tr) this).field_a >= 20) {
                    break L4;
                  } else {
                    ((tr) this).field_a = ((tr) this).field_a + 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (this.c(-1)) {
                  break L5;
                } else {
                  if (((tr) this).field_a > 0) {
                    ((tr) this).field_a = ((tr) this).field_a - 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                L7: {
                  var3_int = -(((tr) this).field_a * ((tr) this).field_a) + 400;
                  var4 = var3_int * (-np.field_Bb + 480) / 400 + np.field_Bb;
                  up.a(var4, (byte) -124);
                  ((tr) this).field_h = ((tr) this).field_h + 1;
                  kp.a(-121);
                  if (null == uv.field_i) {
                    break L7;
                  } else {
                    if (!sp.a(uv.field_i.field_Eb, -3, uv.field_i.field_bc, uv.field_i.field_gc)) {
                      break L7;
                    } else {
                      if (!tu.field_E.d((byte) 46)) {
                        break L7;
                      } else {
                        stackOut_29_0 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L6;
              }
              L8: {
                var5 = stackIn_32_0;
                stackOut_32_0 = 0;
                stackOut_32_1 = -117;
                stackOut_32_2 = 15;
                stackIn_35_0 = stackOut_32_0;
                stackIn_35_1 = stackOut_32_1;
                stackIn_35_2 = stackOut_32_2;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                if (nq.g(0) <= 50) {
                  stackOut_35_0 = stackIn_35_0;
                  stackOut_35_1 = stackIn_35_1;
                  stackOut_35_2 = stackIn_35_2;
                  stackOut_35_3 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  break L8;
                } else {
                  stackOut_33_0 = stackIn_33_0;
                  stackOut_33_1 = stackIn_33_1;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = 1;
                  stackIn_36_0 = stackOut_33_0;
                  stackIn_36_1 = stackOut_33_1;
                  stackIn_36_2 = stackOut_33_2;
                  stackIn_36_3 = stackOut_33_3;
                  break L8;
                }
              }
              L9: {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = stackIn_36_1;
                stackOut_36_2 = stackIn_36_2;
                stackOut_36_3 = stackIn_36_3;
                stackOut_36_4 = 14;
                stackOut_36_5 = var5;
                stackOut_36_6 = id.field_v;
                stackOut_36_7 = param1;
                stackOut_36_8 = 11;
                stackOut_36_9 = 1;
                stackOut_36_10 = 13;
                stackIn_39_0 = stackOut_36_0;
                stackIn_39_1 = stackOut_36_1;
                stackIn_39_2 = stackOut_36_2;
                stackIn_39_3 = stackOut_36_3;
                stackIn_39_4 = stackOut_36_4;
                stackIn_39_5 = stackOut_36_5;
                stackIn_39_6 = stackOut_36_6;
                stackIn_39_7 = stackOut_36_7;
                stackIn_39_8 = stackOut_36_8;
                stackIn_39_9 = stackOut_36_9;
                stackIn_39_10 = stackOut_36_10;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                stackIn_37_2 = stackOut_36_2;
                stackIn_37_3 = stackOut_36_3;
                stackIn_37_4 = stackOut_36_4;
                stackIn_37_5 = stackOut_36_5;
                stackIn_37_6 = stackOut_36_6;
                stackIn_37_7 = stackOut_36_7;
                stackIn_37_8 = stackOut_36_8;
                stackIn_37_9 = stackOut_36_9;
                stackIn_37_10 = stackOut_36_10;
                if (((tr) this).a((byte) 121)) {
                  stackOut_39_0 = stackIn_39_0;
                  stackOut_39_1 = stackIn_39_1;
                  stackOut_39_2 = stackIn_39_2;
                  stackOut_39_3 = stackIn_39_3;
                  stackOut_39_4 = stackIn_39_4;
                  stackOut_39_5 = stackIn_39_5;
                  stackOut_39_6 = stackIn_39_6;
                  stackOut_39_7 = stackIn_39_7;
                  stackOut_39_8 = stackIn_39_8;
                  stackOut_39_9 = stackIn_39_9;
                  stackOut_39_10 = stackIn_39_10;
                  stackOut_39_11 = 0;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  stackIn_40_3 = stackOut_39_3;
                  stackIn_40_4 = stackOut_39_4;
                  stackIn_40_5 = stackOut_39_5;
                  stackIn_40_6 = stackOut_39_6;
                  stackIn_40_7 = stackOut_39_7;
                  stackIn_40_8 = stackOut_39_8;
                  stackIn_40_9 = stackOut_39_9;
                  stackIn_40_10 = stackOut_39_10;
                  stackIn_40_11 = stackOut_39_11;
                  break L9;
                } else {
                  stackOut_37_0 = stackIn_37_0;
                  stackOut_37_1 = stackIn_37_1;
                  stackOut_37_2 = stackIn_37_2;
                  stackOut_37_3 = stackIn_37_3;
                  stackOut_37_4 = stackIn_37_4;
                  stackOut_37_5 = stackIn_37_5;
                  stackOut_37_6 = stackIn_37_6;
                  stackOut_37_7 = stackIn_37_7;
                  stackOut_37_8 = stackIn_37_8;
                  stackOut_37_9 = stackIn_37_9;
                  stackOut_37_10 = stackIn_37_10;
                  stackOut_37_11 = 1;
                  stackIn_40_0 = stackOut_37_0;
                  stackIn_40_1 = stackOut_37_1;
                  stackIn_40_2 = stackOut_37_2;
                  stackIn_40_3 = stackOut_37_3;
                  stackIn_40_4 = stackOut_37_4;
                  stackIn_40_5 = stackOut_37_5;
                  stackIn_40_6 = stackOut_37_6;
                  stackIn_40_7 = stackOut_37_7;
                  stackIn_40_8 = stackOut_37_8;
                  stackIn_40_9 = stackOut_37_9;
                  stackIn_40_10 = stackOut_37_10;
                  stackIn_40_11 = stackOut_37_11;
                  break L9;
                }
              }
              L10: {
                te.a(stackIn_40_0, (byte) stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0, stackIn_40_4, stackIn_40_5 != 0, stackIn_40_6, stackIn_40_7, stackIn_40_8, stackIn_40_9 != 0, stackIn_40_10, stackIn_40_11 != 0);
                if (!gs.field_e) {
                  break L10;
                } else {
                  or.field_d.b(50, (byte) 105);
                  gs.field_e = false;
                  break L10;
                }
              }
              if (!mg.field_f) {
                break L2;
              } else {
                or.field_d.b(10, (byte) -97);
                mg.field_f = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "tr.P(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
            field_e = null;
            field_f = null;
            field_g = null;
            field_b = null;
            field_c = null;
            if (param0) {
                gg discarded$0 = tr.a((String) null, (byte) -45);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "tr.C(" + param0 + ')');
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_28_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 11516) {
                break L1;
              } else {
                ((tr) this).field_a = -5;
                break L1;
              }
            }
            L2: {
              L3: {
                if (tk.field_Ib >= 2) {
                  break L3;
                } else {
                  if (eq.field_d <= 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (!ne.field_G[86]) {
                break L2;
              } else {
                if (84 == param1) {
                  L4: {
                    L5: {
                      if (null == e.field_m) {
                        break L5;
                      } else {
                        fd.h(0);
                        if (Kickabout.field_G == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    dw.a(true, param0 + -11516);
                    break L4;
                  }
                  stackOut_21_0 = 1;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            if (!((tr) this).a((byte) 73)) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0 != 0;
            } else {
              stackOut_28_0 = ss.a((byte) 88, 12, 15, 13);
              stackIn_29_0 = stackOut_28_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "tr.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_29_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = "Profile";
        field_e = new int[16];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 16) {
            field_c = "In an Exhibition Game you don't play with your normal team, but with premade level 50 players instead.";
            field_f = new String[]{"Showing by rating", "Showing by win percentage"};
            field_b = new hh();
            return;
          } else {
            field_e[var0] = var0 * (var0 * 65793);
            var0++;
            continue L0;
          }
        }
    }
}
