/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends oj {
    static String field_A;
    private boolean field_C;
    ik field_B;
    private int field_z;
    static je field_D;
    int field_y;
    static ea field_E;

    final String a(byte param0, boolean param1) {
        int var3 = 3 % ((53 - param0) / 51);
        String var4 = "Trinketused! " + ((pj) this).field_B.field_c;
        if (param1) {
            System.out.println(var4);
        }
        return var4;
    }

    final void a(ha param0, int param1) {
        if (param1 != -26661) {
            field_A = null;
        }
        if (!(!((pj) this).field_C)) {
            return;
        }
        try {
            ((pj) this).field_C = true;
            ((pj) this).field_B.a(((pj) this).field_z, param0, 26123);
            param0.a((byte) -49, ((pj) this).field_B, ((pj) this).field_y, ((pj) this).field_z);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pj.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void h() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nr var9 = null;
        int var10 = 0;
        String stackIn_9_0 = null;
        String stackIn_10_0 = null;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        nr stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        nr stackOut_14_0 = null;
        nr stackOut_13_0 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1_int = bm.field_h - co.field_f;
            co.field_f = bt.field_g + -(var1_int >> 1);
            bm.field_h = var1_int + co.field_f;
            rk.field_r = -(ms.field_r >> 1) + lm.field_g;
            var2 = rk.field_r;
            var3 = 0;
            L1: while (true) {
              if (nb.field_h.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = cj.field_k[var3];
                  if (var4 >= 0) {
                    if (var4 == nn.field_z.field_h) {
                      var5 = jv.field_c;
                      break L2;
                    } else {
                      var5 = ui.field_g;
                      break L2;
                    }
                  } else {
                    var5 = mn.field_n;
                    break L2;
                  }
                }
                L3: {
                  var6 = nb.field_h[var3];
                  stackOut_8_0 = (String) var6;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (0 > var4) {
                    stackOut_10_0 = (String) (Object) stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = (String) (Object) stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                L4: {
                  int discarded$1 = 0;
                  var7 = lp.a(stackIn_11_0, stackIn_11_1 != 0);
                  var8 = bt.field_g - (var7 >> 1);
                  if (0 > var4) {
                    break L4;
                  } else {
                    L5: {
                      var2 = var2 + ar.field_w;
                      if (nn.field_z.field_h != var4) {
                        stackOut_14_0 = ov.field_m;
                        stackIn_15_0 = stackOut_14_0;
                        break L5;
                      } else {
                        stackOut_13_0 = ed.field_d;
                        stackIn_15_0 = stackOut_13_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_15_0;
                      if (var9 != null) {
                        var9.a((byte) -111, (rd.field_b << 1) + jg.field_k, var8 + -df.field_E, (df.field_E << 1) + var7, var2);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + rd.field_b;
                    break L4;
                  }
                }
                L7: {
                  if (0 <= var4) {
                    uk.field_s.b(var6, var8, ia.field_g + var2, var5, -1);
                    var2 = var2 + (jg.field_k + ar.field_w + rd.field_b);
                    break L7;
                  } else {
                    ej.field_G.b(var6, var8, var2 - -lw.field_mb, var5, -1);
                    var2 = var2 + cn.field_o;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "pj.B(" + 15 + 41);
        }
    }

    final static void b(int param0, int param1) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        li var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (li) (Object) s.field_e.e((byte) 108);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == -32666) {
                    break L2;
                  } else {
                    field_D = null;
                    break L2;
                  }
                }
                var2 = oe.field_Bb.e((byte) 105);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$6 = 0;
                    tq.a(param0);
                    var2 = oe.field_Bb.a((byte) 123);
                    continue L3;
                  }
                }
              } else {
                int discarded$7 = 25522;
                hp.a(var4, param0);
                var4 = (li) (Object) s.field_e.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "pj.F(" + param0 + 44 + param1 + 41);
        }
    }

    final static String g() {
        if (!(f.field_E >= 2)) {
            return eo.field_c;
        }
        if (!(null == nf.field_Nb)) {
            if (!(nf.field_Nb.a((byte) 82))) {
                return db.field_b;
            }
            return of.field_Jb;
        }
        if (!(ps.field_u.a((byte) 82))) {
            return ca.field_i;
        }
        if (!ps.field_u.a(28979, "commonui")) {
            return ha.field_nb + " - " + ps.field_u.a("commonui", (byte) -34) + "%";
        }
        if (!sk.field_M.a((byte) 82)) {
            return is.field_f;
        }
        if (!(sk.field_M.a(28979, "commonui"))) {
            return rf.field_a + " - " + sk.field_M.a("commonui", (byte) 122) + "%";
        }
        if (!h.field_g.a((byte) 82)) {
            return cr.field_eb;
        }
        if (!(h.field_g.d(-27927))) {
            return en.field_G + " - " + h.field_g.a(0) + "%";
        }
        return fm.field_c;
    }

    public static void a() {
        field_E = null;
        field_A = null;
        field_D = null;
    }

    final static int a(int param0, ne[] param1, boolean param2, int param3, int param4, int param5, int param6, jd param7, int param8, boolean param9) {
        RuntimeException var11 = null;
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
        jd var23 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var23 = param1[param3].field_c;
              if (!param2) {
                break L1;
              } else {
                if (var23 == null) {
                  break L1;
                } else {
                  L2: {
                    if (!param9) {
                      break L2;
                    } else {
                      if (var23.field_s) {
                        break L2;
                      } else {
                        if (~param4 != ~var23.field_O) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  stackOut_7_0 = 1000000;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            L3: {
              var12 = param7.g(0);
              var13 = param1[param8].field_h;
              var14 = param1[param3].field_h;
              var15 = 0;
              var16 = 0;
              if (bw.field_m[param7.field_N][1] != 2) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var17 = stackIn_12_0;
              var18 = param7.r((byte) 55) ? 1 : 0;
              var19 = param7.o((byte) 98) ? 1 : 0;
              if (var12 != 4) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            var20 = stackIn_15_0;
            var15 = gm.field_h[var12][var13];
            L5: {
              L6: {
                if (var17 == 0) {
                  break L6;
                } else {
                  if (var13 != 3) {
                    break L6;
                  } else {
                    var15 = 3;
                    break L5;
                  }
                }
              }
              L7: {
                if (var13 == 4) {
                  break L7;
                } else {
                  if (var13 != 6) {
                    if (var13 != 5) {
                      break L5;
                    } else {
                      L8: {
                        if (var18 != 0) {
                          break L8;
                        } else {
                          if (var19 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var15 = 3;
                      break L5;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              if (var19 != 0) {
                var15 = 1;
                break L5;
              } else {
                if (var18 == 0) {
                  break L5;
                } else {
                  var15 = 3;
                  break L5;
                }
              }
            }
            L9: {
              if (var15 >= 0) {
                break L9;
              } else {
                var15 = 6;
                break L9;
              }
            }
            L10: {
              L11: {
                var16 = gm.field_h[var12][var14];
                if (var17 == 0) {
                  break L11;
                } else {
                  if (var14 != 3) {
                    break L11;
                  } else {
                    var16 = 3;
                    break L10;
                  }
                }
              }
              L12: {
                if (var14 == 4) {
                  break L12;
                } else {
                  if (6 != var14) {
                    if (var14 == 5) {
                      L13: {
                        if (var18 != 0) {
                          break L13;
                        } else {
                          if (var19 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var16 = 3;
                      break L10;
                    } else {
                      break L10;
                    }
                  } else {
                    break L12;
                  }
                }
              }
              if (var19 != 0) {
                var16 = 1;
                break L10;
              } else {
                if (var18 == 0) {
                  break L10;
                } else {
                  var16 = 3;
                  break L10;
                }
              }
            }
            L14: {
              if (var16 >= 0) {
                break L14;
              } else {
                var16 = 1000000;
                break L14;
              }
            }
            L15: {
              var21 = param1[param8 % param0 - -(param8 / param5 * param0)].a((byte) 97, param4, param6);
              if (var20 != 0) {
                break L15;
              } else {
                if ((1 & var21) == 0) {
                  break L15;
                } else {
                  if (var13 == 4) {
                    break L15;
                  } else {
                    if (6 == var13) {
                      break L15;
                    } else {
                      if (var13 == 2) {
                        break L15;
                      } else {
                        if (12 == var13) {
                          break L15;
                        } else {
                          if (15 != var13) {
                            var15 = 9;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L16: {
              var21 = param1[param3 % param0 + param0 * (param3 / param5)].a((byte) 97, param4, param6);
              if (var20 != 0) {
                break L16;
              } else {
                if ((1 & var21) == 0) {
                  break L16;
                } else {
                  if (var14 == 4) {
                    break L16;
                  } else {
                    if (var14 == 6) {
                      break L16;
                    } else {
                      if (var14 == 2) {
                        break L16;
                      } else {
                        if (var14 == 12) {
                          break L16;
                        } else {
                          if (var14 != 15) {
                            var16 = 9;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L17: {
              if (2 != var14) {
                break L17;
              } else {
                if (param7.field_N != 62) {
                  break L17;
                } else {
                  var16 = 3 * bw.field_m[62][3];
                  break L17;
                }
              }
            }
            if (var16 >= var15) {
              stackOut_76_0 = var16;
              stackIn_77_0 = stackOut_76_0;
              break L0;
            } else {
              stackOut_74_0 = var15;
              stackIn_75_0 = stackOut_74_0;
              return stackIn_75_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var11 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var11;
            stackOut_78_1 = new StringBuilder().append("pj.E(").append(param0).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L18;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L18;
            }
          }
          L19: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param7 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L19;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L19;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + 44 + param8 + 44 + param9 + 44 + 1 + 41);
        }
        return stackIn_77_0;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_18_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              hs.b(-103, ((pj) this).field_B.field_c);
              to.a(3, (byte) -121, 38);
              param2.g(27, ((pj) this).field_B.field_c, -91);
              var4_int = 0;
              if (param1 < -84) {
                break L1;
              } else {
                pj.b(30, -93);
                break L1;
              }
            }
            L2: {
              var4_int = var4_int != 0 | ((pj) this).a((byte) -39, param2, param0, false) ? 1 : 0;
              if (uc.field_d[((pj) this).field_B.field_c][3] == 4) {
                break L2;
              } else {
                if (uc.field_d[((pj) this).field_B.field_c][4] == 5) {
                  break L2;
                } else {
                  var5 = ((wa) (Object) ((pj) this).field_B).field_g;
                  var6 = ((wa) (Object) ((pj) this).field_B).field_f;
                  if (6 != uc.field_d[((pj) this).field_B.field_c][3]) {
                    var7 = uc.field_d[((pj) this).field_B.field_c][7];
                    var8 = -var7 + var5;
                    L3: while (true) {
                      if (~var8 < ~(var7 + var5)) {
                        break L2;
                      } else {
                        L4: {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            if (~var8 > ~param2.field_xb.field_v) {
                              var9 = -var7 + var6;
                              L5: while (true) {
                                if (var9 > var7 + var6) {
                                  break L4;
                                } else {
                                  L6: {
                                    if (0 > var9) {
                                      break L6;
                                    } else {
                                      if (~param2.field_xb.field_v >= ~var9) {
                                        break L6;
                                      } else {
                                        var4_int = var4_int != 0 | ((pj) this).a(var9, 15, param2, param0, var8) ? 1 : 0;
                                        break L6;
                                      }
                                    }
                                  }
                                  var9++;
                                  continue L5;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      var7 = param2.field_xb.a(var6, 2056, var5);
                      var8 = param2.field_xb.g(var6, -90, var5);
                      var9 = var5;
                      var10 = var6;
                      var11 = 0;
                      var12 = 0;
                      var13 = var7;
                      if (var13 != 1) {
                        if (var13 != 2) {
                          if (var13 == 3) {
                            var11 = -1;
                            var12 = 0;
                            break L7;
                          } else {
                            if (var13 != 0) {
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              return stackIn_18_0 != 0;
                            } else {
                              var12 = 0;
                              var11 = 1;
                              break L7;
                            }
                          }
                        } else {
                          var12 = 1;
                          var11 = 0;
                          break L7;
                        }
                      } else {
                        var11 = 0;
                        var12 = -1;
                        break L7;
                      }
                    }
                    L8: while (true) {
                      if (~var8 != ~param2.field_xb.g(var10, -94, var9)) {
                        var4_int = var4_int != 0 | ((pj) this).a(var6 + -var12, 15, param2, param0, -var11 + var5) ? 1 : 0;
                        var4_int = var4_int != 0 | ((pj) this).a(var10, 15, param2, param0, var9) ? 1 : 0;
                        break L2;
                      } else {
                        var4_int = var4_int != 0 | ((pj) this).a(var10, 15, param2, param0, var9) ? 1 : 0;
                        var9 = var9 + var11;
                        var10 = var10 + var12;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
            ul.a((byte) -80, fo.a(4800, jr.field_e, new String[2]), param2.field_Nb);
            stackOut_34_0 = var4_int;
            stackIn_35_0 = stackOut_34_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("pj.A(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L9;
            }
          }
          L10: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_35_0 != 0;
    }

    pj(ik param0, int param1, int param2) {
        try {
            ((pj) this).field_z = param2;
            ((pj) this).field_y = param1;
            ((pj) this).field_B = param0;
            ((pj) this).field_m = 24;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 0;
            stackOut_0_0 = hh.a(param1, 0, param1.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pj.S(").append(593277313).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "This item can only be used on a cyclops.";
    }
}
