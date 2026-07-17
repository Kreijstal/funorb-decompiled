/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qf {
    static String field_a;
    static String field_c;
    static df field_h;
    static String[] field_f;
    static String field_e;
    static String field_j;
    static int field_i;
    static String[] field_b;
    static boolean field_g;
    static se field_k;
    static String field_d;

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        bc var6 = null;
        CharSequence var7 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        Object stackOut_26_0 = null;
        String stackOut_24_0 = null;
        String stackOut_21_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var7 = (CharSequence) (Object) param1;
            if (gi.a(false, var7)) {
              if (ji.field_Tb == 2) {
                if (ej.a(param1, 4)) {
                  stackOut_8_0 = hl.field_A;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  L1: {
                    if (param0 == 122) {
                      break L1;
                    } else {
                      var5 = null;
                      qf.a(-37, -32, (bh) null, (ie) null);
                      break L1;
                    }
                  }
                  if (oj.a(1, param1)) {
                    stackOut_14_0 = sk.a(new String[1], tc.field_n, 123);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    L2: {
                      if (qi.field_q < 100) {
                        break L2;
                      } else {
                        if (0 < mb.field_C) {
                          break L2;
                        } else {
                          stackOut_18_0 = ha.field_g;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    }
                    if (qi.field_q < 200) {
                      if (!sb.a((byte) 2, param1)) {
                        var6 = nd.field_Lb;
                        var6.f(param2, (byte) -92);
                        var6.field_t = var6.field_t + 1;
                        var4 = var6.field_t;
                        var6.a(0, false);
                        var6.a(param1, 0);
                        var6.b(var6.field_t + -var4, param0 ^ -124);
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      } else {
                        stackOut_24_0 = sk.a(new String[1], rh.field_J, 126);
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                    } else {
                      stackOut_21_0 = ha.field_g;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    }
                  }
                }
              } else {
                stackOut_4_0 = el.field_qc;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = uk.field_u;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("qf.C(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L3;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_27_0;
    }

    final static void a(int param0, boolean param1) {
        ra.a();
        if (param0 != 1) {
            field_k = null;
        }
    }

    final static void a(int param0, int param1, bh param2, ie param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  var18 = (Object) (Object) new nm();
                  ((nm) var18).field_r = param2.d((byte) -99);
                  ((nm) var18).field_s = param2.f(-118);
                  ((nm) var18).field_u = new vl[((nm) var18).field_r];
                  ((nm) var18).field_x = new vl[((nm) var18).field_r];
                  if (param1 == 4) {
                    break L1;
                  } else {
                    qf.a(85, false);
                    break L1;
                  }
                }
                ((nm) var18).field_w = new int[((nm) var18).field_r];
                ((nm) var18).field_q = new int[((nm) var18).field_r];
                ((nm) var18).field_z = new int[((nm) var18).field_r];
                ((nm) var18).field_t = new byte[((nm) var18).field_r][][];
                var5 = 0;
                L2: while (true) {
                  if (((nm) var18).field_r <= var5) {
                    bo.field_C.a((mc) var18, false);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param2.d((byte) -99);
                            if (var6_int == 0) {
                              break L5;
                            } else {
                              if (var6_int == 1) {
                                break L5;
                              } else {
                                if (var6_int != 2) {
                                  L6: {
                                    if (var6_int == 3) {
                                      break L6;
                                    } else {
                                      if (var6_int == 4) {
                                        break L6;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  var20 = param2.g((byte) 81);
                                  var21 = param2.g((byte) 81);
                                  var9 = param2.d((byte) -99);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var9 <= var11_int) {
                                      L8: {
                                        var24 = new byte[var9][];
                                        var23 = var24;
                                        var22 = var23;
                                        var19 = var22;
                                        var11 = var19;
                                        if (var6_int != 3) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var12_int >= var9) {
                                              break L8;
                                            } else {
                                              var13 = param2.f(param1 + -113);
                                              var11[var12_int] = new byte[var13];
                                              param2.b(var13, 0, var24[var12_int], param1 ^ -29);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      ((nm) var18).field_z[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          ((nm) var18).field_u[var5] = param3.a(8, hh.a(var20, 42), var12, var21);
                                          ((nm) var18).field_t[var5] = var24;
                                          break L4;
                                        } else {
                                          var12[var17] = hh.a(var10[var17], 111);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.g((byte) 81);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param2.g((byte) 81);
                            var7 = var16;
                            var15 = param2.g((byte) 81);
                            var8 = var15;
                            var9 = 0;
                            if (1 != var6_int) {
                              break L11;
                            } else {
                              var9 = param2.f(-123);
                              break L11;
                            }
                          }
                          ((nm) var18).field_z[var5] = var6_int;
                          ((nm) var18).field_q[var5] = var9;
                          ((nm) var18).field_x[var5] = param3.a(var15, 26298, hh.a(var16, -72));
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((nm) var18).field_w[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((nm) var18).field_w[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((nm) var18).field_w[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("qf.D(").append(param0).append(44).append(param1).append(44);
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param2 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L17;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L17;
                }
              }
              L18: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param3 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L18;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L18;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_j = null;
        field_k = null;
        field_f = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Don't mind";
        field_e = "Buying or selling an account";
        field_a = "Tips";
        field_f = new String[]{"2D - Fastest", "2D - Best", "3D - Fastest", "3D - Balanced", "3D - Best"};
        field_b = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_i = 20;
        field_h = new df(2);
        field_d = "Switch to 3D mode";
    }
}
