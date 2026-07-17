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
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          var1 = -wd.field_c + 320;
          var2 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
          if (ve.field_b >= 0) {
            var3 = -var1 + -wd.field_c + ((sk.field_o >> 4) + 320);
            var4 = -var2 + -si.field_E + (wg.field_e >> 4);
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
                if (kb.field_b < 7) {
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
        if (ve.field_b > 250) {
          return;
        } else {
          L6: {
            L7: {
              be.a(-111);
              var6 = kb.field_b;
              if (0 == var6) {
                if (wb.field_b <= 0) {
                  L8: {
                    L9: {
                      if (wb.field_c != 1) {
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
                    if (bi.field_h != 1) {
                      mb.a(true, 3, 256);
                      break L10;
                    } else {
                      mb.a(true, 3, 128);
                      break L10;
                    }
                  }
                  L11: {
                    wb.field_b = 25;
                    if (bi.field_h <= 0) {
                      break L11;
                    } else {
                      wb.field_b = 13;
                      break L11;
                    }
                  }
                  if (2 > bi.field_h) {
                    rb discarded$18 = m.a(0, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                    break L6;
                  } else {
                    var6 = var3 * 128 / var5;
                    var7 = 128 * var4 / var5;
                    rb discarded$19 = m.a(0, (ci.field_sb << 4) + var6, -var7 + (rj.field_b << 4), (byte) -6, var7, var6);
                    rb discarded$20 = m.a(0, -var6 + (ci.field_sb << 4), var7 + (rj.field_b << 4), (byte) -6, var7, var6);
                    break L6;
                  }
                } else {
                  L12: {
                    if (12 != wb.field_b) {
                      break L12;
                    } else {
                      mb.a(true, 2, 256);
                      break L12;
                    }
                  }
                  wb.field_b = wb.field_b - 1;
                  break L6;
                }
              } else {
                if (var6 == 2) {
                  if (wb.field_b > 0) {
                    L13: {
                      if (wb.field_b == 12) {
                        mb.a(true, 2, 256);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    wb.field_b = wb.field_b - 1;
                    break L6;
                  } else {
                    L14: {
                      L15: {
                        if (wb.field_c != 1) {
                          break L15;
                        } else {
                          if (0 == jg.field_b) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (ve.field_b >= 0) {
                        break L14;
                      } else {
                        break L6;
                      }
                    }
                    L16: {
                      if (bi.field_h != 1) {
                        mb.a(true, 8, 256);
                        break L16;
                      } else {
                        mb.a(true, 8, 128);
                        break L16;
                      }
                    }
                    L17: {
                      wb.field_b = 37;
                      if (0 < bi.field_h) {
                        wb.field_b = 18;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    if (bi.field_h < 2) {
                      rb discarded$21 = m.a(1, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 32 / var5, 32 * var3 / var5);
                      break L6;
                    } else {
                      var6 = 32 * (var4 + var3) / var5;
                      var7 = (-var3 + var4) * 32 / var5;
                      rb discarded$22 = m.a(1, (ci.field_sb << 4) + var6 * 4, -(var7 * 4) + (rj.field_b << 4), (byte) -6, var7, var6);
                      rb discarded$23 = m.a(1, (ci.field_sb << 4) - -(var7 * 4), (rj.field_b << 4) - -(4 * var6), (byte) -6, var6, -var7);
                      break L6;
                    }
                  }
                } else {
                  if (var6 == 1) {
                    if (0 < wb.field_b) {
                      L18: {
                        if (wb.field_b == 12) {
                          mb.a(true, 2, 256);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      wb.field_b = wb.field_b - 1;
                      break L6;
                    } else {
                      L19: {
                        L20: {
                          if (wb.field_c != 1) {
                            break L20;
                          } else {
                            if (jg.field_b == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (0 > ve.field_b) {
                          break L7;
                        } else {
                          break L19;
                        }
                      }
                      L21: {
                        mb.a(true, 15, 256);
                        wb.field_b = 50;
                        if (bi.field_h <= 0) {
                          break L21;
                        } else {
                          wb.field_b = 25;
                          break L21;
                        }
                      }
                      rb discarded$24 = m.a(2, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                      break L6;
                    }
                  } else {
                    if (var6 == 3) {
                      if (wb.field_b > 0) {
                        L22: {
                          if (12 != wb.field_b) {
                            break L22;
                          } else {
                            mb.a(true, 2, 256);
                            break L22;
                          }
                        }
                        wb.field_b = wb.field_b - 1;
                        break L6;
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
                          if (ve.field_b < 0) {
                            break L7;
                          } else {
                            break L23;
                          }
                        }
                        L25: {
                          mb.a(true, 10, 256);
                          wb.field_b = 75;
                          if (bi.field_h <= 0) {
                            break L25;
                          } else {
                            wb.field_b = 37;
                            break L25;
                          }
                        }
                        rb discarded$25 = m.a(3, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                        break L6;
                      }
                    } else {
                      if (4 == var6) {
                        if (wb.field_b > 0) {
                          wb.field_b = wb.field_b - 1;
                          break L6;
                        } else {
                          L26: {
                            L27: {
                              if (wb.field_c != 1) {
                                break L27;
                              } else {
                                if (jg.field_b == 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            if (ve.field_b >= 0) {
                              break L26;
                            } else {
                              break L6;
                            }
                          }
                          L28: {
                            mb.a(true, 11, 256);
                            wb.field_b = 8;
                            if (bi.field_h < 0) {
                              break L28;
                            } else {
                              rb discarded$26 = m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 256 / var5, var3 * 256 / var5);
                              break L28;
                            }
                          }
                          L29: {
                            if (bi.field_h < 1) {
                              break L29;
                            } else {
                              rb discarded$27 = m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 256 * var4 / var5 - var3 * 32 / var5, 256 * var3 / var5 + var4 * 32 / var5);
                              rb discarded$28 = m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 256 * var4 / var5 - -(32 * var3 / var5), -(var4 * 32 / var5) + var3 * 256 / var5);
                              break L29;
                            }
                          }
                          if (2 > bi.field_h) {
                            break L7;
                          } else {
                            rb discarded$29 = m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 192 * var4 / var5 - 48 * var3 / var5, 192 * var3 / var5 + var4 * 48 / var5);
                            rb discarded$30 = m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 192 * var4 / var5 - -(48 * var3 / var5), -(48 * var4 / var5) + 192 * var3 / var5);
                            break L6;
                          }
                        }
                      } else {
                        if (5 == var6) {
                          if (wb.field_b <= 0) {
                            L30: {
                              L31: {
                                if (wb.field_c != 1) {
                                  break L31;
                                } else {
                                  if (jg.field_b == 0) {
                                    break L30;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              if (ve.field_b < 0) {
                                break L7;
                              } else {
                                break L30;
                              }
                            }
                            mb.a(true, 5, 256);
                            wb.field_b = 8;
                            rb discarded$31 = m.a(5, ci.field_sb << 4, rj.field_b << 4, (byte) -6, (128 - bi.field_h * 32) * var4 / var5, (128 - 32 * bi.field_h) * var3 / var5);
                            break L6;
                          } else {
                            wb.field_b = wb.field_b - 1;
                            break L6;
                          }
                        } else {
                          if (6 != var6) {
                            if (var6 == 7) {
                              L32: {
                                if (wb.field_b <= 0) {
                                  L33: {
                                    L34: {
                                      if (wb.field_c != 1) {
                                        break L34;
                                      } else {
                                        if (0 == jg.field_b) {
                                          break L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                    if (ve.field_b < 0) {
                                      break L32;
                                    } else {
                                      break L33;
                                    }
                                  }
                                  wb.field_b = 175;
                                  mb.a(true, 19, 256);
                                  break L32;
                                } else {
                                  wb.field_b = wb.field_b - 4;
                                  if (wb.field_b <= 50) {
                                    break L32;
                                  } else {
                                    wb.field_b = wb.field_b - 4;
                                    break L32;
                                  }
                                }
                              }
                              L35: {
                                if (wb.field_b < 46) {
                                  break L35;
                                } else {
                                  if (wb.field_b < 54) {
                                    mb.a(true, 20, 256);
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                              if (wb.field_b <= 0) {
                                break L7;
                              } else {
                                if (wb.field_b < 50) {
                                  rb discarded$32 = m.a(7, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              break L6;
                            }
                          } else {
                            L36: {
                              if (wb.field_b > 0) {
                                L37: {
                                  wb.field_b = wb.field_b - 1;
                                  if (0 == wb.field_b) {
                                    break L37;
                                  } else {
                                    if (wb.field_b == 10) {
                                      break L37;
                                    } else {
                                      if (wb.field_b == 20) {
                                        break L37;
                                      } else {
                                        if (wb.field_b == 30) {
                                          break L37;
                                        } else {
                                          if (wb.field_b == 40) {
                                            break L37;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                mb.a(true, 18, 256);
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            L38: {
                              if (wb.field_b > 0) {
                                break L38;
                              } else {
                                L39: {
                                  L40: {
                                    if (wb.field_c != 1) {
                                      break L40;
                                    } else {
                                      if (0 == jg.field_b) {
                                        break L39;
                                      } else {
                                        break L40;
                                      }
                                    }
                                  }
                                  if (0 <= ve.field_b) {
                                    break L39;
                                  } else {
                                    break L38;
                                  }
                                }
                                wb.field_b = 100;
                                break L38;
                              }
                            }
                            L41: {
                              L42: {
                                if (wb.field_b == 90) {
                                  break L42;
                                } else {
                                  if (wb.field_b == 70) {
                                    break L42;
                                  } else {
                                    if (wb.field_b == 50) {
                                      break L42;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              }
                              mb.a(true, 17, 256);
                              rb discarded$33 = m.a(6, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                              break L41;
                            }
                            L43: {
                              L44: {
                                if (80 == wb.field_b) {
                                  break L44;
                                } else {
                                  if (wb.field_b == 60) {
                                    break L44;
                                  } else {
                                    if (bi.field_h < 1) {
                                      break L43;
                                    } else {
                                      if (wb.field_b == 55) {
                                        break L44;
                                      } else {
                                        if (wb.field_b == 70) {
                                          break L44;
                                        } else {
                                          if (85 != wb.field_b) {
                                            break L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              mb.a(true, 17, 256);
                              rb discarded$34 = m.a(6, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5 - -(var3 * 64 / var5), var3 * 128 / var5 + -(var4 * 64 / var5));
                              rb discarded$35 = m.a(6, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5 - var3 * 64 / var5, var4 * 64 / var5 + 128 * var3 / var5);
                              break L43;
                            }
                            if (wb.field_b != 50) {
                              break L7;
                            } else {
                              if (bi.field_h == 2) {
                                wb.field_b = 0;
                                break L6;
                              } else {
                                break L6;
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
            break L6;
          }
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!param2) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            } else {
              L1: {
                var8_int = -((be) this).field_m + (-param1 + -((be) this).field_N) + param3;
                var9 = -((be) this).field_P + -((be) this).field_j + -param5 + param4;
                if (var8_int * var8_int - -(var9 * var9) >= ((be) this).field_O * ((be) this).field_O) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - ic.field_w;
                    if (var10 < 0.0) {
                      var10 = var10 - 3.141592653589793 / (double)((be) this).field_L;
                      break L2;
                    } else {
                      if (var10 > 0.0) {
                        var10 = var10 + 3.141592653589793 / (double)((be) this).field_L;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((be) this).field_Q = (int)((double)((be) this).field_L * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((be) this).field_Q < ((be) this).field_L) {
                      L4: while (true) {
                        if (((be) this).field_Q >= 0) {
                          break L1;
                        } else {
                          ((be) this).field_Q = ((be) this).field_Q + ((be) this).field_L;
                          continue L4;
                        }
                      }
                    } else {
                      ((be) this).field_Q = ((be) this).field_Q - ((be) this).field_L;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("be.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static byte[] a(byte param0, byte[] param1, jd param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param2.d((byte) 48, param3);
            if (var4_int != 0) {
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
                if (var5 > 0) {
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
              stackOut_17_0 = (byte[]) param1;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("be.E(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
        }
        return stackIn_18_0;
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
              L0: {
                L1: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref != null) {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        bi.field_a = (int)(var3.longValue() / 1048576L) - -1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
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
