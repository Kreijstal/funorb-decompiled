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

    final static void a() {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  if (aj.field_c == null) {
                    break L1;
                  } else {
                    aj.field_c.b((byte) 35);
                    break L1;
                  }
                }
                L2: {
                  if (uf.field_r == null) {
                    break L2;
                  } else {
                    uf.field_r.a((byte) -32);
                    break L2;
                  }
                }
                L3: {
                  if (null == fe.field_z) {
                    break L3;
                  } else {
                    {
                      L4: {
                        fe.field_z.b(-30821);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (aa.field_h != null) {
                    var1_int = 0;
                    L7: while (true) {
                      if (aa.field_h.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (aa.field_h[var1_int] != null) {
                            {
                              L9: {
                                aa.field_h[var1_int].b(-30821);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw lj.a((Throwable) (Object) var1_ref, "bl.J(" + 1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean h(int param0);

    abstract Object f(int param0);

    final static boolean g() {
        if (mf.field_i >= 0) {
          if (bd.field_k >= 0) {
            if (mh.field_e[ca.field_k][hf.field_t + 1].g()) {
              return true;
            } else {
              if (-80 <= sk.field_d) {
                L0: {
                  if (sk.field_d <= 80) {
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
                  if (bd.field_k < 0) {
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
                            if (sk.field_d >= -30) {
                              break L2;
                            } else {
                              if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                break L2;
                              } else {
                                if (di.field_K == -1) {
                                  return true;
                                } else {
                                  L3: {
                                    if (sk.field_d <= 30) {
                                      break L3;
                                    } else {
                                      if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                        break L3;
                                      } else {
                                        if (di.field_K != 1) {
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
                          if (sk.field_d <= 30) {
                            break L1;
                          } else {
                            if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              break L1;
                            } else {
                              if (di.field_K != 1) {
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
                    if (sk.field_d <= 80) {
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
                    if (bd.field_k < 0) {
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
                              if (sk.field_d >= -30) {
                                break L6;
                              } else {
                                if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                  break L6;
                                } else {
                                  if (di.field_K == -1) {
                                    return true;
                                  } else {
                                    L7: {
                                      if (sk.field_d <= 30) {
                                        break L7;
                                      } else {
                                        if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                          break L7;
                                        } else {
                                          if (di.field_K != 1) {
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
                            if (sk.field_d <= 30) {
                              break L5;
                            } else {
                              if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                break L5;
                              } else {
                                if (di.field_K != 1) {
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
            if (bd.field_k >= 0) {
              if (!qd.field_O[99]) {
                if (2 != rj.field_f) {
                  if (qe.field_b[4]) {
                    if (sk.field_d < -30) {
                      if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                        L8: {
                          if (sk.field_d <= 30) {
                            break L8;
                          } else {
                            if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              break L8;
                            } else {
                              if (di.field_K != 1) {
                                break L8;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        return false;
                      } else {
                        if (di.field_K == -1) {
                          return true;
                        } else {
                          L9: {
                            if (sk.field_d <= 30) {
                              break L9;
                            } else {
                              if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                break L9;
                              } else {
                                if (di.field_K != 1) {
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
                        if (sk.field_d <= 30) {
                          break L10;
                        } else {
                          if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                            break L10;
                          } else {
                            if (di.field_K != 1) {
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
            if (bd.field_k < 0) {
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
                      if (sk.field_d >= -30) {
                        break L12;
                      } else {
                        if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                          break L12;
                        } else {
                          if (di.field_K == -1) {
                            return true;
                          } else {
                            L13: {
                              if (sk.field_d <= 30) {
                                break L13;
                              } else {
                                if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                                  break L13;
                                } else {
                                  if (di.field_K != 1) {
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
                    if (sk.field_d <= 30) {
                      break L11;
                    } else {
                      if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                        break L11;
                      } else {
                        if (di.field_K != 1) {
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
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = -121;
            if (cn.a(param0, 258, param3, param1)) {
              int discarded$2 = 255;
              stackOut_3_0 = qc.c();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ea) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("bl.H(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -79 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    public static void b() {
        int var1 = 0;
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
