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
        int var3 = 0;
        String var4 = null;
        var3 = 3 % ((53 - param0) / 51);
        var4 = "Trinketused! " + this.field_B.field_c;
        if (param1) {
          System.out.println(var4);
          return var4;
        } else {
          return var4;
        }
    }

    final void a(ha param0, int param1) {
        if (param1 != -26661) {
            field_A = (String) null;
        }
        if (!(!this.field_C)) {
            return;
        }
        try {
            this.field_C = true;
            this.field_B.a(this.field_z, param0, 26123);
            param0.a((byte) -49, this.field_B, this.field_y, this.field_z);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        String stackIn_12_0 = null;
        String stackIn_13_0 = null;
        String stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        nr stackIn_18_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        nr stackOut_17_0 = null;
        nr stackOut_16_0 = null;
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
                field_E = (ea) null;
                break L1;
              }
            }
            rk.field_r = -(ms.field_r >> 593277313) + lm.field_g;
            var2 = rk.field_r;
            var3 = 0;
            L2: while (true) {
              if (nb.field_h.length <= var3) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = cj.field_k[var3];
                if (var10 != 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if ((var4 ^ -1) <= -1) {
                        break L4;
                      } else {
                        var5 = mn.field_n;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var4 == nn.field_z.field_h) {
                        break L5;
                      } else {
                        var5 = ui.field_g;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = jv.field_c;
                    break L3;
                  }
                  L6: {
                    var6 = nb.field_h[var3];
                    stackOut_11_0 = (String) (var6);
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (0 > var4) {
                      stackOut_13_0 = (String) ((Object) stackIn_13_0);
                      stackOut_13_1 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L6;
                    } else {
                      stackOut_12_0 = (String) ((Object) stackIn_12_0);
                      stackOut_12_1 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L6;
                    }
                  }
                  L7: {
                    var7 = lp.a(stackIn_14_0, stackIn_14_1 != 0, false);
                    var8 = bt.field_g - (var7 >> 1537923681);
                    if (0 > var4) {
                      break L7;
                    } else {
                      L8: {
                        var2 = var2 + ar.field_w;
                        if (nn.field_z.field_h != var4) {
                          stackOut_17_0 = ov.field_m;
                          stackIn_18_0 = stackOut_17_0;
                          break L8;
                        } else {
                          stackOut_16_0 = ed.field_d;
                          stackIn_18_0 = stackOut_16_0;
                          break L8;
                        }
                      }
                      L9: {
                        var9 = stackIn_18_0;
                        if (var9 != null) {
                          var9.a((byte) -111, (rd.field_b << 264941409) + jg.field_k, var8 + -df.field_E, (df.field_E << -901947103) + var7, var2);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var2 = var2 + rd.field_b;
                      break L7;
                    }
                  }
                  L10: {
                    L11: {
                      if (0 <= var4) {
                        break L11;
                      } else {
                        ej.field_G.b(var6, var8, var2 - -lw.field_mb, var5, -1);
                        var2 = var2 + cn.field_o;
                        if (var10 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    uk.field_s.b(var6, var8, ia.field_g + var2, var5, -1);
                    var2 = var2 + (jg.field_k + ar.field_w + rd.field_b);
                    break L10;
                  }
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "pj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0, int param1) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        li var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (li) ((Object) s.field_e.e((byte) 108));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    hp.a(var4, param0, 25522);
                    var4 = (li) ((Object) s.field_e.a((byte) 123));
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
                  field_D = (je) null;
                  break L2;
                }
              }
              var2 = oe.field_Bb.e((byte) 105);
              L4: while (true) {
                if (var2 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  tq.a(param0, 0);
                  var2 = oe.field_Bb.a((byte) 123);
                  if (var3 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L4;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "pj.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String g(int param0) {
        if (!((f.field_E ^ -1) <= -3)) {
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
        if (param0 != -15862) {
            return (String) null;
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
        if (!(h.field_g.d(param0 ^ 20707))) {
            return en.field_G + " - " + h.field_g.a(0) + "%";
        }
        return fm.field_c;
    }

    public static void a(boolean param0) {
        field_E = null;
        field_A = null;
        if (!param0) {
            pj.b(-127, -31);
            field_D = null;
            return;
        }
        field_D = null;
    }

    final static int a(int param0, ne[] param1, boolean param2, int param3, int param4, int param5, int param6, jd param7, int param8, boolean param9, boolean param10) {
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
        int stackIn_17_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
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
                        if (param4 != var23.field_O) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  stackOut_7_0 = 1000000;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
              if (-5 != (var12 ^ -1)) {
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
                    if ((var13 ^ -1) == -5) {
                      break L8;
                    } else {
                      if ((var13 ^ -1) != -7) {
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
                if ((var13 ^ -1) != -6) {
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
                if (-1 >= (var15 ^ -1)) {
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
                    if (-4 != (var14 ^ -1)) {
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
                    if (-5 == (var14 ^ -1)) {
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
                if (-6 == (var14 ^ -1)) {
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
                  if (-1 == (1 & var21 ^ -1)) {
                    break L19;
                  } else {
                    if (-5 == (var13 ^ -1)) {
                      break L19;
                    } else {
                      if (6 == var13) {
                        break L19;
                      } else {
                        if ((var13 ^ -1) == -3) {
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
                    if ((var14 ^ -1) == -5) {
                      break L20;
                    } else {
                      if ((var14 ^ -1) == -7) {
                        break L20;
                      } else {
                        if ((var14 ^ -1) == -3) {
                          break L20;
                        } else {
                          if ((var14 ^ -1) == -13) {
                            break L20;
                          } else {
                            if ((var14 ^ -1) != -16) {
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
                  if (-63 != (param7.field_N ^ -1)) {
                    break L21;
                  } else {
                    var16 = 3 * bw.field_m[62][3];
                    break L21;
                  }
                }
              }
              if (var16 >= var15) {
                stackOut_77_0 = var16;
                stackIn_78_0 = stackOut_77_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_75_0 = var15;
                stackIn_76_0 = stackOut_75_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_16_0 = 20;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var11 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var11);
            stackOut_79_1 = new StringBuilder().append("pj.E(").append(param0).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param1 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L22;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L22;
            }
          }
          L23: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param7 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L23;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L23;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_76_0;
            } else {
              return stackIn_78_0;
            }
          }
        }
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
        int stackIn_21_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              hs.b(-103, this.field_B.field_c);
              to.a(3, (byte) -121, 38);
              param2.g(27, this.field_B.field_c, -91);
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
                var4_int = var4_int != 0 | this.a((byte) -39, param2, param0, false) ? 1 : 0;
                if (uc.field_d[this.field_B.field_c][3] == 4) {
                  break L3;
                } else {
                  if ((uc.field_d[this.field_B.field_c][4] ^ -1) == -6) {
                    break L3;
                  } else {
                    L4: {
                      var5 = ((wa) ((Object) this.field_B)).field_g;
                      var6 = ((wa) ((Object) this.field_B)).field_f;
                      if (6 != uc.field_d[this.field_B.field_c][3]) {
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
                                      if ((var13 ^ -1) != -2) {
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
                                      if (-1 != (var13 ^ -1)) {
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
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        L13: while (true) {
                          L14: {
                            if (var8 != param2.field_xb.g(var10, -94, var9)) {
                              var4_int = var4_int != 0 | this.a(var6 + -var12, 15, param2, param0, -var11 + var5) ? 1 : 0;
                              var4_int = var4_int != 0 | this.a(var10, 15, param2, param0, var9) ? 1 : 0;
                              break L14;
                            } else {
                              var4_int = var4_int != 0 | this.a(var10, 15, param2, param0, var9) ? 1 : 0;
                              var9 = var9 + var11;
                              var10 = var10 + var12;
                              if (var14 != 0) {
                                break L14;
                              } else {
                                continue L13;
                              }
                            }
                          }
                          if (var14 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var7 = uc.field_d[this.field_B.field_c][7];
                    var8 = -var7 + var5;
                    L15: while (true) {
                      stackOut_30_0 = var8;
                      stackOut_30_1 = var7 + var5;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      L16: while (true) {
                        if (stackIn_31_0 > stackIn_31_1) {
                          break L3;
                        } else {
                          stackOut_32_0 = var8 ^ -1;
                          stackOut_32_1 = -1;
                          stackIn_42_0 = stackOut_32_0;
                          stackIn_42_1 = stackOut_32_1;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          if (var14 != 0) {
                            break L2;
                          } else {
                            L17: {
                              if (stackIn_33_0 > stackIn_33_1) {
                                break L17;
                              } else {
                                L18: {
                                  if (var8 < param2.field_xb.field_v) {
                                    break L18;
                                  } else {
                                    if (var14 == 0) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var9 = -var7 + var6;
                                if (var9 > var7 + var6) {
                                  break L17;
                                } else {
                                  stackOut_38_0 = 0;
                                  stackOut_38_1 = var9;
                                  stackIn_31_0 = stackOut_38_0;
                                  stackIn_31_1 = stackOut_38_1;
                                  continue L16;
                                }
                              }
                            }
                            var8++;
                            if (var14 == 0) {
                              continue L15;
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
              stackOut_41_0 = -80;
              stackOut_41_1 = 4800;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              break L2;
            }
            ul.a((byte) stackIn_42_0, fo.a(stackIn_42_1, jr.field_e, new String[]{param2.field_xb.field_lb[this.field_z], fq.field_f[this.field_B.field_c]}), param2.field_Nb);
            stackOut_42_0 = var4_int;
            stackIn_43_0 = stackOut_42_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var4);
            stackOut_44_1 = new StringBuilder().append("pj.A(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L19;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L19;
            }
          }
          L20: {
            stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L20;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L20;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_43_0 != 0;
        }
    }

    pj(ik param0, int param1, int param2) {
        try {
            this.field_z = param2;
            this.field_y = param1;
            this.field_B = param0;
            this.field_m = 24;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        int discarded$2 = 0;
        RuntimeException var2 = null;
        jd var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 593277313) {
                break L1;
              } else {
                var3 = (jd) null;
                discarded$2 = pj.a(73, (ne[]) null, true, -35, 53, 62, 17, (jd) null, 87, false, false);
                break L1;
              }
            }
            stackOut_2_0 = hh.a(param1, 0, param1.length, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("pj.S(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_A = "This item can only be used on a cyclops.";
    }
}
