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
            L0: {
              var3 = MinerDisturbance.field_ab;
              if (aj.field_c == null) {
                break L0;
              } else {
                aj.field_c.b((byte) 35);
                break L0;
              }
            }
            L1: {
              if (uf.field_r == null) {
                break L1;
              } else {
                uf.field_r.a((byte) -32);
                break L1;
              }
            }
            L2: {
              if (null == fe.field_z) {
                break L2;
              } else {
                try {
                  L3: {
                    fe.field_z.b(-30821);
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L4;
                  }
                }
                break L2;
              }
            }
            if (aa.field_h != null) {
              var1 = 0;
              L5: while (true) {
                if (aa.field_h.length <= var1) {
                  if (!param0) {
                    bl.b((byte) 56);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (aa.field_h[var1] != null) {
                    try {
                      L6: {
                        aa.field_h[var1].b(-30821);
                        var1++;
                        break L6;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        var1++;
                        break L7;
                      }
                    }
                    continue L5;
                  } else {
                    var1++;
                    continue L5;
                  }
                }
              }
            } else {
              L8: {
                if (param0) {
                  break L8;
                } else {
                  bl.b((byte) 56);
                  break L8;
                }
              }
              return;
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
          if (-1 >= (bd.field_k ^ -1)) {
            if (mh.field_e[ca.field_k][hf.field_t + 1].g()) {
              return true;
            } else {
              if (-80 <= sk.field_d) {
                L0: {
                  if ((sk.field_d ^ -1) >= -81) {
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
                  if (-1 < (bd.field_k ^ -1)) {
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
                            if (29 >= (sk.field_d ^ -1)) {
                              break L2;
                            } else {
                              if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                break L2;
                              } else {
                                if (0 == (di.field_K ^ -1)) {
                                  return true;
                                } else {
                                  L3: {
                                    if (-31 <= (sk.field_d ^ -1)) {
                                      break L3;
                                    } else {
                                      if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                        break L3;
                                      } else {
                                        if (-2 != (di.field_K ^ -1)) {
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
                          if (-31 <= (sk.field_d ^ -1)) {
                            break L1;
                          } else {
                            if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              break L1;
                            } else {
                              if (-2 != (di.field_K ^ -1)) {
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
                    if ((sk.field_d ^ -1) >= -81) {
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
                    if (-1 < (bd.field_k ^ -1)) {
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
                              if (29 >= (sk.field_d ^ -1)) {
                                break L6;
                              } else {
                                if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                  break L6;
                                } else {
                                  if (0 == (di.field_K ^ -1)) {
                                    return true;
                                  } else {
                                    L7: {
                                      if (-31 <= (sk.field_d ^ -1)) {
                                        break L7;
                                      } else {
                                        if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                          break L7;
                                        } else {
                                          if (-2 != (di.field_K ^ -1)) {
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
                            if (-31 <= (sk.field_d ^ -1)) {
                              break L5;
                            } else {
                              if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                break L5;
                              } else {
                                if (-2 != (di.field_K ^ -1)) {
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
                    if (29 < (sk.field_d ^ -1)) {
                      if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                        L8: {
                          if (-31 <= (sk.field_d ^ -1)) {
                            break L8;
                          } else {
                            if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              break L8;
                            } else {
                              if (-2 != (di.field_K ^ -1)) {
                                break L8;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        return false;
                      } else {
                        if (0 == (di.field_K ^ -1)) {
                          return true;
                        } else {
                          L9: {
                            if (-31 <= (sk.field_d ^ -1)) {
                              break L9;
                            } else {
                              if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                break L9;
                              } else {
                                if (-2 != (di.field_K ^ -1)) {
                                  break L9;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      L10: {
                        if (-31 <= (sk.field_d ^ -1)) {
                          break L10;
                        } else {
                          if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                            break L10;
                          } else {
                            if (-2 != (di.field_K ^ -1)) {
                              break L10;
                            } else {
                              return true;
                            }
                          }
                        }
                      }
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
        } else {
          L11: {
            if (-1 < (bd.field_k ^ -1)) {
              break L11;
            } else {
              if (qd.field_O[99]) {
                break L11;
              } else {
                if (2 == rj.field_f) {
                  break L11;
                } else {
                  if (!qe.field_b[4]) {
                    break L11;
                  } else {
                    L12: {
                      if (29 >= (sk.field_d ^ -1)) {
                        break L12;
                      } else {
                        if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                          break L12;
                        } else {
                          if (0 == (di.field_K ^ -1)) {
                            return true;
                          } else {
                            L13: {
                              if (-31 <= (sk.field_d ^ -1)) {
                                break L13;
                              } else {
                                if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                  break L13;
                                } else {
                                  if (-2 != (di.field_K ^ -1)) {
                                    break L13;
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
                    if (-31 <= (sk.field_d ^ -1)) {
                      break L11;
                    } else {
                      if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                        break L11;
                      } else {
                        if (-2 != (di.field_K ^ -1)) {
                          break L11;
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
