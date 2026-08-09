/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ie var5 = null;
        bc var6 = null;
        CharSequence var7 = null;
        try {
          L0: {
            var7 = (CharSequence) ((Object) param1);
            if (gi.a(false, var7)) {
              if (ji.field_Tb == 2) {
                if (ej.a(param1, 4)) {
                  stackIn_9_0 = hl.field_A;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param0 == 122) {
                      break L1;
                    } else {
                      var5 = (ie) null;
                      qf.a(-37, -32, (bh) null, (ie) null);
                      break L1;
                    }
                  }
                  if (oj.a(1, param1)) {
                    stackIn_15_0 = sk.a(new String[]{param1}, tc.field_n, 123);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (-101 < (qi.field_q ^ -1)) {
                        break L2;
                      } else {
                        if (0 < mb.field_C) {
                          break L2;
                        } else {
                          stackIn_19_0 = ha.field_g;
                          decompiledRegionSelector0 = 4;
                          break L0;
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
                        stackIn_27_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_25_0 = sk.a(new String[]{param1}, rh.field_J, 126);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_22_0 = ha.field_g;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_5_0 = el.field_qc;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = uk.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("qf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      return (String) ((Object) stackIn_27_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        ra.a();
        if (param0 != 1) {
            field_k = (se) null;
        }
    }

    final static void a(int param0, int param1, bh param2, ie param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            StringBuilder stackIn_40_1 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            nm var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  var18 = new nm();
                  var18.field_r = param2.d((byte) -99);
                  var18.field_s = param2.f(-118);
                  var18.field_u = new vl[var18.field_r];
                  var18.field_x = new vl[var18.field_r];
                  if (param1 == 4) {
                    break L1;
                  } else {
                    qf.a(85, false);
                    break L1;
                  }
                }
                var18.field_w = new int[var18.field_r];
                var18.field_q = new int[var18.field_r];
                var18.field_z = new int[var18.field_r];
                var18.field_t = new byte[var18.field_r][][];
                var5 = 0;
                L2: while (true) {
                  if (var18.field_r <= var5) {
                    bo.field_C.a(var18, false);
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
                                if (-3 != (var6_int ^ -1)) {
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
                                        var22 = new byte[var9][];
                                        var19 = var22;
                                        var11 = var19;
                                        if ((var6_int ^ -1) != -4) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var12_int >= var9) {
                                              break L8;
                                            } else {
                                              var13 = param2.f(param1 + -113);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param2.b(var13, 0, var22[var12_int], param1 ^ -29);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_z[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_u[var5] = param3.a(8, hh.a(var20, 42), var12, var21);
                                          var18.field_t[var5] = var22;
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
                          var18.field_z[var5] = var6_int;
                          var18.field_q[var5] = var9;
                          var18.field_x[var5] = param3.a(var15, 26298, hh.a(var16, -72));
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -2;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -3;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_w[var5] = -5;
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
                stackIn_37_0 = (RuntimeException) (var4);

                stackIn_37_1 = new StringBuilder().append("qf.D(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "null";
                  break L17;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

                if (param3 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "null";
                  break L18;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "{...}";
                  break L18;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ')');
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
        if (param0) {
            return;
        }
        field_e = null;
        field_j = null;
        field_k = null;
        field_f = null;
        field_b = null;
    }

    static {
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
