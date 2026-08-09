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
        String var4 = "Trinketused! " + this.field_B.field_c;
        if (param1) {
            System.out.println(var4);
        }
        return var4;
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
        String stackIn_12_0 = null;
        String stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        nr stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nr var9 = null;
        int var10 = 0;
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
                break L0;
              } else {
                L3: {
                  var4 = cj.field_k[var3];
                  if ((var4 ^ -1) <= -1) {
                    if (var4 == nn.field_z.field_h) {
                      var5 = jv.field_c;
                      break L3;
                    } else {
                      var5 = ui.field_g;
                      break L3;
                    }
                  } else {
                    var5 = mn.field_n;
                    break L3;
                  }
                }
                L4: {
                  var6 = nb.field_h[var3];
                  stackIn_12_0 = (String) (var6);

                  if (0 > var4) {
                    stackIn_13_0 = (String) ((Object) stackIn_12_0);
                    stackIn_13_1 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = (String) ((Object) stackIn_12_0);
                    stackIn_13_1 = 1;
                    break L4;
                  }
                }
                L5: {
                  var7 = lp.a(stackIn_13_0, stackIn_13_1 != 0, false);
                  var8 = bt.field_g - (var7 >> 1537923681);
                  if (0 > var4) {
                    break L5;
                  } else {
                    L6: {
                      var2 = var2 + ar.field_w;
                      if (nn.field_z.field_h != var4) {
                        stackIn_17_0 = ov.field_m;
                        break L6;
                      } else {
                        stackIn_17_0 = ed.field_d;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_17_0;
                      if (var9 != null) {
                        var9.a((byte) -111, (rd.field_b << 264941409) + jg.field_k, var8 + -df.field_E, (df.field_E << -901947103) + var7, var2);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2 = var2 + rd.field_b;
                    break L5;
                  }
                }
                L8: {
                  if (0 <= var4) {
                    uk.field_s.b(var6, var8, ia.field_g + var2, var5, -1);
                    var2 = var2 + (jg.field_k + ar.field_w + rd.field_b);
                    break L8;
                  } else {
                    ej.field_G.b(var6, var8, var2 - -lw.field_mb, var5, -1);
                    var2 = var2 + cn.field_o;
                    break L8;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "pj.B(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        tc var2 = null;
        int var3 = 0;
        li var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (li) ((Object) s.field_e.e((byte) 108));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == -32666) {
                    break L2;
                  } else {
                    field_D = (je) null;
                    break L2;
                  }
                }
                var2 = oe.field_Bb.e((byte) 105);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    tq.a(param0, 0);
                    var2 = oe.field_Bb.a((byte) 123);
                    continue L3;
                  }
                }
              } else {
                hp.a(var4, param0, 25522);
                var4 = (li) ((Object) s.field_e.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "pj.F(" + param0 + ',' + param1 + ')');
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
        }
        field_D = null;
    }

    final static int a(int param0, ne[] param1, boolean param2, int param3, int param4, int param5, int param6, jd param7, int param8, boolean param9, boolean param10) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_84_1 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_8_0 = 1000000;
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
                stackIn_12_0 = 0;
                break L3;
              } else {
                stackIn_12_0 = 1;
                break L3;
              }
            }
            L4: {
              var17 = stackIn_12_0;
              var18 = param7.r((byte) 55) ? 1 : 0;
              var19 = param7.o((byte) 98) ? 1 : 0;
              if (-5 != (var12 ^ -1)) {
                stackIn_15_0 = 0;
                break L4;
              } else {
                stackIn_15_0 = 1;
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
                      break L5;
                    }
                  }
                }
                L7: {
                  if ((var13 ^ -1) == -5) {
                    break L7;
                  } else {
                    if ((var13 ^ -1) != -7) {
                      if ((var13 ^ -1) != -6) {
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
                if (-1 >= (var15 ^ -1)) {
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
                    if (-4 != (var14 ^ -1)) {
                      break L11;
                    } else {
                      var16 = 3;
                      break L10;
                    }
                  }
                }
                L12: {
                  if (-5 == (var14 ^ -1)) {
                    break L12;
                  } else {
                    if (6 != var14) {
                      if (-6 == (var14 ^ -1)) {
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
                  if (-1 == (1 & var21 ^ -1)) {
                    break L15;
                  } else {
                    if (-5 == (var13 ^ -1)) {
                      break L15;
                    } else {
                      if (6 == var13) {
                        break L15;
                      } else {
                        if ((var13 ^ -1) == -3) {
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
                    if ((var14 ^ -1) == -5) {
                      break L16;
                    } else {
                      if ((var14 ^ -1) == -7) {
                        break L16;
                      } else {
                        if ((var14 ^ -1) == -3) {
                          break L16;
                        } else {
                          if ((var14 ^ -1) == -13) {
                            break L16;
                          } else {
                            if ((var14 ^ -1) != -16) {
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
                  if (-63 != (param7.field_N ^ -1)) {
                    break L17;
                  } else {
                    var16 = 3 * bw.field_m[62][3];
                    break L17;
                  }
                }
              }
              if (var16 >= var15) {
                stackIn_78_0 = var16;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_76_0 = var15;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_17_0 = 20;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var11 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var11);

            stackIn_81_1 = new StringBuilder().append("pj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L18;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_84_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L19;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L19;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_82_0), stackIn_85_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
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
        int stackIn_18_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
              var4_int = var4_int != 0 | this.a((byte) -39, param2, param0, false) ? 1 : 0;
              if (uc.field_d[this.field_B.field_c][3] == 4) {
                break L2;
              } else {
                if ((uc.field_d[this.field_B.field_c][4] ^ -1) == -6) {
                  break L2;
                } else {
                  var5 = ((wa) ((Object) this.field_B)).field_g;
                  var6 = ((wa) ((Object) this.field_B)).field_f;
                  if (6 != uc.field_d[this.field_B.field_c][3]) {
                    var7 = uc.field_d[this.field_B.field_c][7];
                    var8 = -var7 + var5;
                    L3: while (true) {
                      if (var8 > var7 + var5) {
                        break L2;
                      } else {
                        L4: {
                          if ((var8 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (var8 < param2.field_xb.field_v) {
                              var9 = -var7 + var6;
                              L5: while (true) {
                                if (var9 > var7 + var6) {
                                  break L4;
                                } else {
                                  if (0 <= var9) {
                                    if (param2.field_xb.field_v > var9) {
                                      var4_int = var4_int != 0 | this.a(var9, 15, param2, param0, var8) ? 1 : 0;
                                      var9++;
                                      continue L5;
                                    } else {
                                      var9++;
                                      continue L5;
                                    }
                                  } else {
                                    var9++;
                                    continue L5;
                                  }
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
                    L6: {
                      var7 = param2.field_xb.a(var6, 2056, var5);
                      var8 = param2.field_xb.g(var6, -90, var5);
                      var9 = var5;
                      var10 = var6;
                      var11 = 0;
                      var12 = 0;
                      var13 = var7;
                      if ((var13 ^ -1) != -2) {
                        if (var13 != 2) {
                          if (var13 == 3) {
                            var11 = -1;
                            var12 = 0;
                            break L6;
                          } else {
                            if (-1 != (var13 ^ -1)) {
                              stackIn_18_0 = 0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              var12 = 0;
                              var11 = 1;
                              break L6;
                            }
                          }
                        } else {
                          var12 = 1;
                          var11 = 0;
                          break L6;
                        }
                      } else {
                        var11 = 0;
                        var12 = -1;
                        break L6;
                      }
                    }
                    L7: while (true) {
                      if (var8 != param2.field_xb.g(var10, -94, var9)) {
                        var4_int = var4_int != 0 | this.a(var6 + -var12, 15, param2, param0, -var11 + var5) ? 1 : 0;
                        var4_int = var4_int != 0 | this.a(var10, 15, param2, param0, var9) ? 1 : 0;
                        break L2;
                      } else {
                        var4_int = var4_int != 0 | this.a(var10, 15, param2, param0, var9) ? 1 : 0;
                        var9 = var9 + var11;
                        var10 = var10 + var12;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
            ul.a((byte) -80, fo.a(4800, jr.field_e, new String[]{param2.field_xb.field_lb[this.field_z], fq.field_f[this.field_B.field_c]}), param2.field_Nb);
            stackIn_36_0 = var4_int;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var4);

            stackIn_39_1 = new StringBuilder().append("pj.A(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L9;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          return stackIn_36_0 != 0;
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
        RuntimeException var2 = null;
        jd var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 593277313) {
                break L1;
              } else {
                var3 = (jd) null;
                pj.a(73, (ne[]) null, true, -35, 53, 62, 17, (jd) null, 87, false, false);
                break L1;
              }
            }
            stackIn_3_0 = hh.a(param1, 0, param1.length, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pj.S(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_A = "This item can only be used on a cyclops.";
    }
}
