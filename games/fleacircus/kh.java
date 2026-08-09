/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    char[][] field_c;
    byte field_e;
    static mk field_a;
    byte field_f;
    static int field_d;
    static int field_g;
    static int field_b;

    final static Object a(boolean param0, byte[] param1, int param2) {
        qe var3 = null;
        RuntimeException var3_ref = null;
        qe stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if ((param1.length ^ -1) < param2) {
                var3 = new qe();
                ((hd) ((Object) var3)).a(param2 + 13, param1);
                stackIn_6_0 = (qe) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!param0) {
                  stackIn_11_0 = (byte[]) (param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = rl.a(1, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("kh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -34) {
            return;
        }
        field_a = null;
    }

    kh(byte[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 3;
                        this.field_f = param0[1];
                        this.field_e = param0[2];
                        this.field_c = new char[40][21];
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-41 >= (var3 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var4 ^ -1) <= -22) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_c[var3][var4] = (char)param0[var2_int];
                        var2_int++;
                        var4++;
                        if (var5 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("kh.<init>(");
                    stackIn_13_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (rl.field_e == null) {
              break L1;
            } else {
              if (rl.field_e.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          rl.field_e = new int[param1 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == jl.field_b) {
              break L3;
            } else {
              if (param1 > jl.field_b.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          jl.field_b = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == kk.field_b) {
              break L5;
            } else {
              if (param1 <= kk.field_b.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          kk.field_b = new int[param1 * 2];
          break L4;
        }
        if (hg.field_q == null) {
          L6: {
            L7: {
              hg.field_q = new int[param1 * 2];
              if (vh.field_i == null) {
                break L7;
              } else {
                if (vh.field_i.length >= param1) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            vh.field_i = new int[2 * param1];
            break L6;
          }
          L8: {
            L9: {
              if (null == uj.field_a) {
                break L9;
              } else {
                if (uj.field_a.length < param1) {
                  break L9;
                } else {
                  break L8;
                }
              }
            }
            uj.field_a = new int[2 * param1];
            break L8;
          }
          L10: {
            if (param2 == 26721) {
              break L10;
            } else {
              kh.a(-42, -43, 83);
              break L10;
            }
          }
          L11: {
            L12: {
              if (mh.field_y == null) {
                break L12;
              } else {
                if (param0 + param1 > mh.field_y.length) {
                  break L12;
                } else {
                  break L11;
                }
              }
            }
            mh.field_y = new int[(param1 + param0) * 2];
            break L11;
          }
          if (null == se.field_d) {
            se.field_d = new boolean[param1 * 2];
            lc.field_u = -2147483648;
            ok.field_L = -2147483648;
            ak.field_f = 2147483647;
            ea.field_a = 2147483647;
            qh.field_D = 0;
            return;
          } else {
            if (se.field_d.length < param1) {
              se.field_d = new boolean[param1 * 2];
              lc.field_u = -2147483648;
              ok.field_L = -2147483648;
              ak.field_f = 2147483647;
              ea.field_a = 2147483647;
              qh.field_D = 0;
              return;
            } else {
              lc.field_u = -2147483648;
              ok.field_L = -2147483648;
              ak.field_f = 2147483647;
              ea.field_a = 2147483647;
              qh.field_D = 0;
              return;
            }
          }
        } else {
          if (param1 <= hg.field_q.length) {
            if (vh.field_i == null) {
              L13: {
                L14: {
                  vh.field_i = new int[2 * param1];
                  if (null == uj.field_a) {
                    break L14;
                  } else {
                    if (uj.field_a.length < param1) {
                      break L14;
                    } else {
                      break L13;
                    }
                  }
                }
                uj.field_a = new int[2 * param1];
                break L13;
              }
              if (param2 == 26721) {
                L15: {
                  L16: {
                    if (mh.field_y == null) {
                      break L16;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L15;
                }
                if (null == se.field_d) {
                  se.field_d = new boolean[param1 * 2];
                  lc.field_u = -2147483648;
                  ok.field_L = -2147483648;
                  ak.field_f = 2147483647;
                  ea.field_a = 2147483647;
                  qh.field_D = 0;
                  return;
                } else {
                  if (se.field_d.length < param1) {
                    se.field_d = new boolean[param1 * 2];
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  }
                }
              } else {
                L17: {
                  L18: {
                    kh.a(-42, -43, 83);
                    if (mh.field_y == null) {
                      break L18;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L17;
                }
                L19: {
                  if (null == se.field_d) {
                    break L19;
                  } else {
                    if (se.field_d.length >= param1) {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      break L19;
                    }
                  }
                }
                se.field_d = new boolean[param1 * 2];
                lc.field_u = -2147483648;
                ok.field_L = -2147483648;
                ak.field_f = 2147483647;
                ea.field_a = 2147483647;
                qh.field_D = 0;
                return;
              }
            } else {
              if (vh.field_i.length >= param1) {
                L20: {
                  L21: {
                    if (null == uj.field_a) {
                      break L21;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L20;
                }
                L22: {
                  if (param2 == 26721) {
                    break L22;
                  } else {
                    kh.a(-42, -43, 83);
                    break L22;
                  }
                }
                L23: {
                  L24: {
                    if (mh.field_y == null) {
                      break L24;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L23;
                }
                if (null == se.field_d) {
                  se.field_d = new boolean[param1 * 2];
                  lc.field_u = -2147483648;
                  ok.field_L = -2147483648;
                  ak.field_f = 2147483647;
                  ea.field_a = 2147483647;
                  qh.field_D = 0;
                  return;
                } else {
                  if (se.field_d.length < param1) {
                    se.field_d = new boolean[param1 * 2];
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  }
                }
              } else {
                L25: {
                  L26: {
                    vh.field_i = new int[2 * param1];
                    if (null == uj.field_a) {
                      break L26;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L25;
                }
                if (param2 == 26721) {
                  L27: {
                    L28: {
                      if (mh.field_y == null) {
                        break L28;
                      } else {
                        if (param0 + param1 > mh.field_y.length) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                    mh.field_y = new int[(param1 + param0) * 2];
                    break L27;
                  }
                  if (null == se.field_d) {
                    se.field_d = new boolean[param1 * 2];
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    if (se.field_d.length < param1) {
                      se.field_d = new boolean[param1 * 2];
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    }
                  }
                } else {
                  L29: {
                    L30: {
                      kh.a(-42, -43, 83);
                      if (mh.field_y == null) {
                        break L30;
                      } else {
                        if (param0 + param1 > mh.field_y.length) {
                          break L30;
                        } else {
                          break L29;
                        }
                      }
                    }
                    mh.field_y = new int[(param1 + param0) * 2];
                    break L29;
                  }
                  L31: {
                    if (null == se.field_d) {
                      break L31;
                    } else {
                      if (se.field_d.length >= param1) {
                        lc.field_u = -2147483648;
                        ok.field_L = -2147483648;
                        ak.field_f = 2147483647;
                        ea.field_a = 2147483647;
                        qh.field_D = 0;
                        return;
                      } else {
                        break L31;
                      }
                    }
                  }
                  se.field_d = new boolean[param1 * 2];
                  lc.field_u = -2147483648;
                  ok.field_L = -2147483648;
                  ak.field_f = 2147483647;
                  ea.field_a = 2147483647;
                  qh.field_D = 0;
                  return;
                }
              }
            }
          } else {
            hg.field_q = new int[param1 * 2];
            if (vh.field_i != null) {
              if (vh.field_i.length < param1) {
                L32: {
                  L33: {
                    vh.field_i = new int[2 * param1];
                    if (null == uj.field_a) {
                      break L33;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L32;
                }
                L34: {
                  if (param2 == 26721) {
                    break L34;
                  } else {
                    kh.a(-42, -43, 83);
                    break L34;
                  }
                }
                L35: {
                  L36: {
                    if (mh.field_y == null) {
                      break L36;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L36;
                      } else {
                        break L35;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L35;
                }
                L37: {
                  if (null == se.field_d) {
                    break L37;
                  } else {
                    if (se.field_d.length >= param1) {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      break L37;
                    }
                  }
                }
                se.field_d = new boolean[param1 * 2];
                lc.field_u = -2147483648;
                ok.field_L = -2147483648;
                ak.field_f = 2147483647;
                ea.field_a = 2147483647;
                qh.field_D = 0;
                return;
              } else {
                L38: {
                  L39: {
                    if (null == uj.field_a) {
                      break L39;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L38;
                }
                L40: {
                  if (param2 == 26721) {
                    break L40;
                  } else {
                    kh.a(-42, -43, 83);
                    break L40;
                  }
                }
                L41: {
                  L42: {
                    if (mh.field_y == null) {
                      break L42;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L42;
                      } else {
                        break L41;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L41;
                }
                L43: {
                  if (null == se.field_d) {
                    break L43;
                  } else {
                    if (se.field_d.length >= param1) {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      break L43;
                    }
                  }
                }
                se.field_d = new boolean[param1 * 2];
                lc.field_u = -2147483648;
                ok.field_L = -2147483648;
                ak.field_f = 2147483647;
                ea.field_a = 2147483647;
                qh.field_D = 0;
                return;
              }
            } else {
              L44: {
                L45: {
                  vh.field_i = new int[2 * param1];
                  if (null == uj.field_a) {
                    break L45;
                  } else {
                    if (uj.field_a.length < param1) {
                      break L45;
                    } else {
                      break L44;
                    }
                  }
                }
                uj.field_a = new int[2 * param1];
                break L44;
              }
              L46: {
                if (param2 == 26721) {
                  break L46;
                } else {
                  kh.a(-42, -43, 83);
                  break L46;
                }
              }
              L47: {
                L48: {
                  if (mh.field_y == null) {
                    break L48;
                  } else {
                    if (param0 + param1 > mh.field_y.length) {
                      break L48;
                    } else {
                      break L47;
                    }
                  }
                }
                mh.field_y = new int[(param1 + param0) * 2];
                break L47;
              }
              L49: {
                if (null == se.field_d) {
                  break L49;
                } else {
                  if (se.field_d.length >= param1) {
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    break L49;
                  }
                }
              }
              se.field_d = new boolean[param1 * 2];
              lc.field_u = -2147483648;
              ok.field_L = -2147483648;
              ak.field_f = 2147483647;
              ea.field_a = 2147483647;
              qh.field_D = 0;
              return;
            }
          }
        }
    }

    static {
    }
}
