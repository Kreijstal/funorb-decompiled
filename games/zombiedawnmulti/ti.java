/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ti extends id {
    int field_L;
    static int field_Y;
    private int field_T;
    private boolean field_R;
    int field_K;
    static int field_J;
    static String[] field_M;
    int field_O;
    int field_P;
    static String field_H;
    int field_S;
    int field_G;
    uj field_U;
    static int field_I;
    int field_N;
    int field_bb;
    static String field_Z;
    int field_X;
    static int field_W;
    int field_V;
    int field_F;
    int field_ab;
    int field_Q;

    final void j(int param0) {
        ((ti) this).field_G = param0;
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = ((ti) this).field_z >> 16;
        if (param1) {
          var5 = ((ti) this).field_E >> 16;
          if (-7 + (var4 - -24) > param0) {
            if (7 + var4 - 24 < param0) {
              if (param2 > -48 + var5 + 5) {
                if (var5 + 2 <= param2) {
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
          return true;
        }
    }

    void f(byte param0) {
        L0: {
          if (((ti) this).field_G > 0) {
            ((ti) this).field_G = ((ti) this).field_G - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (-22 == ((ti) this).field_K) {
          ((ti) this).field_N = ((ti) this).field_N - 4;
          if (-1 == ((ti) this).field_N) {
            ((ti) this).a(true);
            ((ti) this).a(-4564);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            if (param0 <= -79) {
              break L1;
            } else {
              field_W = 92;
              break L1;
            }
          }
          return;
        }
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        if (param1 != 2) {
          return;
        } else {
          L0: {
            var3 = 600;
            if (!(this instanceof gm)) {
              break L0;
            } else {
              var3 = var3 * 2;
              break L0;
            }
          }
          ((ti) this).field_G = op.field_m.a((byte) 32, param0, var3);
          return;
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -115 / ((param0 - -53) / 59);
            int discarded$2 = 10;
            stackOut_0_0 = ng.a(-49, true, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ti.MA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void i(int param0) {
        ((ti) this).field_E = ((ti) this).field_E + ((ti) this).field_S;
        ((ti) this).field_z = ((ti) this).field_z + ((ti) this).field_X;
        if (param0 != 5197) {
            ((ti) this).c(20, -102);
        }
    }

    void b(int param0, int param1) {
        if (((ti) this).field_K == 32) {
          return;
        } else {
          if (20 != ((ti) this).field_K) {
            ((ti) this).field_Q = 0;
            ((ti) this).field_ab = 0;
            ((ti) this).field_K = param0;
            if (param0 != 21) {
              if (param1 != -27655) {
                field_Z = null;
                return;
              } else {
                return;
              }
            } else {
              ((ti) this).a(-4564);
              ((ti) this).field_N = 256;
              if (param1 != -27655) {
                field_Z = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 18) {
              ((ti) this).field_Q = 0;
              ((ti) this).field_ab = 0;
              ((ti) this).field_K = param0;
              if (param0 == 21) {
                ((ti) this).a(-4564);
                ((ti) this).field_N = 256;
                if (param1 == -27655) {
                  return;
                } else {
                  field_Z = null;
                  return;
                }
              } else {
                if (param1 != -27655) {
                  field_Z = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    ti(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        ((ti) this).field_U = null;
        ((ti) this).field_K = !(this instanceof gm) ? 4 : 0;
        ((ti) this).field_F = 1 != hp.a((byte) 21, g.field_a, 2) ? 1 : 3;
        ((ti) this).field_ab = 0;
        ((ti) this).field_Q = 0;
        ((ti) this).field_bb = param3;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -88 % ((param3 - -32) / 57);
        ((ti) this).field_R = false;
        ((ti) this).field_z = param0;
        ((ti) this).field_O = param5;
        ((ti) this).field_P = param2;
        ((ti) this).field_E = param1;
        ((ti) this).d(6, param4);
    }

    final boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_299_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_297_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        if (param0 < -69) {
          L0: {
            var2 = ((ti) this).field_O << 16;
            var3 = ((ti) this).field_P << 16;
            if (((ti) this).field_X != 0) {
              break L0;
            } else {
              if (((ti) this).field_S != 0) {
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((ti) this).field_X != 0) {
            if (((ti) this).field_X <= 0) {
              L1: {
                if (((ti) this).field_X >= 0) {
                  break L1;
                } else {
                  if (~((ti) this).field_z <= ~var2) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var4 = 1;
                        if (((ti) this).field_S == 0) {
                          break L3;
                        } else {
                          L4: {
                            if (((ti) this).field_S <= 0) {
                              break L4;
                            } else {
                              if (((ti) this).field_E > var3) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (((ti) this).field_S >= 0) {
                              break L5;
                            } else {
                              if (~var3 >= ~((ti) this).field_E) {
                                break L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_217_0 = 0;
                          stackIn_218_0 = stackOut_217_0;
                          break L2;
                        }
                      }
                      stackOut_216_0 = 1;
                      stackIn_218_0 = stackOut_216_0;
                      break L2;
                    }
                    L6: {
                      var5 = stackIn_218_0;
                      if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                        break L6;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L6;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (var4 == 0) {
                          break L8;
                        } else {
                          if (var5 == 0) {
                            ((ti) this).field_X = 0;
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var4 != 0) {
                          break L9;
                        } else {
                          if (var5 == 0) {
                            break L9;
                          } else {
                            ((ti) this).field_S = 0;
                            break L7;
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L7;
                      } else {
                        if (var5 != 0) {
                          ((ti) this).field_E = ((ti) this).field_P << 16;
                          ((ti) this).field_z = ((ti) this).field_O << 16;
                          if (((ti) this).field_R) {
                            ((ti) this).field_R = false;
                            ((ti) this).field_O = ((ti) this).field_V;
                            ((ti) this).field_P = ((ti) this).field_L;
                            ((ti) this).d(6, ((ti) this).field_T);
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              var4 = 0;
              if (((ti) this).field_S != 0) {
                if (((ti) this).field_S <= 0) {
                  L10: {
                    if (((ti) this).field_S >= 0) {
                      break L10;
                    } else {
                      if (~var3 >= ~((ti) this).field_E) {
                        break L10;
                      } else {
                        L11: {
                          var5 = 1;
                          if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                            break L11;
                          } else {
                            if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                              break L11;
                            } else {
                              var4 = 1;
                              var5 = 1;
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var4 == 0) {
                            L13: {
                              if (var4 != 0) {
                                break L13;
                              } else {
                                if (var5 == 0) {
                                  break L13;
                                } else {
                                  ((ti) this).field_S = 0;
                                  return false;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L12;
                            } else {
                              if (var5 != 0) {
                                ((ti) this).field_E = ((ti) this).field_P << 16;
                                ((ti) this).field_z = ((ti) this).field_O << 16;
                                if (((ti) this).field_R) {
                                  ((ti) this).field_R = false;
                                  ((ti) this).field_O = ((ti) this).field_V;
                                  ((ti) this).field_P = ((ti) this).field_L;
                                  ((ti) this).d(6, ((ti) this).field_T);
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                return false;
                              }
                            }
                          } else {
                            if (var5 == 0) {
                              ((ti) this).field_X = 0;
                              break L12;
                            } else {
                              L14: {
                                L15: {
                                  if (var4 != 0) {
                                    break L15;
                                  } else {
                                    if (var5 == 0) {
                                      break L15;
                                    } else {
                                      ((ti) this).field_S = 0;
                                      break L14;
                                    }
                                  }
                                }
                                if (var4 == 0) {
                                  break L14;
                                } else {
                                  if (var5 != 0) {
                                    ((ti) this).field_E = ((ti) this).field_P << 16;
                                    ((ti) this).field_z = ((ti) this).field_O << 16;
                                    if (((ti) this).field_R) {
                                      ((ti) this).field_R = false;
                                      ((ti) this).field_O = ((ti) this).field_V;
                                      ((ti) this).field_P = ((ti) this).field_L;
                                      ((ti) this).d(6, ((ti) this).field_T);
                                      return false;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              return false;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  L16: {
                    var5 = 0;
                    if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                      break L16;
                    } else {
                      if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                        break L16;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (var4 == 0) {
                      L18: {
                        if (var4 != 0) {
                          break L18;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            ((ti) this).field_S = 0;
                            return false;
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L17;
                      } else {
                        if (var5 != 0) {
                          ((ti) this).field_E = ((ti) this).field_P << 16;
                          ((ti) this).field_z = ((ti) this).field_O << 16;
                          if (((ti) this).field_R) {
                            ((ti) this).field_R = false;
                            ((ti) this).field_O = ((ti) this).field_V;
                            ((ti) this).field_P = ((ti) this).field_L;
                            ((ti) this).d(6, ((ti) this).field_T);
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          return false;
                        }
                      }
                    } else {
                      if (var5 == 0) {
                        ((ti) this).field_X = 0;
                        break L17;
                      } else {
                        L19: {
                          if (var4 != 0) {
                            break L19;
                          } else {
                            if (var5 == 0) {
                              break L19;
                            } else {
                              ((ti) this).field_S = 0;
                              return false;
                            }
                          }
                        }
                        if (var4 == 0) {
                          return false;
                        } else {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 16;
                            ((ti) this).field_z = ((ti) this).field_O << 16;
                            if (((ti) this).field_R) {
                              ((ti) this).field_R = false;
                              ((ti) this).field_O = ((ti) this).field_V;
                              ((ti) this).field_P = ((ti) this).field_L;
                              ((ti) this).d(6, ((ti) this).field_T);
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (((ti) this).field_E <= var3) {
                    L20: {
                      L21: {
                        if (((ti) this).field_S >= 0) {
                          break L21;
                        } else {
                          if (~var3 >= ~((ti) this).field_E) {
                            break L21;
                          } else {
                            stackOut_297_0 = 1;
                            stackIn_299_0 = stackOut_297_0;
                            break L20;
                          }
                        }
                      }
                      stackOut_298_0 = 0;
                      stackIn_299_0 = stackOut_298_0;
                      break L20;
                    }
                    L22: {
                      var5 = stackIn_299_0;
                      if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                        break L22;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L22;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L22;
                        }
                      }
                    }
                    L23: {
                      L24: {
                        if (var4 == 0) {
                          break L24;
                        } else {
                          if (var5 == 0) {
                            ((ti) this).field_X = 0;
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L25: {
                        if (var4 != 0) {
                          break L25;
                        } else {
                          if (var5 == 0) {
                            break L25;
                          } else {
                            ((ti) this).field_S = 0;
                            break L23;
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L23;
                      } else {
                        if (var5 != 0) {
                          ((ti) this).field_E = ((ti) this).field_P << 16;
                          ((ti) this).field_z = ((ti) this).field_O << 16;
                          if (((ti) this).field_R) {
                            ((ti) this).field_R = false;
                            ((ti) this).field_O = ((ti) this).field_V;
                            ((ti) this).field_P = ((ti) this).field_L;
                            ((ti) this).d(6, ((ti) this).field_T);
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                    return false;
                  } else {
                    L26: {
                      var5 = 1;
                      if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                        break L26;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L26;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (var4 == 0) {
                        L28: {
                          if (var4 != 0) {
                            break L28;
                          } else {
                            if (var5 == 0) {
                              break L28;
                            } else {
                              ((ti) this).field_S = 0;
                              return false;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L27;
                        } else {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 16;
                            ((ti) this).field_z = ((ti) this).field_O << 16;
                            if (((ti) this).field_R) {
                              ((ti) this).field_R = false;
                              ((ti) this).field_O = ((ti) this).field_V;
                              ((ti) this).field_P = ((ti) this).field_L;
                              ((ti) this).d(6, ((ti) this).field_T);
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            return false;
                          }
                        }
                      } else {
                        if (var5 == 0) {
                          ((ti) this).field_X = 0;
                          break L27;
                        } else {
                          L29: {
                            L30: {
                              if (var4 != 0) {
                                break L30;
                              } else {
                                if (var5 == 0) {
                                  break L30;
                                } else {
                                  ((ti) this).field_S = 0;
                                  break L29;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L29;
                            } else {
                              if (var5 != 0) {
                                ((ti) this).field_E = ((ti) this).field_P << 16;
                                ((ti) this).field_z = ((ti) this).field_O << 16;
                                if (((ti) this).field_R) {
                                  ((ti) this).field_R = false;
                                  ((ti) this).field_O = ((ti) this).field_V;
                                  ((ti) this).field_P = ((ti) this).field_L;
                                  ((ti) this).d(6, ((ti) this).field_T);
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                break L29;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                    return false;
                  }
                }
              } else {
                L31: {
                  var5 = 1;
                  if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                    break L31;
                  } else {
                    if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                      break L31;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L31;
                    }
                  }
                }
                L32: {
                  if (var4 == 0) {
                    L33: {
                      if (var4 != 0) {
                        break L33;
                      } else {
                        if (var5 == 0) {
                          break L33;
                        } else {
                          ((ti) this).field_S = 0;
                          return false;
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L32;
                    } else {
                      if (var5 != 0) {
                        ((ti) this).field_E = ((ti) this).field_P << 16;
                        ((ti) this).field_z = ((ti) this).field_O << 16;
                        if (((ti) this).field_R) {
                          ((ti) this).field_R = false;
                          ((ti) this).field_O = ((ti) this).field_V;
                          ((ti) this).field_P = ((ti) this).field_L;
                          ((ti) this).d(6, ((ti) this).field_T);
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    if (var5 == 0) {
                      ((ti) this).field_X = 0;
                      break L32;
                    } else {
                      L34: {
                        L35: {
                          if (var4 != 0) {
                            break L35;
                          } else {
                            if (var5 == 0) {
                              break L35;
                            } else {
                              ((ti) this).field_S = 0;
                              break L34;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L34;
                        } else {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 16;
                            ((ti) this).field_z = ((ti) this).field_O << 16;
                            if (((ti) this).field_R) {
                              ((ti) this).field_R = false;
                              ((ti) this).field_O = ((ti) this).field_V;
                              ((ti) this).field_P = ((ti) this).field_L;
                              ((ti) this).d(6, ((ti) this).field_T);
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            break L34;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              }
            } else {
              if (((ti) this).field_z <= var2) {
                L36: {
                  L37: {
                    if (((ti) this).field_X >= 0) {
                      break L37;
                    } else {
                      if (~((ti) this).field_z <= ~var2) {
                        break L37;
                      } else {
                        stackOut_178_0 = 1;
                        stackIn_180_0 = stackOut_178_0;
                        break L36;
                      }
                    }
                  }
                  stackOut_179_0 = 0;
                  stackIn_180_0 = stackOut_179_0;
                  break L36;
                }
                L38: {
                  L39: {
                    var4 = stackIn_180_0;
                    if (((ti) this).field_S == 0) {
                      break L39;
                    } else {
                      L40: {
                        if (((ti) this).field_S <= 0) {
                          break L40;
                        } else {
                          if (((ti) this).field_E > var3) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      L41: {
                        if (((ti) this).field_S >= 0) {
                          break L41;
                        } else {
                          if (~var3 >= ~((ti) this).field_E) {
                            break L41;
                          } else {
                            break L39;
                          }
                        }
                      }
                      stackOut_188_0 = 0;
                      stackIn_189_0 = stackOut_188_0;
                      break L38;
                    }
                  }
                  stackOut_187_0 = 1;
                  stackIn_189_0 = stackOut_187_0;
                  break L38;
                }
                L42: {
                  var5 = stackIn_189_0;
                  if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                    break L42;
                  } else {
                    if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                      break L42;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L42;
                    }
                  }
                }
                L43: {
                  L44: {
                    if (var4 == 0) {
                      break L44;
                    } else {
                      if (var5 == 0) {
                        ((ti) this).field_X = 0;
                        break L43;
                      } else {
                        break L44;
                      }
                    }
                  }
                  L45: {
                    if (var4 != 0) {
                      break L45;
                    } else {
                      if (var5 == 0) {
                        break L45;
                      } else {
                        ((ti) this).field_S = 0;
                        break L43;
                      }
                    }
                  }
                  if (var4 == 0) {
                    break L43;
                  } else {
                    if (var5 != 0) {
                      ((ti) this).field_E = ((ti) this).field_P << 16;
                      ((ti) this).field_z = ((ti) this).field_O << 16;
                      if (((ti) this).field_R) {
                        ((ti) this).field_R = false;
                        ((ti) this).field_O = ((ti) this).field_V;
                        ((ti) this).field_P = ((ti) this).field_L;
                        ((ti) this).d(6, ((ti) this).field_T);
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      break L43;
                    }
                  }
                }
                return false;
              } else {
                L46: {
                  L47: {
                    var4 = 1;
                    if (((ti) this).field_S == 0) {
                      break L47;
                    } else {
                      if (((ti) this).field_S <= 0) {
                        L48: {
                          if (((ti) this).field_S >= 0) {
                            break L48;
                          } else {
                            if (~var3 >= ~((ti) this).field_E) {
                              break L48;
                            } else {
                              L49: {
                                var5 = 1;
                                if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                                  break L49;
                                } else {
                                  if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                                    break L49;
                                  } else {
                                    var4 = 1;
                                    var5 = 1;
                                    break L49;
                                  }
                                }
                              }
                              L50: {
                                L51: {
                                  if (var4 == 0) {
                                    break L51;
                                  } else {
                                    if (var5 == 0) {
                                      ((ti) this).field_X = 0;
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                L52: {
                                  if (var4 != 0) {
                                    break L52;
                                  } else {
                                    if (var5 == 0) {
                                      break L52;
                                    } else {
                                      ((ti) this).field_S = 0;
                                      break L50;
                                    }
                                  }
                                }
                                if (var4 == 0) {
                                  break L50;
                                } else {
                                  if (var5 != 0) {
                                    ((ti) this).field_E = ((ti) this).field_P << 16;
                                    ((ti) this).field_z = ((ti) this).field_O << 16;
                                    if (((ti) this).field_R) {
                                      ((ti) this).field_R = false;
                                      ((ti) this).field_O = ((ti) this).field_V;
                                      ((ti) this).field_P = ((ti) this).field_L;
                                      ((ti) this).d(6, ((ti) this).field_T);
                                      return false;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              return false;
                            }
                          }
                        }
                        stackOut_157_0 = 0;
                        stackIn_158_0 = stackOut_157_0;
                        break L46;
                      } else {
                        if (((ti) this).field_E > var3) {
                          break L47;
                        } else {
                          L53: {
                            L54: {
                              if (((ti) this).field_S >= 0) {
                                break L54;
                              } else {
                                if (~var3 >= ~((ti) this).field_E) {
                                  break L54;
                                } else {
                                  stackOut_116_0 = 1;
                                  stackIn_118_0 = stackOut_116_0;
                                  break L53;
                                }
                              }
                            }
                            stackOut_117_0 = 0;
                            stackIn_118_0 = stackOut_117_0;
                            break L53;
                          }
                          L55: {
                            var5 = stackIn_118_0;
                            if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                              break L55;
                            } else {
                              if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                                break L55;
                              } else {
                                var4 = 1;
                                var5 = 1;
                                break L55;
                              }
                            }
                          }
                          L56: {
                            L57: {
                              if (var4 == 0) {
                                break L57;
                              } else {
                                if (var5 == 0) {
                                  ((ti) this).field_X = 0;
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            L58: {
                              if (var4 != 0) {
                                break L58;
                              } else {
                                if (var5 == 0) {
                                  break L58;
                                } else {
                                  ((ti) this).field_S = 0;
                                  break L56;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L56;
                            } else {
                              if (var5 != 0) {
                                ((ti) this).field_E = ((ti) this).field_P << 16;
                                ((ti) this).field_z = ((ti) this).field_O << 16;
                                if (((ti) this).field_R) {
                                  ((ti) this).field_R = false;
                                  ((ti) this).field_O = ((ti) this).field_V;
                                  ((ti) this).field_P = ((ti) this).field_L;
                                  ((ti) this).d(6, ((ti) this).field_T);
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                break L56;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                  }
                  stackOut_156_0 = 1;
                  stackIn_158_0 = stackOut_156_0;
                  break L46;
                }
                L59: {
                  var5 = stackIn_158_0;
                  if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                    break L59;
                  } else {
                    if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                      break L59;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L59;
                    }
                  }
                }
                L60: {
                  L61: {
                    if (var4 == 0) {
                      break L61;
                    } else {
                      if (var5 == 0) {
                        ((ti) this).field_X = 0;
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  L62: {
                    if (var4 != 0) {
                      break L62;
                    } else {
                      if (var5 == 0) {
                        break L62;
                      } else {
                        ((ti) this).field_S = 0;
                        break L60;
                      }
                    }
                  }
                  if (var4 == 0) {
                    break L60;
                  } else {
                    if (var5 != 0) {
                      ((ti) this).field_E = ((ti) this).field_P << 16;
                      ((ti) this).field_z = ((ti) this).field_O << 16;
                      if (((ti) this).field_R) {
                        ((ti) this).field_R = false;
                        ((ti) this).field_O = ((ti) this).field_V;
                        ((ti) this).field_P = ((ti) this).field_L;
                        ((ti) this).d(6, ((ti) this).field_T);
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      break L60;
                    }
                  }
                }
                return false;
              }
            }
          } else {
            L63: {
              L64: {
                var4 = 1;
                if (((ti) this).field_S == 0) {
                  break L64;
                } else {
                  if (((ti) this).field_S <= 0) {
                    L65: {
                      if (((ti) this).field_S >= 0) {
                        break L65;
                      } else {
                        if (~var3 >= ~((ti) this).field_E) {
                          break L65;
                        } else {
                          L66: {
                            var5 = 1;
                            if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                              break L66;
                            } else {
                              if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                                break L66;
                              } else {
                                var4 = 1;
                                var5 = 1;
                                break L66;
                              }
                            }
                          }
                          L67: {
                            L68: {
                              if (var4 == 0) {
                                break L68;
                              } else {
                                if (var5 == 0) {
                                  ((ti) this).field_X = 0;
                                  break L67;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            L69: {
                              if (var4 != 0) {
                                break L69;
                              } else {
                                if (var5 == 0) {
                                  break L69;
                                } else {
                                  ((ti) this).field_S = 0;
                                  break L67;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L67;
                            } else {
                              if (var5 != 0) {
                                ((ti) this).field_E = ((ti) this).field_P << 16;
                                ((ti) this).field_z = ((ti) this).field_O << 16;
                                if (((ti) this).field_R) {
                                  ((ti) this).field_R = false;
                                  ((ti) this).field_O = ((ti) this).field_V;
                                  ((ti) this).field_P = ((ti) this).field_L;
                                  ((ti) this).d(6, ((ti) this).field_T);
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                break L67;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                    stackOut_90_0 = 0;
                    stackIn_91_0 = stackOut_90_0;
                    break L63;
                  } else {
                    if (((ti) this).field_E > var3) {
                      break L64;
                    } else {
                      L70: {
                        L71: {
                          if (((ti) this).field_S >= 0) {
                            break L71;
                          } else {
                            if (~var3 >= ~((ti) this).field_E) {
                              break L71;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L70;
                            }
                          }
                        }
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L70;
                      }
                      L72: {
                        var5 = stackIn_51_0;
                        if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                          break L72;
                        } else {
                          if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                            break L72;
                          } else {
                            var4 = 1;
                            var5 = 1;
                            break L72;
                          }
                        }
                      }
                      L73: {
                        L74: {
                          if (var4 == 0) {
                            break L74;
                          } else {
                            if (var5 == 0) {
                              ((ti) this).field_X = 0;
                              break L73;
                            } else {
                              break L74;
                            }
                          }
                        }
                        L75: {
                          if (var4 != 0) {
                            break L75;
                          } else {
                            if (var5 == 0) {
                              break L75;
                            } else {
                              ((ti) this).field_S = 0;
                              break L73;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L73;
                        } else {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 16;
                            ((ti) this).field_z = ((ti) this).field_O << 16;
                            if (((ti) this).field_R) {
                              ((ti) this).field_R = false;
                              ((ti) this).field_O = ((ti) this).field_V;
                              ((ti) this).field_P = ((ti) this).field_L;
                              ((ti) this).d(6, ((ti) this).field_T);
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            break L73;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
              }
              stackOut_89_0 = 1;
              stackIn_91_0 = stackOut_89_0;
              break L63;
            }
            L76: {
              var5 = stackIn_91_0;
              if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
                break L76;
              } else {
                if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                  break L76;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L76;
                }
              }
            }
            L77: {
              L78: {
                if (var4 == 0) {
                  break L78;
                } else {
                  if (var5 == 0) {
                    ((ti) this).field_X = 0;
                    break L77;
                  } else {
                    break L78;
                  }
                }
              }
              L79: {
                if (var4 != 0) {
                  break L79;
                } else {
                  if (var5 == 0) {
                    break L79;
                  } else {
                    ((ti) this).field_S = 0;
                    break L77;
                  }
                }
              }
              if (var4 == 0) {
                break L77;
              } else {
                if (var5 != 0) {
                  ((ti) this).field_E = ((ti) this).field_P << 16;
                  ((ti) this).field_z = ((ti) this).field_O << 16;
                  if (((ti) this).field_R) {
                    ((ti) this).field_R = false;
                    ((ti) this).field_O = ((ti) this).field_V;
                    ((ti) this).field_P = ((ti) this).field_L;
                    ((ti) this).d(6, ((ti) this).field_T);
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  break L77;
                }
              }
            }
            return false;
          }
        } else {
          L80: {
            ((ti) this).field_X = 119;
            var2 = ((ti) this).field_O << 16;
            var3 = ((ti) this).field_P << 16;
            if (((ti) this).field_X != 0) {
              break L80;
            } else {
              if (((ti) this).field_S != 0) {
                break L80;
              } else {
                return false;
              }
            }
          }
          L81: {
            L82: {
              if (((ti) this).field_X == 0) {
                break L82;
              } else {
                L83: {
                  if (((ti) this).field_X <= 0) {
                    break L83;
                  } else {
                    if (((ti) this).field_z > var2) {
                      break L82;
                    } else {
                      break L83;
                    }
                  }
                }
                L84: {
                  if (((ti) this).field_X >= 0) {
                    break L84;
                  } else {
                    if (~((ti) this).field_z <= ~var2) {
                      break L84;
                    } else {
                      break L82;
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L81;
              }
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L81;
          }
          L85: {
            L86: {
              var4 = stackIn_13_0;
              if (((ti) this).field_S == 0) {
                break L86;
              } else {
                L87: {
                  if (((ti) this).field_S <= 0) {
                    break L87;
                  } else {
                    if (((ti) this).field_E > var3) {
                      break L86;
                    } else {
                      break L87;
                    }
                  }
                }
                L88: {
                  if (((ti) this).field_S >= 0) {
                    break L88;
                  } else {
                    if (~var3 >= ~((ti) this).field_E) {
                      break L88;
                    } else {
                      break L86;
                    }
                  }
                }
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L85;
              }
            }
            stackOut_20_0 = 1;
            stackIn_22_0 = stackOut_20_0;
            break L85;
          }
          L89: {
            var5 = stackIn_22_0;
            if (~Math.abs(-var2 + ((ti) this).field_z) <= ~wc.field_O) {
              break L89;
            } else {
              if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                break L89;
              } else {
                var4 = 1;
                var5 = 1;
                break L89;
              }
            }
          }
          L90: {
            L91: {
              if (var4 == 0) {
                break L91;
              } else {
                if (var5 == 0) {
                  ((ti) this).field_X = 0;
                  break L90;
                } else {
                  break L91;
                }
              }
            }
            L92: {
              if (var4 != 0) {
                break L92;
              } else {
                if (var5 == 0) {
                  break L92;
                } else {
                  ((ti) this).field_S = 0;
                  return false;
                }
              }
            }
            if (var4 == 0) {
              break L90;
            } else {
              if (var5 != 0) {
                ((ti) this).field_E = ((ti) this).field_P << 16;
                ((ti) this).field_z = ((ti) this).field_O << 16;
                if (((ti) this).field_R) {
                  ((ti) this).field_R = false;
                  ((ti) this).field_O = ((ti) this).field_V;
                  ((ti) this).field_P = ((ti) this).field_L;
                  ((ti) this).d(6, ((ti) this).field_T);
                  return false;
                } else {
                  return true;
                }
              } else {
                break L90;
              }
            }
          }
          return false;
        }
    }

    public static void g() {
        field_H = null;
        field_M = null;
        field_Z = null;
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var3 = ((ti) this).field_O - ((ti) this).g(param0 + 68);
          var4 = ((ti) this).field_P + -((ti) this).h(-80);
          var5 = g.b(var3 * var3 + var4 * var4);
          if (param0 == 6) {
            break L0;
          } else {
            ((ti) this).c(-72, 91);
            break L0;
          }
        }
        if (-1 == var5) {
          if (-2 != ((ti) this).field_K) {
            if (5 != ((ti) this).field_K) {
              if (6 != ((ti) this).field_K) {
                if (((ti) this).field_K == 7) {
                  L1: {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (!(this instanceof gm)) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = 4;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L1;
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = 0;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L1;
                    }
                  }
                  ((ti) this).b(stackIn_24_1, param0 + -27661);
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (!(this instanceof gm)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 4;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L2;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L2;
                  }
                }
                ((ti) this).b(stackIn_18_1, param0 + -27661);
                return;
              }
            } else {
              L3: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!(this instanceof gm)) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 4;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L3;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 0;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L3;
                }
              }
              ((ti) this).b(stackIn_13_1, param0 + -27661);
              return;
            }
          } else {
            L4: {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (!(this instanceof gm)) {
                stackOut_7_0 = this;
                stackOut_7_1 = 4;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L4;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L4;
              }
            }
            ((ti) this).b(stackIn_8_1, param0 + -27661);
            return;
          }
        } else {
          var6 = param1 / var5;
          this.a(var6 * var4, var6 * var3, (byte) -121);
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        ((ti) this).field_S = param0;
        ((ti) this).field_X = param1;
        ((ti) this).field_F = 0 < param1 ? 1 : 3;
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        if (gg.field_j[param1] > ((ti) this).field_ab) {
          if (param0 != 30818) {
            L0: {
              field_Y = 103;
              var3 = gg.field_b[param1];
              if (0 < ((ti) this).field_G) {
                var3 = var3 * 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              int fieldTemp$8 = ((ti) this).field_Q + 1;
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < fieldTemp$8) {
                L2: {
                  int fieldTemp$9 = ((ti) this).field_ab + 1;
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (fieldTemp$9 == gg.field_j[param1]) {
                    ((ti) this).field_ab = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((ti) this).field_Q = 0;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L3: {
              var3 = gg.field_b[param1];
              if (0 < ((ti) this).field_G) {
                var3 = var3 * 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              int fieldTemp$10 = ((ti) this).field_Q + 1;
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < fieldTemp$10) {
                L5: {
                  int fieldTemp$11 = ((ti) this).field_ab + 1;
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (fieldTemp$11 == gg.field_j[param1]) {
                    ((ti) this).field_ab = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((ti) this).field_Q = 0;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          ((ti) this).field_ab = 0;
          if (param0 == 30818) {
            L6: {
              var3 = gg.field_b[param1];
              if (0 < ((ti) this).field_G) {
                var3 = var3 * 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              int fieldTemp$12 = ((ti) this).field_Q + 1;
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < fieldTemp$12) {
                L8: {
                  int fieldTemp$13 = ((ti) this).field_ab + 1;
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (fieldTemp$13 == gg.field_j[param1]) {
                    ((ti) this).field_ab = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ((ti) this).field_Q = 0;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          } else {
            L9: {
              field_Y = 103;
              var3 = gg.field_b[param1];
              if (0 < ((ti) this).field_G) {
                var3 = var3 * 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              int fieldTemp$14 = ((ti) this).field_Q + 1;
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < fieldTemp$14) {
                L11: {
                  int fieldTemp$15 = ((ti) this).field_ab + 1;
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (fieldTemp$15 == gg.field_j[param1]) {
                    ((ti) this).field_ab = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((ti) this).field_Q = 0;
                break L10;
              } else {
                break L10;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 3;
        field_Y = 0;
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_I = 10;
        field_Z = "Whisk your zombies across time and space. Well, maybe not time.";
        field_M = new String[]{"The Mall", "Power Plant", "Police Precinct", "White House"};
    }
}
