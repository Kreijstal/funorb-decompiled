/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ri extends wf {
    long field_j;
    static cj field_k;
    ri field_h;
    ri field_g;
    static String field_i;

    final static int a(int param0, int param1) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        var2 = -12 % ((-73 - param0) / 47);
        param1 = param1 & 8191;
        if ((param1 ^ -1) <= -4097) {
          L0: {
            if ((param1 ^ -1) <= -6145) {
              stackIn_8_0 = nj.field_r[-6144 + param1];
              break L0;
            } else {
              stackIn_8_0 = -nj.field_r[-param1 + 6144];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackIn_4_0 = -nj.field_r[-2048 + param1];
              break L1;
            } else {
              stackIn_4_0 = nj.field_r[-param1 + 2048];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void b(byte param0) {
        if (this.field_g == null) {
          return;
        } else {
          if (param0 > -57) {
            return;
          } else {
            this.field_g.field_h = this.field_h;
            this.field_h.field_g = this.field_g;
            this.field_h = null;
            this.field_g = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 35 / ((-82 - param0) / 43);
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int var9;
        var9 = Transmogrify.field_A ? 1 : 0;
        if (param4 >= -117) {
          ri.a(-105, -75);
          if (param5 < param6) {
            L0: {
              if (param6 >= param3) {
                if (param3 > param5) {
                  ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                  return;
                } else {
                  ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                  if (var9 == 0) {
                    break L0;
                  } else {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  }
                }
              } else {
                ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                if (var9 == 0) {
                  break L0;
                } else {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  }
                }
              }
            }
            return;
          } else {
            if (param3 > param5) {
              ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
              if (var9 != 0) {
                if (param6 >= param3) {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    if (var9 == 0) {
                      return;
                    } else {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      return;
                    }
                  }
                } else {
                  ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                  if (var9 != 0) {
                    L1: {
                      if (param3 > param5) {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L1;
                      } else {
                        ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L1;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (param6 >= param3) {
                ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                if (var9 != 0) {
                  ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                  if (var9 != 0) {
                    L2: {
                      if (param6 >= param3) {
                        break L2;
                      } else {
                        ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                        break L2;
                      }
                    }
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      return;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 != 0) {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ca.a(param0, param3, param2, param1, param7, true, param6, param5, sb.field_h);
                if (var9 == 0) {
                  return;
                } else {
                  L3: {
                    ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                    ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                    if (param6 >= param3) {
                      break L3;
                    } else {
                      ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                      break L3;
                    }
                  }
                  L4: {
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L4;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 == 0) {
                        break L4;
                      } else {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L4;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          if (param5 < param6) {
            if (param6 >= param3) {
              if (param3 <= param5) {
                ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                if (var9 != 0) {
                  ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                  return;
                } else {
                  return;
                }
              } else {
                ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                return;
              }
            } else {
              ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
              if (var9 != 0) {
                L5: {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    break L5;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    break L5;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            if (param3 > param5) {
              ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
              if (var9 != 0) {
                L6: {
                  if (param6 >= param3) {
                    break L6;
                  } else {
                    ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                    break L6;
                  }
                }
                L7: {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    break L7;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    if (var9 == 0) {
                      break L7;
                    } else {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L7;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (param6 >= param3) {
                ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                if (var9 != 0) {
                  L8: {
                    ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                    if (param6 >= param3) {
                      break L8;
                    } else {
                      ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                      break L8;
                    }
                  }
                  L9: {
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L9;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 == 0) {
                        break L9;
                      } else {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L9;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ca.a(param0, param3, param2, param1, param7, true, param6, param5, sb.field_h);
                if (var9 != 0) {
                  L10: {
                    ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                    ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                    if (param6 >= param3) {
                      break L10;
                    } else {
                      ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                      break L10;
                    }
                  }
                  L11: {
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L11;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 == 0) {
                        break L11;
                      } else {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L11;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0 + param1;
                        var6 = param4 + param2;
                        if (sb.field_d >= param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = sb.field_d;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = stackIn_4_0;
                        if (sb.field_e >= param2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = param2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = sb.field_e;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = stackIn_7_0;
                        if (var5_int < sb.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = sb.field_b;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = var5_int;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = stackIn_10_0;
                        if (var6 < sb.field_f) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = sb.field_f;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var6;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = stackIn_13_0;
                        if (param1 < sb.field_d) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (sb.field_b > param1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var11 = param1 + var8 * sb.field_c;
                        var12 = -var8 + (1 - -var10) >> 521415233;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        sb.field_h[var11] = 16777215;
                        var11 = var11 + 2 * sb.field_c;
                        if (var13 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var13 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (sb.field_e > param2) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6 < sb.field_f) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = var7 + param2 * sb.field_c;
                        var12 = var9 + (1 - var7) >> -1456379327;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        sb.field_h[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var13 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (sb.field_d > var5_int) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (sb.field_b > var5_int) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11 = (var8 - -(1 & var5_int + -param1)) * sb.field_c - -var5_int;
                        var12 = -var8 + var10 + 1 >> -586795711;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        sb.field_h[var11] = 16777215;
                        var11 = var11 + sb.field_c * 2;
                        if (var13 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var13 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (param3 <= -9) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (param2 < sb.field_e) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6 < sb.field_f) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                        var12 = 1 + (var9 - var7) >> -702428575;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var12--;
                        if (var12 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        sb.field_h[var11] = 16777215;
                        var11 += 2;
                        if (var13 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        return;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var13 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var5), "ri.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected ri() {
    }

    static {
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
