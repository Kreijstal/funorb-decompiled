/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr {
    static Boolean field_a;
    static jj field_b;

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) as.field_b;
                    // monitorenter as.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cf.field_a = cf.field_a + 1;
                        q.field_v = cl.field_f;
                        ed.field_n = ja.field_h;
                        gb.field_d = ca.field_c;
                        wo.field_s = ej.field_f;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ej.field_f = stackIn_4_0 != 0;
                        kf.field_c = kc.field_a;
                        sd.field_N = hn.field_o;
                        no.field_e = gf.field_e;
                        kc.field_a = 0;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        if ((ol.field_B ^ -1) == -2) {
          ol.field_B = -1;
          if (param0 <= -40) {
            return;
          } else {
            field_a = null;
            return;
          }
        } else {
          ol.field_B = 1;
          if (param0 <= -40) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    public static void c(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            mr.b(false);
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        var5 = param4 - -param0;
        var6 = param2 + param1;
        if (param3 == 0) {
          L0: {
            if (param4 > bi.field_d) {
              stackOut_50_0 = param4;
              stackIn_51_0 = stackOut_50_0;
              break L0;
            } else {
              stackOut_49_0 = bi.field_d;
              stackIn_51_0 = stackOut_49_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_51_0;
            if (param1 <= bi.field_f) {
              stackOut_53_0 = bi.field_f;
              stackIn_54_0 = stackOut_53_0;
              break L1;
            } else {
              stackOut_52_0 = param1;
              stackIn_54_0 = stackOut_52_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_54_0;
            if (bi.field_i > var5) {
              stackOut_56_0 = var5;
              stackIn_57_0 = stackOut_56_0;
              break L2;
            } else {
              stackOut_55_0 = bi.field_i;
              stackIn_57_0 = stackOut_55_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_57_0;
            if (bi.field_c > var6) {
              stackOut_59_0 = var6;
              stackIn_60_0 = stackOut_59_0;
              break L3;
            } else {
              stackOut_58_0 = bi.field_c;
              stackIn_60_0 = stackOut_58_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_60_0;
            if (bi.field_d > param4) {
              break L4;
            } else {
              if (param4 < bi.field_i) {
                var11 = param4 + var8 * bi.field_e;
                var12 = var10 + 1 + -var8 >> 345662017;
                L5: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L4;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 = var11 + 2 * bi.field_e;
                    continue L5;
                  }
                }
              } else {
                L6: {
                  if (param1 < bi.field_f) {
                    break L6;
                  } else {
                    if (bi.field_c > var6) {
                      var11 = param1 * bi.field_e + var7;
                      var12 = 1 + (var9 - var7) >> -1413086015;
                      L7: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L6;
                        } else {
                          bi.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L7;
                        }
                      }
                    } else {
                      L8: {
                        if (bi.field_d > var5) {
                          break L8;
                        } else {
                          if (bi.field_i > var5) {
                            var11 = var5 + bi.field_e * ((-param4 + var5 & 1) + var8);
                            var12 = -var8 + 1 + var10 >> 24636193;
                            L9: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L8;
                              } else {
                                bi.field_l[var11] = 16777215;
                                var11 = var11 + bi.field_e * 2;
                                continue L9;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L10: {
                        if (bi.field_f > param1) {
                          break L10;
                        } else {
                          if (bi.field_c > var6) {
                            var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                            var12 = -var7 + var9 + 1 >> 778686913;
                            L11: while (true) {
                              var12--;
                              if (-1 < (var12 ^ -1)) {
                                break L10;
                              } else {
                                bi.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L12: {
                  if (bi.field_d > var5) {
                    break L12;
                  } else {
                    if (bi.field_i > var5) {
                      var11 = var5 + bi.field_e * ((-param4 + var5 & 1) + var8);
                      var12 = -var8 + 1 + var10 >> 24636193;
                      L13: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L12;
                        } else {
                          bi.field_l[var11] = 16777215;
                          var11 = var11 + bi.field_e * 2;
                          continue L13;
                        }
                      }
                    } else {
                      L14: {
                        if (bi.field_f > param1) {
                          break L14;
                        } else {
                          if (bi.field_c > var6) {
                            var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                            var12 = -var7 + var9 + 1 >> 778686913;
                            L15: while (true) {
                              var12--;
                              if (-1 < (var12 ^ -1)) {
                                break L14;
                              } else {
                                bi.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L15;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (bi.field_f <= param1) {
                  if (bi.field_c <= var6) {
                    return;
                  } else {
                    var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                    var12 = -var7 + var9 + 1 >> 778686913;
                    L16: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        return;
                      } else {
                        bi.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L16;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          L17: {
            if (param1 < bi.field_f) {
              break L17;
            } else {
              if (bi.field_c > var6) {
                var11 = param1 * bi.field_e + var7;
                var12 = 1 + (var9 - var7) >> -1413086015;
                L18: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L17;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 += 2;
                    continue L18;
                  }
                }
              } else {
                L19: {
                  if (bi.field_d > var5) {
                    break L19;
                  } else {
                    if (bi.field_i > var5) {
                      var11 = var5 + bi.field_e * ((-param4 + var5 & 1) + var8);
                      var12 = -var8 + 1 + var10 >> 24636193;
                      L20: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L19;
                        } else {
                          bi.field_l[var11] = 16777215;
                          var11 = var11 + bi.field_e * 2;
                          continue L20;
                        }
                      }
                    } else {
                      L21: {
                        if (bi.field_f > param1) {
                          break L21;
                        } else {
                          if (bi.field_c > var6) {
                            var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                            var12 = -var7 + var9 + 1 >> 778686913;
                            L22: while (true) {
                              var12--;
                              if (-1 < (var12 ^ -1)) {
                                break L21;
                              } else {
                                bi.field_l[var11] = 16777215;
                                var11 += 2;
                                continue L22;
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L23: {
                  if (bi.field_f > param1) {
                    break L23;
                  } else {
                    if (bi.field_c > var6) {
                      var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                      var12 = -var7 + var9 + 1 >> 778686913;
                      L24: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L23;
                        } else {
                          bi.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L24;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          L25: {
            if (bi.field_d > var5) {
              break L25;
            } else {
              if (bi.field_i > var5) {
                var11 = var5 + bi.field_e * ((-param4 + var5 & 1) + var8);
                var12 = -var8 + 1 + var10 >> 24636193;
                L26: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L25;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 = var11 + bi.field_e * 2;
                    continue L26;
                  }
                }
              } else {
                L27: {
                  if (bi.field_f > param1) {
                    break L27;
                  } else {
                    if (bi.field_c > var6) {
                      var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                      var12 = -var7 + var9 + 1 >> 778686913;
                      L28: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L27;
                        } else {
                          bi.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L28;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          L29: {
            if (bi.field_f > param1) {
              break L29;
            } else {
              if (bi.field_c > var6) {
                var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                var12 = -var7 + var9 + 1 >> 778686913;
                L30: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L29;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 += 2;
                    continue L30;
                  }
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L31: {
            field_b = null;
            if (param4 > bi.field_d) {
              stackOut_3_0 = param4;
              stackIn_4_0 = stackOut_3_0;
              break L31;
            } else {
              stackOut_2_0 = bi.field_d;
              stackIn_4_0 = stackOut_2_0;
              break L31;
            }
          }
          L32: {
            var7 = stackIn_4_0;
            if (param1 <= bi.field_f) {
              stackOut_6_0 = bi.field_f;
              stackIn_7_0 = stackOut_6_0;
              break L32;
            } else {
              stackOut_5_0 = param1;
              stackIn_7_0 = stackOut_5_0;
              break L32;
            }
          }
          L33: {
            var8 = stackIn_7_0;
            if (bi.field_i > var5) {
              stackOut_9_0 = var5;
              stackIn_10_0 = stackOut_9_0;
              break L33;
            } else {
              stackOut_8_0 = bi.field_i;
              stackIn_10_0 = stackOut_8_0;
              break L33;
            }
          }
          L34: {
            var9 = stackIn_10_0;
            if (bi.field_c > var6) {
              stackOut_12_0 = var6;
              stackIn_13_0 = stackOut_12_0;
              break L34;
            } else {
              stackOut_11_0 = bi.field_c;
              stackIn_13_0 = stackOut_11_0;
              break L34;
            }
          }
          L35: {
            var10 = stackIn_13_0;
            if (bi.field_d > param4) {
              break L35;
            } else {
              if (param4 < bi.field_i) {
                var11 = param4 + var8 * bi.field_e;
                var12 = var10 + 1 + -var8 >> 345662017;
                L36: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L35;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 = var11 + 2 * bi.field_e;
                    continue L36;
                  }
                }
              } else {
                break L35;
              }
            }
          }
          L37: {
            if (param1 < bi.field_f) {
              break L37;
            } else {
              if (bi.field_c > var6) {
                var11 = param1 * bi.field_e + var7;
                var12 = 1 + (var9 - var7) >> -1413086015;
                L38: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L37;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 += 2;
                    continue L38;
                  }
                }
              } else {
                break L37;
              }
            }
          }
          L39: {
            if (bi.field_d > var5) {
              break L39;
            } else {
              if (bi.field_i > var5) {
                var11 = var5 + bi.field_e * ((-param4 + var5 & 1) + var8);
                var12 = -var8 + 1 + var10 >> 24636193;
                L40: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L39;
                  } else {
                    bi.field_l[var11] = 16777215;
                    var11 = var11 + bi.field_e * 2;
                    continue L40;
                  }
                }
              } else {
                L41: {
                  if (bi.field_f > param1) {
                    break L41;
                  } else {
                    if (bi.field_c > var6) {
                      var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                      var12 = -var7 + var9 + 1 >> 778686913;
                      L42: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L41;
                        } else {
                          bi.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L42;
                        }
                      }
                    } else {
                      break L41;
                    }
                  }
                }
                return;
              }
            }
          }
          if (bi.field_f <= param1) {
            if (bi.field_c <= var6) {
              return;
            } else {
              var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
              var12 = -var7 + var9 + 1 >> 778686913;
              L43: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  return;
                } else {
                  bi.field_l[var11] = 16777215;
                  var11 += 2;
                  continue L43;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0) {
        fk.a(ob.e((byte) 99), 11514);
        if (param0) {
            field_a = null;
        }
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param1 != -48) {
          return null;
        } else {
          var4 = param3.indexOf(param0);
          L0: while (true) {
            if (-1 == var4) {
              return param3;
            } else {
              param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param0.length());
              var4 = param3.indexOf(param0, var4 - -param2.length());
              continue L0;
            }
          }
        }
    }

    static {
    }
}
