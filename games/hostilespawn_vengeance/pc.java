/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int field_c;
    static volatile boolean field_a;
    static int field_d;
    static String field_b;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        boolean[] var5 = null;
        boolean[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        oc var8 = null;
        int var9 = 0;
        oj var9_ref_oj = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        oj var22_ref_oj = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_159_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        L0: {
          var26 = HostileSpawn.field_I ? 1 : 0;
          if (50 > df.field_c) {
            if (ik.field_b) {
              return;
            } else {
              ik.field_b = true;
              aa.field_f = aa.field_f + 1;
              if (-11 >= (aa.field_f + 1 ^ -1)) {
                break L0;
              } else {
                return;
              }
            }
          } else {
            break L0;
          }
        }
        aa.field_f = 0;
        var1_int = ln.field_a.field_d;
        var2 = ln.field_a.field_a;
        var3 = ln.field_a.field_n;
        kf.a(cm.field_c, 0, var3);
        var4 = ln.field_a.field_c;
        var5 = ln.field_a.field_e;
        var6 = ln.field_a.field_q;
        var7 = ln.field_a.field_f;
        var8_int = 1;
        L1: while (true) {
          if (rc.field_e <= var8_int) {
            L2: {
              var8 = mm.field_m[0].field_j;
              var9 = var8.b(-4);
              var10 = ln.field_a.field_g[var9];
              if (-1 != (var10 ^ -1)) {
                break L2;
              } else {
                var10 = -1;
                break L2;
              }
            }
            L3: {
              var11 = var8.field_g + -50;
              var12 = 50 + var8.field_g;
              var13 = -50 + var8.field_e;
              if (0 < var11) {
                break L3;
              } else {
                var11 = 1;
                break L3;
              }
            }
            L4: {
              if (0 >= var13) {
                var13 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var14 = var8.field_e + 50;
              if (var14 >= var1_int + -1) {
                var14 = var1_int + -2;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var2 + -1 <= var12) {
                var12 = -2 + var2;
                break L6;
              } else {
                break L6;
              }
            }
            var15 = 0;
            var16 = var11;
            L7: while (true) {
              if ((var12 ^ -1) >= (var16 ^ -1)) {
                var16 = var11 * var1_int;
                var17 = var8.field_e;
                var18 = var8.field_g;
                var19 = Math.max(-19 + var8.field_e, 1);
                var20 = Math.min(20 + var8.field_e, ln.field_a.field_d - param0);
                var21 = Math.max(var8.field_g - 17, 1);
                var22 = Math.min(16 + var8.field_g, ln.field_a.field_a + -2);
                var23 = var19;
                L8: while (true) {
                  if ((var20 ^ -1) > (var23 ^ -1)) {
                    var23 = 1 + var21;
                    L9: while (true) {
                      if (var22 + -1 < var23) {
                        L10: {
                          if ((var10 ^ -1) >= -1) {
                            break L10;
                          } else {
                            var16 = var21 * ln.field_a.field_d;
                            var23 = var21;
                            L11: while (true) {
                              if (var22 < var23) {
                                break L10;
                              } else {
                                var24 = var19;
                                L12: while (true) {
                                  if ((var20 ^ -1) > (var24 ^ -1)) {
                                    var16 = var16 + ln.field_a.field_d;
                                    var23++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      if ((var10 ^ -1) == (ln.field_a.field_g[var24 + var16] ^ -1)) {
                                        ln.field_a.field_e[var16 + var24] = true;
                                        ln.field_a.field_f[var16 - -var24] = 2;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var24++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          cm.field_c[var9] = 50;
                          var6[var9] = true;
                          var19 = 49;
                          var20 = var9;
                          if (!n.field_o) {
                            break L14;
                          } else {
                            var21 = 0;
                            L15: while (true) {
                              if ((var21 ^ -1) <= (rc.field_e ^ -1)) {
                                break L14;
                              } else {
                                L16: {
                                  var22_ref_oj = re.field_n[var21];
                                  var23 = var22_ref_oj.field_j.b(param0 ^ -2);
                                  if (null == var22_ref_oj) {
                                    break L16;
                                  } else {
                                    if (!od.a(var22_ref_oj.field_i, 1)) {
                                      break L16;
                                    } else {
                                      if ((var22_ref_oj.field_h ^ -1) == -1) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (null == q.field_g) {
                                            break L17;
                                          } else {
                                            if (q.field_g.a(var22_ref_oj, (byte) -5)) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var4[var23] = 0;
                                        if (rh.a(var22_ref_oj.field_i, true)) {
                                          L18: {
                                            var4[var23 + -ln.field_a.field_d] = 0;
                                            var24 = var4[1 + -ln.field_a.field_d + var23];
                                            if (1 != var4[1 + var23]) {
                                              break L18;
                                            } else {
                                              if ((var24 ^ -1) == -3) {
                                                break L18;
                                              } else {
                                                if (var24 == 3) {
                                                  break L18;
                                                } else {
                                                  if (4 != var24) {
                                                    var4[var23 + 1] = 0;
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var24 != 1) {
                                            break L16;
                                          } else {
                                            var24 = var4[var23 - (ln.field_a.field_d * 2 + 1)];
                                            if (2 == var24) {
                                              break L16;
                                            } else {
                                              if ((var24 ^ -1) == -4) {
                                                break L16;
                                              } else {
                                                if ((var24 ^ -1) != -5) {
                                                  var4[-ln.field_a.field_d + (var23 - -1)] = 0;
                                                  break L16;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L19: {
                                            var4[1 + var23] = 0;
                                            var24 = var4[var23 + ln.field_a.field_d - 1];
                                            if (1 != var4[var23 + ln.field_a.field_d]) {
                                              break L19;
                                            } else {
                                              if (var24 == 2) {
                                                break L19;
                                              } else {
                                                if (var24 == 3) {
                                                  break L19;
                                                } else {
                                                  if (4 != var24) {
                                                    var4[var23 - -ln.field_a.field_d] = 0;
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L20: {
                                            var24 = var4[ln.field_a.field_d + var23];
                                            if ((var4[ln.field_a.field_d + (var23 + 1)] ^ -1) != -2) {
                                              break L20;
                                            } else {
                                              if (2 == var24) {
                                                break L20;
                                              } else {
                                                if (var24 == 3) {
                                                  break L20;
                                                } else {
                                                  if (var24 != 4) {
                                                    var4[1 + ln.field_a.field_d + var23] = 0;
                                                    break L20;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                }
                                var21++;
                                continue L15;
                              }
                            }
                          }
                        }
                        L21: while (true) {
                          L22: {
                            L23: {
                              kl.field_c[var19] = var20;
                              cm.field_c[var20] = var19 + 1;
                              var21 = var20 + 1;
                              var22 = -1 + var20;
                              var23 = -var1_int + var20;
                              var24 = var20 - -var1_int;
                              var25 = cm.field_c[var20] + -1;
                              if (var19 <= 0) {
                                break L23;
                              } else {
                                stackOut_106_0 = var4[var21] ^ -1;
                                stackOut_106_1 = -1;
                                stackIn_107_0 = stackOut_106_0;
                                stackIn_107_1 = stackOut_106_1;
                                L24: {
                                  if (stackIn_107_0 == stackIn_107_1) {
                                    break L24;
                                  } else {
                                    if ((var4[var21] ^ -1) != -6) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                if (cm.field_c[var21] < var25) {
                                  var19--;
                                  var20 = var21;
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L25: {
                              if (var19 <= 0) {
                                break L25;
                              } else {
                                L26: {
                                  if (-1 == (var4[var23] ^ -1)) {
                                    break L26;
                                  } else {
                                    if (-6 != (var4[var23] ^ -1)) {
                                      break L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                if (var25 <= cm.field_c[var23]) {
                                  break L25;
                                } else {
                                  var20 = var23;
                                  var19--;
                                  break L22;
                                }
                              }
                            }
                            stackOut_122_0 = var19 ^ -1;
                            stackOut_122_1 = -1;
                            stackIn_123_0 = stackOut_122_0;
                            stackIn_123_1 = stackOut_122_1;
                            L27: {
                              if (stackIn_123_0 >= stackIn_123_1) {
                                break L27;
                              } else {
                                L28: {
                                  if (var4[var24] == 0) {
                                    break L28;
                                  } else {
                                    if (var4[var24] != 5) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                if ((cm.field_c[var24] ^ -1) > (var25 ^ -1)) {
                                  var19--;
                                  var20 = var24;
                                  break L22;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L29: {
                              if (var19 <= 0) {
                                break L29;
                              } else {
                                L30: {
                                  if ((var4[var22] ^ -1) == -1) {
                                    break L30;
                                  } else {
                                    if (-6 != (var4[var22] ^ -1)) {
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                if (var25 > cm.field_c[var22]) {
                                  var20 = var22;
                                  var19--;
                                  break L22;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            var19++;
                            if (-51 >= (var19 ^ -1)) {
                              L31: {
                                var15 = 0;
                                if (n.field_o) {
                                  var21 = 0;
                                  L32: while (true) {
                                    if ((var21 ^ -1) <= (rc.field_e ^ -1)) {
                                      break L31;
                                    } else {
                                      L33: {
                                        var22_ref_oj = re.field_n[var21];
                                        if (od.a(var22_ref_oj.field_i, 1)) {
                                          if (-1 != (var22_ref_oj.field_e ^ -1)) {
                                            break L33;
                                          } else {
                                            if (0 >= var22_ref_oj.field_I) {
                                              break L33;
                                            } else {
                                              L34: {
                                                var23 = var22_ref_oj.field_j.b(-4);
                                                if (rh.a(var22_ref_oj.field_i, true)) {
                                                  stackOut_158_0 = -ln.field_a.field_d;
                                                  stackIn_159_0 = stackOut_158_0;
                                                  break L34;
                                                } else {
                                                  stackOut_157_0 = 1;
                                                  stackIn_159_0 = stackOut_157_0;
                                                  break L34;
                                                }
                                              }
                                              var24 = stackIn_159_0;
                                              ln.field_a.field_c[var23] = 2;
                                              ln.field_a.field_c[var24 + var23] = 2;
                                              break L33;
                                            }
                                          }
                                        } else {
                                          break L33;
                                        }
                                      }
                                      var21++;
                                      continue L32;
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                              L35: {
                                if (0 != (cj.field_I & 4)) {
                                  var16 = var1_int;
                                  var21 = 1;
                                  L36: while (true) {
                                    if ((var21 ^ -1) <= (-1 + var2 ^ -1)) {
                                      var16 = var1_int;
                                      var21 = 1;
                                      L37: while (true) {
                                        if ((var21 ^ -1) <= (var2 - 1 ^ -1)) {
                                          break L35;
                                        } else {
                                          var22 = 1;
                                          L38: while (true) {
                                            if ((var1_int + -1 ^ -1) >= (var22 ^ -1)) {
                                              var16 = var16 + var1_int;
                                              var21++;
                                              continue L37;
                                            } else {
                                              L39: {
                                                var15 = var16 + var22;
                                                if (var5[var15]) {
                                                  break L39;
                                                } else {
                                                  if (2 == var4[var15]) {
                                                    L40: {
                                                      L41: {
                                                        if (!var5[var15 - -1]) {
                                                          break L41;
                                                        } else {
                                                          if (-3 != (var4[var15 - -1] ^ -1)) {
                                                            break L40;
                                                          } else {
                                                            break L41;
                                                          }
                                                        }
                                                      }
                                                      L42: {
                                                        if (!var5[-1 + var15]) {
                                                          break L42;
                                                        } else {
                                                          if (-3 != (var4[var15 + -1] ^ -1)) {
                                                            break L40;
                                                          } else {
                                                            break L42;
                                                          }
                                                        }
                                                      }
                                                      L43: {
                                                        if (!var5[var1_int + var15]) {
                                                          break L43;
                                                        } else {
                                                          if ((var4[var15 - -var1_int] ^ -1) != -3) {
                                                            break L40;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                      }
                                                      if (!var5[-var1_int + var15]) {
                                                        break L39;
                                                      } else {
                                                        if (-3 != (var4[var15 + -var1_int] ^ -1)) {
                                                          break L40;
                                                        } else {
                                                          break L39;
                                                        }
                                                      }
                                                    }
                                                    var5[var15] = true;
                                                    var7[var15] = 2;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              var22++;
                                              continue L38;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var22 = 1;
                                      L44: while (true) {
                                        if (-1 + var1_int <= var22) {
                                          var16 = var16 + var1_int;
                                          var21++;
                                          continue L36;
                                        } else {
                                          L45: {
                                            var15 = var22 + var16;
                                            if (var5[var15]) {
                                              break L45;
                                            } else {
                                              if (var4[var15] == 1) {
                                                L46: {
                                                  L47: {
                                                    if (!var5[1 + var15]) {
                                                      break L47;
                                                    } else {
                                                      if (-3 == (var4[1 + var15] ^ -1)) {
                                                        break L47;
                                                      } else {
                                                        if (-2 != (var4[var15 + 1] ^ -1)) {
                                                          break L46;
                                                        } else {
                                                          break L47;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L48: {
                                                    if (!var5[var15 + -1]) {
                                                      break L48;
                                                    } else {
                                                      if (var4[var15 + -1] == 2) {
                                                        break L48;
                                                      } else {
                                                        if (-2 != (var4[var15 - 1] ^ -1)) {
                                                          break L46;
                                                        } else {
                                                          break L48;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L49: {
                                                    if (!var5[var15 + var1_int]) {
                                                      break L49;
                                                    } else {
                                                      if (var4[var1_int + var15] == 2) {
                                                        break L49;
                                                      } else {
                                                        if (-2 != (var4[var1_int + var15] ^ -1)) {
                                                          break L46;
                                                        } else {
                                                          break L49;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (!var5[var15 + -var1_int]) {
                                                    break L45;
                                                  } else {
                                                    if (-3 == (var4[var15 - var1_int] ^ -1)) {
                                                      break L45;
                                                    } else {
                                                      if (var4[-var1_int + var15] == 1) {
                                                        break L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                }
                                                var5[var15] = true;
                                                var7[var15] = 2;
                                                break L45;
                                              } else {
                                                break L45;
                                              }
                                            }
                                          }
                                          var22++;
                                          continue L44;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L35;
                                }
                              }
                              return;
                            } else {
                              var20 = kl.field_c[var19];
                              break L22;
                            }
                          }
                          continue L21;
                        }
                      } else {
                        ui.a(var23, var17, var18, var19, (byte) -69);
                        ui.a(var23, var17, var18, var20, (byte) -69);
                        var23++;
                        continue L9;
                      }
                    }
                  } else {
                    ui.a(var21, var17, var18, var23, (byte) -69);
                    ui.a(var22, var17, var18, var23, (byte) -69);
                    var23++;
                    continue L8;
                  }
                }
              } else {
                var15 = var16 * var1_int + var13;
                var17 = var13;
                L50: while (true) {
                  if (var14 <= var17) {
                    var16++;
                    continue L7;
                  } else {
                    var5[var15] = false;
                    var6[var15] = false;
                    var15++;
                    var17++;
                    continue L50;
                  }
                }
              }
            }
          } else {
            L51: {
              var9_ref_oj = re.field_n[var8_int];
              var10 = var9_ref_oj.field_j.b(param0 + -6);
              if (var10 < 0) {
                break L51;
              } else {
                if ((var3 ^ -1) >= (var10 ^ -1)) {
                  break L51;
                } else {
                  if (var4[var10] != 3) {
                    break L51;
                  } else {
                    var4[var10] = 0;
                    break L51;
                  }
                }
              }
            }
            var8_int++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, pf param3, byte param4) {
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
        Object stackIn_6_0 = null;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        Object stackOut_5_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_51_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 > 79) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = vf.b(123, (param0 + -param1) * 3);
                        var6 = 3 * param1;
                        lk.l(74);
                        var7 = var5_int + -10;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3.field_f <= 0) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = null;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 != (Object) (Object) param3.field_x) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        fk.a((byte) -74);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        th.field_Lb = 0;
                        var8 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var8 ^ -1) <= (param3.field_k ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = param3.field_i[var8];
                        var10 = param3.field_P[var8];
                        var11 = param3.field_z[var8];
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param2) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = tb.field_K[var9];
                        var13 = lc.field_c[var9];
                        var14 = tb.field_K[var10] - var12;
                        var15 = -var12 + tb.field_K[var11];
                        var16 = lc.field_c[var10] - var13;
                        var17 = -var13 + lc.field_c[var11];
                        if (-1 >= (var17 * var14 + -(var16 * var15) ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var12 = rb.field_p[var9];
                        if (-2147483648 == var12) {
                            statePc = 50;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = rb.field_p[var10];
                        if (-2147483648 == var13) {
                            statePc = 50;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14 = rb.field_p[var11];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((var14 ^ -1) != 2147483647) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var15 = var14 + (var12 - (-var13 + var6));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = -1 + mn.field_a.length;
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if ((var7 ^ -1) <= -1) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = stackIn_28_0;
                        stackOut_28_1 = var15 << -var7;
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = stackIn_30_0;
                        stackOut_30_1 = var15 >> var7;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16 = stackIn_31_0 + -stackIn_31_1;
                        var17 = mn.field_a[var16];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0 == var17 >> -1647043868) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var16--;
                        if (var16 >= 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        System.err.println("Out of range!");
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17 = mn.field_a[var16];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18 = (var16 << 1390621636) + var17;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        lh.field_d[var18] = var8;
                        mn.field_a[var16] = 1 + var17;
                        if (-1 <= (param3.field_f ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = null;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != (Object) (Object) param3.field_x) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ke.field_z[param3.field_x[var8]] = ke.field_z[param3.field_x[var8]] + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        th.field_Lb = th.field_Lb + 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var8++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 >= param3.field_f) {
                            statePc = 69;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (null == param3.field_x) {
                            statePc = 69;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var9 ^ -1) <= (ke.field_z.length ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10 = ke.field_z[var9];
                        ke.field_z[var9] = var8;
                        var8 = var8 + var10;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9++;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 63: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    try {
                        stackOut_64_0 = (RuntimeException) var5;
                        stackOut_64_1 = new StringBuilder().append("pc.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (param3 == null) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                        stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                        stackOut_65_2 = "{...}";
                        stackIn_68_0 = stackOut_65_0;
                        stackIn_68_1 = stackOut_65_1;
                        stackIn_68_2 = stackOut_65_2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                    stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                    stackOut_67_2 = "null";
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    throw wg.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 44 + param4 + 41);
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        try {
            ac.a(param1, param0, -1, (String) null);
            if (param2) {
                pc.a(118, 37, true, (pf) null, (byte) -126);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "pc.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 14088) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        pc.a(true, true, true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = se.field_c.equals((Object) (Object) mf.a(false, (CharSequence) (Object) param1));
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var2;
                        stackOut_7_1 = new StringBuilder().append("pc.C(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, String param1, boolean param2, long param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param2) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_a = false;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6_ref2 = param4.getParameter("cookiehost");
                            var7 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var6_ref2;
                            if (param3 >= 0L) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7 = var7 + "; Discard;";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var7 + "; Expires=" + dk.a((byte) -41, 1000L * param3 + hn.a((byte) 80)) + "; Max-Age=" + param3;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            a.a(param4, 17467, "document.cookie=\"" + var7 + "\"");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = caughtException;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var6_ref = (RuntimeException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (RuntimeException) var6_ref;
                            stackOut_12_1 = new StringBuilder().append("pc.E(");
                            stackIn_15_0 = stackOut_12_0;
                            stackIn_15_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (param0 == null) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                            stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                            stackOut_13_2 = "{...}";
                            stackIn_16_0 = stackOut_13_0;
                            stackIn_16_1 = stackOut_13_1;
                            stackIn_16_2 = stackOut_13_2;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "null";
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_19_1 = stackOut_16_1;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            if (param1 == null) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                            stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                            stackOut_17_2 = "{...}";
                            stackIn_20_0 = stackOut_17_0;
                            stackIn_20_1 = stackOut_17_1;
                            stackIn_20_2 = stackOut_17_2;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44).append(param3).append(44);
                            stackIn_23_0 = stackOut_20_0;
                            stackIn_23_1 = stackOut_20_1;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            if (param4 == null) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                            stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                            stackOut_21_2 = "{...}";
                            stackIn_24_0 = stackOut_21_0;
                            stackIn_24_1 = stackOut_21_1;
                            stackIn_24_2 = stackOut_21_2;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "null";
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw wg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
                    }
                    case 25: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != 1) {
                field_c = -57;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "pc.D(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "@";
    }
}
