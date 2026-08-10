/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String[] field_a;
    static long field_e;
    static int field_c;
    static int field_d;
    static String field_b;
    static ti[] field_f;

    public static void a(int param0) {
        int var1 = 122 % ((-70 - param0) / 50);
        field_b = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(byte param0) {
        String var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 29) {
            break L0;
          } else {
            var2 = (String) null;
            ua.a((ci) null, (String) null, -14, (ci) null, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == nk.field_b) {
              break L2;
            } else {
              if (!lj.field_z.a(-65)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void b(byte param0) {
        int stackIn_12_0 = 0;
        sj stackIn_17_0 = null;
        sj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        sj stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        sj stackIn_33_0;
        int stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        sj stackIn_42_0 = null;
        sj stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 12;
              if (oa.field_j < 34) {
                break L1;
              } else {
                if (34 + 12 * wl.field_K.field_n <= oa.field_j) {
                  break L1;
                } else {
                  if (114 > bk.field_a) {
                    break L1;
                  } else {
                    if (wl.field_K.field_m + 114 <= bk.field_a) {
                      break L1;
                    } else {
                      var1_int = (-34 + oa.field_j) / wl.field_K.field_n;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (od.field_g.field_e[11] != null) {
                var1_int = 12;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (od.field_g == sg.field_d.field_o) {
                stackIn_12_0 = sg.field_d.field_t;
                break L3;
              } else {
                stackIn_12_0 = 12;
                break L3;
              }
            }
            var2 = stackIn_12_0;
            var3 = 0;
            L4: while (true) {
              L5: {
                if ((var3 ^ -1) <= -13) {
                  break L5;
                } else {
                  var4 = od.field_g.field_e[var3];
                  if (var4 == null) {
                    break L5;
                  } else {
                    L6: {
                      stackIn_17_0 = (sj) (var4);

                      if (var1_int > var3) {
                        stackIn_18_0 = (sj) ((Object) stackIn_17_0);
                        stackIn_18_1 = 0;
                        break L6;
                      } else {
                        stackIn_18_0 = (sj) ((Object) stackIn_17_0);
                        stackIn_18_1 = 32;
                        break L6;
                      }
                    }
                    L7: {


                      stackIn_20_1 = stackIn_18_1 + var3 * 32;

                      stackIn_20_2 = 34;

                      if (var3 <= var2) {
                        stackIn_18_0 = (sj) ((Object) stackIn_18_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = 0;
                        break L7;
                      } else {
                        stackIn_18_0 = (sj) ((Object) stackIn_18_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = -32;
                        break L7;
                      }
                    }
                    stackIn_18_0.field_g = stackIn_21_1 + (stackIn_21_2 - -stackIn_21_3);
                    var3++;
                    continue L4;
                  }
                }
              }
              L8: {
                if (param0 > 57) {
                  break L8;
                } else {
                  ua.a(51, 18);
                  break L8;
                }
              }
              L9: {
                if (var2 > var1_int) {
                  var3 = 0;
                  L10: while (true) {
                    if (-13 >= (var3 ^ -1)) {
                      break L9;
                    } else {
                      var4 = od.field_g.field_e[var3];
                      if (var4 != null) {
                        L11: {
                          L12: {
                            stackIn_42_0 = (sj) (var4);

                            if (var1_int > var3) {
                              break L12;
                            } else {


                              if (var3 < var2) {
                                stackIn_44_0 = (sj) ((Object) stackIn_42_0);
                                stackIn_44_1 = 32;
                                break L11;
                              } else {
                                stackIn_42_0 = (sj) ((Object) stackIn_42_0);
                                break L12;
                              }
                            }
                          }
                          stackIn_44_0 = (sj) ((Object) stackIn_42_0);
                          stackIn_44_1 = 0;
                          break L11;
                        }
                        stackIn_44_0.field_g = stackIn_44_1 + (34 - -(32 * var3));
                        var3++;
                        continue L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  L13: while (true) {
                    if (12 <= var3) {
                      break L9;
                    } else {
                      var4 = od.field_g.field_e[var3];
                      if (var4 == null) {
                        break L9;
                      } else {
                        L14: {
                          L15: {
                            stackIn_31_0 = (sj) (var4);

                            stackIn_31_1 = 34;

                            stackIn_31_2 = 32 * var3;

                            if (var3 > var1_int) {
                              break L15;
                            } else {






                              if (var2 < var3) {
                                stackIn_33_0 = (sj) ((Object) stackIn_31_0);
                                stackIn_33_1 = stackIn_31_1;
                                stackIn_33_2 = stackIn_31_2;
                                stackIn_33_3 = -32;
                                break L14;
                              } else {
                                stackIn_31_0 = (sj) ((Object) stackIn_31_0);


                                break L15;
                              }
                            }
                          }
                          stackIn_33_0 = (sj) ((Object) stackIn_31_0);
                          stackIn_33_1 = stackIn_31_1;
                          stackIn_33_2 = stackIn_31_2;
                          stackIn_33_3 = 0;
                          break L14;
                        }
                        stackIn_33_0.field_g = stackIn_33_1 + (stackIn_33_2 + stackIn_33_3);
                        var3++;
                        continue L13;
                      }
                    }
                  }
                }
              }
              L16: {
                if (sg.field_d == null) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      sg.field_d.field_j = oa.field_j - -rk.field_p;
                      sg.field_d.field_q = bk.field_a + ek.field_e;
                      if (sg.field_d.field_j != sg.field_d.field_g) {
                        break L18;
                      } else {
                        if (sg.field_d.field_q == sg.field_d.field_p) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    nc.field_s = null;
                    break L17;
                  }
                  sg.field_d.field_p = sg.field_d.field_q;
                  sg.field_d.field_g = sg.field_d.field_j;
                  break L16;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ua.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        wf var2 = null;
        int var3 = 0;
        int var4 = 0;
        gh var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5 = (gh) ((Object) mf.field_b.a((byte) -95));
            var3 = -73 / ((param0 - 80) / 36);
            L1: while (true) {
              if (var5 == null) {
                var2 = pj.field_A.a((byte) -95);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ki.a(false, param1);
                    var2 = pj.field_A.a(true);
                    continue L2;
                  }
                }
              } else {
                nb.a(param1, var5, 0);
                var5 = (gh) ((Object) mf.field_b.a(true));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "ua.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static hh a(ci param0, String param1, int param2, ci param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 32) {
                break L1;
              } else {
                field_d = 80;
                break L1;
              }
            }
            var5_int = param0.b(80, param1);
            var6 = param0.a(param2 ^ -33, param4, var5_int);
            stackIn_3_0 = pe.a((byte) -66, param0, var5_int, param3, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ua.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, fe param1, int param2, oa param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            StringBuilder stackIn_42_1 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
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
            ba var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param2 == -22635) {
                    break L1;
                  } else {
                    ua.a(-89);
                    break L1;
                  }
                }
                var18 = new ba();
                var18.field_p = param3.d((byte) 101);
                var18.field_i = param3.c((byte) -127);
                var18.field_o = new ib[var18.field_p];
                var18.field_j = new int[var18.field_p];
                var18.field_k = new int[var18.field_p];
                var18.field_h = new int[var18.field_p];
                var18.field_m = new ib[var18.field_p];
                var18.field_g = new byte[var18.field_p][][];
                var5 = 0;
                L2: while (true) {
                  if (var18.field_p <= var5) {
                    wg.field_f.a(var18, param2 ^ 22577);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param3.d((byte) 26);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (-2 == (var6_int ^ -1)) {
                                break L5;
                              } else {
                                if (2 == var6_int) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param3.g(12248);
                                  var21 = param3.g(12248);
                                  var9 = param3.d((byte) 116);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var9 <= var11_int) {
                                      L8: {
                                        var22 = new byte[var9][];
                                        var19 = var22;
                                        var11 = var19;
                                        if ((var6_int ^ -1) == -4) {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param3.c((byte) -126);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param3.a(var13, 2, var22[var12_int], 0);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var18.field_j[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_o[var5] = param1.a(ek.a(3249872, var20), (byte) 81, var12, var21);
                                          var18.field_g[var5] = var22;
                                          break L4;
                                        } else {
                                          var12[var17] = ek.a(3249872, var10[var17]);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param3.g(param2 + 34883);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param3.g(param2 + 34883);
                            var15 = param3.g(12248);
                            var9 = 0;
                            if (1 == var6_int) {
                              var9 = param3.c((byte) -121);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_j[var5] = var6_int;
                          var18.field_h[var5] = var9;
                          var18.field_m[var5] = param1.a(ak.a(param2, 22529), var15, ek.a(ak.a(param2, -3264187), var16));
                          break L4;
                        }
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_k[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_k[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_k[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_k[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_k[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_39_0 = (RuntimeException) (var4);

                stackIn_39_1 = new StringBuilder().append("ua.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "null";
                  break L18;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "{...}";
                  break L18;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new String[]{"mummy", "skeleton", "pumpkin", "vampire"};
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
