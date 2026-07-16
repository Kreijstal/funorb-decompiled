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
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 >= 91) {
            break L0;
          } else {
            bf.a(-21);
            break L0;
          }
        }
        if (null != di.field_O) {
          var1 = (Object) (Object) di.field_O;
          synchronized (var1) {
            L1: {
              di.field_O = null;
              break L1;
            }
          }
          return;
        } else {
          return;
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
            if ((wj.field_j ^ -1) > -3) {
              return;
            } else {
              L0: {
                if (-1 < (wi.field_w ^ -1)) {
                  break L0;
                } else {
                  if (m.field_e < 0) {
                    break L0;
                  } else {
                    if ((jk.field_ab ^ -1) == -1) {
                      break L0;
                    } else {
                      L1: {
                        var2 = nk.field_w - -li.field_c;
                        var3 = db.field_d + gb.field_e;
                        var4 = var2 / 32;
                        var5 = var3 / 32;
                        qm.field_f = true;
                        di.field_X = di.field_X + 1;
                        if (-2 == (tb.field_a ^ -1)) {
                          mh.field_e[var4][var5].field_U = gd.field_x;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        if (2 != tb.field_a) {
                          break L2;
                        } else {
                          if (0 != bc.field_a) {
                            L3: {
                              if (-5 == (bc.field_a ^ -1)) {
                                mh.field_e[var4][var5].field_b = true;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            if (2 != bc.field_a) {
                              L4: {
                                if (bc.field_a == 3) {
                                  mh.field_e[var4][var5].field_a = true;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_E = true;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              if (bc.field_a != 1) {
                                break L2;
                              } else {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = false;
                                if (3 == tb.field_a) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  if (-1 == (ha.field_e ^ -1)) {
                                    L5: {
                                      je.field_O.g(var5, var4, 4);
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
                                  } else {
                                    if (ha.field_e != 1) {
                                      if ((ha.field_e ^ -1) == -3) {
                                        L6: {
                                          je.field_O.h(var4, 4, var5);
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
                                      } else {
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
                                          L7: {
                                            je.field_O.d(var5, var4, -5);
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
                                      }
                                    } else {
                                      L8: {
                                        je.field_O.c(var5, var4, (byte) -48);
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
                                    if (tb.field_a == 4) {
                                      mh.field_e[var4][var5].field_a = false;
                                      mh.field_e[var4][var5].field_E = false;
                                      mh.field_e[var4][var5].field_v = false;
                                      mh.field_e[var4][var5].field_b = false;
                                      uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  return;
                                }
                              }
                            } else {
                              L10: {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = true;
                                mh.field_e[var4][var5].field_E = false;
                                if (bc.field_a == 3) {
                                  mh.field_e[var4][var5].field_a = true;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_E = true;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: {
                                if (bc.field_a != 1) {
                                  break L11;
                                } else {
                                  mh.field_e[var4][var5].field_a = true;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  break L11;
                                }
                              }
                              if (3 == tb.field_a) {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                if (-1 == (ha.field_e ^ -1)) {
                                  L12: {
                                    je.field_O.g(var5, var4, 4);
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
                                } else {
                                  if (ha.field_e != 1) {
                                    if ((ha.field_e ^ -1) == -3) {
                                      L13: {
                                        je.field_O.h(var4, 4, var5);
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
                                    } else {
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
                                        L14: {
                                          je.field_O.d(var5, var4, -5);
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
                                    }
                                  } else {
                                    L15: {
                                      je.field_O.c(var5, var4, (byte) -48);
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
                                  if (tb.field_a == 4) {
                                    mh.field_e[var4][var5].field_a = false;
                                    mh.field_e[var4][var5].field_E = false;
                                    mh.field_e[var4][var5].field_v = false;
                                    mh.field_e[var4][var5].field_b = false;
                                    uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                return;
                              }
                            }
                          } else {
                            L17: {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              if (-5 == (bc.field_a ^ -1)) {
                                mh.field_e[var4][var5].field_b = true;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (2 != bc.field_a) {
                                break L18;
                              } else {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = true;
                                mh.field_e[var4][var5].field_E = false;
                                break L18;
                              }
                            }
                            L19: {
                              if (bc.field_a == 3) {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = true;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (bc.field_a != 1) {
                                break L20;
                              } else {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = false;
                                break L20;
                              }
                            }
                            if (3 == tb.field_a) {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              if (-1 == (ha.field_e ^ -1)) {
                                L21: {
                                  je.field_O.g(var5, var4, 4);
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
                              } else {
                                if (ha.field_e != 1) {
                                  if ((ha.field_e ^ -1) == -3) {
                                    L22: {
                                      je.field_O.h(var4, 4, var5);
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
                                  } else {
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
                                      L23: {
                                        je.field_O.d(var5, var4, -5);
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
                                  }
                                } else {
                                  L24: {
                                    je.field_O.c(var5, var4, (byte) -48);
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
                            } else {
                              L25: {
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
                          }
                        }
                      }
                      if (3 == tb.field_a) {
                        mh.field_e[var4][var5].field_a = false;
                        mh.field_e[var4][var5].field_E = false;
                        mh.field_e[var4][var5].field_v = false;
                        mh.field_e[var4][var5].field_b = false;
                        if (-1 == (ha.field_e ^ -1)) {
                          L26: {
                            je.field_O.g(var5, var4, 4);
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
                        } else {
                          if (ha.field_e != 1) {
                            if ((ha.field_e ^ -1) == -3) {
                              L27: {
                                je.field_O.h(var4, 4, var5);
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
                            } else {
                              if ((ha.field_e ^ -1) != -4) {
                                if (tb.field_a == 4) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  break L0;
                                } else {
                                  return;
                                }
                              } else {
                                L28: {
                                  je.field_O.d(var5, var4, -5);
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
                            }
                          } else {
                            L29: {
                              je.field_O.c(var5, var4, (byte) -48);
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
                        }
                      } else {
                        L30: {
                          if (tb.field_a == 4) {
                            mh.field_e[var4][var5].field_a = false;
                            mh.field_e[var4][var5].field_E = false;
                            mh.field_e[var4][var5].field_v = false;
                            mh.field_e[var4][var5].field_b = false;
                            uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          L31: {
            if (-1 == (tb.field_a ^ -1)) {
              break L31;
            } else {
              if ((wj.field_j ^ -1) > -3) {
                break L31;
              } else {
                L32: {
                  if (-1 < (wi.field_w ^ -1)) {
                    break L32;
                  } else {
                    if (m.field_e < 0) {
                      break L32;
                    } else {
                      if ((jk.field_ab ^ -1) == -1) {
                        break L32;
                      } else {
                        L33: {
                          var2 = nk.field_w - -li.field_c;
                          var3 = db.field_d + gb.field_e;
                          var4 = var2 / 32;
                          var5 = var3 / 32;
                          qm.field_f = true;
                          di.field_X = di.field_X + 1;
                          if (-2 == (tb.field_a ^ -1)) {
                            mh.field_e[var4][var5].field_U = gd.field_x;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        L34: {
                          if (2 != tb.field_a) {
                            break L34;
                          } else {
                            L35: {
                              if (0 != bc.field_a) {
                                break L35;
                              } else {
                                mh.field_e[var4][var5].field_a = false;
                                mh.field_e[var4][var5].field_E = false;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_b = false;
                                break L35;
                              }
                            }
                            L36: {
                              if (-5 == (bc.field_a ^ -1)) {
                                mh.field_e[var4][var5].field_b = true;
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            L37: {
                              if (2 != bc.field_a) {
                                break L37;
                              } else {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = true;
                                mh.field_e[var4][var5].field_E = false;
                                break L37;
                              }
                            }
                            L38: {
                              if (bc.field_a == 3) {
                                mh.field_e[var4][var5].field_a = true;
                                mh.field_e[var4][var5].field_v = false;
                                mh.field_e[var4][var5].field_E = true;
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            if (bc.field_a != 1) {
                              break L34;
                            } else {
                              mh.field_e[var4][var5].field_a = true;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_E = false;
                              break L34;
                            }
                          }
                        }
                        if (3 == tb.field_a) {
                          mh.field_e[var4][var5].field_a = false;
                          mh.field_e[var4][var5].field_E = false;
                          mh.field_e[var4][var5].field_v = false;
                          mh.field_e[var4][var5].field_b = false;
                          if (-1 == (ha.field_e ^ -1)) {
                            L39: {
                              je.field_O.g(var5, var4, 4);
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
                          } else {
                            if (ha.field_e != 1) {
                              if ((ha.field_e ^ -1) == -3) {
                                L40: {
                                  je.field_O.h(var4, 4, var5);
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
                              } else {
                                if ((ha.field_e ^ -1) != -4) {
                                  if (tb.field_a == 4) {
                                    mh.field_e[var4][var5].field_a = false;
                                    mh.field_e[var4][var5].field_E = false;
                                    mh.field_e[var4][var5].field_v = false;
                                    mh.field_e[var4][var5].field_b = false;
                                    uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                    break L32;
                                  } else {
                                    return;
                                  }
                                } else {
                                  L41: {
                                    je.field_O.d(var5, var4, -5);
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
                              }
                            } else {
                              L42: {
                                je.field_O.c(var5, var4, (byte) -48);
                                if (tb.field_a == 4) {
                                  mh.field_e[var4][var5].field_a = false;
                                  mh.field_e[var4][var5].field_E = false;
                                  mh.field_e[var4][var5].field_v = false;
                                  mh.field_e[var4][var5].field_b = false;
                                  uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              return;
                            }
                          }
                        } else {
                          L43: {
                            if (tb.field_a == 4) {
                              mh.field_e[var4][var5].field_a = false;
                              mh.field_e[var4][var5].field_E = false;
                              mh.field_e[var4][var5].field_v = false;
                              mh.field_e[var4][var5].field_b = false;
                              uf.field_p[jf.b((byte) 100)] = new gf(var4, var5, om.field_g);
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                return;
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
