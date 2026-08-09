/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends tga {
    static int[] field_q;
    static int field_r;

    wp(lu param0) {
        this(param0.b(16711935), param0.b(16711935));
    }

    wp(int param0, int param1) {
        super(param0, param1);
        this.field_j = 3;
    }

    private final void a(ub param0, int param1, int param2, byte param3) {
        gj var8 = param0.field_o;
        if (param3 != 83) {
            field_r = -32;
        }
        op var6 = var8.field_h;
        if (-1 < (param2 ^ -1) || var6.field_z <= param2) {
            return;
        }
        if (0 > param1 || param1 >= var6.field_B) {
            return;
        }
        ad var7 = var8.a(param1, false, param2);
        if (var7 == null) {
            return;
        }
        try {
            var7.field_s.g(48, 45);
            param0.a(27799, new ek(var8, var7, 45));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wp.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, op param3) {
        aga var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param3.field_z > param2) {
                  L2: {
                    if (-1 < (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (param3.field_B > param1) {
                        L3: {
                          var5 = param3.field_a[param2][param1].field_l;
                          if (var5 != null) {
                            var5.g(-94, 45);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (param0 == -116) {
                            break L4;
                          } else {
                            field_r = -38;
                            break L4;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("wp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 <= 58) {
            wp.b(44);
        }
    }

    final void a(boolean param0, op param1) {
        try {
            this.a((byte) -116, this.field_o, this.field_n, param1);
            this.a((byte) -116, this.field_o, -1 + this.field_n, param1);
            this.a((byte) -116, this.field_o, 1 + this.field_n, param1);
            this.a((byte) -116, this.field_o - 1, this.field_n, param1);
            this.a((byte) -116, this.field_o - -1, this.field_n, param1);
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, uha param1, int param2, boolean param3) {
        gna dupTemp$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        gna stackIn_34_0 = null;
        gna stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        gna stackIn_41_0 = null;
        gna stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        gna stackIn_87_0 = null;
        gna stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        gna stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        gna stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        int stackIn_95_2 = 0;
        gna stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_100_1 = 0;
        gna stackIn_104_0 = null;
        gna stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_109_0 = 0;
        gna stackIn_123_0 = null;
        gna stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        gna stackIn_127_0 = null;
        gna stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        gna stackIn_132_0 = null;
        gna stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        gna stackIn_136_0 = null;
        gna stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        String stackIn_154_0 = null;
        gna stackIn_158_0 = null;
        gna stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        gna stackIn_161_0 = null;
        gna stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_225_0 = 0;
        gna stackIn_324_0 = null;
        gna stackIn_325_0 = null;
        int stackIn_325_1 = 0;
        gna stackIn_330_0 = null;
        boolean stackIn_330_1 = false;
        gna stackIn_331_0 = null;
        boolean stackIn_331_1 = false;
        int stackIn_331_2 = 0;
        int stackIn_334_1 = 0;
        byte stackIn_334_2 = 0;
        int stackIn_334_3 = 0;
        gna stackIn_336_0 = null;
        gna stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        gna stackIn_341_0 = null;
        gna stackIn_342_0 = null;
        int stackIn_342_1 = 0;
        RuntimeException stackIn_351_0 = null;
        StringBuilder stackIn_351_1 = null;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        String stackIn_352_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        gna[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        gna var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        gna var28 = null;
        gna var29 = null;
        gna[] var30 = null;
        Object var31 = null;
        String var31_ref = null;
        String var32 = null;
        String var33 = null;
        var26 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3) {
                L2: {
                  if (ce.field_y) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (ps.d(-122)) {
                    if (!param1.field_Zb) {
                      stackIn_8_0 = 1;
                      break L3;
                    } else {
                      stackIn_8_0 = 0;
                      break L3;
                    }
                  } else {
                    stackIn_8_0 = 0;
                    break L3;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var5 = param0 ? 1 : 0;
                  if (!param3) {
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= 5) {
                        L8: {
                          if (!gd.field_n[0][2].field_E) {
                            break L8;
                          } else {
                            if (!ps.d(-117)) {
                              jja.field_m = lga.a(true, new String[]{pw.field_w.field_Jb}, wa.field_o);
                              break L8;
                            } else {
                              jja.field_m = qd.field_p;
                              break L8;
                            }
                          }
                        }
                        if (2 <= qha.field_c.length) {
                          L9: {
                            if (param3) {
                              if (aca.field_k != -1) {
                                stackIn_55_0 = 1;
                                break L9;
                              } else {
                                stackIn_55_0 = 0;
                                break L9;
                              }
                            } else {
                              stackIn_55_0 = 0;
                              break L9;
                            }
                          }
                          var6 = stackIn_55_0;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            var7 = aca.field_k;
                            var8_int = 0;
                            L10: while (true) {
                              if (fia.field_r.length <= var8_int) {
                                break L6;
                              } else {
                                fia.field_r[var8_int] = (byte) 0;
                                var8_int++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        L11: {
                          if (var4_int == 0) {
                            break L11;
                          } else {
                            if (gd.field_n[0][1 + var6].field_R == 0) {
                              break L11;
                            } else {
                              if (param1.field_Kb == var6) {
                                break L11;
                              } else {
                                param1.field_Kb = var6;
                                var5 = 1;
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          stackIn_34_0 = gd.field_n[0][1 + var6];

                          if (var4_int == 0) {
                            stackIn_35_0 = (gna) ((Object) stackIn_34_0);
                            stackIn_35_1 = 0;
                            break L12;
                          } else {
                            stackIn_35_0 = (gna) ((Object) stackIn_34_0);
                            stackIn_35_1 = 1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_35_0.field_u = stackIn_35_1 != 0;
                          if (eaa.field_c) {
                            break L13;
                          } else {
                            if ((var6 ^ -1) == -4) {
                              gd.field_n[0][1 + var6].field_u = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          stackIn_41_0 = gd.field_n[0][var6 - -1];

                          if (var6 != param1.field_Kb) {
                            stackIn_42_0 = (gna) ((Object) stackIn_41_0);
                            stackIn_42_1 = 0;
                            break L14;
                          } else {
                            stackIn_42_0 = (gna) ((Object) stackIn_41_0);
                            stackIn_42_1 = 1;
                            break L14;
                          }
                        }
                        stackIn_42_0.field_t = stackIn_42_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    if (2 <= qha.field_c.length) {
                      L15: {
                        if (param3) {
                          if (aca.field_k != -1) {
                            stackIn_22_0 = 1;
                            break L15;
                          } else {
                            stackIn_22_0 = 0;
                            break L15;
                          }
                        } else {
                          stackIn_22_0 = 0;
                          break L15;
                        }
                      }
                      var6 = stackIn_22_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = aca.field_k;
                        var8_int = 0;
                        L16: while (true) {
                          if (fia.field_r.length <= var8_int) {
                            break L6;
                          } else {
                            fia.field_r[var8_int] = (byte) 0;
                            var8_int++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                fia.field_r[var7 / 8] = (byte)mp.a((int) fia.field_r[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L17: {
                if (!param3) {
                  stackIn_63_0 = 0;
                  break L17;
                } else {
                  stackIn_63_0 = -1;
                  break L17;
                }
              }
              var7 = stackIn_63_0;
              L18: while (true) {
                if (qha.field_c.length <= var7) {
                  break L4;
                } else {
                  L19: {
                    if (var6 != 0) {
                      if (aca.field_k != var7) {
                        stackIn_71_0 = 1;
                        break L19;
                      } else {
                        stackIn_71_0 = 0;
                        break L19;
                      }
                    } else {
                      stackIn_71_0 = 0;
                      break L19;
                    }
                  }
                  L20: {
                    var8_int = stackIn_71_0;
                    if (var4_int == 0) {
                      break L20;
                    } else {
                      if (gd.field_n[1][1 + var7].field_R != 0) {
                        if (!param3) {
                          var9 = qha.field_c[var7];
                          if (param1.field_Pb == var9) {
                            break L20;
                          } else {
                            var5 = 1;
                            param1.field_Pb = var9;
                            break L20;
                          }
                        } else {
                          if (var6 == 0) {
                            if (var7 != -1) {
                              fia.field_r[var7 / 8] = (byte)lt.a((int) fia.field_r[var7 / 8], 1 << dda.a(var7, 7));
                              break L20;
                            } else {
                              var9 = 0;
                              L21: while (true) {
                                if (var9 >= fia.field_r.length) {
                                  break L20;
                                } else {
                                  fia.field_r[var9] = (byte) 0;
                                  var9++;
                                  continue L21;
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (param3) {
                      if (0 != (var7 ^ -1)) {
                        stackIn_97_0 = gd.field_n[1][var7 - -1];
                        stackIn_97_1 = fia.field_r[var7 / 8] & 1 << (var7 & 7) ^ -1;
                        stackIn_97_2 = -1;
                        L23: {


                          if (stackIn_97_1 == stackIn_97_2) {
                            stackIn_97_0 = (gna) ((Object) stackIn_97_0);
                            stackIn_100_1 = 0;
                            break L23;
                          } else {
                            stackIn_97_0 = (gna) ((Object) stackIn_97_0);
                            stackIn_100_1 = 1;
                            break L23;
                          }
                        }
                        stackIn_97_0.field_t = stackIn_100_1 != 0;
                        break L22;
                      } else {
                        gd.field_n[1][var7 - -1].field_t = true;
                        var9 = 0;
                        L24: while (true) {
                          if (qha.field_c.length <= var9) {
                            break L22;
                          } else {
                            L25: {
                              dupTemp$0 = gd.field_n[1][var7 - -1];
                              stackIn_94_0 = (gna) (dupTemp$0);

                              stackIn_94_1 = dupTemp$0.field_t;

                              if ((fia.field_r[var9 / 8] & 1 << (var9 & 7)) != 0) {
                                stackIn_95_0 = (gna) ((Object) stackIn_94_0);
                                stackIn_95_1 = stackIn_94_1;
                                stackIn_95_2 = 0;
                                break L25;
                              } else {
                                stackIn_95_0 = (gna) ((Object) stackIn_94_0);
                                stackIn_95_1 = stackIn_94_1;
                                stackIn_95_2 = 1;
                                break L25;
                              }
                            }
                            stackIn_95_0.field_t = stackIn_95_1 & stackIn_95_2 != 0;
                            var9++;
                            continue L24;
                          }
                        }
                      }
                    } else {
                      L26: {
                        var9 = qha.field_c[var7];
                        stackIn_87_0 = gd.field_n[1][var7 - -1];

                        if (var9 != param1.field_Pb) {
                          stackIn_88_0 = (gna) ((Object) stackIn_87_0);
                          stackIn_88_1 = 0;
                          break L26;
                        } else {
                          stackIn_88_0 = (gna) ((Object) stackIn_87_0);
                          stackIn_88_1 = 1;
                          break L26;
                        }
                      }
                      stackIn_88_0.field_t = stackIn_88_1 != 0;
                      break L22;
                    }
                  }
                  L27: {
                    L28: {
                      stackIn_104_0 = gd.field_n[1][var7 - -1];

                      if (var4_int == 0) {
                        break L28;
                      } else {
                        stackIn_104_0 = (gna) ((Object) stackIn_104_0);

                        if (var8_int != 0) {
                          break L28;
                        } else {
                          stackIn_105_0 = (gna) ((Object) stackIn_104_0);
                          stackIn_105_1 = 1;
                          break L27;
                        }
                      }
                    }
                    stackIn_105_0 = (gna) ((Object) stackIn_104_0);
                    stackIn_105_1 = 0;
                    break L27;
                  }
                  stackIn_105_0.field_u = stackIn_105_1 != 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L29: {
              if (!param3) {
                stackIn_109_0 = 1;
                break L29;
              } else {
                stackIn_109_0 = 0;
                break L29;
              }
            }
            var6 = stackIn_109_0;
            L30: while (true) {
              if ((var6 ^ -1) <= -4) {
                L31: {
                  if (!param3) {
                    break L31;
                  } else {
                    if ((bma.field_u ^ -1) < -2) {
                      var6 = 0;
                      L32: while (true) {
                        if (var6 >= bma.field_u - -1) {
                          break L31;
                        } else {
                          L33: {
                            var29 = gd.field_n[3][var6];
                            if (var4_int == 0) {
                              break L33;
                            } else {
                              if (0 != var29.field_R) {
                                tq.field_h = var6;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          L34: {
                            if (!var29.field_E) {
                              break L34;
                            } else {
                              if ((var6 ^ -1) < -1) {
                                L35: {
                                  if (null == md.field_p) {
                                    stackIn_154_0 = null;
                                    break L35;
                                  } else {
                                    stackIn_154_0 = md.field_p[var6 - 1];
                                    break L35;
                                  }
                                }
                                var8 = stackIn_154_0;
                                if (var8 == null) {
                                  break L34;
                                } else {
                                  jja.field_m = var8;
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                          }
                          L36: {
                            stackIn_158_0 = (gna) (var29);

                            if (tq.field_h != var6) {
                              stackIn_159_0 = (gna) ((Object) stackIn_158_0);
                              stackIn_159_1 = 0;
                              break L36;
                            } else {
                              stackIn_159_0 = (gna) ((Object) stackIn_158_0);
                              stackIn_159_1 = 1;
                              break L36;
                            }
                          }
                          L37: {
                            stackIn_159_0.field_t = stackIn_159_1 != 0;
                            stackIn_161_0 = (gna) (var29);

                            if (var4_int == 0) {
                              stackIn_162_0 = (gna) ((Object) stackIn_161_0);
                              stackIn_162_1 = 0;
                              break L37;
                            } else {
                              stackIn_162_0 = (gna) ((Object) stackIn_161_0);
                              stackIn_162_1 = 1;
                              break L37;
                            }
                          }
                          stackIn_162_0.field_u = stackIn_162_1 != 0;
                          var6++;
                          continue L32;
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L38: while (true) {
                  if (var7 >= ld.field_q) {
                    L39: {
                      if (var5 == 0) {
                        break L39;
                      } else {
                        if (!param3) {
                          bka.b(-112, param2);
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L40: {
                      var30 = gd.field_n[var7 + 4];
                      var8_array = var30;
                      if (param3) {
                        stackIn_168_0 = -1;
                        break L40;
                      } else {
                        stackIn_168_0 = 0;
                        break L40;
                      }
                    }
                    var9 = stackIn_168_0;
                    L41: while (true) {
                      if (var9 >= var30.length + -1) {
                        var6 = var6 + (255 & mja.field_s[var7]);
                        var7++;
                        continue L38;
                      } else {
                        L42: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L42;
                          } else {
                            if ((var9 ^ -1) > -1) {
                              break L42;
                            } else {
                              L43: {
                                if (null == wda.field_c) {
                                  break L43;
                                } else {
                                  if (wda.field_c[var7] == null) {
                                    break L43;
                                  } else {
                                    if ((wda.field_c[var7][var9] & (pn.field_d ^ -1)) <= 0) {
                                      break L43;
                                    } else {
                                      var14 = 1;
                                      var15 = ho.a(62, wda.field_c[var7][var9] & (pn.field_d ^ -1));
                                      break L43;
                                    }
                                  }
                                }
                              }
                              L44: {
                                if (hr.field_b == null) {
                                  break L44;
                                } else {
                                  if (hr.field_b[var7] != null) {
                                    if (dm.field_f > 0) {
                                      break L44;
                                    } else {
                                      if (!hr.field_b[var7][var9]) {
                                        break L44;
                                      } else {
                                        var10 = 1;
                                        break L44;
                                      }
                                    }
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                if (null == re.field_F) {
                                  break L45;
                                } else {
                                  if (null == re.field_F[var7]) {
                                    break L45;
                                  } else {
                                    L46: {
                                      var16 = re.field_F[var7][var9];
                                      if (var16 == 0) {
                                        break L46;
                                      } else {
                                        if (bha.field_l) {
                                          break L46;
                                        } else {
                                          if (dm.field_f > 0) {
                                            break L46;
                                          } else {
                                            var10 = 1;
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 <= 0) {
                                      break L45;
                                    } else {
                                      if (wk.field_a < var16) {
                                        var12 = 1;
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              L47: {
                                if (gma.field_c == null) {
                                  break L47;
                                } else {
                                  if (gma.field_c[var7] == null) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var16 = gma.field_c[var7][var9];
                                      if (0 >= var16) {
                                        break L48;
                                      } else {
                                        if (ui.field_q < var16) {
                                          var11 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L47;
                                    } else {
                                      if (bha.field_l) {
                                        break L47;
                                      } else {
                                        if (dm.field_f > 0) {
                                          break L47;
                                        } else {
                                          var10 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L49: {
                                if (param3) {
                                  if (null != im.field_c) {
                                    if (null != im.field_c[var7]) {
                                      if (im.field_c[var7][var9]) {
                                        stackIn_212_0 = 1;
                                        break L49;
                                      } else {
                                        stackIn_212_0 = 0;
                                        break L49;
                                      }
                                    } else {
                                      stackIn_212_0 = 0;
                                      break L49;
                                    }
                                  } else {
                                    stackIn_212_0 = 0;
                                    break L49;
                                  }
                                } else {
                                  stackIn_212_0 = 0;
                                  break L49;
                                }
                              }
                              var13 = stackIn_212_0;
                              break L42;
                            }
                          }
                        }
                        L50: {
                          if (-3 < (hea.field_r ^ -1)) {
                            break L50;
                          } else {
                            if (wga.field_q[12]) {
                              var12 = 0;
                              var10 = 0;
                              var14 = 0;
                              var13 = 0;
                              var11 = 0;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                        }
                        L51: {
                          L52: {
                            if (var10 != 0) {
                              break L52;
                            } else {
                              if (var11 != 0) {
                                break L52;
                              } else {
                                if (var12 != 0) {
                                  break L52;
                                } else {
                                  if (var13 != 0) {
                                    break L52;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_225_0 = 0;
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_225_0 = 1;
                          break L51;
                        }
                        L53: {
                          var16 = stackIn_225_0;
                          fla.field_q = true;
                          if (var16 != 0) {
                            break L53;
                          } else {
                            if ((var9 ^ -1) > -1) {
                              break L53;
                            } else {
                              if (pha.field_h == null) {
                                break L53;
                              } else {
                                L54: {
                                  if (!param3) {
                                    break L54;
                                  } else {
                                    if (!ce.field_y) {
                                      break L54;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L55: {
                                  if (null != bja.field_o) {
                                    break L55;
                                  } else {
                                    ala.field_b = new boolean[ld.field_q];
                                    bja.field_o = new byte[ld.field_q];
                                    break L55;
                                  }
                                }
                                fla.field_q = false;
                                uu.field_yb = false;
                                var17_int = 0;
                                L56: while (true) {
                                  if (var17_int >= var7) {
                                    L57: {
                                      ub.a(0, param3, -96, var9, -1, param1, -1, var7);
                                      if (2 > hea.field_r) {
                                        break L57;
                                      } else {
                                        if (!wga.field_q[12]) {
                                          break L57;
                                        } else {
                                          fla.field_q = true;
                                          break L57;
                                        }
                                      }
                                    }
                                    if (!fla.field_q) {
                                      var16 = 1;
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  } else {
                                    ala.field_b[var17_int] = false;
                                    var17_int++;
                                    continue L56;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L58: {
                          var17 = var8_array[1 + var9];
                          if (var4_int == 0) {
                            break L58;
                          } else {
                            if (0 == var17.field_R) {
                              break L58;
                            } else {
                              if (param3) {
                                if (-1 == var9) {
                                  var18 = var6;
                                  L59: while (true) {
                                    if (-1 + (var30.length + var6) <= var18) {
                                      break L58;
                                    } else {
                                      sca.field_c[var18 / 8] = (byte)dda.a((int) sca.field_c[var18 / 8], 1 << dda.a(7, var18) ^ -1);
                                      var18++;
                                      continue L59;
                                    }
                                  }
                                } else {
                                  sca.field_c[(var9 + var6) / 8] = (byte)lt.a((int) sca.field_c[(var9 + var6) / 8], 1 << dda.a(7, var6 + var9));
                                  break L58;
                                }
                              } else {
                                if (var16 != 0) {
                                  break L58;
                                } else {
                                  if ((byte)var9 != param1.field_Eb[var7]) {
                                    param1.field_Eb[var7] = (byte)var9;
                                    var5 = 1;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L60: {
                          if (!param3) {
                            break L60;
                          } else {
                            if (var16 != 0) {
                              sca.field_c[(var6 + var9) / 8] = (byte)dda.a((int) sca.field_c[(var6 + var9) / 8], 1 << dda.a(var9 + var6, 7) ^ -1);
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                        }
                        L61: {
                          if (-1 < (var9 ^ -1)) {
                            break L61;
                          } else {
                            if (!var17.field_E) {
                              break L61;
                            } else {
                              L62: {
                                if (null != co.field_a) {
                                  if (null != co.field_a[var7]) {
                                    var18_ref = co.field_a[var7][var9];
                                    break L62;
                                  } else {
                                    var18_ref = null;
                                    break L62;
                                  }
                                } else {
                                  var18_ref = null;
                                  break L62;
                                }
                              }
                              L63: {
                                if (null != gk.field_c) {
                                  if (gk.field_c[var7] != null) {
                                    var19 = gk.field_c[var7][var9];
                                    break L63;
                                  } else {
                                    var19 = null;
                                    break L63;
                                  }
                                } else {
                                  var19 = null;
                                  break L63;
                                }
                              }
                              L64: {
                                var20 = null;
                                if (var19 == null) {
                                  break L64;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                var21 = null;
                                if (var13 == 0) {
                                  if (var10 == 0) {
                                    L66: {
                                      if (var11 == 0) {
                                        break L66;
                                      } else {
                                        var22_int = -ui.field_q + gma.field_c[var7][var9];
                                        if (1 != var22_int) {
                                          var21 = lga.a(true, new String[]{Integer.toString(var22_int)}, tv.field_p);
                                          var31 = var21;
                                          var21 = var31;
                                          var31 = var21;
                                          var21 = var31;
                                          break L66;
                                        } else {
                                          var21 = afa.field_k;
                                          break L66;
                                        }
                                      }
                                    }
                                    L67: {
                                      if (var12 == 0) {
                                        break L67;
                                      } else {
                                        var31_ref = lga.a(true, new String[]{Integer.toString(wk.field_a), Integer.toString(re.field_F[var7][var9])}, oca.field_o);
                                        var21 = var31_ref;
                                        var21 = var31_ref;
                                        if (var21 != null) {
                                          var21 = (String) (var21) + "<br>" + var31_ref;
                                          break L67;
                                        } else {
                                          var21 = var31_ref;
                                          break L67;
                                        }
                                      }
                                    }
                                    if (var14 != 0) {
                                      L68: {
                                        var22 = df.field_q;
                                        if (0 >= var15) {
                                          break L68;
                                        } else {
                                          if (ffa.field_j == null) {
                                            break L68;
                                          } else {
                                            if (var15 > ffa.field_j.length) {
                                              break L68;
                                            } else {
                                              if (null == ffa.field_j[var15 + -1]) {
                                                break L68;
                                              } else {
                                                var22 = ffa.field_j[var15 - 1][0];
                                                break L68;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22;
                                        break L65;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L65;
                                      }
                                    } else {
                                      break L65;
                                    }
                                  } else {
                                    var21 = ph.field_N;
                                    break L65;
                                  }
                                } else {
                                  var21 = hk.field_a;
                                  break L65;
                                }
                              }
                              L69: {
                                if (var4_int == 0) {
                                  break L69;
                                } else {
                                  if (!fla.field_q) {
                                    L70: {
                                      var22 = null;
                                      var23 = 0;
                                      if (uu.field_yb) {
                                        var22 = "</col>" + gb.field_j + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    }
                                    var24 = 0;
                                    L71: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 == 0) {
                                          var21 = lga.a(true, new String[]{(String) (var22)}, l.field_s);
                                          break L69;
                                        } else {
                                          var21 = gf.field_i + (String) (var22);
                                          break L69;
                                        }
                                      } else {
                                        if (ala.field_b[var24]) {
                                          L72: {
                                            var25_ref = "</col>" + kka.field_k[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 == null) {
                                              var22 = var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              break L72;
                                            } else {
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              var23 = 1;
                                              break L72;
                                            }
                                          }
                                          var24++;
                                          continue L71;
                                        } else {
                                          var24++;
                                          continue L71;
                                        }
                                      }
                                    }
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              L73: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = qm.a("<br><col=A00000>", "<br>", var32, -1);
                                  if (var20 == null) {
                                    var20 = var33;
                                    break L73;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L73;
                                  }
                                } else {
                                  break L73;
                                }
                              }
                              if (var20 == null) {
                                break L61;
                              } else {
                                jja.field_m = (String) (var20);
                                break L61;
                              }
                            }
                          }
                        }
                        L74: {
                          if (!param3) {
                            L75: {
                              L76: {
                                stackIn_336_0 = (gna) (var17);

                                if (!fla.field_q) {
                                  break L76;
                                } else {

                                  stackIn_334_1 = (byte)var9 ^ -1;
                                  stackIn_334_2 = param1.field_Eb[var7];
                                  stackIn_334_3 = -1;
                                  stackIn_336_0 = (gna) ((Object) stackIn_336_0);

                                  if (stackIn_334_1 != (stackIn_334_2 ^ stackIn_334_3)) {
                                    break L76;
                                  } else {
                                    stackIn_337_0 = (gna) ((Object) stackIn_336_0);
                                    stackIn_337_1 = 1;
                                    break L75;
                                  }
                                }
                              }
                              stackIn_337_0 = (gna) ((Object) stackIn_336_0);
                              stackIn_337_1 = 0;
                              break L75;
                            }
                            stackIn_337_0.field_t = stackIn_337_1 != 0;
                            break L74;
                          } else {
                            if (0 == (var9 ^ -1)) {
                              var17.field_t = true;
                              var27 = var6;
                              var18 = var27;
                              L77: while (true) {
                                if (var27 >= var6 - -var30.length + -1) {
                                  break L74;
                                } else {
                                  L78: {
                                    stackIn_330_0 = (gna) (var17);

                                    stackIn_330_1 = var17.field_t;

                                    if (-1 != (sca.field_c[var27 / 8] & 1 << (7 & var27) ^ -1)) {
                                      stackIn_331_0 = (gna) ((Object) stackIn_330_0);
                                      stackIn_331_1 = stackIn_330_1;
                                      stackIn_331_2 = 0;
                                      break L78;
                                    } else {
                                      stackIn_331_0 = (gna) ((Object) stackIn_330_0);
                                      stackIn_331_1 = stackIn_330_1;
                                      stackIn_331_2 = 1;
                                      break L78;
                                    }
                                  }
                                  stackIn_331_0.field_t = stackIn_331_1 & stackIn_331_2 != 0;
                                  var27++;
                                  continue L77;
                                }
                              }
                            } else {
                              L79: {
                                stackIn_324_0 = (gna) (var17);

                                if ((sca.field_c[(var9 + var6) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                                  stackIn_325_0 = (gna) ((Object) stackIn_324_0);
                                  stackIn_325_1 = 0;
                                  break L79;
                                } else {
                                  stackIn_325_0 = (gna) ((Object) stackIn_324_0);
                                  stackIn_325_1 = 1;
                                  break L79;
                                }
                              }
                              stackIn_325_0.field_t = stackIn_325_1 != 0;
                              break L74;
                            }
                          }
                        }
                        L80: {
                          L81: {
                            stackIn_341_0 = (gna) (var17);

                            if (var4_int == 0) {
                              break L81;
                            } else {
                              stackIn_341_0 = (gna) ((Object) stackIn_341_0);

                              if (var16 != 0) {
                                break L81;
                              } else {
                                stackIn_342_0 = (gna) ((Object) stackIn_341_0);
                                stackIn_342_1 = 1;
                                break L80;
                              }
                            }
                          }
                          stackIn_342_0 = (gna) ((Object) stackIn_341_0);
                          stackIn_342_1 = 0;
                          break L80;
                        }
                        stackIn_342_0.field_u = stackIn_342_1 != 0;
                        var9++;
                        continue L41;
                      }
                    }
                  }
                }
              } else {
                L82: {
                  var28 = gd.field_n[2][var6];
                  if (var4_int == 0) {
                    break L82;
                  } else {
                    if (var28.field_R != 0) {
                      if (param3) {
                        if (-1 != (var6 ^ -1)) {
                          ena.field_n = ena.field_n ^ var6;
                          break L82;
                        } else {
                          ena.field_n = 0;
                          break L82;
                        }
                      } else {
                        if (var6 != param1.field_Lb) {
                          param1.field_Lb = var6;
                          var5 = 1;
                          break L82;
                        } else {
                          break L82;
                        }
                      }
                    } else {
                      break L82;
                    }
                  }
                }
                L83: {
                  stackIn_123_0 = (gna) (var28);

                  if (var4_int == 0) {
                    stackIn_124_0 = (gna) ((Object) stackIn_123_0);
                    stackIn_124_1 = 0;
                    break L83;
                  } else {
                    stackIn_124_0 = (gna) ((Object) stackIn_123_0);
                    stackIn_124_1 = 1;
                    break L83;
                  }
                }
                L84: {
                  stackIn_124_0.field_u = stackIn_124_1 != 0;
                  if (param3) {
                    if (0 == var6) {
                      L85: {
                        stackIn_136_0 = (gna) (var28);

                        if (0 != ena.field_n) {
                          stackIn_137_0 = (gna) ((Object) stackIn_136_0);
                          stackIn_137_1 = 0;
                          break L85;
                        } else {
                          stackIn_137_0 = (gna) ((Object) stackIn_136_0);
                          stackIn_137_1 = 1;
                          break L85;
                        }
                      }
                      stackIn_137_0.field_t = stackIn_137_1 != 0;
                      break L84;
                    } else {
                      L86: {
                        stackIn_132_0 = (gna) (var28);

                        if (-1 == (ena.field_n & var6 ^ -1)) {
                          stackIn_133_0 = (gna) ((Object) stackIn_132_0);
                          stackIn_133_1 = 0;
                          break L86;
                        } else {
                          stackIn_133_0 = (gna) ((Object) stackIn_132_0);
                          stackIn_133_1 = 1;
                          break L86;
                        }
                      }
                      stackIn_133_0.field_t = stackIn_133_1 != 0;
                      break L84;
                    }
                  } else {
                    L87: {
                      stackIn_127_0 = (gna) (var28);

                      if ((var6 & param1.field_Lb) == 0) {
                        stackIn_128_0 = (gna) ((Object) stackIn_127_0);
                        stackIn_128_1 = 0;
                        break L87;
                      } else {
                        stackIn_128_0 = (gna) ((Object) stackIn_127_0);
                        stackIn_128_1 = 1;
                        break L87;
                      }
                    }
                    stackIn_128_0.field_t = stackIn_128_1 != 0;
                    break L84;
                  }
                }
                var6++;
                continue L30;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L88: {
            var4 = decompiledCaughtException;
            stackIn_351_0 = (RuntimeException) (var4);

            stackIn_351_1 = new StringBuilder().append("wp.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_352_0 = (RuntimeException) ((Object) stackIn_351_0);
              stackIn_352_1 = (StringBuilder) ((Object) stackIn_351_1);
              stackIn_352_2 = "null";
              break L88;
            } else {
              stackIn_352_0 = (RuntimeException) ((Object) stackIn_351_0);
              stackIn_352_1 = (StringBuilder) ((Object) stackIn_351_1);
              stackIn_352_2 = "{...}";
              break L88;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_352_0), stackIn_352_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(ub param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        gj var4 = null;
        gj var5 = null;
        try {
          L0: {
            if (param1 <= -2) {
              L1: {
                var4 = param0.field_o;
                var5 = var4;
                if (-38 == (var4.field_h.field_a[this.field_n][this.field_o].field_n ^ -1)) {
                  param0.a(27799, new iu(8, 128));
                  break L1;
                } else {
                  param0.a(27799, new iu(60, 128));
                  break L1;
                }
              }
              param0.a(27799, new fha(new dw(var5, this.field_n, this.field_o)));
              this.a(param0, this.field_o, this.field_n, (byte) 83);
              this.a(param0, this.field_o, -1 + this.field_n, (byte) 83);
              this.a(param0, this.field_o, this.field_n - -1, (byte) 83);
              this.a(param0, this.field_o - 1, this.field_n, (byte) 83);
              this.a(param0, 1 + this.field_o, this.field_n, (byte) 83);
              super.a(false, var5.field_h);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("wp.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_q = new int[5];
    }
}
