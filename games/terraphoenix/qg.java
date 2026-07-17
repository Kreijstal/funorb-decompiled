/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int field_a;

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        dh var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new dh(param1);
              var3 = var9.a(-16384);
              var4 = var9.f((byte) -107);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (eg.field_h == 0) {
                    break L2;
                  } else {
                    if (var4 <= eg.field_h) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 == param0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(var4, 0, 93, var17);
                  stackOut_20_0 = (byte[]) var5;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.f((byte) -107);
                    if (-1 > var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (eg.field_h == 0) {
                          break L4;
                        } else {
                          if (eg.field_h >= var5_int) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 != 1) {
                          var7 = (Object) (Object) wj.field_c;
                          synchronized (var7) {
                            L6: {
                              wj.field_c.a(var9, 10, var16);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$1 = ih.a(var16, var5_int, param1, var4, 9);
                          break L5;
                        }
                      }
                      stackOut_18_0 = (byte[]) var6;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("qg.C(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (0 >= nl.field_b) {
              break L0;
            } else {
              byte[][] fieldTemp$8 = il.field_b;
              int fieldTemp$9 = nl.field_b - 1;
              nl.field_b = nl.field_b - 1;
              var2_ref_byte__ = fieldTemp$8[fieldTemp$9];
              il.field_b[nl.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (mg.field_o <= 0) {
              break L1;
            } else {
              int fieldTemp$10 = mg.field_o - 1;
              mg.field_o = mg.field_o - 1;
              var2_ref_byte__ = na.field_Z[fieldTemp$10];
              na.field_Z[mg.field_o] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1 != 30000) {
            break L2;
          } else {
            if (g.field_cb > 0) {
              int fieldTemp$11 = g.field_cb - 1;
              g.field_cb = g.field_cb - 1;
              var2_ref_byte__ = dg.field_e[fieldTemp$11];
              dg.field_e[g.field_cb] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != ol.field_Kb) {
            var2 = 0;
            L4: while (true) {
              if (tc.field_c.length <= var2) {
                break L3;
              } else {
                if (param1 == tc.field_c[var2]) {
                  if (ba.field_g[var2] > 0) {
                    ba.field_g[var2] = ba.field_g[var2] - 1;
                    var3 = ol.field_Kb[var2][ba.field_g[var2] - 1];
                    ol.field_Kb[var2][ba.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (param0 > 19) {
            break L5;
          } else {
            field_a = -93;
            break L5;
          }
        }
        return new byte[param1];
    }

    final static ud a(byte param0, fa param1, String param2, fa param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ud stackIn_3_0 = null;
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
        ud stackOut_2_0 = null;
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
              var5_int = param3.c(-1, param2);
              if (param0 == 94) {
                break L1;
              } else {
                byte[] discarded$2 = qg.a(83, -23);
                break L1;
              }
            }
            var6 = param3.a(-128, var5_int, param4);
            stackOut_2_0 = wl.a(param1, var5_int, param3, var6, -121);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("qg.D(").append(param0).append(44);
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(ci param0, int param1, byte param2, int param3, int param4, int param5) {
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              param5 = param5 + param4;
              param1 = param1 + param0.field_p;
              param4 = param4 - (-15 + param0.field_u);
              param4 = param4 + param0.field_v;
              var6_int = param1 - -(l.field_k * param4);
              var7 = 0;
              var8 = param1;
              var9 = param4;
              var10 = param0.field_t;
              var11 = param0.field_r;
              var12 = -var11 + l.field_k;
              if (~param4 <= ~l.field_d) {
                break L1;
              } else {
                var14 = l.field_d + -param4;
                var10 = var10 - var14;
                var7 = var7 + var14 * var11;
                var6_int = var6_int + l.field_k * var14;
                param4 = l.field_d;
                var9 = var9 + var14;
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param1 < l.field_b) {
                var14 = -param1 + l.field_b;
                var6_int = var6_int + var14;
                var12 = var12 + var14;
                param1 = l.field_b;
                var13 = var13 + var14;
                var8 = var8 + var14;
                var7 = var7 + var14;
                var11 = var11 - var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 + var10 > l.field_c) {
                var10 = var10 - (-l.field_c + (param4 - -var10));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var11 + param1 > l.field_f) {
                var14 = -l.field_f + var11 + param1;
                var13 = var13 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param2 == 0) {
                break L5;
              } else {
                byte[] discarded$15 = qg.a(113, 32);
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (var10 <= 0) {
                  break L6;
                } else {
                  var14 = var8;
                  var16 = -(var11 >> 2);
                  var11 = -(var11 & 3);
                  var17 = -var10;
                  L7: while (true) {
                    if (var17 >= 0) {
                      break L0;
                    } else {
                      var18 = var16;
                      L8: while (true) {
                        if (0 <= var18) {
                          var8 = var14;
                          var18 = var11;
                          L9: while (true) {
                            if (var18 >= 0) {
                              L10: {
                                var9++;
                                if (~(param0.field_t + (param4 - 15)) >= ~var9) {
                                  param5++;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var7 = var7 + var13;
                              var6_int = var6_int + var12;
                              var17++;
                              continue L7;
                            } else {
                              L11: {
                                int incrementValue$16 = var7;
                                var7++;
                                var15 = param0.field_z[incrementValue$16];
                                if (0 == var15) {
                                  var6_int++;
                                  break L11;
                                } else {
                                  int incrementValue$17 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 106, true, param3, var15, incrementValue$17);
                                  break L11;
                                }
                              }
                              var18++;
                              continue L9;
                            }
                          }
                        } else {
                          L12: {
                            L13: {
                              int incrementValue$18 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$18];
                              if (var15 == 0) {
                                break L13;
                              } else {
                                if (~gd.field_a[var8][var9] < ~param5) {
                                  break L13;
                                } else {
                                  int incrementValue$19 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$19][var9] = param5;
                                  int incrementValue$20 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 95, true, param3, var15, incrementValue$20);
                                  break L12;
                                }
                              }
                            }
                            var8++;
                            var6_int++;
                            break L12;
                          }
                          L14: {
                            L15: {
                              int incrementValue$21 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$21];
                              if (var15 == 0) {
                                break L15;
                              } else {
                                if (param5 < gd.field_a[var8][var9]) {
                                  break L15;
                                } else {
                                  int incrementValue$22 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$22][var9] = param5;
                                  int incrementValue$23 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 57, true, param3, var15, incrementValue$23);
                                  break L14;
                                }
                              }
                            }
                            var8++;
                            var6_int++;
                            break L14;
                          }
                          L16: {
                            L17: {
                              int incrementValue$24 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$24];
                              if (var15 == 0) {
                                break L17;
                              } else {
                                if (~param5 <= ~gd.field_a[var8][var9]) {
                                  int incrementValue$25 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$25][var9] = param5;
                                  int incrementValue$26 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 50, true, param3, var15, incrementValue$26);
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            var8++;
                            var6_int++;
                            break L16;
                          }
                          L18: {
                            L19: {
                              int incrementValue$27 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$27];
                              if (0 == var15) {
                                break L19;
                              } else {
                                if (~param5 > ~gd.field_a[var8][var9]) {
                                  break L19;
                                } else {
                                  int incrementValue$28 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$28][var9] = param5;
                                  int incrementValue$29 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 40, true, param3, var15, incrementValue$29);
                                  break L18;
                                }
                              }
                            }
                            var6_int++;
                            var8++;
                            break L18;
                          }
                          var18++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var6;
            stackOut_51_1 = new StringBuilder().append("qg.B(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L20;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L20;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
