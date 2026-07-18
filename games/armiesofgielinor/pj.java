/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pj extends oj {
    static String field_A;
    private boolean field_C;
    ik field_B;
    private int field_z;
    static je field_D;
    int field_y;
    static ea field_E;

    final String a(byte param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var3_int = 3 % ((53 - param0) / 51);
              var4 = "Trinketused! " + ((pj) this).field_B.field_c;
              if (!param1) {
                break L1;
              } else {
                System.out.println(var4);
                break L1;
              }
            }
            stackOut_3_0 = (String) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "pj.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(ha param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -26661) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            if (((pj) this).field_C) {
              return;
            } else {
              ((pj) this).field_C = true;
              ((pj) this).field_B.a(((pj) this).field_z, param0, 26123);
              param0.a((byte) -49, ((pj) this).field_B, ((pj) this).field_y, ((pj) this).field_z);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("pj.G(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void h(int param0) {
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
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        String stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        nr stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        String stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        nr stackOut_24_0 = null;
        nr stackOut_22_0 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = bm.field_h - co.field_f;
              co.field_f = bt.field_g + -(var1_int >> -1548457439);
              bm.field_h = var1_int + co.field_f;
              if (param0 == 15) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            rk.field_r = -(ms.field_r >> 593277313) + lm.field_g;
            var2 = rk.field_r;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~nb.field_h.length >= ~var3) {
                    break L4;
                  } else {
                    var4 = cj.field_k[var3];
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (var4 >= 0) {
                            break L6;
                          } else {
                            var5 = mn.field_n;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var4 == nn.field_z.field_h) {
                            break L7;
                          } else {
                            var5 = ui.field_g;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5 = jv.field_c;
                        break L5;
                      }
                      L8: {
                        var6 = nb.field_h[var3];
                        stackOut_16_0 = (String) var6;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (0 > var4) {
                          stackOut_19_0 = (String) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L8;
                        } else {
                          stackOut_17_0 = (String) (Object) stackIn_17_0;
                          stackOut_17_1 = 1;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_20_1 = stackOut_17_1;
                          break L8;
                        }
                      }
                      L9: {
                        var7 = lp.a(stackIn_20_0, stackIn_20_1 != 0, false);
                        var8 = bt.field_g - (var7 >> 1537923681);
                        if (0 > var4) {
                          break L9;
                        } else {
                          L10: {
                            var2 = var2 + ar.field_w;
                            if (~nn.field_z.field_h != ~var4) {
                              stackOut_24_0 = ov.field_m;
                              stackIn_25_0 = stackOut_24_0;
                              break L10;
                            } else {
                              stackOut_22_0 = ed.field_d;
                              stackIn_25_0 = stackOut_22_0;
                              break L10;
                            }
                          }
                          L11: {
                            var9 = stackIn_25_0;
                            if (null != var9) {
                              var9.a((byte) -111, (rd.field_b << 264941409) + jg.field_k, var8 + -df.field_E, (df.field_E << -901947103) + var7, var2);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var2 = var2 + rd.field_b;
                          break L9;
                        }
                      }
                      L12: {
                        L13: {
                          if (0 <= var4) {
                            break L13;
                          } else {
                            ej.field_G.b(var6, var8, var2 - -lw.field_mb, var5, -1);
                            var2 = var2 + cn.field_o;
                            if (var10 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        uk.field_s.b(var6, var8, ia.field_g + var2, var5, -1);
                        var2 = var2 + (jg.field_k + ar.field_w + rd.field_b);
                        break L12;
                      }
                      var3++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "pj.B(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        li var2 = null;
        tc var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = (li) (Object) s.field_e.e((byte) 108);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    hp.a(var2, param0, 25522);
                    var2 = (li) (Object) s.field_e.a((byte) 123);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == -32666) {
                  break L2;
                } else {
                  field_D = null;
                  break L2;
                }
              }
              var2_ref = oe.field_Bb.e((byte) 105);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var2_ref) {
                      break L6;
                    } else {
                      tq.a(param0, 0);
                      var2_ref = oe.field_Bb.a((byte) 123);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "pj.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static String g(int param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        String stackIn_41_0 = null;
        String stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        String stackOut_18_0 = null;
        String stackOut_32_0 = null;
        String stackOut_40_0 = null;
        String stackOut_42_0 = null;
        String stackOut_35_0 = null;
        String stackOut_27_0 = null;
        String stackOut_24_0 = null;
        Object stackOut_21_0 = null;
        try {
          L0: {
            if (f.field_E < 2) {
              stackOut_3_0 = eo.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null != nf.field_Nb) {
                if (!nf.field_Nb.a((byte) 82)) {
                  stackOut_11_0 = db.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = of.field_Jb;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                if (!ps.field_u.a((byte) 82)) {
                  stackOut_18_0 = ca.field_i;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  if (param0 == -15862) {
                    if (ps.field_u.a(28979, "commonui")) {
                      if (sk.field_M.a((byte) 82)) {
                        if (!sk.field_M.a(28979, "commonui")) {
                          stackOut_32_0 = rf.field_a + " - " + sk.field_M.a("commonui", (byte) 122) + "%";
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        } else {
                          if (h.field_g.a((byte) 82)) {
                            if (!h.field_g.d(param0 ^ 20707)) {
                              stackOut_40_0 = en.field_G + " - " + h.field_g.a(0) + "%";
                              stackIn_41_0 = stackOut_40_0;
                              return stackIn_41_0;
                            } else {
                              stackOut_42_0 = fm.field_c;
                              stackIn_43_0 = stackOut_42_0;
                              break L0;
                            }
                          } else {
                            stackOut_35_0 = cr.field_eb;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0;
                          }
                        }
                      } else {
                        stackOut_27_0 = is.field_f;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0;
                      }
                    } else {
                      stackOut_24_0 = ha.field_nb + " - " + ps.field_u.a("commonui", (byte) -34) + "%";
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (String) (Object) stackIn_22_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "pj.R(" + param0 + ')');
        }
        return stackIn_43_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_E = null;
              field_A = null;
              if (param0) {
                break L1;
              } else {
                pj.b(-127, -31);
                break L1;
              }
            }
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "pj.D(" + param0 + ')');
        }
    }

    final static int a(int param0, ne[] param1, boolean param2, int param3, int param4, int param5, int param6, jd param7, int param8, boolean param9, boolean param10) {
        RuntimeException var11 = null;
        jd var11_ref = null;
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
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        RuntimeException stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        String stackIn_153_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        String stackOut_146_2 = null;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        RuntimeException stackOut_152_0 = null;
        StringBuilder stackOut_152_1 = null;
        String stackOut_152_2 = null;
        RuntimeException stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        String stackOut_150_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var11_ref = param1[param3].field_c;
              if (!param2) {
                break L1;
              } else {
                if (var11_ref == null) {
                  break L1;
                } else {
                  L2: {
                    if (!param9) {
                      break L2;
                    } else {
                      if (var11_ref.field_s) {
                        break L2;
                      } else {
                        if (~param4 != ~var11_ref.field_O) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1000000;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
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
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              } else {
                stackOut_19_0 = 1;
                stackIn_22_0 = stackOut_19_0;
                break L3;
              }
            }
            L4: {
              var17 = stackIn_22_0;
              var18 = param7.r((byte) 55) ? 1 : 0;
              var19 = param7.o((byte) 98) ? 1 : 0;
              if (var12 != 4) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L4;
              } else {
                stackOut_23_0 = 1;
                stackIn_26_0 = stackOut_23_0;
                break L4;
              }
            }
            var20 = stackIn_26_0;
            var15 = gm.field_h[var12][var13];
            if (param10) {
              L5: {
                L6: {
                  if (var17 == 0) {
                    break L6;
                  } else {
                    if (var13 != 3) {
                      break L6;
                    } else {
                      var15 = 3;
                      if (var22 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    if (var13 == 4) {
                      break L8;
                    } else {
                      if (var13 != 6) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var19 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        break L5;
                      } else {
                        var15 = 3;
                        if (var22 == 0) {
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  var15 = 1;
                  if (var22 == 0) {
                    break L5;
                  } else {
                    break L7;
                  }
                }
                if (var13 != 5) {
                  break L5;
                } else {
                  L10: {
                    if (var18 != 0) {
                      break L10;
                    } else {
                      if (var19 == 0) {
                        break L5;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var15 = 3;
                  break L5;
                }
              }
              L11: {
                if (var15 >= 0) {
                  break L11;
                } else {
                  var15 = 6;
                  break L11;
                }
              }
              L12: {
                L13: {
                  var16 = gm.field_h[var12][var14];
                  if (var17 == 0) {
                    break L13;
                  } else {
                    if (var14 != 3) {
                      break L13;
                    } else {
                      var16 = 3;
                      if (var22 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L14: {
                  L15: {
                    if (var14 == 4) {
                      break L15;
                    } else {
                      if (6 != var14) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (var19 != 0) {
                      break L16;
                    } else {
                      if (var18 == 0) {
                        break L12;
                      } else {
                        var16 = 3;
                        if (var22 == 0) {
                          break L12;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  var16 = 1;
                  if (var22 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
                if (var14 == 5) {
                  L17: {
                    if (var18 != 0) {
                      break L17;
                    } else {
                      if (var19 == 0) {
                        break L12;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var16 = 3;
                  break L12;
                } else {
                  break L12;
                }
              }
              L18: {
                if (var16 >= 0) {
                  break L18;
                } else {
                  var16 = 1000000;
                  break L18;
                }
              }
              L19: {
                var21 = param1[param8 % param0 - -(param8 / param5 * param0)].a((byte) 97, param4, param6);
                if (var20 != 0) {
                  break L19;
                } else {
                  if ((1 & var21) == 0) {
                    break L19;
                  } else {
                    if (var13 == 4) {
                      break L19;
                    } else {
                      if (6 == var13) {
                        break L19;
                      } else {
                        if (var13 == 2) {
                          break L19;
                        } else {
                          if (12 == var13) {
                            break L19;
                          } else {
                            if (15 != var13) {
                              var15 = 9;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L20: {
                var21 = param1[param3 % param0 + param0 * (param3 / param5)].a((byte) 97, param4, param6);
                if (var20 != 0) {
                  break L20;
                } else {
                  if ((1 & var21) == 0) {
                    break L20;
                  } else {
                    if (var14 == 4) {
                      break L20;
                    } else {
                      if (var14 == 6) {
                        break L20;
                      } else {
                        if (var14 == 2) {
                          break L20;
                        } else {
                          if (var14 == 12) {
                            break L20;
                          } else {
                            if (var14 != 15) {
                              var16 = 9;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L21: {
                if (2 != var14) {
                  break L21;
                } else {
                  if (param7.field_N != 62) {
                    break L21;
                  } else {
                    var16 = 3 * bw.field_m[62][3];
                    break L21;
                  }
                }
              }
              if (var16 >= var15) {
                stackOut_143_0 = var16;
                stackIn_144_0 = stackOut_143_0;
                break L0;
              } else {
                stackOut_141_0 = var15;
                stackIn_142_0 = stackOut_141_0;
                return stackIn_142_0;
              }
            } else {
              stackOut_27_0 = 20;
              stackIn_28_0 = stackOut_27_0;
              return stackIn_28_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var11 = decompiledCaughtException;
            stackOut_145_0 = (RuntimeException) var11;
            stackOut_145_1 = new StringBuilder().append("pj.E(").append(param0).append(',');
            stackIn_148_0 = stackOut_145_0;
            stackIn_148_1 = stackOut_145_1;
            stackIn_146_0 = stackOut_145_0;
            stackIn_146_1 = stackOut_145_1;
            if (param1 == null) {
              stackOut_148_0 = (RuntimeException) (Object) stackIn_148_0;
              stackOut_148_1 = (StringBuilder) (Object) stackIn_148_1;
              stackOut_148_2 = "null";
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              stackIn_149_2 = stackOut_148_2;
              break L22;
            } else {
              stackOut_146_0 = (RuntimeException) (Object) stackIn_146_0;
              stackOut_146_1 = (StringBuilder) (Object) stackIn_146_1;
              stackOut_146_2 = "{...}";
              stackIn_149_0 = stackOut_146_0;
              stackIn_149_1 = stackOut_146_1;
              stackIn_149_2 = stackOut_146_2;
              break L22;
            }
          }
          L23: {
            stackOut_149_0 = (RuntimeException) (Object) stackIn_149_0;
            stackOut_149_1 = ((StringBuilder) (Object) stackIn_149_1).append(stackIn_149_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_152_0 = stackOut_149_0;
            stackIn_152_1 = stackOut_149_1;
            stackIn_150_0 = stackOut_149_0;
            stackIn_150_1 = stackOut_149_1;
            if (param7 == null) {
              stackOut_152_0 = (RuntimeException) (Object) stackIn_152_0;
              stackOut_152_1 = (StringBuilder) (Object) stackIn_152_1;
              stackOut_152_2 = "null";
              stackIn_153_0 = stackOut_152_0;
              stackIn_153_1 = stackOut_152_1;
              stackIn_153_2 = stackOut_152_2;
              break L23;
            } else {
              stackOut_150_0 = (RuntimeException) (Object) stackIn_150_0;
              stackOut_150_1 = (StringBuilder) (Object) stackIn_150_1;
              stackOut_150_2 = "{...}";
              stackIn_153_0 = stackOut_150_0;
              stackIn_153_1 = stackOut_150_1;
              stackIn_153_2 = stackOut_150_2;
              break L23;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_153_0, stackIn_153_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_144_0;
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
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
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
              L3: {
                var4_int = var4_int != 0 | ((pj) this).a((byte) -39, param2, param0, false) ? 1 : 0;
                if (uc.field_d[((pj) this).field_B.field_c][3] == 4) {
                  break L3;
                } else {
                  if (uc.field_d[((pj) this).field_B.field_c][4] == 5) {
                    break L3;
                  } else {
                    L4: {
                      var5 = ((wa) (Object) ((pj) this).field_B).field_g;
                      var6 = ((wa) (Object) ((pj) this).field_B).field_f;
                      if (6 != uc.field_d[((pj) this).field_B.field_c][3]) {
                        break L4;
                      } else {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                L9: {
                                  L10: {
                                    L11: {
                                      var7 = param2.field_xb.a(var6, 2056, var5);
                                      var8 = param2.field_xb.g(var6, -90, var5);
                                      var9 = var5;
                                      var10 = var6;
                                      var11 = 0;
                                      var12 = 0;
                                      var13 = var7;
                                      if (var13 != 1) {
                                        break L11;
                                      } else {
                                        if (var14 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var13 != 2) {
                                        break L12;
                                      } else {
                                        if (var14 == 0) {
                                          break L9;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (var13 == 3) {
                                      break L8;
                                    } else {
                                      if (var13 != 0) {
                                        break L6;
                                      } else {
                                        if (var14 == 0) {
                                          break L7;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  var11 = 0;
                                  var12 = -1;
                                  if (var14 == 0) {
                                    break L5;
                                  } else {
                                    break L9;
                                  }
                                }
                                var12 = 1;
                                var11 = 0;
                                if (var14 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                              var11 = -1;
                              var12 = 0;
                              if (var14 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                            var12 = 0;
                            var11 = 1;
                            if (var14 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0 != 0;
                        }
                        L13: while (true) {
                          L14: {
                            L15: {
                              if (~var8 != ~param2.field_xb.g(var10, -94, var9)) {
                                break L15;
                              } else {
                                var4_int = var4_int != 0 | ((pj) this).a(var10, 15, param2, param0, var9) ? 1 : 0;
                                var9 = var9 + var11;
                                var10 = var10 + var12;
                                if (var14 != 0) {
                                  break L14;
                                } else {
                                  if (var14 == 0) {
                                    continue L13;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            var4_int = var4_int != 0 | ((pj) this).a(var6 + -var12, 15, param2, param0, -var11 + var5) ? 1 : 0;
                            var4_int = var4_int != 0 | ((pj) this).a(var10, 15, param2, param0, var9) ? 1 : 0;
                            break L14;
                          }
                          if (var14 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var7 = uc.field_d[((pj) this).field_B.field_c][7];
                    var8 = -var7 + var5;
                    L16: while (true) {
                      stackOut_42_0 = ~var8;
                      stackOut_42_1 = ~(var7 + var5);
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      L17: while (true) {
                        if (stackIn_43_0 < stackIn_43_1) {
                          break L3;
                        } else {
                          stackOut_44_0 = ~var8;
                          stackOut_44_1 = -1;
                          stackIn_65_0 = stackOut_44_0;
                          stackIn_65_1 = stackOut_44_1;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          if (var14 != 0) {
                            break L2;
                          } else {
                            L18: {
                              if (stackIn_45_0 > stackIn_45_1) {
                                break L18;
                              } else {
                                L19: {
                                  if (~var8 > ~param2.field_xb.field_v) {
                                    break L19;
                                  } else {
                                    if (var14 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                var9 = -var7 + var6;
                                L20: while (true) {
                                  if (var9 > var7 + var6) {
                                    break L18;
                                  } else {
                                    stackOut_56_0 = 0;
                                    stackOut_56_1 = var9;
                                    stackIn_43_0 = stackOut_56_0;
                                    stackIn_43_1 = stackOut_56_1;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    if (var14 != 0) {
                                      continue L17;
                                    } else {
                                      L21: {
                                        if (stackIn_57_0 > stackIn_57_1) {
                                          break L21;
                                        } else {
                                          if (~param2.field_xb.field_v >= ~var9) {
                                            break L21;
                                          } else {
                                            var4_int = var4_int != 0 | ((pj) this).a(var9, 15, param2, param0, var8) ? 1 : 0;
                                            break L21;
                                          }
                                        }
                                      }
                                      var9++;
                                      if (var14 == 0) {
                                        continue L20;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var8++;
                            if (var14 == 0) {
                              continue L16;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_64_0 = -80;
              stackOut_64_1 = 4800;
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              break L2;
            }
            ul.a((byte) stackIn_65_0, fo.a(stackIn_65_1, jr.field_e, new String[2]), param2.field_Nb);
            stackOut_65_0 = var4_int;
            stackIn_66_0 = stackOut_65_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var4;
            stackOut_67_1 = new StringBuilder().append("pj.A(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L22;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L22;
            }
          }
          L23: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L23;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ')');
        }
        return stackIn_66_0 != 0;
    }

    pj(ik param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((pj) this).field_z = param2;
            ((pj) this).field_y = param1;
            ((pj) this).field_B = param0;
            ((pj) this).field_m = 24;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pj.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 593277313) {
                break L1;
              } else {
                int discarded$2 = pj.a(73, (ne[]) null, true, -35, 53, 62, 17, (jd) null, 87, false, false);
                break L1;
              }
            }
            stackOut_3_0 = hh.a(param1, 0, param1.length, 0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("pj.S(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "This item can only be used on a cyclops.";
    }
}
