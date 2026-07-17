/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends pl {
    int field_G;
    int field_O;
    int field_L;
    int field_J;
    static boolean field_Q;
    int field_K;
    static int field_H;
    static int[] field_I;
    int field_M;
    static String field_P;
    static String field_F;
    static long field_N;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              sg.field_b = new o[6][];
              ok.field_e = new o[6][5][];
              bd.field_c = new o[6];
              ok.field_e[0][0] = pe.a("", mi.field_E, "monster00", 110);
              ok.field_e[0][1] = pe.a("", mi.field_E, "monster01", 125);
              ok.field_e[0][2] = pe.a("", mi.field_E, "monster02", 121);
              ok.field_e[0][4] = pe.a("", mi.field_E, "monster04", 94);
              sg.field_b[0] = pe.a("", mi.field_E, "level1blocks", 110);
              bd.field_c[0] = vg.a(15, "level1background", mi.field_E, "");
              bd.field_c[1] = vg.a(15, "level2background", mi.field_E, "");
              sg.field_b[1] = pe.a("", mi.field_E, "level2blocks", 122);
              ok.field_e[1][0] = pe.a("", mi.field_E, "monster10", 97);
              ok.field_e[1][1] = pe.a("", mi.field_E, "monster11", 121);
              ok.field_e[1][2] = pe.a("", mi.field_E, "monster12", 96);
              ok.field_e[1][3] = pe.a("", mi.field_E, "monster13", 115);
              ok.field_e[1][4] = pe.a("", mi.field_E, "monster14", 112);
              bd.field_c[2] = vg.a(15, "level3background", mi.field_E, "");
              sg.field_b[2] = pe.a("", mi.field_E, "level3blocks", 102);
              ok.field_e[2][0] = pe.a("", mi.field_E, "monster20", 89);
              ok.field_e[2][1] = pe.a("", mi.field_E, "monster21", 124);
              ok.field_e[2][2] = pe.a("", mi.field_E, "monster22", 118);
              ok.field_e[2][3] = pe.a("", mi.field_E, "monster23", 97);
              ok.field_e[2][4] = pe.a("", mi.field_E, "monster24", 119);
              bd.field_c[3] = vg.a(15, "level4background", mi.field_E, "");
              sg.field_b[3] = pe.a("", mi.field_E, "level4blocks", 90);
              ok.field_e[3][0] = pe.a("", mi.field_E, "monster30", 111);
              ok.field_e[3][1] = pe.a("", mi.field_E, "monster31", 104);
              ok.field_e[3][2] = pe.a("", mi.field_E, "monster32", 118);
              ok.field_e[3][4] = pe.a("", mi.field_E, "monster34", 105);
              bd.field_c[4] = vg.a(15, "level5background", mi.field_E, "");
              sg.field_b[4] = pe.a("", mi.field_E, "level5blocks", 92);
              ok.field_e[4][0] = pe.a("", mi.field_E, "monster40", 125);
              if (param0 <= -27) {
                break L1;
              } else {
                ug.a(false, (byte) -19, 6, -5, (le) null);
                break L1;
              }
            }
            ok.field_e[4][1] = pe.a("", mi.field_E, "monster41", 91);
            ok.field_e[4][2] = pe.a("", mi.field_E, "monster42", 119);
            ok.field_e[4][3] = pe.a("", mi.field_E, "monster43", 121);
            ok.field_e[4][4] = pe.a("", mi.field_E, "monster44", 114);
            bd.field_c[5] = vg.a(15, "level6background", mi.field_E, "");
            sg.field_b[5] = pe.a("", mi.field_E, "level6blocks", 93);
            ok.field_e[5][0] = pe.a("", mi.field_E, "monster50", 107);
            ok.field_e[5][1] = pe.a("", mi.field_E, "monster52", 115);
            ok.field_e[5][2] = pe.a("", mi.field_E, "monster51", 90);
            ok.field_e[5][3] = pe.a("", mi.field_E, "monster53", 98);
            ok.field_e[5][4] = pe.a("", mi.field_E, "monster54", 107);
            hh.field_eb = pe.a("", mi.field_E, "monster55", 110);
            h.field_j = pe.a("", mi.field_E, "monster56", 125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ug.EA(" + param0 + 41);
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = wizardrun.field_H;
        try {
          L0: {
            var8_int = 11 / ((param1 - 12) / 36);
            if (super.a(param0, (byte) 69, param2, param3, param4, param5, param6)) {
              L1: {
                var9 = -param0 + -((ug) this).field_o + (-((ug) this).field_J + param2);
                var10 = param5 + (-((ug) this).field_L + -param3) + -((ug) this).field_l;
                if (~(var9 * var9 + var10 * var10) <= ~(((ug) this).field_G * ((ug) this).field_G)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var11 = Math.atan2((double)var10, (double)var9) - fb.field_b;
                      if (var11 >= 0.0) {
                        break L3;
                      } else {
                        var11 = var11 - 3.141592653589793 / (double)((ug) this).field_O;
                        if (var13 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var11 <= 0.0) {
                      break L2;
                    } else {
                      var11 = var11 + 3.141592653589793 / (double)((ug) this).field_O;
                      break L2;
                    }
                  }
                  ((ug) this).field_M = (int)(var11 * (double)((ug) this).field_O / 6.283185307179586);
                  L4: while (true) {
                    L5: {
                      if (~((ug) this).field_M > ~((ug) this).field_O) {
                        break L5;
                      } else {
                        ((ug) this).field_M = ((ug) this).field_M - ((ug) this).field_O;
                        if (var13 != 0) {
                          break L1;
                        } else {
                          if (var13 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (((ug) this).field_M >= 0) {
                        break L1;
                      } else {
                        ((ug) this).field_M = ((ug) this).field_M + ((ug) this).field_O;
                        if (var13 == 0) {
                          continue L6;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            } else {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("ug.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param6 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final static void a(boolean param0, byte param1, int param2, int param3, le param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        byte stackOut_48_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var19 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var5_int = dj.a(false, 3 * (param2 + -param3));
              var6 = 3 * param3;
              var7 = -10 + var5_int;
              vj.b(0);
              if (0 >= param4.field_n) {
                break L1;
              } else {
                if (null == param4.field_x) {
                  break L1;
                } else {
                  of.c(45);
                  break L1;
                }
              }
            }
            kg.field_c = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param4.field_N >= ~var8) {
                    break L4;
                  } else {
                    var9 = param4.field_p[var8];
                    var10 = param4.field_C[var8];
                    var11 = param4.field_I[var8];
                    stackOut_9_0 = param0;
                    stackIn_49_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0) {
                            var12 = nl.field_A[var9];
                            var13 = d.field_c[var9];
                            var14 = -var12 + nl.field_A[var10];
                            var15 = -var12 + nl.field_A[var11];
                            var16 = -var13 + d.field_c[var10];
                            var17 = d.field_c[var11] + -var13;
                            if (var14 * var17 - var16 * var15 < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var12 = dl.field_a[var9];
                        if (var12 == -2147483648) {
                          break L5;
                        } else {
                          L7: {
                            var13 = dl.field_a[var10];
                            if (-2147483648 != var13) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var14 = dl.field_a[var11];
                          if (-2147483648 == var14) {
                            break L5;
                          } else {
                            L8: {
                              var15 = var14 + (var13 + var12) + -var6;
                              if (var7 >= 0) {
                                stackOut_27_0 = var15 >> var7;
                                stackIn_28_0 = stackOut_27_0;
                                break L8;
                              } else {
                                stackOut_25_0 = var15 << -var7;
                                stackIn_28_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var16 = -stackIn_28_0 + (id.field_b.length + -1);
                            var17 = id.field_b[var16];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (var17 >> 4 == 0) {
                                    break L11;
                                  } else {
                                    var16--;
                                    stackOut_30_0 = ~var16;
                                    stackOut_30_1 = -1;
                                    stackIn_39_0 = stackOut_30_0;
                                    stackIn_39_1 = stackOut_30_1;
                                    stackIn_31_0 = stackOut_30_0;
                                    stackIn_31_1 = stackOut_30_1;
                                    if (var19 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_31_0 <= stackIn_31_1) {
                                          break L12;
                                        } else {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var17 = id.field_b[var16];
                                      if (var19 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_38_0 = var16 << 4;
                                stackOut_38_1 = var17;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                break L10;
                              }
                              L13: {
                                var18 = stackIn_39_0 + stackIn_39_1;
                                cb.field_e[var18] = var8;
                                id.field_b[var16] = var17 - -1;
                                if (0 >= param4.field_n) {
                                  break L13;
                                } else {
                                  if (param4.field_x != null) {
                                    t.field_a[param4.field_x[var8]] = t.field_a[param4.field_x[var8]] + 1;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              kg.field_c = kg.field_c + 1;
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_48_0 = param1;
                stackIn_49_0 = stackOut_48_0;
                break L3;
              }
              L14: {
                if (stackIn_49_0 == 11) {
                  break L14;
                } else {
                  field_H = -15;
                  break L14;
                }
              }
              L15: {
                L16: {
                  if (param4.field_n <= 0) {
                    break L16;
                  } else {
                    if (null != param4.field_x) {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (t.field_a.length <= var9) {
                          break L16;
                        } else {
                          var10 = t.field_a[var9];
                          t.field_a[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var5;
            stackOut_65_1 = new StringBuilder().append("ug.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param4 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L18;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -13542) {
                break L1;
              } else {
                ug.d(-125);
                break L1;
              }
            }
            field_F = null;
            field_I = null;
            field_P = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ug.DA(" + param0 + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        Exception var6 = null;
        java.awt.Graphics var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5 = wizardrun.field_G.getGraphics();
                  if (null != mh.field_ob) {
                    break L2;
                  } else {
                    mh.field_ob = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param1) {
                    var5.setColor(java.awt.Color.black);
                    var5.fillRect(0, 0, rg.field_R, rg.field_P);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (null == param4) {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (hg.field_b == null) {
                        hg.field_b = wizardrun.field_G.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var6_ref = hg.field_b.getGraphics();
                      var6_ref.setColor(param4);
                      if (param0 == 10487) {
                        break L7;
                      } else {
                        ug.a(106, false, -93, (String) null, (java.awt.Color) null);
                        break L7;
                      }
                    }
                    var6_ref.drawRect(0, 0, 303, 33);
                    var6_ref.fillRect(2, 2, param2 * 3, 30);
                    var6_ref.setColor(java.awt.Color.black);
                    var6_ref.drawRect(1, 1, 301, 31);
                    var6_ref.fillRect(param2 * 3 + 2, 2, -(param2 * 3) + 300, 30);
                    var6_ref.setFont(mh.field_ob);
                    var6_ref.setColor(java.awt.Color.white);
                    var6_ref.drawString(param3, (-(6 * param3.length()) + 304) / 2, 22);
                    boolean discarded$1 = var5.drawImage(hg.field_b, rg.field_R / 2 + -152, -18 + rg.field_P / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = rg.field_R / 2 - 152;
                    var8 = -18 + rg.field_P / 2;
                    var5.setColor(param4);
                    var5.drawRect(var7, var8, 303, 33);
                    var5.fillRect(2 + var7, 2 + var8, param2 * 3, 30);
                    var5.setColor(java.awt.Color.black);
                    var5.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var5.fillRect(var7 - -2 - -(3 * param2), 2 + var8, -(3 * param2) + 300, 30);
                    var5.setFont(mh.field_ob);
                    var5.setColor(java.awt.Color.white);
                    var5.drawString(param3, var7 + (304 - param3.length() * 6) / 2, 22 + var8);
                    break L8;
                  }
                }
                L9: {
                  if (gi.field_e != null) {
                    var5.setFont(mh.field_ob);
                    var5.setColor(java.awt.Color.white);
                    var5.drawString(gi.field_e, rg.field_R / 2 + -(gi.field_e.length() * 6 / 2), rg.field_P / 2 + -26);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5_ref = (Exception) (Object) decompiledCaughtException;
                wizardrun.field_G.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5_ref2;
            stackOut_28_1 = new StringBuilder().append("ug.CA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L12;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
    }

    private ug() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ug.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = false;
        field_P = "the health bar down to nothing.";
        field_F = "Password is valid";
    }
}
