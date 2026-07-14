/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static he field_b;
    static String field_d;
    static String field_c;
    static vj field_a;
    static long field_f;
    static vh field_e;

    final static void a(bl param0, java.awt.Frame param1, byte param2) {
        il var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        L0: while (true) {
          var3_ref = param0.a(param1, (byte) -124);
          L1: while (true) {
            if (var3_ref.field_b != 0) {
              if (1 != var3_ref.field_b) {
                kk.a(100L, true);
                continue L0;
              } else {
                param1.setVisible(false);
                var3 = -46 / ((64 - param2) / 50);
                param1.dispose();
                return;
              }
            } else {
              kk.a(10L, true);
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var5 = param3 + param1;
        if (param2 == -16579) {
          L0: {
            var6 = param0 + param4;
            if (param1 > wj.field_g) {
              stackOut_4_0 = param1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = wj.field_g;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (wj.field_e >= param4) {
              stackOut_7_0 = wj.field_e;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param4;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (wj.field_b > var5) {
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = wj.field_b;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (wj.field_j > var6) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = wj.field_j;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var10 = stackIn_14_0;
          if (wj.field_g <= param1) {
            if (param1 < wj.field_b) {
              var11 = param1 + var8 * wj.field_k;
              var12 = -var8 + var10 + 1 >> -548037055;
              L4: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  L5: {
                    if (param4 < wj.field_e) {
                      break L5;
                    } else {
                      if (wj.field_j > var6) {
                        var11 = var7 + param4 * wj.field_k;
                        var12 = 1 + (var9 + -var7) >> -2067431935;
                        L6: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L5;
                          } else {
                            wj.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (wj.field_g > var5) {
                            break L7;
                          } else {
                            if (wj.field_b <= var5) {
                              break L7;
                            } else {
                              var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                              var12 = -var8 + 1 - -var10 >> 2098333537;
                              L8: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L7;
                                } else {
                                  wj.field_l[var11] = 16777215;
                                  var11 = var11 + 2 * wj.field_k;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                        L9: {
                          if (wj.field_e > param4) {
                            break L9;
                          } else {
                            if (wj.field_j <= var6) {
                              break L9;
                            } else {
                              var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                              var12 = -var7 + (1 - -var9) >> -1233119231;
                              L10: while (true) {
                                var12--;
                                if (var12 < 0) {
                                  break L9;
                                } else {
                                  wj.field_l[var11] = 16777215;
                                  var11 += 2;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L11: {
                    if (wj.field_g > var5) {
                      break L11;
                    } else {
                      if (wj.field_b <= var5) {
                        break L11;
                      } else {
                        var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                        var12 = -var8 + 1 - -var10 >> 2098333537;
                        L12: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L11;
                          } else {
                            wj.field_l[var11] = 16777215;
                            var11 = var11 + 2 * wj.field_k;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (wj.field_e > param4) {
                      break L13;
                    } else {
                      if (wj.field_j <= var6) {
                        break L13;
                      } else {
                        var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                        var12 = -var7 + (1 - -var9) >> -1233119231;
                        L14: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L13;
                          } else {
                            wj.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  wj.field_l[var11] = 16777215;
                  var11 = var11 + 2 * wj.field_k;
                  continue L4;
                }
              }
            } else {
              if (param4 >= wj.field_e) {
                if (wj.field_j <= var6) {
                  L15: {
                    if (wj.field_g > var5) {
                      break L15;
                    } else {
                      if (wj.field_b <= var5) {
                        break L15;
                      } else {
                        var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                        var12 = -var8 + 1 - -var10 >> 2098333537;
                        L16: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L15;
                          } else {
                            wj.field_l[var11] = 16777215;
                            var11 = var11 + 2 * wj.field_k;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (wj.field_e > param4) {
                      break L17;
                    } else {
                      if (wj.field_j <= var6) {
                        break L17;
                      } else {
                        var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                        var12 = -var7 + (1 - -var9) >> -1233119231;
                        L18: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L17;
                          } else {
                            wj.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  var11 = var7 + param4 * wj.field_k;
                  var12 = 1 + (var9 + -var7) >> -2067431935;
                  L19: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      L20: {
                        if (wj.field_g > var5) {
                          break L20;
                        } else {
                          if (wj.field_b <= var5) {
                            break L20;
                          } else {
                            var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                            var12 = -var8 + 1 - -var10 >> 2098333537;
                            L21: while (true) {
                              var12--;
                              if (-1 < (var12 ^ -1)) {
                                break L20;
                              } else {
                                wj.field_l[var11] = 16777215;
                                var11 = var11 + 2 * wj.field_k;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                      L22: {
                        if (wj.field_e > param4) {
                          break L22;
                        } else {
                          if (wj.field_j <= var6) {
                            break L22;
                          } else {
                            var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                            var12 = -var7 + (1 - -var9) >> -1233119231;
                            L23: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L22;
                              } else {
                                wj.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      wj.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L19;
                    }
                  }
                }
              } else {
                L24: {
                  if (wj.field_g > var5) {
                    break L24;
                  } else {
                    if (wj.field_b <= var5) {
                      break L24;
                    } else {
                      var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                      var12 = -var8 + 1 - -var10 >> 2098333537;
                      L25: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L24;
                        } else {
                          wj.field_l[var11] = 16777215;
                          var11 = var11 + 2 * wj.field_k;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (wj.field_e > param4) {
                    break L26;
                  } else {
                    if (wj.field_j <= var6) {
                      break L26;
                    } else {
                      var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                      var12 = -var7 + (1 - -var9) >> -1233119231;
                      L27: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L26;
                        } else {
                          wj.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L27;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (param4 >= wj.field_e) {
              if (wj.field_j <= var6) {
                L28: {
                  if (wj.field_g > var5) {
                    break L28;
                  } else {
                    if (wj.field_b <= var5) {
                      break L28;
                    } else {
                      var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                      var12 = -var8 + 1 - -var10 >> 2098333537;
                      L29: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L28;
                        } else {
                          wj.field_l[var11] = 16777215;
                          var11 = var11 + 2 * wj.field_k;
                          continue L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  if (wj.field_e > param4) {
                    break L30;
                  } else {
                    if (wj.field_j <= var6) {
                      break L30;
                    } else {
                      var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                      var12 = -var7 + (1 - -var9) >> -1233119231;
                      L31: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L30;
                        } else {
                          wj.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L31;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var11 = var7 + param4 * wj.field_k;
                var12 = 1 + (var9 + -var7) >> -2067431935;
                L32: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    L33: {
                      if (wj.field_g > var5) {
                        break L33;
                      } else {
                        if (wj.field_b <= var5) {
                          break L33;
                        } else {
                          var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                          var12 = -var8 + 1 - -var10 >> 2098333537;
                          L34: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L33;
                            } else {
                              wj.field_l[var11] = 16777215;
                              var11 = var11 + 2 * wj.field_k;
                              continue L34;
                            }
                          }
                        }
                      }
                    }
                    L35: {
                      if (wj.field_e > param4) {
                        break L35;
                      } else {
                        if (wj.field_j <= var6) {
                          break L35;
                        } else {
                          var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                          var12 = -var7 + (1 - -var9) >> -1233119231;
                          L36: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L35;
                            } else {
                              wj.field_l[var11] = 16777215;
                              var11 += 2;
                              continue L36;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    wj.field_l[var11] = 16777215;
                    var11 += 2;
                    continue L32;
                  }
                }
              }
            } else {
              L37: {
                if (wj.field_g > var5) {
                  break L37;
                } else {
                  if (wj.field_b <= var5) {
                    break L37;
                  } else {
                    var11 = var5 + wj.field_k * (var8 - -(var5 - param1 & 1));
                    var12 = -var8 + 1 - -var10 >> 2098333537;
                    L38: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L37;
                      } else {
                        wj.field_l[var11] = 16777215;
                        var11 = var11 + 2 * wj.field_k;
                        continue L38;
                      }
                    }
                  }
                }
              }
              L39: {
                if (wj.field_e > param4) {
                  break L39;
                } else {
                  if (wj.field_j <= var6) {
                    break L39;
                  } else {
                    var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                    var12 = -var7 + (1 - -var9) >> -1233119231;
                    L40: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L39;
                      } else {
                        wj.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L40;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -90) {
          field_a = null;
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        od var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new od(param1);
                    if (param0 == 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ce.a(76, 80, 93, -121, -34);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = var9.l(31760);
                    var4 = var9.h(-4);
                    if (var4 < 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == aj.field_d) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (aj.field_d < var4) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.b(0, var4, param0 + 127, var16);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.h(-9);
                    if ((var5 ^ -1) > -1) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (aj.field_d == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 > aj.field_d) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (1 != var3) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$3 = gh.a(var17, var5, param1, var4, 9);
                    return var6;
                }
                case 16: {
                    var7 = (Object) (Object) ei.field_i;
                    // monitorenter ei.field_i
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        ei.field_i.a(var17, var9, -1);
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return var6;
                }
                case 19: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email address is unavailable";
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_e = new vh();
    }
}
