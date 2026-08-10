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
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_170_0 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
                if (wb.field_c == 0) {
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
                if (-8 < (kb.field_b ^ -1)) {
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
        if ((ve.field_b ^ -1) < -251) {
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
            L8: {
              var6 = kb.field_b;
              if (0 == var6) {
                if (wb.field_b <= 0) {
                  L9: {
                    L10: {
                      if (-2 != (wb.field_c ^ -1)) {
                        break L10;
                      } else {
                        if (jg.field_b == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (0 > ve.field_b) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    if ((bi.field_h ^ -1) != -2) {
                      L12: {
                        if (param0) {
                          stackIn_45_0 = 0;
                          break L12;
                        } else {
                          stackIn_45_0 = 1;
                          break L12;
                        }
                      }
                      mb.a(stackIn_45_0 != 0, 3, 256);
                      break L11;
                    } else {
                      L13: {
                        if (param0) {
                          stackIn_41_0 = 0;
                          break L13;
                        } else {
                          stackIn_41_0 = 1;
                          break L13;
                        }
                      }
                      mb.a(stackIn_41_0 != 0, 3, 128);
                      break L11;
                    }
                  }
                  L14: {
                    wb.field_b = 25;
                    if (bi.field_h <= 0) {
                      break L14;
                    } else {
                      wb.field_b = 13;
                      break L14;
                    }
                  }
                  if (2 > bi.field_h) {
                    m.a(0, ci.field_sb << -1078515900, rj.field_b << 1487773988, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                    break L7;
                  } else {
                    var6 = var3 * 128 / var5;
                    var7 = 128 * var4 / var5;
                    m.a(0, (ci.field_sb << 1375723876) + var6, -var7 + (rj.field_b << 2123863876), (byte) -6, var7, var6);
                    m.a(0, -var6 + (ci.field_sb << -1288420796), var7 + (rj.field_b << 1052443108), (byte) -6, var7, var6);
                    break L7;
                  }
                } else {
                  L15: {
                    if (12 != wb.field_b) {
                      break L15;
                    } else {
                      mb.a(true, 2, 256);
                      break L15;
                    }
                  }
                  wb.field_b = wb.field_b - 1;
                  break L7;
                }
              } else {
                if (-3 == (var6 ^ -1)) {
                  if (wb.field_b > 0) {
                    L16: {
                      if (wb.field_b == 12) {
                        mb.a(true, 2, 256);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    wb.field_b = wb.field_b - 1;
                    break L7;
                  } else {
                    L17: {
                      L18: {
                        if (wb.field_c != 1) {
                          break L18;
                        } else {
                          if (0 == jg.field_b) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if ((ve.field_b ^ -1) <= -1) {
                        break L17;
                      } else {
                        break L7;
                      }
                    }
                    L19: {
                      if ((bi.field_h ^ -1) != -2) {
                        mb.a(true, 8, 256);
                        break L19;
                      } else {
                        mb.a(true, 8, 128);
                        break L19;
                      }
                    }
                    L20: {
                      wb.field_b = 37;
                      if (0 < bi.field_h) {
                        wb.field_b = 18;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if ((bi.field_h ^ -1) > -3) {
                      m.a(1, ci.field_sb << 767114436, rj.field_b << -995095964, (byte) -6, var4 * 32 / var5, 32 * var3 / var5);
                      break L7;
                    } else {
                      var6 = 32 * (var4 + var3) / var5;
                      var7 = (-var3 + var4) * 32 / var5;
                      m.a(1, (ci.field_sb << 45706276) + var6 * 4, -(var7 * 4) + (rj.field_b << 1951156356), (byte) -6, var7, var6);
                      m.a(1, (ci.field_sb << -1963021212) - -(var7 * 4), (rj.field_b << -305687644) - -(4 * var6), (byte) -6, var6, -var7);
                      break L7;
                    }
                  }
                } else {
                  if (-2 == (var6 ^ -1)) {
                    if (0 < wb.field_b) {
                      L21: {
                        if (-13 == (wb.field_b ^ -1)) {
                          L22: {
                            if (param0) {
                              stackIn_84_0 = 0;
                              break L22;
                            } else {
                              stackIn_84_0 = 1;
                              break L22;
                            }
                          }
                          mb.a(stackIn_84_0 != 0, 2, 256);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      wb.field_b = wb.field_b - 1;
                      break L7;
                    } else {
                      L23: {
                        L24: {
                          if (wb.field_c != 1) {
                            break L24;
                          } else {
                            if (jg.field_b == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (0 > ve.field_b) {
                          break L8;
                        } else {
                          break L23;
                        }
                      }
                      L25: {
                        mb.a(true, 15, 256);
                        wb.field_b = 50;
                        if (-1 <= (bi.field_h ^ -1)) {
                          break L25;
                        } else {
                          wb.field_b = 25;
                          break L25;
                        }
                      }
                      m.a(2, ci.field_sb << 1476027780, rj.field_b << -1272538652, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                      break L7;
                    }
                  } else {
                    if (var6 == 3) {
                      if (wb.field_b > 0) {
                        L26: {
                          if (12 != wb.field_b) {
                            break L26;
                          } else {
                            mb.a(true, 2, 256);
                            break L26;
                          }
                        }
                        wb.field_b = wb.field_b - 1;
                        break L7;
                      } else {
                        L27: {
                          L28: {
                            if ((wb.field_c ^ -1) != -2) {
                              break L28;
                            } else {
                              if (-1 == (jg.field_b ^ -1)) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                          if (ve.field_b < 0) {
                            break L8;
                          } else {
                            break L27;
                          }
                        }
                        L29: {
                          mb.a(true, 10, 256);
                          wb.field_b = 75;
                          if (-1 <= (bi.field_h ^ -1)) {
                            break L29;
                          } else {
                            wb.field_b = 37;
                            break L29;
                          }
                        }
                        m.a(3, ci.field_sb << -1348773468, rj.field_b << 321235716, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                        break L7;
                      }
                    } else {
                      if (4 == var6) {
                        if (wb.field_b > 0) {
                          wb.field_b = wb.field_b - 1;
                          break L7;
                        } else {
                          L30: {
                            L31: {
                              if (-2 != (wb.field_c ^ -1)) {
                                break L31;
                              } else {
                                if (jg.field_b == 0) {
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            if ((ve.field_b ^ -1) <= -1) {
                              break L30;
                            } else {
                              break L7;
                            }
                          }
                          L32: {
                            mb.a(true, 11, 256);
                            wb.field_b = 8;
                            if ((bi.field_h ^ -1) > -1) {
                              break L32;
                            } else {
                              m.a(4, ci.field_sb << -661717148, rj.field_b << 2022584740, (byte) -6, var4 * 256 / var5, var3 * 256 / var5);
                              break L32;
                            }
                          }
                          L33: {
                            if ((bi.field_h ^ -1) > -2) {
                              break L33;
                            } else {
                              m.a(4, ci.field_sb << -1371149692, rj.field_b << -933566652, (byte) -6, 256 * var4 / var5 - var3 * 32 / var5, 256 * var3 / var5 + var4 * 32 / var5);
                              m.a(4, ci.field_sb << -688221052, rj.field_b << 343516740, (byte) -6, 256 * var4 / var5 - -(32 * var3 / var5), -(var4 * 32 / var5) + var3 * 256 / var5);
                              break L33;
                            }
                          }
                          if (2 > bi.field_h) {
                            break L8;
                          } else {
                            m.a(4, ci.field_sb << -813109404, rj.field_b << -600088892, (byte) -6, 192 * var4 / var5 - 48 * var3 / var5, 192 * var3 / var5 + var4 * 48 / var5);
                            m.a(4, ci.field_sb << 740470500, rj.field_b << 1849683140, (byte) -6, 192 * var4 / var5 - -(48 * var3 / var5), -(48 * var4 / var5) + 192 * var3 / var5);
                            break L7;
                          }
                        }
                      } else {
                        if (5 == var6) {
                          if (-1 <= (wb.field_b ^ -1)) {
                            L34: {
                              L35: {
                                if (-2 != (wb.field_c ^ -1)) {
                                  break L35;
                                } else {
                                  if (jg.field_b == 0) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                              if (ve.field_b < 0) {
                                break L8;
                              } else {
                                break L34;
                              }
                            }
                            mb.a(true, 5, 256);
                            wb.field_b = 8;
                            m.a(5, ci.field_sb << -1683468444, rj.field_b << 692267076, (byte) -6, (128 - bi.field_h * 32) * var4 / var5, (128 - 32 * bi.field_h) * var3 / var5);
                            break L7;
                          } else {
                            wb.field_b = wb.field_b - 1;
                            break L7;
                          }
                        } else {
                          if (6 != var6) {
                            if (var6 == 7) {
                              L36: {
                                if ((wb.field_b ^ -1) >= -1) {
                                  L37: {
                                    L38: {
                                      if ((wb.field_c ^ -1) != -2) {
                                        break L38;
                                      } else {
                                        if (0 == jg.field_b) {
                                          break L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    if (ve.field_b < 0) {
                                      break L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                  wb.field_b = 175;
                                  mb.a(true, 19, 256);
                                  break L36;
                                } else {
                                  wb.field_b = wb.field_b - 4;
                                  if ((wb.field_b ^ -1) >= -51) {
                                    break L36;
                                  } else {
                                    wb.field_b = wb.field_b - 4;
                                    break L36;
                                  }
                                }
                              }
                              L39: {
                                if ((wb.field_b ^ -1) > -47) {
                                  break L39;
                                } else {
                                  if (-55 < (wb.field_b ^ -1)) {
                                    L40: {
                                      if (param0) {
                                        stackIn_170_0 = 0;
                                        break L40;
                                      } else {
                                        stackIn_170_0 = 1;
                                        break L40;
                                      }
                                    }
                                    mb.a(stackIn_170_0 != 0, 20, 256);
                                    break L39;
                                  } else {
                                    break L39;
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
                                  break L7;
                                }
                              }
                            } else {
                              break L7;
                            }
                          } else {
                            L41: {
                              if ((wb.field_b ^ -1) < -1) {
                                L42: {
                                  wb.field_b = wb.field_b - 1;
                                  if (0 == wb.field_b) {
                                    break L42;
                                  } else {
                                    if (wb.field_b == 10) {
                                      break L42;
                                    } else {
                                      if (wb.field_b == 20) {
                                        break L42;
                                      } else {
                                        if ((wb.field_b ^ -1) == -31) {
                                          break L42;
                                        } else {
                                          if (wb.field_b == 40) {
                                            break L42;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L43: {
                                  if (param0) {
                                    stackIn_130_0 = 0;
                                    break L43;
                                  } else {
                                    stackIn_130_0 = 1;
                                    break L43;
                                  }
                                }
                                mb.a(stackIn_130_0 != 0, 18, 256);
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                            L44: {
                              if ((wb.field_b ^ -1) < -1) {
                                break L44;
                              } else {
                                L45: {
                                  L46: {
                                    if (-2 != (wb.field_c ^ -1)) {
                                      break L46;
                                    } else {
                                      if (0 == jg.field_b) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  if (0 <= ve.field_b) {
                                    break L45;
                                  } else {
                                    break L44;
                                  }
                                }
                                wb.field_b = 100;
                                break L44;
                              }
                            }
                            L47: {
                              L48: {
                                if (-91 == (wb.field_b ^ -1)) {
                                  break L48;
                                } else {
                                  if (wb.field_b == 70) {
                                    break L48;
                                  } else {
                                    if ((wb.field_b ^ -1) == -51) {
                                      break L48;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              }
                              mb.a(true, 17, 256);
                              m.a(6, ci.field_sb << -1921851004, rj.field_b << -2091216284, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                              break L47;
                            }
                            L49: {
                              L50: {
                                if (80 == wb.field_b) {
                                  break L50;
                                } else {
                                  if ((wb.field_b ^ -1) == -61) {
                                    break L50;
                                  } else {
                                    if ((bi.field_h ^ -1) > -2) {
                                      break L49;
                                    } else {
                                      if (wb.field_b == 55) {
                                        break L50;
                                      } else {
                                        if ((wb.field_b ^ -1) == -71) {
                                          break L50;
                                        } else {
                                          if (85 != wb.field_b) {
                                            break L49;
                                          } else {
                                            break L50;
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
                              break L49;
                            }
                            if ((wb.field_b ^ -1) != -51) {
                              break L8;
                            } else {
                              if (-3 == (bi.field_h ^ -1)) {
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
            break L7;
          }
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!param2) {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L1: {
                var8_int = -this.field_m + (-param1 + -this.field_N) + param3;
                var9 = -this.field_P + -this.field_j + -param5 + param4;
                if (var8_int * var8_int - -(var9 * var9) >= this.field_O * this.field_O) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - ic.field_w;
                    if (var10 < 0.0) {
                      var10 = var10 - 3.141592653589793 / (double)this.field_L;
                      break L2;
                    } else {
                      if (var10 > 0.0) {
                        var10 = var10 + 3.141592653589793 / (double)this.field_L;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_Q = (int)((double)this.field_L * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_Q < this.field_L) {
                      L4: while (true) {
                        if (-1 >= (this.field_Q ^ -1)) {
                          break L1;
                        } else {
                          this.field_Q = this.field_Q + this.field_L;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_Q = this.field_Q - this.field_L;
                      continue L3;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("be.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static byte[] a(byte param0, byte[] param1, jd param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param2.d((byte) 48, param3);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int != param1.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.d((byte) 48, 3);
                var6 = (byte)param2.d((byte) 48, 8);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)(var6 + param2.d((byte) 48, var5));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 == 63) {
                  break L6;
                } else {
                  be.a(-63);
                  break L6;
                }
              }
              stackIn_18_0 = (byte[]) (param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("be.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
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
