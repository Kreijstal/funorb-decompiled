/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends mu {
    static String field_db;
    static ut field_cb;
    static int field_bb;
    static int[][] field_eb;

    vo(se param0, fd param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void a(byte param0, fd param1) {
        try {
            if (param0 > -117) {
                field_cb = null;
            }
            super.a((byte) -127, param1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vo.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(byte param0, String param1, String[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = 2 + var6_int;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!gn.a(12105, param1.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (gr.a((byte) 15, (CharSequence) (Object) var7_ref_String)) {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (62 == param1.charAt(var5)) {
                        var5++;
                        var8 = rr.a(10, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (param2[var8].length() + (var6_int + -var5));
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                L4: {
                  if (param0 == -18) {
                    break L4;
                  } else {
                    field_bb = 91;
                    break L4;
                  }
                }
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (0 <= var8) {
                    var5 = 2 + var8;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!gn.a(12105, param1.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(var8 - -2, var5);
                      if (!gr.a((byte) 15, (CharSequence) (Object) var9)) {
                        continue L5;
                      } else {
                        if (var3_int <= var5) {
                          continue L5;
                        } else {
                          if (62 != param1.charAt(var5)) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = rr.a(10, (CharSequence) (Object) var9);
                            StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                            StringBuilder discarded$4 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$5 = var6.append(param1.substring(var7));
                    stackOut_27_0 = var6.toString();
                    stackIn_28_0 = stackOut_27_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("vo.VA(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_28_0;
    }

    public static void j(byte param0) {
        field_cb = null;
        field_db = null;
        field_eb = null;
        if (param0 <= 29) {
            vo.j((byte) -47);
        }
    }

    final static void a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        iw var16 = null;
        iw var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var16 = new iw(param1);
            var17 = var16;
            var17.field_n = -2 + param1.length;
            io.field_l = var17.a((byte) 81);
            lo.field_j = new int[io.field_l];
            rm.field_B = new boolean[io.field_l];
            es.field_e = new byte[io.field_l][];
            ku.field_c = new int[io.field_l];
            aq.field_f = new int[io.field_l];
            fc.field_g = new int[io.field_l];
            pq.field_O = new byte[io.field_l][];
            var17.field_n = -(io.field_l * 8) + param1.length - 7;
            kw.field_i = var17.a((byte) 81);
            ai.field_J = var17.a((byte) 81);
            var3 = 1 + (var17.h((byte) -116) & 255);
            var4 = 0;
            L1: while (true) {
              if (var4 >= io.field_l) {
                var4 = 0;
                L2: while (true) {
                  if (io.field_l <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= io.field_l) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= io.field_l) {
                            var17.field_n = -7 + (param1.length + (-(io.field_l * 8) + -(3 * (-1 + var3))));
                            lt.field_a = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_n = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= io.field_l) {
                                    var5 = 111 % ((param0 - 11) / 61);
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = ku.field_c[var4];
                                      var6 = lo.field_j[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      pq.field_O[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      es.field_e[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.h((byte) -127);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.j((byte) -74);
                                                        var9[var12 - -(var13 * var5)] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_45_0 = var10;
                                                        stackIn_47_0 = stackOut_45_0;
                                                        stackIn_46_0 = stackOut_45_0;
                                                        if (var14 == -1) {
                                                          stackOut_47_0 = stackIn_47_0;
                                                          stackOut_47_1 = 0;
                                                          stackIn_48_0 = stackOut_47_0;
                                                          stackIn_48_1 = stackOut_47_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 1;
                                                          stackIn_48_0 = stackOut_46_0;
                                                          stackIn_48_1 = stackOut_46_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_48_0 | stackIn_48_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var5 * var13 + var12] = var17.j((byte) -102);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.j((byte) -49);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_29_0 = var10;
                                                    stackIn_31_0 = stackOut_29_0;
                                                    stackIn_30_0 = stackOut_29_0;
                                                    if (var13 == -1) {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 0;
                                                      stackIn_32_0 = stackOut_31_0;
                                                      stackIn_32_1 = stackOut_31_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 1;
                                                      stackIn_32_0 = stackOut_30_0;
                                                      stackIn_32_1 = stackOut_30_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_32_0 | stackIn_32_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.j((byte) -86);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    rm.field_B[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  lt.field_a[var4] = var17.i(-123);
                                  if (lt.field_a[var4] == 0) {
                                    lt.field_a[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            lo.field_j[var4] = var17.a((byte) 81);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        ku.field_c[var4] = var17.a((byte) 81);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    fc.field_g[var4] = var17.a((byte) 81);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                aq.field_f[var4] = var16.a((byte) 81);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("vo.WA(").append(param0).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = "Message game";
        field_bb = 0;
        field_eb = new int[7][4];
        field_eb[3][3] = 0;
        field_eb[3][1] = 40;
        field_eb[3][0] = 0;
        field_eb[3][2] = 60;
        field_eb[4][2] = 60;
        field_eb[4][0] = 0;
        field_eb[4][1] = 30;
        field_eb[4][3] = 10;
        field_eb[5][2] = 60;
        field_eb[5][1] = 20;
        field_eb[5][0] = 0;
        field_eb[5][3] = 20;
        field_eb[6][3] = 30;
        field_eb[6][1] = 0;
        field_eb[6][0] = 0;
        field_eb[6][2] = 70;
    }
}
