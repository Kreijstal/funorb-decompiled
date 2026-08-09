/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm implements bo {
    private int field_b;
    static qg[] field_a;

    public final void a(kh param0, byte param1) {
        try {
            this.field_b = param0.h(255);
            if (param1 != -19) {
                this.field_b = -24;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_b = param0;
        if (param1 != 0) {
            field_a = (qg[]) null;
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        try {
            param1.i(this.field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          if (param7 > 49) {
            break L0;
          } else {
            field_a = (qg[]) null;
            break L0;
          }
        }
        L1: {
          if (param0 <= param12) {
            if (param14 <= param12) {
              if (param0 >= param14) {
                ica.a(param0, param10, param3, param5, 0, param8, bea.field_l, param1, param4, param11, param2, param15, param13, param9, param6, param12, param14);
                break L1;
              } else {
                ica.a(param14, param3, param10, param1, 0, param8, bea.field_l, param5, param6, param11, param2, param15, param9, param13, param4, param12, param0);
                break L1;
              }
            } else {
              ica.a(param12, param3, param2, param11, 0, param6, bea.field_l, param5, param8, param1, param10, param9, param15, param13, param4, param14, param0);
              break L1;
            }
          } else {
            if (param14 > param0) {
              ica.a(param0, param2, param3, param5, 0, param6, bea.field_l, param11, param4, param1, param10, param9, param13, param15, param8, param14, param12);
              break L1;
            } else {
              if (param12 < param14) {
                ica.a(param14, param2, param10, param1, 0, param4, bea.field_l, param11, param6, param5, param3, param13, param9, param15, param8, param0, param12);
                break L1;
              } else {
                ica.a(param12, param10, param2, param11, 0, param4, bea.field_l, param1, param8, param5, param3, param13, param15, param9, param6, param0, param14);
                break L1;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = (qg[]) null;
        }
    }

    final static void a(int param0, ht param1, int param2, boolean param3) {
        tv dupTemp$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        tv stackIn_23_0 = null;
        tv stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        tv stackIn_29_0 = null;
        tv stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        tv stackIn_74_0 = null;
        tv stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        tv stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        tv stackIn_82_0 = null;
        boolean stackIn_82_1 = false;
        int stackIn_82_2 = 0;
        tv stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        byte stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        int stackIn_87_1 = 0;
        tv stackIn_91_0 = null;
        tv stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_96_0 = 0;
        tv stackIn_110_0 = null;
        tv stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        tv stackIn_115_0 = null;
        tv stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        tv stackIn_119_0 = null;
        tv stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        tv stackIn_123_0 = null;
        tv stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        String stackIn_139_0 = null;
        tv stackIn_143_0 = null;
        tv stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        tv stackIn_146_0 = null;
        tv stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_218_0 = 0;
        tv stackIn_318_0 = null;
        int stackIn_318_1 = 0;
        int stackIn_318_2 = 0;
        int stackIn_321_1 = 0;
        tv stackIn_326_0 = null;
        boolean stackIn_326_1 = false;
        tv stackIn_327_0 = null;
        boolean stackIn_327_1 = false;
        int stackIn_327_2 = 0;
        tv stackIn_331_0 = null;
        tv stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        tv stackIn_336_0 = null;
        tv stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        RuntimeException stackIn_346_0 = null;
        StringBuilder stackIn_346_1 = null;
        RuntimeException stackIn_347_0 = null;
        StringBuilder stackIn_347_1 = null;
        String stackIn_347_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        tv[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        tv var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        tv var28 = null;
        tv var29 = null;
        tv[] var30 = null;
        String var31 = null;
        String var32 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                L2: {
                  if (qa.field_o) {
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
                  if (mka.b(8192)) {
                    if (!param1.field_ec) {
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
              var5 = 0;
              if (param3) {
                break L4;
              } else {
                var6 = 0;
                L5: while (true) {
                  if (-6 >= (var6 ^ -1)) {
                    if (!bf.field_b[0][2].field_pb) {
                      break L4;
                    } else {
                      if (mka.b(8192)) {
                        qda.field_b = jsa.field_y;
                        break L4;
                      } else {
                        qda.field_b = gl.a((byte) 101, gfa.field_i, new String[]{uu.field_a.field_tb});
                        break L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var4_int == 0) {
                        break L6;
                      } else {
                        if (bf.field_b[0][1 + var6].field_y == 0) {
                          break L6;
                        } else {
                          if (var6 != param1.field_cc) {
                            param1.field_cc = var6;
                            var5 = 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      stackIn_23_0 = bf.field_b[0][var6 - -1];

                      if (var4_int == 0) {
                        stackIn_24_0 = (tv) ((Object) stackIn_23_0);
                        stackIn_24_1 = 0;
                        break L7;
                      } else {
                        stackIn_24_0 = (tv) ((Object) stackIn_23_0);
                        stackIn_24_1 = 1;
                        break L7;
                      }
                    }
                    L8: {
                      stackIn_24_0.field_X = stackIn_24_1 != 0;
                      if (rca.field_p) {
                        break L8;
                      } else {
                        if (-4 != (var6 ^ -1)) {
                          break L8;
                        } else {
                          bf.field_b[0][1 + var6].field_X = false;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      stackIn_29_0 = bf.field_b[0][1 + var6];

                      if (param1.field_cc != var6) {
                        stackIn_30_0 = (tv) ((Object) stackIn_29_0);
                        stackIn_30_1 = 0;
                        break L9;
                      } else {
                        stackIn_30_0 = (tv) ((Object) stackIn_29_0);
                        stackIn_30_1 = 1;
                        break L9;
                      }
                    }
                    stackIn_30_0.field_cb = stackIn_30_1 != 0;
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L10: {
              if ((sg.field_u.length ^ -1) > -3) {
                break L10;
              } else {
                L11: {
                  if (param3) {
                    if (kca.field_g != -1) {
                      stackIn_42_0 = 1;
                      break L11;
                    } else {
                      stackIn_42_0 = 0;
                      break L11;
                    }
                  } else {
                    stackIn_42_0 = 0;
                    break L11;
                  }
                }
                L12: {
                  var6 = stackIn_42_0;
                  if (var6 == 0) {
                    break L12;
                  } else {
                    var7 = kca.field_g;
                    var8_int = 0;
                    L13: while (true) {
                      if (vk.field_b.length <= var8_int) {
                        vk.field_b[var7 / 8] = (byte)fh.a((int) vk.field_b[var7 / 8], 1 << var7 % 8);
                        break L12;
                      } else {
                        vk.field_b[var8_int] = (byte) 0;
                        var8_int++;
                        continue L13;
                      }
                    }
                  }
                }
                L14: {
                  if (!param3) {
                    stackIn_50_0 = 0;
                    break L14;
                  } else {
                    stackIn_50_0 = -1;
                    break L14;
                  }
                }
                var7 = stackIn_50_0;
                L15: while (true) {
                  if (sg.field_u.length <= var7) {
                    break L10;
                  } else {
                    L16: {
                      if (var6 != 0) {
                        if (var7 != kca.field_g) {
                          stackIn_58_0 = 1;
                          break L16;
                        } else {
                          stackIn_58_0 = 0;
                          break L16;
                        }
                      } else {
                        stackIn_58_0 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      var8_int = stackIn_58_0;
                      if (var4_int == 0) {
                        break L17;
                      } else {
                        if (0 != bf.field_b[1][1 + var7].field_y) {
                          if (!param3) {
                            var9 = sg.field_u[var7];
                            if (param1.field_Jb != var9) {
                              var5 = 1;
                              param1.field_Jb = var9;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if (0 == (var7 ^ -1)) {
                                var9 = 0;
                                L18: while (true) {
                                  if (var9 >= vk.field_b.length) {
                                    break L17;
                                  } else {
                                    vk.field_b[var9] = (byte) 0;
                                    var9++;
                                    continue L18;
                                  }
                                }
                              } else {
                                vk.field_b[var7 / 8] = (byte)kha.b((int) vk.field_b[var7 / 8], 1 << sea.c(var7, 7));
                                break L17;
                              }
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (param3) {
                        if (0 != (var7 ^ -1)) {
                          stackIn_84_0 = bf.field_b[1][1 + var7];
                          stackIn_84_1 = 0;
                          stackIn_84_2 = vk.field_b[var7 / 8];
                          stackIn_84_3 = 1 << (var7 & 7);
                          L20: {


                            if (stackIn_84_1 == (stackIn_84_2 & stackIn_84_3)) {
                              stackIn_84_0 = (tv) ((Object) stackIn_84_0);
                              stackIn_87_1 = 0;
                              break L20;
                            } else {
                              stackIn_84_0 = (tv) ((Object) stackIn_84_0);
                              stackIn_87_1 = 1;
                              break L20;
                            }
                          }
                          stackIn_84_0.field_cb = stackIn_87_1 != 0;
                          break L19;
                        } else {
                          bf.field_b[1][var7 + 1].field_cb = true;
                          var9 = 0;
                          L21: while (true) {
                            if (var9 >= sg.field_u.length) {
                              break L19;
                            } else {
                              L22: {
                                dupTemp$0 = bf.field_b[1][1 + var7];
                                stackIn_81_0 = (tv) (dupTemp$0);

                                stackIn_81_1 = dupTemp$0.field_cb;

                                if (0 != (vk.field_b[var9 / 8] & 1 << (7 & var9))) {
                                  stackIn_82_0 = (tv) ((Object) stackIn_81_0);
                                  stackIn_82_1 = stackIn_81_1;
                                  stackIn_82_2 = 0;
                                  break L22;
                                } else {
                                  stackIn_82_0 = (tv) ((Object) stackIn_81_0);
                                  stackIn_82_1 = stackIn_81_1;
                                  stackIn_82_2 = 1;
                                  break L22;
                                }
                              }
                              stackIn_82_0.field_cb = stackIn_82_1 & stackIn_82_2 != 0;
                              var9++;
                              continue L21;
                            }
                          }
                        }
                      } else {
                        L23: {
                          var9 = sg.field_u[var7];
                          stackIn_74_0 = bf.field_b[1][var7 + 1];

                          if (param1.field_Jb != var9) {
                            stackIn_75_0 = (tv) ((Object) stackIn_74_0);
                            stackIn_75_1 = 0;
                            break L23;
                          } else {
                            stackIn_75_0 = (tv) ((Object) stackIn_74_0);
                            stackIn_75_1 = 1;
                            break L23;
                          }
                        }
                        stackIn_75_0.field_cb = stackIn_75_1 != 0;
                        break L19;
                      }
                    }
                    L24: {
                      L25: {
                        stackIn_91_0 = bf.field_b[1][1 + var7];

                        if (var4_int == 0) {
                          break L25;
                        } else {
                          stackIn_91_0 = (tv) ((Object) stackIn_91_0);

                          if (var8_int != 0) {
                            break L25;
                          } else {
                            stackIn_92_0 = (tv) ((Object) stackIn_91_0);
                            stackIn_92_1 = 1;
                            break L24;
                          }
                        }
                      }
                      stackIn_92_0 = (tv) ((Object) stackIn_91_0);
                      stackIn_92_1 = 0;
                      break L24;
                    }
                    stackIn_92_0.field_X = stackIn_92_1 != 0;
                    var7++;
                    continue L15;
                  }
                }
              }
            }
            L26: {
              if (param3) {
                stackIn_96_0 = 0;
                break L26;
              } else {
                stackIn_96_0 = 1;
                break L26;
              }
            }
            var6 = stackIn_96_0;
            L27: while (true) {
              if ((var6 ^ -1) <= -4) {
                L28: {
                  if (!param3) {
                    break L28;
                  } else {
                    if ((ws.field_r ^ -1) < -2) {
                      var6 = 0;
                      L29: while (true) {
                        if (var6 >= 1 + ws.field_r) {
                          break L28;
                        } else {
                          L30: {
                            var29 = bf.field_b[3][var6];
                            if (var4_int == 0) {
                              break L30;
                            } else {
                              if (-1 == (var29.field_y ^ -1)) {
                                break L30;
                              } else {
                                aja.field_H = var6;
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (!var29.field_pb) {
                              break L31;
                            } else {
                              if ((var6 ^ -1) >= -1) {
                                break L31;
                              } else {
                                L32: {
                                  if (null == mh.field_L) {
                                    stackIn_139_0 = null;
                                    break L32;
                                  } else {
                                    stackIn_139_0 = mh.field_L[-1 + var6];
                                    break L32;
                                  }
                                }
                                var8 = stackIn_139_0;
                                if (var8 == null) {
                                  break L31;
                                } else {
                                  qda.field_b = var8;
                                  break L31;
                                }
                              }
                            }
                          }
                          L33: {
                            stackIn_143_0 = (tv) (var29);

                            if (var4_int == 0) {
                              stackIn_144_0 = (tv) ((Object) stackIn_143_0);
                              stackIn_144_1 = 0;
                              break L33;
                            } else {
                              stackIn_144_0 = (tv) ((Object) stackIn_143_0);
                              stackIn_144_1 = 1;
                              break L33;
                            }
                          }
                          L34: {
                            stackIn_144_0.field_X = stackIn_144_1 != 0;
                            stackIn_146_0 = (tv) (var29);

                            if (aja.field_H != var6) {
                              stackIn_147_0 = (tv) ((Object) stackIn_146_0);
                              stackIn_147_1 = 0;
                              break L34;
                            } else {
                              stackIn_147_0 = (tv) ((Object) stackIn_146_0);
                              stackIn_147_1 = 1;
                              break L34;
                            }
                          }
                          stackIn_147_0.field_cb = stackIn_147_1 != 0;
                          var6++;
                          continue L29;
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                }
                L35: {
                  var6 = 0;
                  if (param2 == -21290) {
                    break L35;
                  } else {
                    field_a = (qg[]) null;
                    break L35;
                  }
                }
                var7 = 0;
                L36: while (true) {
                  if (var7 >= fk.field_b) {
                    L37: {
                      L38: {
                        if (var5 == 0) {
                          break L38;
                        } else {
                          if (!param3) {
                            mla.a(param0, -94);
                            break L38;
                          } else {
                            break L37;
                          }
                        }
                      }
                      break L37;
                    }
                    break L0;
                  } else {
                    L39: {
                      var30 = bf.field_b[var7 + 4];
                      var8_array = var30;
                      if (!param3) {
                        stackIn_155_0 = 0;
                        break L39;
                      } else {
                        stackIn_155_0 = -1;
                        break L39;
                      }
                    }
                    var9 = stackIn_155_0;
                    L40: while (true) {
                      if (var9 >= var30.length + -1) {
                        var6 = var6 + (255 & um.field_m[var7]);
                        var7++;
                        continue L36;
                      } else {
                        L41: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L41;
                          } else {
                            if (0 <= var9) {
                              L42: {
                                if (lga.field_z == null) {
                                  break L42;
                                } else {
                                  if (lga.field_z[var7] == null) {
                                    break L42;
                                  } else {
                                    if (0 < ((mi.field_g ^ -1) & lga.field_z[var7][var9])) {
                                      var15 = b.a((mi.field_g ^ -1) & lga.field_z[var7][var9], (byte) -115);
                                      var14 = 1;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                              }
                              L43: {
                                if (rl.field_u == null) {
                                  break L43;
                                } else {
                                  if (rl.field_u[var7] != null) {
                                    if (-1 > (wla.field_ub ^ -1)) {
                                      break L43;
                                    } else {
                                      if (rl.field_u[var7][var9]) {
                                        var10 = 1;
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              L44: {
                                if (null == hp.field_a) {
                                  break L44;
                                } else {
                                  if (hp.field_a[var7] == null) {
                                    break L44;
                                  } else {
                                    L45: {
                                      var16 = hp.field_a[var7][var9];
                                      if (0 == var16) {
                                        break L45;
                                      } else {
                                        if (dea.field_c) {
                                          break L45;
                                        } else {
                                          if ((wla.field_ub ^ -1) >= -1) {
                                            var10 = 1;
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    if ((var16 ^ -1) >= -1) {
                                      break L44;
                                    } else {
                                      if (qb.field_f < var16) {
                                        var12 = 1;
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (null == nra.field_g) {
                                  break L46;
                                } else {
                                  if (nra.field_g[var7] != null) {
                                    L47: {
                                      var16 = nra.field_g[var7][var9];
                                      if (-1 == (var16 ^ -1)) {
                                        break L47;
                                      } else {
                                        if (dea.field_c) {
                                          break L47;
                                        } else {
                                          if (0 >= wla.field_ub) {
                                            var10 = 1;
                                            break L47;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 <= 0) {
                                      break L46;
                                    } else {
                                      if (bha.field_z < var16) {
                                        var11 = 1;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L48: {
                                if (param3) {
                                  if (pfa.field_b != null) {
                                    if (pfa.field_b[var7] != null) {
                                      if (!pfa.field_b[var7][var9]) {
                                        stackIn_205_0 = 0;
                                        break L48;
                                      } else {
                                        stackIn_205_0 = 1;
                                        break L48;
                                      }
                                    } else {
                                      stackIn_205_0 = 0;
                                      break L48;
                                    }
                                  } else {
                                    stackIn_205_0 = 0;
                                    break L48;
                                  }
                                } else {
                                  stackIn_205_0 = 0;
                                  break L48;
                                }
                              }
                              var13 = stackIn_205_0;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                        }
                        L49: {
                          if (ld.field_e < 2) {
                            break L49;
                          } else {
                            if (oj.field_tb[12]) {
                              var14 = 0;
                              var13 = 0;
                              var11 = 0;
                              var12 = 0;
                              var10 = 0;
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                        }
                        L50: {
                          L51: {
                            rh.field_s = true;
                            if (var10 != 0) {
                              break L51;
                            } else {
                              if (var11 != 0) {
                                break L51;
                              } else {
                                if (var12 != 0) {
                                  break L51;
                                } else {
                                  if (var13 != 0) {
                                    break L51;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_218_0 = 0;
                                      break L50;
                                    } else {
                                      stackIn_218_0 = 1;
                                      break L50;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_218_0 = 1;
                          break L50;
                        }
                        L52: {
                          var16 = stackIn_218_0;
                          if (var16 != 0) {
                            break L52;
                          } else {
                            if (var9 < 0) {
                              break L52;
                            } else {
                              if (ce.field_A == null) {
                                break L52;
                              } else {
                                L53: {
                                  if (!param3) {
                                    break L53;
                                  } else {
                                    if (!qa.field_o) {
                                      break L53;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L54: {
                                  mm.field_g = false;
                                  if (null != tba.field_m) {
                                    break L54;
                                  } else {
                                    tba.field_m = new byte[fk.field_b];
                                    sda.field_f = new boolean[fk.field_b];
                                    break L54;
                                  }
                                }
                                rh.field_s = false;
                                var17_int = 0;
                                L55: while (true) {
                                  if (var17_int >= var7) {
                                    L56: {
                                      cja.a(125, var7, param1, 0, var9, -1, -1, param3);
                                      if ((ld.field_e ^ -1) > -3) {
                                        break L56;
                                      } else {
                                        if (!oj.field_tb[12]) {
                                          break L56;
                                        } else {
                                          rh.field_s = true;
                                          break L56;
                                        }
                                      }
                                    }
                                    if (rh.field_s) {
                                      break L52;
                                    } else {
                                      var16 = 1;
                                      break L52;
                                    }
                                  } else {
                                    sda.field_f[var17_int] = false;
                                    var17_int++;
                                    continue L55;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L57: {
                          var17 = var8_array[var9 + 1];
                          if (var4_int == 0) {
                            break L57;
                          } else {
                            if (0 == var17.field_y) {
                              break L57;
                            } else {
                              if (!param3) {
                                if (var16 != 0) {
                                  break L57;
                                } else {
                                  if ((byte)var9 != param1.field_ac[var7]) {
                                    param1.field_ac[var7] = (byte)var9;
                                    var5 = 1;
                                    break L57;
                                  } else {
                                    break L57;
                                  }
                                }
                              } else {
                                if (var9 == -1) {
                                  var18 = var6;
                                  L58: while (true) {
                                    if (var18 >= -1 + var6 + var30.length) {
                                      break L57;
                                    } else {
                                      tqa.field_e[var18 / 8] = (byte)sea.c((int) tqa.field_e[var18 / 8], 1 << sea.c(var18, 7) ^ -1);
                                      var18++;
                                      continue L58;
                                    }
                                  }
                                } else {
                                  tqa.field_e[(var6 + var9) / 8] = (byte)kha.b((int) tqa.field_e[(var6 + var9) / 8], 1 << sea.c(7, var9 + var6));
                                  break L57;
                                }
                              }
                            }
                          }
                        }
                        L59: {
                          if (!param3) {
                            break L59;
                          } else {
                            if (var16 != 0) {
                              tqa.field_e[(var9 + var6) / 8] = (byte)sea.c((int) tqa.field_e[(var9 + var6) / 8], 1 << sea.c(7, var6 + var9) ^ -1);
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                        }
                        L60: {
                          if (-1 < (var9 ^ -1)) {
                            break L60;
                          } else {
                            if (var17.field_pb) {
                              L61: {
                                if (null == no.field_o) {
                                  var18_ref = null;
                                  break L61;
                                } else {
                                  if (null == no.field_o[var7]) {
                                    var18_ref = null;
                                    break L61;
                                  } else {
                                    var18_ref = no.field_o[var7][var9];
                                    break L61;
                                  }
                                }
                              }
                              L62: {
                                if (null == eca.field_b) {
                                  var19 = null;
                                  break L62;
                                } else {
                                  if (null == eca.field_b[var7]) {
                                    var19 = null;
                                    break L62;
                                  } else {
                                    var19 = eca.field_b[var7][var9];
                                    break L62;
                                  }
                                }
                              }
                              L63: {
                                var20 = null;
                                if (var19 == null) {
                                  break L63;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                var21 = null;
                                if (var13 != 0) {
                                  var21 = tp.field_L;
                                  var22 = var21;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var25 = var21;
                                  var22 = var25;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var22 = var25;
                                  break L64;
                                } else {
                                  if (var10 != 0) {
                                    var21 = ai.field_b;
                                    break L64;
                                  } else {
                                    L65: {
                                      if (var11 == 0) {
                                        break L65;
                                      } else {
                                        var22_int = nra.field_g[var7][var9] + -bha.field_z;
                                        if (-2 == (var22_int ^ -1)) {
                                          var21 = rm.field_b;
                                          break L65;
                                        } else {
                                          var21 = gl.a((byte) 112, vn.field_c, new String[]{Integer.toString(var22_int)});
                                          break L65;
                                        }
                                      }
                                    }
                                    L66: {
                                      if (var12 != 0) {
                                        var31 = gl.a((byte) 106, kp.field_f, new String[]{Integer.toString(qb.field_f), Integer.toString(hp.field_a[var7][var9])});
                                        var22 = var31;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        var25_ref = var31;
                                        var22 = var25_ref;
                                        if (var21 == null) {
                                          var21 = var31;
                                          break L66;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L66;
                                        }
                                      } else {
                                        break L66;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L67: {
                                        var22 = ova.field_j;
                                        if (-1 <= (var15 ^ -1)) {
                                          break L67;
                                        } else {
                                          if (null == kh.field_l) {
                                            break L67;
                                          } else {
                                            if (var15 > kh.field_l.length) {
                                              break L67;
                                            } else {
                                              if (null != kh.field_l[var15 + -1]) {
                                                var22 = kh.field_l[var15 + -1][0];
                                                break L67;
                                              } else {
                                                break L67;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 != null) {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L64;
                                      } else {
                                        var21 = var22;
                                        break L64;
                                      }
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                              }
                              L68: {
                                if (var4_int == 0) {
                                  break L68;
                                } else {
                                  if (!rh.field_s) {
                                    L69: {
                                      var22 = null;
                                      var23 = 0;
                                      if (mm.field_g) {
                                        var22 = "</col>" + mi.field_j + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L69;
                                      } else {
                                        break L69;
                                      }
                                    }
                                    var24 = 0;
                                    L70: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 != 0) {
                                          var21 = sta.field_G + (String) (var22);
                                          break L68;
                                        } else {
                                          var21 = gl.a((byte) 106, cna.field_d, new String[]{(String) (var22)});
                                          break L68;
                                        }
                                      } else {
                                        L71: {
                                          if (sda.field_f[var24]) {
                                            var25_ref = "</col>" + kma.field_e[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 != null) {
                                              var23 = 1;
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              break L71;
                                            } else {
                                              var22 = var25_ref;
                                              break L71;
                                            }
                                          } else {
                                            break L71;
                                          }
                                        }
                                        var24++;
                                        continue L70;
                                      }
                                    }
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              L72: {
                                if (var21 == null) {
                                  break L72;
                                } else {
                                  var21 = "<col=A00000>" + (String) (var21);
                                  var32 = fta.a((String) (var21), "<br>", 0, "<br><col=A00000>");
                                  if (var20 == null) {
                                    var20 = var32;
                                    break L72;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var32;
                                    break L72;
                                  }
                                }
                              }
                              if (var20 == null) {
                                break L60;
                              } else {
                                qda.field_b = (String) (var20);
                                break L60;
                              }
                            } else {
                              break L60;
                            }
                          }
                        }
                        L73: {
                          if (!param3) {
                            L74: {
                              L75: {
                                stackIn_331_0 = (tv) (var17);

                                if (!rh.field_s) {
                                  break L75;
                                } else {
                                  stackIn_331_0 = (tv) ((Object) stackIn_331_0);

                                  if ((byte)var9 != param1.field_ac[var7]) {
                                    break L75;
                                  } else {
                                    stackIn_332_0 = (tv) ((Object) stackIn_331_0);
                                    stackIn_332_1 = 1;
                                    break L74;
                                  }
                                }
                              }
                              stackIn_332_0 = (tv) ((Object) stackIn_331_0);
                              stackIn_332_1 = 0;
                              break L74;
                            }
                            stackIn_332_0.field_cb = stackIn_332_1 != 0;
                            break L73;
                          } else {
                            if (0 == (var9 ^ -1)) {
                              var17.field_cb = true;
                              var27 = var6;
                              var18 = var27;
                              L76: while (true) {
                                if (var27 >= var30.length + (var6 - 1)) {
                                  break L73;
                                } else {
                                  L77: {
                                    stackIn_326_0 = (tv) (var17);

                                    stackIn_326_1 = var17.field_cb;

                                    if (0 != (tqa.field_e[var27 / 8] & 1 << (var27 & 7))) {
                                      stackIn_327_0 = (tv) ((Object) stackIn_326_0);
                                      stackIn_327_1 = stackIn_326_1;
                                      stackIn_327_2 = 0;
                                      break L77;
                                    } else {
                                      stackIn_327_0 = (tv) ((Object) stackIn_326_0);
                                      stackIn_327_1 = stackIn_326_1;
                                      stackIn_327_2 = 1;
                                      break L77;
                                    }
                                  }
                                  stackIn_327_0.field_cb = stackIn_327_1 & stackIn_327_2 != 0;
                                  var27++;
                                  continue L76;
                                }
                              }
                            } else {
                              stackIn_318_0 = (tv) (var17);
                              stackIn_318_1 = 0;
                              stackIn_318_2 = tqa.field_e[(var6 + var9) / 8] & 1 << (7 & var9 + var6);
                              L78: {


                                if (stackIn_318_1 == stackIn_318_2) {
                                  stackIn_318_0 = (tv) ((Object) stackIn_318_0);
                                  stackIn_321_1 = 0;
                                  break L78;
                                } else {
                                  stackIn_318_0 = (tv) ((Object) stackIn_318_0);
                                  stackIn_321_1 = 1;
                                  break L78;
                                }
                              }
                              stackIn_318_0.field_cb = stackIn_321_1 != 0;
                              break L73;
                            }
                          }
                        }
                        L79: {
                          L80: {
                            stackIn_336_0 = (tv) (var17);

                            if (var4_int == 0) {
                              break L80;
                            } else {
                              stackIn_336_0 = (tv) ((Object) stackIn_336_0);

                              if (var16 != 0) {
                                break L80;
                              } else {
                                stackIn_337_0 = (tv) ((Object) stackIn_336_0);
                                stackIn_337_1 = 1;
                                break L79;
                              }
                            }
                          }
                          stackIn_337_0 = (tv) ((Object) stackIn_336_0);
                          stackIn_337_1 = 0;
                          break L79;
                        }
                        stackIn_337_0.field_X = stackIn_337_1 != 0;
                        var9++;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                L81: {
                  var28 = bf.field_b[2][var6];
                  if (var4_int == 0) {
                    break L81;
                  } else {
                    if (-1 != (var28.field_y ^ -1)) {
                      if (!param3) {
                        if (param1.field_yb != var6) {
                          var5 = 1;
                          param1.field_yb = var6;
                          break L81;
                        } else {
                          break L81;
                        }
                      } else {
                        if (var6 != 0) {
                          mua.field_b = mua.field_b ^ var6;
                          break L81;
                        } else {
                          mua.field_b = 0;
                          break L81;
                        }
                      }
                    } else {
                      break L81;
                    }
                  }
                }
                L82: {
                  stackIn_110_0 = (tv) (var28);

                  if (var4_int == 0) {
                    stackIn_111_0 = (tv) ((Object) stackIn_110_0);
                    stackIn_111_1 = 0;
                    break L82;
                  } else {
                    stackIn_111_0 = (tv) ((Object) stackIn_110_0);
                    stackIn_111_1 = 1;
                    break L82;
                  }
                }
                L83: {
                  stackIn_111_0.field_X = stackIn_111_1 != 0;
                  if (!param3) {
                    L84: {
                      stackIn_123_0 = (tv) (var28);

                      if ((var6 & param1.field_yb) == 0) {
                        stackIn_124_0 = (tv) ((Object) stackIn_123_0);
                        stackIn_124_1 = 0;
                        break L84;
                      } else {
                        stackIn_124_0 = (tv) ((Object) stackIn_123_0);
                        stackIn_124_1 = 1;
                        break L84;
                      }
                    }
                    stackIn_124_0.field_cb = stackIn_124_1 != 0;
                    break L83;
                  } else {
                    if (var6 == 0) {
                      L85: {
                        stackIn_119_0 = (tv) (var28);

                        if (mua.field_b != 0) {
                          stackIn_120_0 = (tv) ((Object) stackIn_119_0);
                          stackIn_120_1 = 0;
                          break L85;
                        } else {
                          stackIn_120_0 = (tv) ((Object) stackIn_119_0);
                          stackIn_120_1 = 1;
                          break L85;
                        }
                      }
                      stackIn_120_0.field_cb = stackIn_120_1 != 0;
                      break L83;
                    } else {
                      L86: {
                        stackIn_115_0 = (tv) (var28);

                        if ((mua.field_b & var6) == 0) {
                          stackIn_116_0 = (tv) ((Object) stackIn_115_0);
                          stackIn_116_1 = 0;
                          break L86;
                        } else {
                          stackIn_116_0 = (tv) ((Object) stackIn_115_0);
                          stackIn_116_1 = 1;
                          break L86;
                        }
                      }
                      stackIn_116_0.field_cb = stackIn_116_1 != 0;
                      break L83;
                    }
                  }
                }
                var6++;
                continue L27;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L87: {
            var4 = decompiledCaughtException;
            stackIn_346_0 = (RuntimeException) (var4);

            stackIn_346_1 = new StringBuilder().append("cm.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_347_0 = (RuntimeException) ((Object) stackIn_346_0);
              stackIn_347_1 = (StringBuilder) ((Object) stackIn_346_1);
              stackIn_347_2 = "null";
              break L87;
            } else {
              stackIn_347_0 = (RuntimeException) ((Object) stackIn_346_0);
              stackIn_347_1 = (StringBuilder) ((Object) stackIn_346_1);
              stackIn_347_2 = "{...}";
              break L87;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_347_0), stackIn_347_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
