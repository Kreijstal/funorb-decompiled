/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hh extends mg {
    static java.awt.Frame field_G;
    private int field_K;
    static int field_I;
    private int field_J;
    private int field_C;
    static da field_M;
    private boolean field_F;
    static sj field_N;
    static sh field_L;
    private int field_E;
    private boolean field_D;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!((hh) this).a(param3 ^ -8891, param2, param1, param0)) {
                break L1;
              } else {
                ((hh) this).a(param2, 0, param0, param1);
                ((hh) this).b(param2, -28327, param0, param1);
                StringBuilder discarded$26 = param2.append(" revert=").append(((hh) this).field_F);
                if (-2147483648 == ((hh) this).field_J) {
                  break L1;
                } else {
                  if (-2147483648 == ((hh) this).field_E) {
                    break L1;
                  } else {
                    StringBuilder discarded$27 = param2.append(" to ").append(((hh) this).field_J).append(44).append(((hh) this).field_E);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3 == -15992) {
                break L2;
              } else {
                field_G = null;
                break L2;
              }
            }
            stackOut_6_0 = (StringBuilder) param2;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("hh.TA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final void g(int param0) {
        super.g(param0);
        ((hh) this).field_A.a(((hh) this).field_v, ((hh) this).field_j, true, 0, 0);
        ((hh) this).field_J = ((hh) this).field_t;
        ((hh) this).field_E = ((hh) this).field_o;
    }

    public static void h() {
        field_M = null;
        field_N = null;
        field_G = null;
        field_L = null;
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (((hh) this).field_D) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!((hh) this).a(param3, param6, param5, param4, (byte) -79)) {
              stackOut_8_0 = var8_int;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              ((hh) this).field_h = param1;
              if (param1 != 1) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                ((hh) this).field_C = -((hh) this).field_t + (param6 - param5);
                si.field_t = (hh) this;
                ((hh) this).field_K = -param4 + param3 - ((hh) this).field_o;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("hh.VA(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((hh) this).field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hh.BB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private hh(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((hh) this).field_J = 2147483647;
        ((hh) this).field_E = 2147483647;
        try {
            ((hh) this).field_D = param8 ? true : false;
            ((hh) this).field_A = param6;
            ((hh) this).field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hh.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        var2 = param1;
        if (var2 != 32) {
          if (var2 != 160) {
            if (var2 != 95) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (var2 != 93) {
                    if (var2 != 35) {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (var2 != 192) {
                                  if (var2 != 193) {
                                    if (var2 != 194) {
                                      if (var2 != 196) {
                                        if (var2 == 195) {
                                          return 'a';
                                        } else {
                                          if (var2 != 232) {
                                            if (233 != var2) {
                                              if (234 != var2) {
                                                if (235 != var2) {
                                                  if (200 != var2) {
                                                    if (var2 != 201) {
                                                      if (var2 != 202) {
                                                        if (var2 != 203) {
                                                          if (var2 != 237) {
                                                            if (var2 != 238) {
                                                              if (var2 != 239) {
                                                                if (var2 != 205) {
                                                                  if (var2 != 206) {
                                                                    if (207 != var2) {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          L0: {
                                                                            if (var2 == 244) {
                                                                              break L0;
                                                                            } else {
                                                                              if (var2 != 246) {
                                                                                if (var2 == 245) {
                                                                                  break L0;
                                                                                } else {
                                                                                  if (var2 == 210) {
                                                                                    break L0;
                                                                                  } else {
                                                                                    if (var2 == 211) {
                                                                                      break L0;
                                                                                    } else {
                                                                                      if (var2 != 212) {
                                                                                        if (var2 == 214) {
                                                                                          break L0;
                                                                                        } else {
                                                                                          if (213 != var2) {
                                                                                            L1: {
                                                                                              if (249 == var2) {
                                                                                                break L1;
                                                                                              } else {
                                                                                                if (var2 != 250) {
                                                                                                  if (var2 == 251) {
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    if (var2 == 252) {
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if (var2 == 217) {
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        if (var2 != 218) {
                                                                                                          if (219 != var2) {
                                                                                                            if (220 == var2) {
                                                                                                              break L1;
                                                                                                            } else {
                                                                                                              if (231 != var2) {
                                                                                                                if (var2 == 199) {
                                                                                                                  return 'c';
                                                                                                                } else {
                                                                                                                  if (255 != var2) {
                                                                                                                    if (376 == var2) {
                                                                                                                      return 'y';
                                                                                                                    } else {
                                                                                                                      if (241 == var2) {
                                                                                                                        return 'n';
                                                                                                                      } else {
                                                                                                                        if (var2 != 209) {
                                                                                                                          if (var2 != 223) {
                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                          } else {
                                                                                                                            return 'b';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'n';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'u';
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          }
                                                                          return 'o';
                                                                        } else {
                                                                          return 'o';
                                                                        }
                                                                      } else {
                                                                        return 'o';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  } else {
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'i';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    } else {
                                                      return 'e';
                                                    }
                                                  } else {
                                                    return 'e';
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'e';
                                          }
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    return param1;
                  }
                } else {
                  return param1;
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '_';
        }
    }

    final static fh a() {
        if (!(null != bg.field_d)) {
            bg.field_d = new fh();
            bg.field_d.a(ql.field_Q, 48);
            bg.field_d.field_h = 2763306;
            bg.field_d.field_d = 6;
            bg.field_d.field_l = 14;
            bg.field_d.field_e = 5;
            bg.field_d.field_c = 7697781;
            bg.field_d.field_p = cl.field_T;
            bg.field_d.field_k = 0;
            bg.field_d.field_n = 4;
        }
        return bg.field_d;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((hh) this).field_A instanceof kf)) {
                    break L3;
                  } else {
                    if (!((kf) (Object) ((hh) this).field_A).field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((hh) this).field_h != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -param3 + (-((hh) this).field_C + bk.field_b);
                    var6 = -param2 + sh.field_e + -((hh) this).field_K;
                    if (var5_int != ((hh) this).field_t) {
                      break L4;
                    } else {
                      if (var6 != ((hh) this).field_o) {
                        break L4;
                      } else {
                        super.a(param0, param1, param2, param3);
                        return;
                      }
                    }
                  }
                  ((hh) this).field_o = var6;
                  ((hh) this).field_t = var5_int;
                  if (!(((hh) this).field_r instanceof hj)) {
                    break L1;
                  } else {
                    ((hj) (Object) ((hh) this).field_r).a((hh) this, 31954, param3, param2);
                    break L1;
                  }
                }
              }
              if (!((hh) this).field_F) {
                break L1;
              } else {
                L5: {
                  if (((hh) this).field_J == ((hh) this).field_t) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -((hh) this).field_t + ((hh) this).field_J;
                      stackOut_11_0 = this;
                      stackOut_11_1 = ((hh) this).field_t;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (Math.abs(var5_int) >= -3) {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (-1 >= var5_int) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = -1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L6;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L6;
                        }
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = var5_int >> 1;
                        stackIn_16_0 = stackOut_12_0;
                        stackIn_16_1 = stackOut_12_1;
                        stackIn_16_2 = stackOut_12_2;
                        break L6;
                      }
                    }
                    ((hh) this).field_t = stackIn_16_1 + stackIn_16_2;
                    break L5;
                  }
                }
                if (((hh) this).field_E != ((hh) this).field_o) {
                  L7: {
                    var5_int = -((hh) this).field_o + ((hh) this).field_E;
                    stackOut_19_0 = this;
                    stackOut_19_1 = ((hh) this).field_o;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (2 >= Math.abs(var5_int)) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (0 < var5_int) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L7;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = -1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        break L7;
                      }
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = var5_int >> 1;
                      stackIn_24_0 = stackOut_20_0;
                      stackIn_24_1 = stackOut_20_1;
                      stackIn_24_2 = stackOut_20_2;
                      break L7;
                    }
                  }
                  ((hh) this).field_o = stackIn_24_1 + stackIn_24_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("hh.FA(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new da();
        field_N = null;
    }
}
