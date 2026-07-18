/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private boolean field_d;
    private gi field_i;
    static vb field_p;
    private int field_h;
    static ik field_c;
    static mj field_f;
    static String field_b;
    private Object[][] field_l;
    private rf field_m;
    static int field_a;
    private Object[] field_g;
    static String field_o;
    static ed field_k;
    static boolean[] field_j;
    static String field_e;
    static sf field_n;

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        ni var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        ni var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var22 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.a(true, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((rh) this).field_g[param1]) {
                L1: {
                  var5_int = ((rh) this).field_m.field_f[param1];
                  var6 = ((rh) this).field_m.field_h[param1];
                  if (null == ((rh) this).field_l[param1]) {
                    ((rh) this).field_l[param1] = new Object[((rh) this).field_m.field_v[param1]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((rh) this).field_l[param1];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10_int = var9_int;
                          break L4;
                        } else {
                          var10_int = var6[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10_int] != null) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param0[0]) {
                              break L7;
                            } else {
                              if (-1 != param0[1]) {
                                break L7;
                              } else {
                                if (-1 != param0[2]) {
                                  break L7;
                                } else {
                                  if (param0[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = jg.a(false, ((rh) this).field_g[param1], true);
                          var10_ref = new ni(var9_array);
                          var10_ref.a(param0, 5, -1, var10_ref.field_k.length);
                          break L5;
                        }
                      }
                      var9_array = jg.a(false, ((rh) this).field_g[param1], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var23 = qi.a(var9_array, -22518);
                        var10 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_33_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_33_1 = new StringBuilder();
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param0 == null) {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          break L9;
                        } else {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L9;
                        }
                      }
                      throw pf.a((Throwable) (Object) stackIn_36_0, (stackIn_36_2 != 0) + " " + param1 + " " + param0.length + " " + ia.a(true, var9_array, param0.length) + " " + ia.a(true, var9_array, param0.length + -2) + " " + ((rh) this).field_m.field_u[param1] + " " + ((rh) this).field_m.field_p);
                    }
                    L10: {
                      if (((rh) this).field_d) {
                        ((rh) this).field_g[param1] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int > 1) {
                        if (((rh) this).field_h == 2) {
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var13 = new ni(var10);
                          var14 = 0;
                          var15 = 0;
                          var13.field_i = var11;
                          var16_int = 0;
                          L12: while (true) {
                            if (var16_int >= var12) {
                              if (var14 == 0) {
                                stackOut_86_0 = 1;
                                stackIn_87_0 = stackOut_86_0;
                                return stackIn_87_0 != 0;
                              } else {
                                var16 = new byte[var14];
                                var14 = 0;
                                var13.field_i = var11;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = (Object) (Object) var16;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var13.c((byte) -70);
                                          if (var6 != null) {
                                            var21 = var6[var20];
                                            break L15;
                                          } else {
                                            var21 = var20;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (param3 != var21) {
                                            break L16;
                                          } else {
                                            dm.a(var10, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var5_int) {
                                  var16_int++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var13.c((byte) -91);
                                    if (var6 != null) {
                                      var19 = var6[var18];
                                      break L18;
                                    } else {
                                      var19 = var18;
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var19 == param3) {
                                      var14 = var14 + var17;
                                      var15 = var19;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var18++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var5_int * var12);
                          var13 = new ni(var10);
                          var14_ref_int__ = new int[var5_int];
                          var13.field_i = var11;
                          var15 = 0;
                          L20: while (true) {
                            if (var12 <= var15) {
                              var15_ref_byte____ = new byte[var5_int][];
                              var16_int = 0;
                              L21: while (true) {
                                if (var16_int >= var5_int) {
                                  var13.field_i = var11;
                                  var16_int = 0;
                                  var17 = 0;
                                  L22: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L23: while (true) {
                                        if (var17 >= var5_int) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var18 = var6[var17];
                                              break L24;
                                            } else {
                                              var18 = var17;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (((rh) this).field_h == 0) {
                                              int discarded$2 = -137;
                                              var7[var18] = kh.a(false, var15_ref_byte____[var17]);
                                              break L25;
                                            } else {
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              break L25;
                                            }
                                          }
                                          var17++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L26: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L22;
                                        } else {
                                          var18 = var18 + var13.c((byte) -35);
                                          dm.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16_int = var16_int + var18;
                                          var19++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  continue L21;
                                }
                              }
                            } else {
                              var16_int = 0;
                              var17 = 0;
                              L27: while (true) {
                                if (var17 >= var5_int) {
                                  var15++;
                                  continue L20;
                                } else {
                                  var16_int = var16_int + var13.c((byte) -123);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                  var17++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 == null) {
                            var11 = 0;
                            break L28;
                          } else {
                            var11 = var6[0];
                            break L28;
                          }
                        }
                        if (((rh) this).field_h != 0) {
                          var7[var11] = (Object) (Object) var10;
                          break L11;
                        } else {
                          int discarded$3 = -137;
                          var7[var11] = kh.a(false, var23);
                          return true;
                        }
                      }
                    }
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var5;
            stackOut_102_1 = new StringBuilder().append("rh.M(");
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param0 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L29;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L29;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param1 + ',' + 0 + ',' + param3 + ')');
        }
        return stackIn_101_0 != 0;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (!((rh) this).b((byte) -126)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            if (param0 <= -12) {
              break L0;
            } else {
              ((long[]) ((rh) this).field_g[3])[7] = ((long[]) ((rh) this).field_g[3])[8];
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((rh) this).field_m.field_r.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((rh) this).field_m.field_r[var3];
              if (null == ((rh) this).field_g[var4]) {
                this.a((byte) 101, var4);
                if (((rh) this).field_g[var4] == null) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
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
            if (!((rh) this).b((byte) -126)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == -100) {
                  break L1;
                } else {
                  ((rh) this).field_g = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              int discarded$2 = 0;
              var3_int = ((rh) this).field_m.field_j.a(tb.a(var4), (byte) 123);
              if (!this.a(true, var3_int)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("rh.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1, int param2, int[] param3, byte param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param1--;
              if (0 > param1) {
                L2: {
                  if (param4 <= -65) {
                    break L2;
                  } else {
                    rh.c((byte) -61);
                    break L2;
                  }
                }
                break L0;
              } else {
                var9 = param3;
                var5 = var9;
                var6 = param2;
                var7 = param0;
                var9[var6] = (sc.a(16711422, var9[var6]) >> 1) + var7;
                param2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("rh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
        }
    }

    final synchronized boolean b(byte param0) {
        if (((rh) this).field_m == null) {
            ((rh) this).field_m = ((rh) this).field_i.a(-1712);
            if (!(((rh) this).field_m != null)) {
                return false;
            }
            ((rh) this).field_l = new Object[((rh) this).field_m.field_i][];
            ((rh) this).field_g = new Object[((rh) this).field_m.field_i];
        }
        if (param0 > -97) {
            Object var3 = null;
            int discarded$0 = ((rh) this).a((String) null, (byte) 76);
            return true;
        }
        return true;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -91) {
                break L1;
              } else {
                boolean discarded$4 = this.a(((boolean[]) ((rh) this).field_g[0])[1], ((int[]) ((rh) this).field_g[3])[4]);
                break L1;
              }
            }
            if (!((rh) this).b((byte) -110)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              int discarded$5 = 0;
              var3_int = ((rh) this).field_m.field_j.a(tb.a(var4), (byte) 125);
              stackOut_6_0 = ((rh) this).c(var3_int, 14969);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rh.T(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
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
        int stackOut_5_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_1_0 = 0;
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
            if (((rh) this).b((byte) -102)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var7 = (CharSequence) (Object) param1;
              int discarded$4 = 0;
              var4_int = ((rh) this).field_m.field_j.a(tb.a(var7), (byte) 121);
              if (!this.a(true, var4_int)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                var5 = -70 / ((-21 - param2) / 33);
                var8 = (CharSequence) (Object) param0;
                int discarded$5 = 0;
                var6 = ((rh) this).field_m.field_k[var4_int].a(tb.a(var8), (byte) 116);
                stackOut_7_0 = ((rh) this).a((byte) -29, var4_int, var6);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("rh.L(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(-10, param1, param2)) {
            return false;
        }
        if (param0 != -29) {
            return ((boolean[]) ((rh) this).field_g[11])[1];
        }
        if (((rh) this).field_l[param1] != null) {
            if (!(((rh) this).field_l[param1][param2] == null)) {
                return true;
            }
        }
        if (((rh) this).field_g[param1] != null) {
            return true;
        }
        this.a((byte) 101, param1);
        if (null != ((rh) this).field_g[param1]) {
            return true;
        }
        return false;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 == 37) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            if (((rh) this).b((byte) -111)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              int discarded$2 = 0;
              var3_int = ((rh) this).field_m.field_j.a(tb.a(var4), (byte) 126);
              if (var3_int >= 0) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("rh.K(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    public static void c(byte param0) {
        field_o = null;
        if (param0 != -110) {
            return;
        }
        field_f = null;
        field_c = null;
        field_k = null;
        field_p = null;
        field_b = null;
        field_n = null;
        field_j = null;
        field_e = null;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((rh) this).b((byte) -101)) {
              if (param0 < -37) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                int discarded$2 = 0;
                var3_int = ((rh) this).field_m.field_j.a(tb.a(var4), (byte) 125);
                stackOut_6_0 = ((rh) this).b(var3_int, -2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((int[]) ((rh) this).field_g[13])[2];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rh.P(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final int d(byte param0) {
        if (!((rh) this).b((byte) -99)) {
            return -1;
        }
        int var2 = -22 % ((-8 - param0) / 41);
        return ((rh) this).field_m.field_v.length;
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = fleas.field_A ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = ic.field_db[(int)(-(param1 * 37L) + var7)];
            if (!(95 != var9)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final int a(String param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
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
            if (!this.a(true, param2)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == -15) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              int discarded$2 = 0;
              var4_int = ((rh) this).field_m.field_k[param2].a(tb.a(var5), (byte) 118);
              if (!this.a(-51, param2, var4_int)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return var4_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("rh.V(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != -2) {
            return -13;
        }
        if (!this.a(true, param0)) {
            return 0;
        }
        if (null != ((rh) this).field_g[param0]) {
            return 100;
        }
        return ((rh) this).field_i.a(param0, (byte) -5);
    }

    private final synchronized boolean a(boolean param0, int param1) {
        if (param0) {
          if (((rh) this).b((byte) -124)) {
            L0: {
              if (param1 < 0) {
                break L0;
              } else {
                if (param1 >= ((rh) this).field_m.field_v.length) {
                  break L0;
                } else {
                  if (((rh) this).field_m.field_v[param1] != 0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (!rj.field_n) {
              return false;
            } else {
              throw new IllegalArgumentException(Integer.toString(param1));
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7, ce param8) {
        try {
            fh.field_g = param5;
            wj.field_d = param1;
            il.field_g = param4;
            of.field_b = param3;
            pg.field_c = param6;
            b.field_a = param0;
            mh.field_x = param8;
            tj.field_c = param7;
            td.field_k = (w) (Object) new g();
            vg.field_r = new af(param8);
            gf.field_e = new uf(td.field_k, vg.field_r);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rh.R(" + param0 + ',' + param1 + ',' + 8737 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (this.a(-63, param3, param0)) {
              var5 = null;
              L1: {
                L2: {
                  if (null == ((rh) this).field_l[param3]) {
                    break L2;
                  } else {
                    if (((rh) this).field_l[param3][param0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(param2, param3, 0, param0)) {
                  break L1;
                } else {
                  this.a((byte) 101, param3);
                  if (this.a(param2, param3, 0, param0)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (((rh) this).field_l[param3] != null) {
                L3: {
                  if (((rh) this).field_l[param3][param0] != null) {
                    var7 = jg.a(false, ((rh) this).field_l[param3][param0], false);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((rh) this).field_h == 1) {
                      ((rh) this).field_l[param3][param0] = null;
                      if (1 == ((rh) this).field_m.field_v[param3]) {
                        ((rh) this).field_l[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (((rh) this).field_h == 2) {
                        ((rh) this).field_l[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("rh.AA(").append(param0).append(',').append(true).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 < 113) {
            field_j = null;
        }
        return this.a(param2, true, (int[]) null, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4 = -7 / ((param0 - 68) / 34);
        if (!(((rh) this).b((byte) -110))) {
            return false;
        }
        if (param1 >= 0) {
            if (param2 >= 0) {
                if (((rh) this).field_m.field_v.length > param1) {
                    if (param2 < ((rh) this).field_m.field_v[param1]) {
                        return true;
                    }
                }
            }
        }
        if (!rj.field_n) {
            return false;
        }
        throw new IllegalArgumentException(param1 + " " + param2);
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((rh) this).b((byte) -115)) {
            return null;
        }
        if (1 == ((rh) this).field_m.field_v.length) {
            return ((rh) this).a(0, (byte) 117, param0);
        }
        if (!this.a(true, param0)) {
            return null;
        }
        if (!(((rh) this).field_m.field_v[param0] != 1)) {
            return ((rh) this).a(param0, (byte) 116, 0);
        }
        if (param1 != 0) {
            ((rh) this).field_l = null;
        }
        throw new RuntimeException();
    }

    final int a(int param0, byte param1) {
        if (!(this.a(true, param0))) {
            return 0;
        }
        if (param1 > -91) {
            boolean discarded$0 = ((rh) this).c(-123, 42);
        }
        return ((rh) this).field_m.field_v[param0];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
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
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
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
            if (((rh) this).b((byte) -128)) {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (param0 == 0) {
                  break L1;
                } else {
                  field_k = null;
                  break L1;
                }
              }
              var6 = (CharSequence) (Object) param2;
              int discarded$4 = 0;
              var4_int = ((rh) this).field_m.field_j.a(tb.a(var6), (byte) 118);
              if (this.a(true, var4_int)) {
                var7 = (CharSequence) (Object) param1;
                int discarded$5 = 0;
                var5 = ((rh) this).field_m.field_k[var4_int].a(tb.a(var7), (byte) 117);
                stackOut_8_0 = ((rh) this).a(var4_int, (byte) 115, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("rh.W(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized void a(byte param0, int param1) {
        if (!((rh) this).field_d) {
            int discarded$1 = -137;
            ((rh) this).field_g[param1] = kh.a(false, ((rh) this).field_i.b(param1, false));
        } else {
            ((rh) this).field_g[param1] = (Object) (Object) ((rh) this).field_i.b(param1, false);
        }
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (!((rh) this).b((byte) -113)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          if (param0 < -38) {
            L0: while (true) {
              if (var4 >= ((rh) this).field_g.length) {
                if (var2 != 0) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (((rh) this).field_m.field_f[var4] > 0) {
                  var2 += 100;
                  var3 = var3 + ((rh) this).b(var4, -2);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          } else {
            return -101;
          }
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(true, param0)) {
            return false;
        }
        if (!(null == ((rh) this).field_g[param0])) {
            return true;
        }
        this.a((byte) 101, param0);
        if (param1 != 14969) {
            return false;
        }
        if (((rh) this).field_g[param0] == null) {
            return false;
        }
        return true;
    }

    rh(gi param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
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
        ((rh) this).field_m = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((rh) this).field_h = param2;
                    ((rh) this).field_i = param0;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((rh) this).field_d = stackIn_7_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("rh.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Previous";
        field_o = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_a = 20;
        field_f = new mj();
        field_e = null;
        field_j = new boolean[]{false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false};
    }
}
