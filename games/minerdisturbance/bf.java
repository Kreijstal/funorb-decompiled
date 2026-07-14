/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static int field_d;
    static String field_c;
    private uj[] field_b;
    static String field_a;

    final uj[] e(int param0) {
        if (param0 != -27555) {
            return null;
        }
        return ((bf) this).field_b;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        if (param0 != 48) {
            bf.c(-40);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (tb.field_a == 0) {
          return;
        } else {
          L0: {
            if (0 > nk.field_w) {
              break L0;
            } else {
              if (-1 >= (gb.field_e ^ -1)) {
                var2 = nk.field_w - -li.field_c;
                var3 = gb.field_e - -db.field_d;
                var4 = var2 / 32 * 32 - li.field_c;
                var5 = -db.field_d + 32 * (var3 / 32);
                eh.e(var4, var5, 8, 16711680);
                eh.g(var4, var5, 8, 16711680);
                eh.e(var4, var5 + 32, 8, 16711680);
                eh.g(var4, 24 + var5, 8, 16711680);
                eh.e(var4 + 24, var5, 8, 16711680);
                eh.g(var4 - -32, var5, 8, 16711680);
                eh.e(var4 + 24, var5, 8, 16711680);
                eh.g(var4 + 32, var5 + 24, 8, 16711680);
                break L0;
              } else {
                if (param0 < -57) {
                  return;
                } else {
                  field_d = -48;
                  return;
                }
              }
            }
          }
          if (param0 >= -57) {
            field_d = -48;
            return;
          } else {
            return;
          }
        }
    }

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= 91) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    bf.a(-21);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null != di.field_O) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) di.field_O;
                    // monitorenter di.field_O
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        di.field_O = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        if (param0 != 32) {
          ((bf) this).b(94);
          if (-1 != (tb.field_a ^ -1)) {
            if (wj.field_j > -3) {
              return;
            } else {
              if (-1 <= wi.field_w) {
                if (m.field_e >= 0) {
                  if (jk.field_ab != 0) {
                    L0: {
                      var2 = nk.field_w - -li.field_c;
                      var3 = db.field_d + gb.field_e;
                      var4 = var2 / 32;
                      var5 = var3 / 32;
                      qm.field_f = true;
                      di.field_X = di.field_X + 1;
                      if (-2 == (tb.field_a ^ -1)) {
                        mh.field_e[var4][var5].field_U = gd.field_x;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    L1: {
                      if (2 != tb.field_a) {
                        break L1;
                      } else {
                        if (0 != bc.field_a) {
                          L2: {
                            if (-5 == (bc.field_a ^ -1)) {
                              mh.field_e[var4][var5].field_b = true;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          if (2 != bc.field_a) {
                            L3: {
                              if (bc.field_a == 3) {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = true;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            if (bc.field_a != 1) {
                              break L1;
                            } else {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_E = false;
                              if (3 == tb.field_a) {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                if (-1 != (ha.field_e ^ -1)) {
                                  if (ha.field_e != 1) {
                                    if ((ha.field_e ^ -1) != -3) {
                                      if ((ha.field_e ^ -1) != -4) {
                                        if (tb.field_a != 4) {
                                          return;
                                        } else {
                                          mh.field_e[var4][var5].field_a = false;
                                          mh.field_e[var4][var5].field_E = false;
                                          mh.field_e[var4][var5].field_v = false;
                                          mh.field_e[var4][var5].field_b = false;
                                          uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                          return;
                                        }
                                      } else {
                                        L4: {
                                          je.field_O.d(var5, var4, -5);
                                          if (tb.field_a == 4) {
                                            mh.field_e[var4][var5].field_a = false;
                                            mh.field_e[var4][var5].field_E = false;
                                            mh.field_e[var4][var5].field_v = false;
                                            mh.field_e[var4][var5].field_b = false;
                                            uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        return;
                                      }
                                    } else {
                                      L5: {
                                        je.field_O.h(var4, 4, var5);
                                        if (tb.field_a == 4) {
                                          mh.field_e[var4][var5].field_a = false;
                                          mh.field_e[var4][var5].field_E = false;
                                          mh.field_e[var4][var5].field_v = false;
                                          mh.field_e[var4][var5].field_b = false;
                                          uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      return;
                                    }
                                  } else {
                                    L6: {
                                      je.field_O.c(var5, var4, (byte) -48);
                                      if (tb.field_a == 4) {
                                        mh.field_e[var4][var5].field_a = false;
                                        mh.field_e[var4][var5].field_E = false;
                                        mh.field_e[var4][var5].field_v = false;
                                        mh.field_e[var4][var5].field_b = false;
                                        uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    return;
                                  }
                                } else {
                                  L7: {
                                    je.field_O.g(var5, var4, 4);
                                    if (tb.field_a == 4) {
                                      mh.field_e[var4][var5].field_a = false;
                                      mh.field_e[var4][var5].field_E = false;
                                      mh.field_e[var4][var5].field_v = false;
                                      mh.field_e[var4][var5].field_b = false;
                                      uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L8: {
                                  if (tb.field_a == 4) {
                                    mh.field_e[var4][var5].field_a = false;
                                    mh.field_e[var4][var5].field_E = false;
                                    mh.field_e[var4][var5].field_v = false;
                                    mh.field_e[var4][var5].field_b = false;
                                    uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                return;
                              }
                            }
                          } else {
                            L9: {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = true;
                              mh.field_e[var4][var5].field_E = false;
                              if (bc.field_a == 3) {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = true;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (bc.field_a != 1) {
                                break L10;
                              } else {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = false;
                                break L10;
                              }
                            }
                            if (3 == tb.field_a) {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              if (-1 != (ha.field_e ^ -1)) {
                                if (ha.field_e != 1) {
                                  if ((ha.field_e ^ -1) != -3) {
                                    if ((ha.field_e ^ -1) != -4) {
                                      if (tb.field_a == 4) {
                                        mh.field_e[var4][var5].field_a = false;
                                        mh.field_e[var4][var5].field_E = false;
                                        mh.field_e[var4][var5].field_v = false;
                                        mh.field_e[var4][var5].field_b = false;
                                        uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                        return;
                                      } else {
                                        return;
                                      }
                                    } else {
                                      L11: {
                                        je.field_O.d(var5, var4, -5);
                                        if (tb.field_a == 4) {
                                          mh.field_e[var4][var5].field_a = false;
                                          mh.field_e[var4][var5].field_E = false;
                                          mh.field_e[var4][var5].field_v = false;
                                          mh.field_e[var4][var5].field_b = false;
                                          uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      return;
                                    }
                                  } else {
                                    L12: {
                                      je.field_O.h(var4, 4, var5);
                                      if (tb.field_a == 4) {
                                        mh.field_e[var4][var5].field_a = false;
                                        mh.field_e[var4][var5].field_E = false;
                                        mh.field_e[var4][var5].field_v = false;
                                        mh.field_e[var4][var5].field_b = false;
                                        uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    return;
                                  }
                                } else {
                                  L13: {
                                    je.field_O.c(var5, var4, (byte) -48);
                                    if (tb.field_a == 4) {
                                      mh.field_e[var4][var5].field_a = false;
                                      mh.field_e[var4][var5].field_E = false;
                                      mh.field_e[var4][var5].field_v = false;
                                      mh.field_e[var4][var5].field_b = false;
                                      uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L14: {
                                  je.field_O.g(var5, var4, 4);
                                  if (tb.field_a == 4) {
                                    mh.field_e[var4][var5].field_a = false;
                                    mh.field_e[var4][var5].field_E = false;
                                    mh.field_e[var4][var5].field_v = false;
                                    mh.field_e[var4][var5].field_b = false;
                                    uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                return;
                              }
                            } else {
                              L15: {
                                if (tb.field_a == 4) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              return;
                            }
                          }
                        } else {
                          L16: {
                            mh.field_e[var4][var5].field_a = false;
                            mh.field_e[var4][var5].field_E = false;
                            mh.field_e[var4][var5].field_v = false;
                            mh.field_e[var4][var5].field_b = false;
                            if (-5 == (bc.field_a ^ -1)) {
                              mh.field_e[var4][var5].field_b = true;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (2 != bc.field_a) {
                              break L17;
                            } else {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = true;
                              mh.field_e[var4][var5].field_E = false;
                              break L17;
                            }
                          }
                          L18: {
                            if (bc.field_a == 3) {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_E = true;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if (bc.field_a != 1) {
                              break L19;
                            } else {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_E = false;
                              break L19;
                            }
                          }
                          if (3 == tb.field_a) {
                            mh.field_e[var4][var5].field_a = false;
                            mh.field_e[var4][var5].field_E = false;
                            mh.field_e[var4][var5].field_v = false;
                            mh.field_e[var4][var5].field_b = false;
                            if (-1 != (ha.field_e ^ -1)) {
                              if (ha.field_e != 1) {
                                if ((ha.field_e ^ -1) != -3) {
                                  if ((ha.field_e ^ -1) != -4) {
                                    if (tb.field_a == 4) {
                                      mh.field_e[var4][var5].field_a = false;
                                      mh.field_e[var4][var5].field_E = false;
                                      mh.field_e[var4][var5].field_v = false;
                                      mh.field_e[var4][var5].field_b = false;
                                      uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                      return;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    L20: {
                                      je.field_O.d(var5, var4, -5);
                                      if (tb.field_a == 4) {
                                        mh.field_e[var4][var5].field_a = false;
                                        mh.field_e[var4][var5].field_E = false;
                                        mh.field_e[var4][var5].field_v = false;
                                        mh.field_e[var4][var5].field_b = false;
                                        uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    return;
                                  }
                                } else {
                                  L21: {
                                    je.field_O.h(var4, 4, var5);
                                    if (tb.field_a == 4) {
                                      mh.field_e[var4][var5].field_a = false;
                                      mh.field_e[var4][var5].field_E = false;
                                      mh.field_e[var4][var5].field_v = false;
                                      mh.field_e[var4][var5].field_b = false;
                                      uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L22: {
                                  je.field_O.c(var5, var4, (byte) -48);
                                  if (tb.field_a == 4) {
                                    mh.field_e[var4][var5].field_a = false;
                                    mh.field_e[var4][var5].field_E = false;
                                    mh.field_e[var4][var5].field_v = false;
                                    mh.field_e[var4][var5].field_b = false;
                                    uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                return;
                              }
                            } else {
                              L23: {
                                je.field_O.g(var5, var4, 4);
                                if (tb.field_a == 4) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              return;
                            }
                          } else {
                            L24: {
                              if (tb.field_a == 4) {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    if (3 == tb.field_a) {
                      mh.field_e[var4][var5].field_a = false;
                      mh.field_e[var4][var5].field_E = false;
                      mh.field_e[var4][var5].field_v = false;
                      mh.field_e[var4][var5].field_b = false;
                      if (-1 != (ha.field_e ^ -1)) {
                        if (ha.field_e != 1) {
                          if ((ha.field_e ^ -1) != -3) {
                            if ((ha.field_e ^ -1) != -4) {
                              if (tb.field_a == 4) {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                return;
                              } else {
                                return;
                              }
                            } else {
                              L25: {
                                je.field_O.d(var5, var4, -5);
                                if (tb.field_a == 4) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              return;
                            }
                          } else {
                            L26: {
                              je.field_O.h(var4, 4, var5);
                              if (tb.field_a == 4) {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            return;
                          }
                        } else {
                          L27: {
                            je.field_O.c(var5, var4, (byte) -48);
                            if (tb.field_a == 4) {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          return;
                        }
                      } else {
                        L28: {
                          je.field_O.g(var5, var4, 4);
                          if (tb.field_a == 4) {
                            mh.field_e[var4][var5].field_a = false;
                            mh.field_e[var4][var5].field_E = false;
                            mh.field_e[var4][var5].field_v = false;
                            mh.field_e[var4][var5].field_b = false;
                            uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        return;
                      }
                    } else {
                      L29: {
                        if (tb.field_a == 4) {
                          mh.field_e[var4][var5].field_a = false;
                          mh.field_e[var4][var5].field_E = false;
                          mh.field_e[var4][var5].field_v = false;
                          mh.field_e[var4][var5].field_b = false;
                          uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          L30: {
            if (-1 == (tb.field_a ^ -1)) {
              break L30;
            } else {
              if (wj.field_j > -3) {
                break L30;
              } else {
                if (-1 <= wi.field_w) {
                  if (m.field_e >= 0) {
                    if (jk.field_ab != 0) {
                      L31: {
                        var2 = nk.field_w - -li.field_c;
                        var3 = db.field_d + gb.field_e;
                        var4 = var2 / 32;
                        var5 = var3 / 32;
                        qm.field_f = true;
                        di.field_X = di.field_X + 1;
                        if (-2 == (tb.field_a ^ -1)) {
                          mh.field_e[var4][var5].field_U = gd.field_x;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if (2 != tb.field_a) {
                          break L32;
                        } else {
                          L33: {
                            if (0 != bc.field_a) {
                              break L33;
                            } else {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              break L33;
                            }
                          }
                          L34: {
                            if (-5 == (bc.field_a ^ -1)) {
                              mh.field_e[var4][var5].field_b = true;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (2 != bc.field_a) {
                              break L35;
                            } else {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = true;
                              mh.field_e[var4][var5].field_E = false;
                              break L35;
                            }
                          }
                          L36: {
                            if (bc.field_a == 3) {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_E = true;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          if (bc.field_a != 1) {
                            break L32;
                          } else {
                            mh.field_e[var4][var5].field_a = true;
                            mh.field_e[var4][var5].field_v = false;
                            mh.field_e[var4][var5].field_E = false;
                            break L32;
                          }
                        }
                      }
                      if (3 == tb.field_a) {
                        mh.field_e[var4][var5].field_a = false;
                        mh.field_e[var4][var5].field_E = false;
                        mh.field_e[var4][var5].field_v = false;
                        mh.field_e[var4][var5].field_b = false;
                        if (-1 != (ha.field_e ^ -1)) {
                          if (ha.field_e != 1) {
                            if ((ha.field_e ^ -1) != -3) {
                              if ((ha.field_e ^ -1) != -4) {
                                if (tb.field_a != 4) {
                                  return;
                                } else {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  return;
                                }
                              } else {
                                L37: {
                                  je.field_O.d(var5, var4, -5);
                                  if (tb.field_a == 4) {
                                    mh.field_e[var4][var5].field_a = false;
                                    mh.field_e[var4][var5].field_E = false;
                                    mh.field_e[var4][var5].field_v = false;
                                    mh.field_e[var4][var5].field_b = false;
                                    uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                    break L37;
                                  } else {
                                    break L37;
                                  }
                                }
                                return;
                              }
                            } else {
                              L38: {
                                je.field_O.h(var4, 4, var5);
                                if (tb.field_a == 4) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              return;
                            }
                          } else {
                            L39: {
                              je.field_O.c(var5, var4, (byte) -48);
                              if (tb.field_a == 4) {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                            return;
                          }
                        } else {
                          L40: {
                            je.field_O.g(var5, var4, 4);
                            if (tb.field_a == 4) {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          return;
                        }
                      } else {
                        L41: {
                          if (tb.field_a == 4) {
                            mh.field_e[var4][var5].field_a = false;
                            mh.field_e[var4][var5].field_E = false;
                            mh.field_e[var4][var5].field_v = false;
                            mh.field_e[var4][var5].field_b = false;
                            uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          return;
        }
    }

    bf() {
        ((bf) this).field_b = new uj[23];
        ((bf) this).field_b[0] = (uj) (Object) new v();
        ((bf) this).field_b[1] = (uj) (Object) new pj();
        ((bf) this).field_b[2] = (uj) (Object) new te();
        ((bf) this).field_b[3] = (uj) (Object) new hl();
        ((bf) this).field_b[4] = (uj) (Object) new i();
        ((bf) this).field_b[5] = (uj) (Object) new tk();
        ((bf) this).field_b[6] = (uj) (Object) new ug();
        ((bf) this).field_b[7] = (uj) (Object) new ib();
        ((bf) this).field_b[8] = (uj) (Object) new vh();
        ((bf) this).field_b[9] = (uj) (Object) new ka();
        ((bf) this).field_b[10] = (uj) (Object) new tb();
        ((bf) this).field_b[11] = (uj) (Object) new re();
        ((bf) this).field_b[12] = (uj) (Object) new wc();
        ((bf) this).field_b[13] = (uj) (Object) new le();
        ((bf) this).field_b[14] = (uj) (Object) new pn();
        ((bf) this).field_b[15] = (uj) (Object) new sk();
        ((bf) this).field_b[16] = (uj) (Object) new rj();
        ((bf) this).field_b[17] = (uj) (Object) new mh();
        ((bf) this).field_b[18] = (uj) (Object) new mm();
        ((bf) this).field_b[19] = (uj) (Object) new aj();
        ((bf) this).field_b[20] = (uj) (Object) new ub();
        ((bf) this).field_b[21] = (uj) (Object) new li();
        ((bf) this).field_b[22] = (uj) (Object) new bn();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Alternatively, click 'Discard Results' to delete your score, progress and Achievements.";
    }
}
