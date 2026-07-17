/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    static String field_a;
    static cr field_b;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 11) {
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= 10) {
                    break L0;
                  } else {
                    var2 = var1_int / 5;
                    var3 = -(var2 * 5) + (7 + var1_int);
                    var4 = 12 * var2 + var3;
                    al.field_A[var4] = "F" + (var3 + 1);
                    al.field_o[var4] = var3;
                    al.field_x[var4] = var2;
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                var2 = var1_int / 7;
                var3 = var1_int - 7 * var2;
                var4 = 12 * var2 + var3;
                al.field_A[var4] = "F" + (var3 + 1);
                al.field_o[var4] = var3 + 1;
                al.field_x[var4] = var2;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "vc.D(" + 0 + 41);
        }
    }

    final static void c(int param0) {
        if (hm.field_F != -sq.field_e) {
            if (-sq.field_e + 250 == hm.field_F) {
            }
        }
        int var1 = -30;
        hm.field_F = hm.field_F + 1;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param1.length() <= var2_int) {
                var2_int = 35 / ((-66 - param0) / 41);
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (oc.a((char) var3, (byte) -115)) {
                    break L2;
                  } else {
                    if (ab.a(false, (char) var3)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("vc.F(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        bs var1_ref = null;
        uh var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = (bs) (Object) mk.field_J.a((byte) 100);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (uh) (Object) nr.field_p.a((byte) 100);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (bs) (Object) kq.field_Rb.a((byte) 100);
                    L3: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        if (var1_ref.field_Ub > 0) {
                          L4: {
                            var1_ref.field_Ub = var1_ref.field_Ub - 1;
                            if (0 != var1_ref.field_Ub) {
                              break L4;
                            } else {
                              var1_ref.field_Hb = 0;
                              if (var1_ref.k(15)) {
                                var1_ref.c(2);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var1_ref = (bs) (Object) kq.field_Rb.b(38);
                          continue L3;
                        } else {
                          var1_ref = (bs) (Object) kq.field_Rb.b(38);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var1_ref2.field_ic > 0) {
                        var1_ref2.field_ic = var1_ref2.field_ic - 1;
                        if (0 == var1_ref2.field_ic) {
                          var1_ref2.field_Lb = 0;
                          if (var1_ref2.k(4043)) {
                            var1_ref2.c(2);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref2 = (uh) (Object) nr.field_p.b(47);
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (var1_ref.field_Ub > 0) {
                    var1_ref.field_Ub = var1_ref.field_Ub - 1;
                    if (var1_ref.field_Ub == 0) {
                      var1_ref.field_Hb = 0;
                      if (var1_ref.k(15)) {
                        var1_ref.c(2);
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var1_ref = (bs) (Object) mk.field_J.b(103);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "vc.E(" + -59 + 41);
        }
    }

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (so.field_B <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = so.field_B - 1;
              so.field_B = so.field_B - 1;
              var2_ref_byte__ = ac.field_O[fieldTemp$6];
              ac.field_O[so.field_B] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (ie.field_Kb > 0) {
              int fieldTemp$7 = ie.field_Kb - 1;
              ie.field_Kb = ie.field_Kb - 1;
              var2_ref_byte__ = bh.field_g[fieldTemp$7];
              bh.field_g[ie.field_Kb] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (ff.field_b > 0) {
              int fieldTemp$8 = ff.field_b - 1;
              ff.field_b = ff.field_b - 1;
              var2_ref_byte__ = uo.field_f[fieldTemp$8];
              uo.field_f[ff.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (df.field_j == null) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (ue.field_M.length <= var2) {
                break L3;
              } else {
                if (param0 == ue.field_M[var2]) {
                  if (mi.field_w[var2] > 0) {
                    mi.field_w[var2] = mi.field_w[var2] - 1;
                    var3 = df.field_j[var2][mi.field_w[var2] - 1];
                    df.field_j[var2][mi.field_w[var2]] = null;
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
          }
        }
        return new byte[param0];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var36 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var10_int = -83 / ((param7 - -84) / 37);
                if (param8 != param1) {
                  break L2;
                } else {
                  if (param4 != param5) {
                    break L2;
                  } else {
                    if (param0 != param6) {
                      break L2;
                    } else {
                      if (param3 == param2) {
                        uj.a(param8, param6, param3, true, param4, param9);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var11 = param8;
              var12 = param4;
              var13 = param8 * 3;
              var14 = 3 * param4;
              var15 = param1 * 3;
              var16 = 3 * param5;
              var17 = param0 * 3;
              var18 = 3 * param2;
              var19 = var15 + param6 - (var17 - -param8);
              var20 = -param4 + (var16 + -var18 + param3);
              var21 = var13 + (var17 - var15 - var15);
              var22 = var14 + (-var16 + var18 + -var16);
              var23 = -var13 + var15;
              var24 = -var14 + var16;
              var25 = 128;
              L3: while (true) {
                if (var25 > 4096) {
                  break L1;
                } else {
                  var26 = var25 * var25 >> 12;
                  var27 = var25 * var26 >> 12;
                  var28 = var19 * var27;
                  var29 = var20 * var27;
                  var30 = var21 * var26;
                  var31 = var26 * var22;
                  var32 = var23 * var25;
                  var33 = var25 * var24;
                  var34 = (var32 + var30 + var28 >> 12) + param8;
                  var35 = (var29 + (var31 - -var33) >> 12) + param4;
                  uj.a(var11, var34, var35, true, var12, param9);
                  var11 = var34;
                  var12 = var35;
                  var25 += 128;
                  continue L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var10, "vc.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for fonts";
    }
}
