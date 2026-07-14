/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp implements Runnable {
    volatile du[] field_c;
    volatile boolean field_b;
    static String field_f;
    static String[] field_e;
    wi field_g;
    volatile boolean field_a;
    static gm field_d;
    static int field_h;

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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = Sumoblitz.field_L ? 1 : 0;
          var5 = param3 - -param1;
          var6 = param0 + param4;
          if (lk.field_k < param3) {
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = lk.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (lk.field_i >= param0) {
            stackOut_5_0 = lk.field_i;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param0;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= lk.field_j) {
            stackOut_8_0 = lk.field_j;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (lk.field_e <= var6) {
            stackOut_11_0 = lk.field_e;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (lk.field_k <= param3) {
          if (lk.field_j > param3) {
            var11 = param3 + var8 * lk.field_b;
            var12 = 1 - -var10 + -var8 >> -2219903;
            L4: while (true) {
              var12--;
              if (-1 < (var12 ^ -1)) {
                L5: {
                  if (param2 == -13181) {
                    break L5;
                  } else {
                    pp.a(5, 111, 100, -88, -57);
                    break L5;
                  }
                }
                if (lk.field_i <= param0) {
                  if (var6 >= lk.field_e) {
                    L6: {
                      if (lk.field_k > var5) {
                        break L6;
                      } else {
                        if (var5 >= lk.field_j) {
                          break L6;
                        } else {
                          var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                          var12 = var10 + 1 + -var8 >> -1169820063;
                          L7: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L6;
                            } else {
                              lk.field_a[var11] = 16777215;
                              var11 = var11 + 2 * lk.field_b;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (lk.field_i > param0) {
                        break L8;
                      } else {
                        if (lk.field_e <= var6) {
                          break L8;
                        } else {
                          var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                          var12 = -var7 + (1 - -var9) >> 883457121;
                          L9: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L8;
                            } else {
                              lk.field_a[var11] = 16777215;
                              var11 += 2;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    var11 = param0 * lk.field_b - -var7;
                    var12 = -var7 + (1 + var9) >> 220154369;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        L11: {
                          if (lk.field_k > var5) {
                            break L11;
                          } else {
                            if (var5 >= lk.field_j) {
                              break L11;
                            } else {
                              var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                              var12 = var10 + 1 + -var8 >> -1169820063;
                              L12: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L11;
                                } else {
                                  lk.field_a[var11] = 16777215;
                                  var11 = var11 + 2 * lk.field_b;
                                  continue L12;
                                }
                              }
                            }
                          }
                        }
                        L13: {
                          if (lk.field_i > param0) {
                            break L13;
                          } else {
                            if (lk.field_e <= var6) {
                              break L13;
                            } else {
                              var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                              var12 = -var7 + (1 - -var9) >> 883457121;
                              L14: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L13;
                                } else {
                                  lk.field_a[var11] = 16777215;
                                  var11 += 2;
                                  continue L14;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 += 2;
                        continue L10;
                      }
                    }
                  }
                } else {
                  L15: {
                    if (lk.field_k > var5) {
                      break L15;
                    } else {
                      if (var5 >= lk.field_j) {
                        break L15;
                      } else {
                        var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                        var12 = var10 + 1 + -var8 >> -1169820063;
                        L16: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L15;
                          } else {
                            lk.field_a[var11] = 16777215;
                            var11 = var11 + 2 * lk.field_b;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (lk.field_i > param0) {
                      break L17;
                    } else {
                      if (lk.field_e <= var6) {
                        break L17;
                      } else {
                        var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                        var12 = -var7 + (1 - -var9) >> 883457121;
                        L18: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L17;
                          } else {
                            lk.field_a[var11] = 16777215;
                            var11 += 2;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                lk.field_a[var11] = 16777215;
                var11 = var11 + lk.field_b * 2;
                continue L4;
              }
            }
          } else {
            L19: {
              if (param2 == -13181) {
                break L19;
              } else {
                pp.a(5, 111, 100, -88, -57);
                break L19;
              }
            }
            if (lk.field_i <= param0) {
              if (var6 >= lk.field_e) {
                L20: {
                  if (lk.field_k > var5) {
                    break L20;
                  } else {
                    if (var5 >= lk.field_j) {
                      break L20;
                    } else {
                      var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                      var12 = var10 + 1 + -var8 >> -1169820063;
                      L21: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L20;
                        } else {
                          lk.field_a[var11] = 16777215;
                          var11 = var11 + 2 * lk.field_b;
                          continue L21;
                        }
                      }
                    }
                  }
                }
                L22: {
                  if (lk.field_i > param0) {
                    break L22;
                  } else {
                    if (lk.field_e <= var6) {
                      break L22;
                    } else {
                      var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                      var12 = -var7 + (1 - -var9) >> 883457121;
                      L23: while (true) {
                        var12--;
                        if (-1 < var12) {
                          break L22;
                        } else {
                          lk.field_a[var11] = 16777215;
                          var11 += 2;
                          continue L23;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var11 = param0 * lk.field_b - -var7;
                var12 = -var7 + (1 + var9) >> 220154369;
                L24: while (true) {
                  var12--;
                  if (var12 < 0) {
                    L25: {
                      if (lk.field_k > var5) {
                        break L25;
                      } else {
                        if (var5 >= lk.field_j) {
                          break L25;
                        } else {
                          var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                          var12 = var10 + 1 + -var8 >> -1169820063;
                          L26: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L25;
                            } else {
                              lk.field_a[var11] = 16777215;
                              var11 = var11 + 2 * lk.field_b;
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                    L27: {
                      if (lk.field_i > param0) {
                        break L27;
                      } else {
                        if (lk.field_e <= var6) {
                          break L27;
                        } else {
                          var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                          var12 = -var7 + (1 - -var9) >> 883457121;
                          L28: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L27;
                            } else {
                              lk.field_a[var11] = 16777215;
                              var11 += 2;
                              continue L28;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    lk.field_a[var11] = 16777215;
                    var11 += 2;
                    continue L24;
                  }
                }
              }
            } else {
              L29: {
                if (lk.field_k > var5) {
                  break L29;
                } else {
                  if (var5 >= lk.field_j) {
                    break L29;
                  } else {
                    var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                    var12 = var10 + 1 + -var8 >> -1169820063;
                    L30: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L29;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 = var11 + 2 * lk.field_b;
                        continue L30;
                      }
                    }
                  }
                }
              }
              L31: {
                if (lk.field_i > param0) {
                  break L31;
                } else {
                  if (lk.field_e <= var6) {
                    break L31;
                  } else {
                    var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                    var12 = -var7 + (1 - -var9) >> 883457121;
                    L32: while (true) {
                      var12--;
                      if (-1 < var12) {
                        break L31;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 += 2;
                        continue L32;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          if (param2 == -13181) {
            if (lk.field_i <= param0) {
              if (var6 >= lk.field_e) {
                L33: {
                  if (lk.field_k > var5) {
                    break L33;
                  } else {
                    if (var5 >= lk.field_j) {
                      break L33;
                    } else {
                      var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                      var12 = var10 + 1 + -var8 >> -1169820063;
                      L34: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L33;
                        } else {
                          lk.field_a[var11] = 16777215;
                          var11 = var11 + 2 * lk.field_b;
                          continue L34;
                        }
                      }
                    }
                  }
                }
                L35: {
                  if (lk.field_i > param0) {
                    break L35;
                  } else {
                    if (lk.field_e <= var6) {
                      break L35;
                    } else {
                      var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                      var12 = -var7 + (1 - -var9) >> 883457121;
                      L36: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L35;
                        } else {
                          lk.field_a[var11] = 16777215;
                          var11 += 2;
                          continue L36;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var11 = param0 * lk.field_b - -var7;
                var12 = -var7 + (1 + var9) >> 220154369;
                L37: while (true) {
                  var12--;
                  if (var12 < 0) {
                    L38: {
                      if (lk.field_k > var5) {
                        break L38;
                      } else {
                        if (var5 >= lk.field_j) {
                          break L38;
                        } else {
                          var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                          var12 = var10 + 1 + -var8 >> -1169820063;
                          L39: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L38;
                            } else {
                              lk.field_a[var11] = 16777215;
                              var11 = var11 + 2 * lk.field_b;
                              continue L39;
                            }
                          }
                        }
                      }
                    }
                    L40: {
                      if (lk.field_i > param0) {
                        break L40;
                      } else {
                        if (lk.field_e <= var6) {
                          break L40;
                        } else {
                          var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                          var12 = -var7 + (1 - -var9) >> 883457121;
                          L41: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L40;
                            } else {
                              lk.field_a[var11] = 16777215;
                              var11 += 2;
                              continue L41;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    lk.field_a[var11] = 16777215;
                    var11 += 2;
                    continue L37;
                  }
                }
              }
            } else {
              L42: {
                if (lk.field_k > var5) {
                  break L42;
                } else {
                  if (var5 >= lk.field_j) {
                    break L42;
                  } else {
                    var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                    var12 = var10 + 1 + -var8 >> -1169820063;
                    L43: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L42;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 = var11 + 2 * lk.field_b;
                        continue L43;
                      }
                    }
                  }
                }
              }
              L44: {
                if (lk.field_i > param0) {
                  break L44;
                } else {
                  if (lk.field_e <= var6) {
                    break L44;
                  } else {
                    var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                    var12 = -var7 + (1 - -var9) >> 883457121;
                    L45: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L44;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 += 2;
                        continue L45;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L46: {
              pp.a(5, 111, 100, -88, -57);
              if (lk.field_i > param0) {
                break L46;
              } else {
                if (var6 < lk.field_e) {
                  var11 = param0 * lk.field_b - -var7;
                  var12 = -var7 + (1 + var9) >> 220154369;
                  L47: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L46;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L47;
                    }
                  }
                } else {
                  break L46;
                }
              }
            }
            L48: {
              if (lk.field_k > var5) {
                break L48;
              } else {
                if (var5 >= lk.field_j) {
                  break L48;
                } else {
                  var11 = var5 + lk.field_b * ((1 & var5 + -param3) + var8);
                  var12 = var10 + 1 + -var8 >> -1169820063;
                  L49: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L48;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 = var11 + 2 * lk.field_b;
                      continue L49;
                    }
                  }
                }
              }
            }
            L50: {
              if (lk.field_i > param0) {
                break L50;
              } else {
                if (lk.field_e <= var6) {
                  break L50;
                } else {
                  var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                  var12 = -var7 + (1 - -var9) >> 883457121;
                  L51: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L50;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L51;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2) {
            pp.a(-25);
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        du var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    ((pp) this).field_b = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((pp) this).field_a) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (2 <= var1_int) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = ((pp) this).field_c[var1_int];
                        if (var2 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2.b();
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        tg.a(10L, (byte) 107);
                        rd.a((Object) null, ((pp) this).field_g, -11030);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 9: {
                    ((pp) this).field_b = false;
                    return;
                }
                case 10: {
                    try {
                        var1 = (Exception) (Object) caughtException;
                        var5 = null;
                        ms.a((String) null, (Throwable) (Object) var1, 0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    ((pp) this).field_b = false;
                    return;
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    ((pp) this).field_b = false;
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pp() {
        ((pp) this).field_c = new du[2];
        ((pp) this).field_a = false;
        ((pp) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Accelerator pad", "Ice pad", "Teleporter pad", "Pinball bouncer", "Attractor", "Repeller", "Spike pad", "Landmine"};
        field_f = "Members";
    }
}
