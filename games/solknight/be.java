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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_170_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          var1 = -wd.field_c + 320;
          var2 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
          if (ve.field_b >= 0) {
            var3 = -var1 + -wd.field_c + ((sk.field_o >> -1764275260) + 320);
            var4 = -var2 + -si.field_E + (wg.field_e >> 1997227716);
            break L0;
          } else {
            var4 = -var2 + ad.field_m;
            var3 = gb.field_j - var1;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
              if (0 <= gb.field_j) {
                break L3;
              } else {
                if (wb.field_c == -1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (wb.field_b <= 0) {
                break L4;
              } else {
                if (-8 > kb.field_b) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (var5 > kd.field_b[kb.field_b]) {
                break L5;
              } else {
                var4 = ea.field_p[kb.field_b] - 720 + ci.field_sb;
                var3 = rj.field_b;
                var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
                break L5;
              }
            }
            rj.field_b = (32 + kd.field_b[kb.field_b]) * var3 / var5;
            ci.field_sb = -ea.field_p[kb.field_b] + 720 + (32 + kd.field_b[kb.field_b]) * var4 / var5;
            jj.field_t = (int)(Math.atan2((double)(-var3), (double)(-var4)) * 128.0 / 3.141592653589793);
            var3 = rj.field_b;
            var4 = ci.field_sb + (ea.field_p[kb.field_b] + -720);
            break L1;
          }
          var3 = rj.field_b;
          var4 = ci.field_sb + ea.field_p[kb.field_b] + -720;
          break L1;
        }
        var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
        if (ve.field_b < -251) {
          return;
        } else {
          L6: {
            if (!param0) {
              break L6;
            } else {
              be.a(-111);
              break L6;
            }
          }
          L7: {
            var6 = kb.field_b;
            if (0 == var6) {
              if (wb.field_b <= 0) {
                L8: {
                  L9: {
                    if (-2 != (wb.field_c ^ -1)) {
                      break L9;
                    } else {
                      if (jg.field_b == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (0 > ve.field_b) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if ((bi.field_h ^ -1) != -2) {
                    L11: {
                      if (param0) {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        break L11;
                      } else {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        break L11;
                      }
                    }
                    mb.a(stackIn_45_0 != 0, 3, 256);
                    break L10;
                  } else {
                    L12: {
                      if (param0) {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L12;
                      } else {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        break L12;
                      }
                    }
                    mb.a(stackIn_41_0 != 0, 3, 128);
                    break L10;
                  }
                }
                L13: {
                  wb.field_b = 25;
                  if (bi.field_h <= 0) {
                    break L13;
                  } else {
                    wb.field_b = 13;
                    break L13;
                  }
                }
                if (2 > bi.field_h) {
                  rb discarded$18 = m.a(0, ci.field_sb << -1078515900, rj.field_b << 1487773988, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                  break L7;
                } else {
                  var6 = var3 * 128 / var5;
                  var7 = 128 * var4 / var5;
                  rb discarded$19 = m.a(0, (ci.field_sb << 1375723876) + var6, -var7 + (rj.field_b << 2123863876), (byte) -6, var7, var6);
                  rb discarded$20 = m.a(0, -var6 + (ci.field_sb << -1288420796), var7 + (rj.field_b << 1052443108), (byte) -6, var7, var6);
                  break L7;
                }
              } else {
                L14: {
                  if (12 != wb.field_b) {
                    break L14;
                  } else {
                    mb.a(true, 2, 256);
                    break L14;
                  }
                }
                wb.field_b = wb.field_b - 1;
                break L7;
              }
            } else {
              if (-3 == var6) {
                if (wb.field_b > 0) {
                  L15: {
                    if (wb.field_b == 12) {
                      mb.a(true, 2, 256);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  wb.field_b = wb.field_b - 1;
                  break L7;
                } else {
                  L16: {
                    L17: {
                      if (wb.field_c != 1) {
                        break L17;
                      } else {
                        if (0 == jg.field_b) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if ((ve.field_b ^ -1) <= -1) {
                      break L16;
                    } else {
                      break L7;
                    }
                  }
                  L18: {
                    if ((bi.field_h ^ -1) != -2) {
                      mb.a(true, 8, 256);
                      break L18;
                    } else {
                      mb.a(true, 8, 128);
                      break L18;
                    }
                  }
                  L19: {
                    wb.field_b = 37;
                    if (0 < bi.field_h) {
                      wb.field_b = 18;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  if ((bi.field_h ^ -1) > -3) {
                    rb discarded$21 = m.a(1, ci.field_sb << 767114436, rj.field_b << -995095964, (byte) -6, var4 * 32 / var5, 32 * var3 / var5);
                    break L7;
                  } else {
                    var6 = 32 * (var4 + var3) / var5;
                    var7 = (-var3 + var4) * 32 / var5;
                    rb discarded$22 = m.a(1, (ci.field_sb << 45706276) + var6 * 4, -(var7 * 4) + (rj.field_b << 1951156356), (byte) -6, var7, var6);
                    rb discarded$23 = m.a(1, (ci.field_sb << -1963021212) - -(var7 * 4), (rj.field_b << -305687644) - -(4 * var6), (byte) -6, var6, -var7);
                    break L7;
                  }
                }
              } else {
                if (-2 == (var6 ^ -1)) {
                  if (0 < wb.field_b) {
                    L20: {
                      if (-13 == (wb.field_b ^ -1)) {
                        L21: {
                          if (param0) {
                            stackOut_83_0 = 0;
                            stackIn_84_0 = stackOut_83_0;
                            break L21;
                          } else {
                            stackOut_82_0 = 1;
                            stackIn_84_0 = stackOut_82_0;
                            break L21;
                          }
                        }
                        mb.a(stackIn_84_0 != 0, 2, 256);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    wb.field_b = wb.field_b - 1;
                    break L7;
                  } else {
                    L22: {
                      L23: {
                        if (wb.field_c != 1) {
                          break L23;
                        } else {
                          if (jg.field_b == -1) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (0 > ve.field_b) {
                        break L7;
                      } else {
                        break L22;
                      }
                    }
                    L24: {
                      mb.a(true, 15, 256);
                      wb.field_b = 50;
                      if (-1 >= bi.field_h) {
                        break L24;
                      } else {
                        wb.field_b = 25;
                        break L24;
                      }
                    }
                    rb discarded$24 = m.a(2, ci.field_sb << 1476027780, rj.field_b << -1272538652, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                    break L7;
                  }
                } else {
                  if (var6 == 3) {
                    if (wb.field_b > 0) {
                      L25: {
                        if (12 != wb.field_b) {
                          break L25;
                        } else {
                          mb.a(true, 2, 256);
                          break L25;
                        }
                      }
                      wb.field_b = wb.field_b - 1;
                      break L7;
                    } else {
                      L26: {
                        L27: {
                          if (wb.field_c != -2) {
                            break L27;
                          } else {
                            if (-1 == jg.field_b) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if (ve.field_b < 0) {
                          break L7;
                        } else {
                          break L26;
                        }
                      }
                      L28: {
                        mb.a(true, 10, 256);
                        wb.field_b = 75;
                        if (-1 <= (bi.field_h ^ -1)) {
                          break L28;
                        } else {
                          wb.field_b = 37;
                          break L28;
                        }
                      }
                      rb discarded$25 = m.a(3, ci.field_sb << -1348773468, rj.field_b << 321235716, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                      break L7;
                    }
                  } else {
                    if (4 == var6) {
                      if (wb.field_b > 0) {
                        wb.field_b = wb.field_b - 1;
                        break L7;
                      } else {
                        L29: {
                          L30: {
                            if (-2 != (wb.field_c ^ -1)) {
                              break L30;
                            } else {
                              if (jg.field_b == 0) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          if ((ve.field_b ^ -1) <= -1) {
                            break L29;
                          } else {
                            break L7;
                          }
                        }
                        L31: {
                          mb.a(true, 11, 256);
                          wb.field_b = 8;
                          if ((bi.field_h ^ -1) > -1) {
                            break L31;
                          } else {
                            rb discarded$26 = m.a(4, ci.field_sb << -661717148, rj.field_b << 2022584740, (byte) -6, var4 * 256 / var5, var3 * 256 / var5);
                            break L31;
                          }
                        }
                        L32: {
                          if ((bi.field_h ^ -1) > -2) {
                            break L32;
                          } else {
                            rb discarded$27 = m.a(4, ci.field_sb << -1371149692, rj.field_b << -933566652, (byte) -6, 256 * var4 / var5 - var3 * 32 / var5, 256 * var3 / var5 + var4 * 32 / var5);
                            rb discarded$28 = m.a(4, ci.field_sb << -688221052, rj.field_b << 343516740, (byte) -6, 256 * var4 / var5 - -(32 * var3 / var5), -(var4 * 32 / var5) + var3 * 256 / var5);
                            break L32;
                          }
                        }
                        if (2 > bi.field_h) {
                          break L7;
                        } else {
                          rb discarded$29 = m.a(4, ci.field_sb << -813109404, rj.field_b << -600088892, (byte) -6, 192 * var4 / var5 - 48 * var3 / var5, 192 * var3 / var5 + var4 * 48 / var5);
                          rb discarded$30 = m.a(4, ci.field_sb << 740470500, rj.field_b << 1849683140, (byte) -6, 192 * var4 / var5 - -(48 * var3 / var5), -(48 * var4 / var5) + 192 * var3 / var5);
                          break L7;
                        }
                      }
                    } else {
                      if (5 == var6) {
                        if (-1 <= wb.field_b) {
                          L33: {
                            L34: {
                              if (-2 != wb.field_c) {
                                break L34;
                              } else {
                                if (jg.field_b == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            if (ve.field_b < 0) {
                              break L7;
                            } else {
                              break L33;
                            }
                          }
                          mb.a(true, 5, 256);
                          wb.field_b = 8;
                          rb discarded$31 = m.a(5, ci.field_sb << -1683468444, rj.field_b << 692267076, (byte) -6, (128 - bi.field_h * 32) * var4 / var5, (128 - 32 * bi.field_h) * var3 / var5);
                          break L7;
                        } else {
                          wb.field_b = wb.field_b - 1;
                          break L7;
                        }
                      } else {
                        if (6 != var6) {
                          if (var6 == 7) {
                            L35: {
                              if ((wb.field_b ^ -1) >= -1) {
                                L36: {
                                  L37: {
                                    if ((wb.field_c ^ -1) != -2) {
                                      break L37;
                                    } else {
                                      if (0 == jg.field_b) {
                                        break L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  if (ve.field_b < 0) {
                                    break L35;
                                  } else {
                                    break L36;
                                  }
                                }
                                wb.field_b = 175;
                                mb.a(true, 19, 256);
                                break L35;
                              } else {
                                wb.field_b = wb.field_b - 4;
                                if ((wb.field_b ^ -1) >= -51) {
                                  break L35;
                                } else {
                                  wb.field_b = wb.field_b - 4;
                                  break L35;
                                }
                              }
                            }
                            L38: {
                              if (wb.field_b > -47) {
                                break L38;
                              } else {
                                if (-55 > wb.field_b) {
                                  L39: {
                                    if (param0) {
                                      stackOut_169_0 = 0;
                                      stackIn_170_0 = stackOut_169_0;
                                      break L39;
                                    } else {
                                      stackOut_168_0 = 1;
                                      stackIn_170_0 = stackOut_168_0;
                                      break L39;
                                    }
                                  }
                                  mb.a(stackIn_170_0 != 0, 20, 256);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            if (-1 <= wb.field_b) {
                              break L7;
                            } else {
                              if (-51 > wb.field_b) {
                                rb discarded$32 = m.a(7, ci.field_sb << 1381296548, rj.field_b << -321756412, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        } else {
                          L40: {
                            if ((wb.field_b ^ -1) < -1) {
                              L41: {
                                wb.field_b = wb.field_b - 1;
                                if (0 == wb.field_b) {
                                  break L41;
                                } else {
                                  if (wb.field_b == 10) {
                                    break L41;
                                  } else {
                                    if (wb.field_b == 20) {
                                      break L41;
                                    } else {
                                      if ((wb.field_b ^ -1) == -31) {
                                        break L41;
                                      } else {
                                        if (wb.field_b == 40) {
                                          break L41;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L42: {
                                if (param0) {
                                  stackOut_129_0 = 0;
                                  stackIn_130_0 = stackOut_129_0;
                                  break L42;
                                } else {
                                  stackOut_128_0 = 1;
                                  stackIn_130_0 = stackOut_128_0;
                                  break L42;
                                }
                              }
                              mb.a(stackIn_130_0 != 0, 18, 256);
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          L43: {
                            if (wb.field_b < -1) {
                              break L43;
                            } else {
                              L44: {
                                L45: {
                                  if (-2 != wb.field_c) {
                                    break L45;
                                  } else {
                                    if (0 == jg.field_b) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                if (0 <= ve.field_b) {
                                  break L44;
                                } else {
                                  break L43;
                                }
                              }
                              wb.field_b = 100;
                              break L43;
                            }
                          }
                          L46: {
                            L47: {
                              if (-91 == (wb.field_b ^ -1)) {
                                break L47;
                              } else {
                                if (wb.field_b == 70) {
                                  break L47;
                                } else {
                                  if ((wb.field_b ^ -1) == -51) {
                                    break L47;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                            mb.a(true, 17, 256);
                            rb discarded$33 = m.a(6, ci.field_sb << -1921851004, rj.field_b << -2091216284, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                            break L46;
                          }
                          L48: {
                            L49: {
                              if (80 == wb.field_b) {
                                break L49;
                              } else {
                                if ((wb.field_b ^ -1) == -61) {
                                  break L49;
                                } else {
                                  if ((bi.field_h ^ -1) > -2) {
                                    break L48;
                                  } else {
                                    if (wb.field_b == 55) {
                                      break L49;
                                    } else {
                                      if ((wb.field_b ^ -1) == -71) {
                                        break L49;
                                      } else {
                                        if (85 != wb.field_b) {
                                          break L48;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            mb.a(true, 17, 256);
                            rb discarded$34 = m.a(6, ci.field_sb << 116571620, rj.field_b << -662492924, (byte) -6, var4 * 128 / var5 - -(var3 * 64 / var5), var3 * 128 / var5 + -(var4 * 64 / var5));
                            rb discarded$35 = m.a(6, ci.field_sb << -585038044, rj.field_b << 706606148, (byte) -6, var4 * 128 / var5 - var3 * 64 / var5, var4 * 64 / var5 + 128 * var3 / var5);
                            break L48;
                          }
                          if (wb.field_b != -51) {
                            break L7;
                          } else {
                            if (-3 == bi.field_h) {
                              wb.field_b = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (!param2) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            var8 = -((be) this).field_m + (-param1 + -((be) this).field_N) + param3;
            var9 = -((be) this).field_P + -((be) this).field_j + -param5 + param4;
            if (var8 * var8 - -(var9 * var9) >= ((be) this).field_O * ((be) this).field_O) {
              break L0;
            } else {
              L1: {
                var10 = Math.atan2((double)var9, (double)var8) - ic.field_w;
                if (var10 < 0.0) {
                  var10 = var10 - 3.141592653589793 / (double)((be) this).field_L;
                  break L1;
                } else {
                  if (var10 > 0.0) {
                    var10 = var10 + 3.141592653589793 / (double)((be) this).field_L;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              ((be) this).field_Q = (int)((double)((be) this).field_L * var10 / 6.283185307179586);
              L2: while (true) {
                if (((be) this).field_Q < ((be) this).field_L) {
                  L3: while (true) {
                    if (-1 >= (((be) this).field_Q ^ -1)) {
                      break L0;
                    } else {
                      ((be) this).field_Q = ((be) this).field_Q + ((be) this).field_L;
                      continue L3;
                    }
                  }
                } else {
                  ((be) this).field_Q = ((be) this).field_Q - ((be) this).field_L;
                  continue L2;
                }
              }
            }
          }
          return true;
        }
    }

    final static byte[] a(byte param0, byte[] param1, jd param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        var4 = param2.d((byte) 48, param3);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (var4 != param1.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param2.d((byte) 48, 3);
            var6 = (byte)param2.d((byte) 48, 8);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (byte)(var6 + param2.d((byte) 48, var5));
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (param0 == 63) {
              break L5;
            } else {
              be.a(-63);
              break L5;
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final static void i(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 == 4) {
                L0: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref != null) {
                    try {
                      var2_ref = Runtime.getRuntime();
                      var4 = null;
                      var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                      bi.field_a = (int)(var3.longValue() / 1048576L) - -1;
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
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
            Object var2 = null;
            byte[] discarded$0 = be.a((byte) -106, (byte[]) null, (jd) null, 51);
        }
    }

    private be() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Members";
    }
}
