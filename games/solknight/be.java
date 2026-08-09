/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends pj {
    static int field_I;
    static int field_K;
    int field_M;
    static String field_J;
    int field_Q;
    int field_P;
    int field_L;
    int field_N;
    int field_O;

    final static void c(boolean param0) {
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_179_0 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          L1: {
            var8 = SolKnight.field_L ? 1 : 0;
            var1 = -wd.field_c + 320;
            var2 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
            if (ve.field_b >= 0) {
              break L1;
            } else {
              var4 = -var2 + ad.field_m;
              var3 = gb.field_j - var1;
              if (var8 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = -var1 + -wd.field_c + ((sk.field_o >> -1764275260) + 320);
          var4 = -var2 + -si.field_E + (wg.field_e >> 1997227716);
          break L0;
        }
        L2: {
          L3: {
            L4: {
              L5: {
                var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
                if (0 <= gb.field_j) {
                  break L5;
                } else {
                  if (wb.field_c == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (wb.field_b <= 0) {
                break L3;
              } else {
                if (-8 < (kb.field_b ^ -1)) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            var3 = rj.field_b;
            var4 = ci.field_sb + ea.field_p[kb.field_b] + -720;
            if (var8 == 0) {
              break L2;
            } else {
              break L3;
            }
          }
          L6: {
            if (var5 > kd.field_b[kb.field_b]) {
              break L6;
            } else {
              var4 = ea.field_p[kb.field_b] - 720 + ci.field_sb;
              var3 = rj.field_b;
              var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
              break L6;
            }
          }
          rj.field_b = (32 + kd.field_b[kb.field_b]) * var3 / var5;
          ci.field_sb = -ea.field_p[kb.field_b] + 720 + (32 + kd.field_b[kb.field_b]) * var4 / var5;
          jj.field_t = (int)(Math.atan2((double)(-var3), (double)(-var4)) * 128.0 / 3.141592653589793);
          var3 = rj.field_b;
          var4 = ci.field_sb + (ea.field_p[kb.field_b] + -720);
          break L2;
        }
        var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
        if ((ve.field_b ^ -1) < -251) {
          return;
        } else {
          L7: {
            if (!param0) {
              break L7;
            } else {
              be.a(-111);
              break L7;
            }
          }
          L8: {
            L9: {
              L10: {
                L11: {
                  L12: {
                    L13: {
                      L14: {
                        L15: {
                          var6 = kb.field_b;
                          if (0 == var6) {
                            L16: {
                              if (wb.field_b <= 0) {
                                break L16;
                              } else {
                                L17: {
                                  if (12 != wb.field_b) {
                                    break L17;
                                  } else {
                                    mb.a(true, 2, 256);
                                    break L17;
                                  }
                                }
                                wb.field_b = wb.field_b - 1;
                                if (var8 == 0) {
                                  break L8;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            L18: {
                              L19: {
                                if (-2 != (wb.field_c ^ -1)) {
                                  break L19;
                                } else {
                                  if (jg.field_b == 0) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              if (0 > ve.field_b) {
                                break L8;
                              } else {
                                break L18;
                              }
                            }
                            L20: {
                              L21: {
                                if ((bi.field_h ^ -1) != -2) {
                                  break L21;
                                } else {
                                  L22: {
                                    if (param0) {
                                      stackIn_42_0 = 0;
                                      break L22;
                                    } else {
                                      stackIn_42_0 = 1;
                                      break L22;
                                    }
                                  }
                                  mb.a(stackIn_42_0 != 0, 3, 128);
                                  if (var8 == 0) {
                                    break L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L23: {
                                if (param0) {
                                  stackIn_46_0 = 0;
                                  break L23;
                                } else {
                                  stackIn_46_0 = 1;
                                  break L23;
                                }
                              }
                              mb.a(stackIn_46_0 != 0, 3, 256);
                              break L20;
                            }
                            L24: {
                              wb.field_b = 25;
                              if (bi.field_h <= 0) {
                                break L24;
                              } else {
                                wb.field_b = 13;
                                break L24;
                              }
                            }
                            L25: {
                              if (2 > bi.field_h) {
                                break L25;
                              } else {
                                var6 = var3 * 128 / var5;
                                var7 = 128 * var4 / var5;
                                m.a(0, (ci.field_sb << 1375723876) + var6, -var7 + (rj.field_b << 2123863876), (byte) -6, var7, var6);
                                m.a(0, -var6 + (ci.field_sb << -1288420796), var7 + (rj.field_b << 1052443108), (byte) -6, var7, var6);
                                if (var8 == 0) {
                                  break L8;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            m.a(0, ci.field_sb << -1078515900, rj.field_b << 1487773988, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                            if (var8 == 0) {
                              break L8;
                            } else {
                              break L15;
                            }
                          } else {
                            if (-3 == (var6 ^ -1)) {
                              break L15;
                            } else {
                              if (-2 == (var6 ^ -1)) {
                                break L14;
                              } else {
                                if (var6 == 3) {
                                  break L13;
                                } else {
                                  if (4 == var6) {
                                    break L12;
                                  } else {
                                    if (5 == var6) {
                                      break L11;
                                    } else {
                                      L26: {
                                        if (6 != var6) {
                                          break L26;
                                        } else {
                                          if (var8 == 0) {
                                            break L10;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      if (var6 == 7) {
                                        break L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L27: {
                          if (wb.field_b > 0) {
                            break L27;
                          } else {
                            L28: {
                              L29: {
                                if (wb.field_c != 1) {
                                  break L29;
                                } else {
                                  if (0 == jg.field_b) {
                                    break L28;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              if ((ve.field_b ^ -1) <= -1) {
                                break L28;
                              } else {
                                break L8;
                              }
                            }
                            L30: {
                              L31: {
                                if ((bi.field_h ^ -1) != -2) {
                                  break L31;
                                } else {
                                  mb.a(true, 8, 128);
                                  if (var8 == 0) {
                                    break L30;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              mb.a(true, 8, 256);
                              break L30;
                            }
                            L32: {
                              wb.field_b = 37;
                              if (0 < bi.field_h) {
                                wb.field_b = 18;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: {
                              if ((bi.field_h ^ -1) > -3) {
                                break L33;
                              } else {
                                var6 = 32 * (var4 + var3) / var5;
                                var7 = (-var3 + var4) * 32 / var5;
                                m.a(1, (ci.field_sb << 45706276) + var6 * 4, -(var7 * 4) + (rj.field_b << 1951156356), (byte) -6, var7, var6);
                                m.a(1, (ci.field_sb << -1963021212) - -(var7 * 4), (rj.field_b << -305687644) - -(4 * var6), (byte) -6, var6, -var7);
                                if (var8 == 0) {
                                  break L8;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            m.a(1, ci.field_sb << 767114436, rj.field_b << -995095964, (byte) -6, var4 * 32 / var5, 32 * var3 / var5);
                            if (var8 == 0) {
                              break L8;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L34: {
                          if (wb.field_b == 12) {
                            mb.a(true, 2, 256);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        wb.field_b = wb.field_b - 1;
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L14;
                        }
                      }
                      L35: {
                        if (0 < wb.field_b) {
                          break L35;
                        } else {
                          L36: {
                            L37: {
                              if (wb.field_c != 1) {
                                break L37;
                              } else {
                                if (jg.field_b == 0) {
                                  break L36;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            if (0 > ve.field_b) {
                              break L8;
                            } else {
                              break L36;
                            }
                          }
                          L38: {
                            mb.a(true, 15, 256);
                            wb.field_b = 50;
                            if (-1 <= (bi.field_h ^ -1)) {
                              break L38;
                            } else {
                              wb.field_b = 25;
                              break L38;
                            }
                          }
                          m.a(2, ci.field_sb << 1476027780, rj.field_b << -1272538652, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                          if (var8 == 0) {
                            break L8;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L39: {
                        if (-13 == (wb.field_b ^ -1)) {
                          L40: {
                            if (param0) {
                              stackIn_88_0 = 0;
                              break L40;
                            } else {
                              stackIn_88_0 = 1;
                              break L40;
                            }
                          }
                          mb.a(stackIn_88_0 != 0, 2, 256);
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                      wb.field_b = wb.field_b - 1;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L13;
                      }
                    }
                    L41: {
                      if (wb.field_b > 0) {
                        break L41;
                      } else {
                        L42: {
                          L43: {
                            if ((wb.field_c ^ -1) != -2) {
                              break L43;
                            } else {
                              if (-1 == (jg.field_b ^ -1)) {
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                          if (ve.field_b < 0) {
                            break L8;
                          } else {
                            break L42;
                          }
                        }
                        L44: {
                          mb.a(true, 10, 256);
                          wb.field_b = 75;
                          if (-1 <= (bi.field_h ^ -1)) {
                            break L44;
                          } else {
                            wb.field_b = 37;
                            break L44;
                          }
                        }
                        m.a(3, ci.field_sb << -1348773468, rj.field_b << 321235716, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L41;
                        }
                      }
                    }
                    L45: {
                      if (12 != wb.field_b) {
                        break L45;
                      } else {
                        mb.a(true, 2, 256);
                        break L45;
                      }
                    }
                    wb.field_b = wb.field_b - 1;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      break L12;
                    }
                  }
                  L46: {
                    if (wb.field_b > 0) {
                      break L46;
                    } else {
                      L47: {
                        L48: {
                          if (-2 != (wb.field_c ^ -1)) {
                            break L48;
                          } else {
                            if (jg.field_b == 0) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        if ((ve.field_b ^ -1) <= -1) {
                          break L47;
                        } else {
                          break L8;
                        }
                      }
                      L49: {
                        mb.a(true, 11, 256);
                        wb.field_b = 8;
                        if ((bi.field_h ^ -1) > -1) {
                          break L49;
                        } else {
                          m.a(4, ci.field_sb << -661717148, rj.field_b << 2022584740, (byte) -6, var4 * 256 / var5, var3 * 256 / var5);
                          break L49;
                        }
                      }
                      L50: {
                        if ((bi.field_h ^ -1) > -2) {
                          break L50;
                        } else {
                          m.a(4, ci.field_sb << -1371149692, rj.field_b << -933566652, (byte) -6, 256 * var4 / var5 - var3 * 32 / var5, 256 * var3 / var5 + var4 * 32 / var5);
                          m.a(4, ci.field_sb << -688221052, rj.field_b << 343516740, (byte) -6, 256 * var4 / var5 - -(32 * var3 / var5), -(var4 * 32 / var5) + var3 * 256 / var5);
                          break L50;
                        }
                      }
                      if (2 > bi.field_h) {
                        break L8;
                      } else {
                        m.a(4, ci.field_sb << -813109404, rj.field_b << -600088892, (byte) -6, 192 * var4 / var5 - 48 * var3 / var5, 192 * var3 / var5 + var4 * 48 / var5);
                        m.a(4, ci.field_sb << 740470500, rj.field_b << 1849683140, (byte) -6, 192 * var4 / var5 - -(48 * var3 / var5), -(48 * var4 / var5) + 192 * var3 / var5);
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                  wb.field_b = wb.field_b - 1;
                  if (var8 == 0) {
                    break L8;
                  } else {
                    break L11;
                  }
                }
                L51: {
                  if (-1 <= (wb.field_b ^ -1)) {
                    break L51;
                  } else {
                    wb.field_b = wb.field_b - 1;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      break L51;
                    }
                  }
                }
                L52: {
                  L53: {
                    if (-2 != (wb.field_c ^ -1)) {
                      break L53;
                    } else {
                      if (jg.field_b == 0) {
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  if (ve.field_b < 0) {
                    break L8;
                  } else {
                    break L52;
                  }
                }
                mb.a(true, 5, 256);
                wb.field_b = 8;
                m.a(5, ci.field_sb << -1683468444, rj.field_b << 692267076, (byte) -6, (128 - bi.field_h * 32) * var4 / var5, (128 - 32 * bi.field_h) * var3 / var5);
                if (var8 == 0) {
                  break L8;
                } else {
                  break L10;
                }
              }
              L54: {
                if ((wb.field_b ^ -1) < -1) {
                  L55: {
                    wb.field_b = wb.field_b - 1;
                    if (0 == wb.field_b) {
                      break L55;
                    } else {
                      if (wb.field_b == 10) {
                        break L55;
                      } else {
                        if (wb.field_b == 20) {
                          break L55;
                        } else {
                          if ((wb.field_b ^ -1) == -31) {
                            break L55;
                          } else {
                            if (wb.field_b == 40) {
                              break L55;
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                    }
                  }
                  L56: {
                    if (param0) {
                      stackIn_138_0 = 0;
                      break L56;
                    } else {
                      stackIn_138_0 = 1;
                      break L56;
                    }
                  }
                  mb.a(stackIn_138_0 != 0, 18, 256);
                  break L54;
                } else {
                  break L54;
                }
              }
              L57: {
                if ((wb.field_b ^ -1) < -1) {
                  break L57;
                } else {
                  L58: {
                    L59: {
                      if (-2 != (wb.field_c ^ -1)) {
                        break L59;
                      } else {
                        if (0 == jg.field_b) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    if (0 <= ve.field_b) {
                      break L58;
                    } else {
                      break L57;
                    }
                  }
                  wb.field_b = 100;
                  break L57;
                }
              }
              L60: {
                L61: {
                  if (-91 == (wb.field_b ^ -1)) {
                    break L61;
                  } else {
                    if (wb.field_b == 70) {
                      break L61;
                    } else {
                      if ((wb.field_b ^ -1) == -51) {
                        break L61;
                      } else {
                        break L60;
                      }
                    }
                  }
                }
                mb.a(true, 17, 256);
                m.a(6, ci.field_sb << -1921851004, rj.field_b << -2091216284, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                break L60;
              }
              L62: {
                L63: {
                  if (80 == wb.field_b) {
                    break L63;
                  } else {
                    if ((wb.field_b ^ -1) == -61) {
                      break L63;
                    } else {
                      if ((bi.field_h ^ -1) > -2) {
                        break L62;
                      } else {
                        if (wb.field_b == 55) {
                          break L63;
                        } else {
                          if ((wb.field_b ^ -1) == -71) {
                            break L63;
                          } else {
                            if (85 != wb.field_b) {
                              break L62;
                            } else {
                              break L63;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                mb.a(true, 17, 256);
                m.a(6, ci.field_sb << 116571620, rj.field_b << -662492924, (byte) -6, var4 * 128 / var5 - -(var3 * 64 / var5), var3 * 128 / var5 + -(var4 * 64 / var5));
                m.a(6, ci.field_sb << -585038044, rj.field_b << 706606148, (byte) -6, var4 * 128 / var5 - var3 * 64 / var5, var4 * 64 / var5 + 128 * var3 / var5);
                break L62;
              }
              if ((wb.field_b ^ -1) != -51) {
                break L8;
              } else {
                if (-3 == (bi.field_h ^ -1)) {
                  wb.field_b = 0;
                  if (var8 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                } else {
                  break L8;
                }
              }
            }
            L64: {
              L65: {
                if ((wb.field_b ^ -1) >= -1) {
                  break L65;
                } else {
                  wb.field_b = wb.field_b - 4;
                  if ((wb.field_b ^ -1) >= -51) {
                    break L64;
                  } else {
                    wb.field_b = wb.field_b - 4;
                    if (var8 == 0) {
                      break L64;
                    } else {
                      break L65;
                    }
                  }
                }
              }
              L66: {
                L67: {
                  if ((wb.field_c ^ -1) != -2) {
                    break L67;
                  } else {
                    if (0 == jg.field_b) {
                      break L66;
                    } else {
                      break L67;
                    }
                  }
                }
                if (ve.field_b < 0) {
                  break L64;
                } else {
                  break L66;
                }
              }
              wb.field_b = 175;
              mb.a(true, 19, 256);
              break L64;
            }
            L68: {
              if ((wb.field_b ^ -1) > -47) {
                break L68;
              } else {
                if (-55 < (wb.field_b ^ -1)) {
                  L69: {
                    if (param0) {
                      stackIn_179_0 = 0;
                      break L69;
                    } else {
                      stackIn_179_0 = 1;
                      break L69;
                    }
                  }
                  mb.a(stackIn_179_0 != 0, 20, 256);
                  break L68;
                } else {
                  break L68;
                }
              }
            }
            if (-1 <= (wb.field_b ^ -1)) {
              break L8;
            } else {
              if (-51 < (wb.field_b ^ -1)) {
                m.a(7, ci.field_sb << 1381296548, rj.field_b << -321756412, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                break L8;
              } else {
                break L8;
              }
            }
          }
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                            statePc = 17;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var8_int = -this.field_m + (-param1 + -this.field_N) + param3;
                        var9 = -this.field_P + -this.field_j + -param5 + param4;
                        if (var8_int * var8_int - -(var9 * var9) >= this.field_O * this.field_O) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var10 = Math.atan2((double)var9, (double)var8_int) - ic.field_w;
                        if (var10 < 0.0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 > 0.0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = var10 + 3.141592653589793 / (double)this.field_L;
                        if (var12 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = var10 - 3.141592653589793 / (double)this.field_L;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_Q = (int)((double)this.field_L * var10 / 6.283185307179586);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_Q < this.field_L) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_Q = this.field_Q - this.field_L;
                        if (var12 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var12 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 >= (this.field_Q ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_Q = this.field_Q + this.field_L;
                        if (var12 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        if (!param2) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var8);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("be.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param6 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(byte param0, byte[] param1, jd param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param2.d((byte) 48, param3);
                        if (-1 != (var4_int ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4_int != param1.length) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param1 = new byte[var4_int];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = param2.d((byte) 48, 3);
                        var6 = (byte)param2.d((byte) 48, 8);
                        if ((var5 ^ -1) < -1) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param1[var7] = (byte)var6;
                        var7++;
                        if (var8 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param1[var7] = (byte)(var6 + param2.d((byte) 48, var5));
                        var7++;
                        if (var8 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0 == 63) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        be.a(-63);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (byte[]) (param1);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("be.E(").append(param0).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param1 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param2 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void i(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                if (param0 == 4) {
                  L1: {
                    var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var1 != null) {
                      try {
                        L2: {
                          var2 = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                          bi.field_a = (int)(var3.longValue() / 1048576L) - -1;
                          break L2;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          var2_ref = decompiledCaughtException;
                          break L3;
                        }
                      }
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L4;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != -3) {
            jd var2 = (jd) null;
            be.a((byte) -106, (byte[]) null, (jd) null, 51);
        }
    }

    private be() throws Throwable {
        throw new Error();
    }

    static {
        field_J = "Members";
    }
}
