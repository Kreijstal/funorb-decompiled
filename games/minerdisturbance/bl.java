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
                    try {
                      L4: {
                        fe.field_z.b(-30821);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L5;
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
                            try {
                              L9: {
                                aa.field_h[var1_int].b(-30821);
                                break L9;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L10: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L10;
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
                L11: {
                  if (param0) {
                    break L11;
                  } else {
                    bl.b((byte) 56);
                    break L11;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw lj.a((Throwable) ((Object) var1_ref), "bl.J(" + param0 + ')');
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
                        if (-31 > (sk.field_d ^ -1)) {
                          if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                            if (-2 != (di.field_K ^ -1)) {
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
                        if (0 != (di.field_K ^ -1)) {
                          if (-31 > (sk.field_d ^ -1)) {
                            if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              if (-2 == (di.field_K ^ -1)) {
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
                      if (-31 > (sk.field_d ^ -1)) {
                        if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                          if (-2 != (di.field_K ^ -1)) {
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
          if (-1 >= (bd.field_k ^ -1)) {
            if (!qd.field_O[99]) {
              if (2 != rj.field_f) {
                if (qe.field_b[4]) {
                  L8: {
                    if (29 >= (sk.field_d ^ -1)) {
                      break L8;
                    } else {
                      if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                        break L8;
                      } else {
                        if (0 != (di.field_K ^ -1)) {
                          if (-31 > (sk.field_d ^ -1)) {
                            if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                              if (-2 == (di.field_K ^ -1)) {
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
                  if (-31 > (sk.field_d ^ -1)) {
                    if (mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                      if (-2 != (di.field_K ^ -1)) {
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
        int decompiledRegionSelector0 = 0;
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
            var4_int = -121 / ((-15 - param2) / 55);
            if (cn.a(param0, 258, param3, param1)) {
              stackOut_3_0 = qc.c(255);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("bl.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ea) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
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
        this.field_y = param0;
    }

    static {
        field_u = "<%0> <times> 2,500 = <%1>";
        field_z = new int[8192];
    }
}
