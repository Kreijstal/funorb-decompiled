/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class bl extends al {
    static String field_u;
    int field_y;
    static ea field_x;
    static ea field_w;
    static int[] field_z;
    static ud[] field_v;

    final static void a(boolean param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = MinerDisturbance.field_ab;
                        if (aj.field_c == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        aj.field_c.b((byte) 35);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (uf.field_r == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        uf.field_r.a((byte) -32);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null == fe.field_z) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            fe.field_z.b(-30821);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (aa.field_h != null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        if (param0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        bl.b((byte) 56);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        var1 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (aa.field_h.length <= var1) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (aa.field_h[var1] != null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            aa.field_h[var1].b(-30821);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 18: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 20: {
                        if (!param0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        return;
                    }
                    case 22: {
                        bl.b((byte) 56);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean h(int param0);

    abstract Object f(int param0);

    final static boolean g(int param0) {
        if (mf.field_i >= param0) {
          if (-1 <= bd.field_k) {
            if (mh.field_e[ca.field_k][hf.field_t + 1].g()) {
              return true;
            } else {
              if (-80 <= sk.field_d) {
                L0: {
                  if (sk.field_d >= -81) {
                    break L0;
                  } else {
                    if (!mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                      break L0;
                    } else {
                      return true;
                    }
                  }
                }
                L1: {
                  if (-1 > bd.field_k) {
                    break L1;
                  } else {
                    if (qd.field_O[99]) {
                      break L1;
                    } else {
                      if (2 == rj.field_f) {
                        break L1;
                      } else {
                        if (!qe.field_b[4]) {
                          break L1;
                        } else {
                          L2: {
                            if (29 >= sk.field_d) {
                              break L2;
                            } else {
                              if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                break L2;
                              } else {
                                if (0 == di.field_K) {
                                  return true;
                                } else {
                                  L3: {
                                    if (-31 <= sk.field_d) {
                                      break L3;
                                    } else {
                                      if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                        break L3;
                                      } else {
                                        if (-2 != di.field_K) {
                                          break L3;
                                        } else {
                                          return true;
                                        }
                                      }
                                    }
                                  }
                                  return false;
                                }
                              }
                            }
                          }
                          if (-31 <= sk.field_d) {
                            break L1;
                          } else {
                            if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              break L1;
                            } else {
                              if (-2 != di.field_K) {
                                break L1;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return false;
              } else {
                if (mh.field_e[ca.field_k - 1][hf.field_t + 1].g()) {
                  return true;
                } else {
                  L4: {
                    if (sk.field_d >= -81) {
                      break L4;
                    } else {
                      if (!mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                        break L4;
                      } else {
                        return true;
                      }
                    }
                  }
                  L5: {
                    if (-1 > bd.field_k) {
                      break L5;
                    } else {
                      if (qd.field_O[99]) {
                        break L5;
                      } else {
                        if (2 == rj.field_f) {
                          break L5;
                        } else {
                          if (!qe.field_b[4]) {
                            break L5;
                          } else {
                            L6: {
                              if (29 >= sk.field_d) {
                                break L6;
                              } else {
                                if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                  break L6;
                                } else {
                                  if (0 == di.field_K) {
                                    return true;
                                  } else {
                                    L7: {
                                      if (-31 <= sk.field_d) {
                                        break L7;
                                      } else {
                                        if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                          break L7;
                                        } else {
                                          if (-2 != di.field_K) {
                                            break L7;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                    return false;
                                  }
                                }
                              }
                            }
                            if (-31 <= sk.field_d) {
                              break L5;
                            } else {
                              if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                break L5;
                              } else {
                                if (-2 != di.field_K) {
                                  break L5;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return false;
                }
              }
            }
          } else {
            if (-1 >= (bd.field_k ^ -1)) {
              if (!qd.field_O[99]) {
                if (2 != rj.field_f) {
                  if (qe.field_b[4]) {
                    if (29 < sk.field_d) {
                      if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                        if (-31 > sk.field_d) {
                          if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                            if (-2 != di.field_K) {
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        if (0 != di.field_K) {
                          if (-31 > sk.field_d) {
                            if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              if (-2 == di.field_K) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              return false;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          return true;
                        }
                      }
                    } else {
                      if (-31 < sk.field_d) {
                        if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                          if (-2 != di.field_K) {
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          if (-1 >= bd.field_k) {
            if (!qd.field_O[99]) {
              if (2 != rj.field_f) {
                if (qe.field_b[4]) {
                  L8: {
                    if (29 <= sk.field_d) {
                      break L8;
                    } else {
                      if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                        break L8;
                      } else {
                        if (0 != di.field_K) {
                          if (-31 < sk.field_d) {
                            if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              if (-2 == di.field_K) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              return false;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  if (-31 < sk.field_d) {
                    if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                      if (-2 != di.field_K) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static ea a(int param0, bj param1, byte param2, int param3) {
        int var4 = 0;
        var4 = -121 / ((-15 - param2) / 55);
        if (!cn.a(param0, 258, param3, param1)) {
          return null;
        } else {
          return qc.c(255);
        }
    }

    public static void b(byte param0) {
        int var1 = 35 % ((24 - param0) / 34);
        field_w = null;
        field_z = null;
        field_u = null;
        field_v = null;
        field_x = null;
    }

    bl(int param0) {
        ((bl) this).field_y = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "<%0> <times> 2,500 = <%1>";
        field_z = new int[8192];
    }
}
