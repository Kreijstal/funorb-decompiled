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
        var4 = ((ti) this).field_z >> 53387440;
        if (param1) {
          var5 = ((ti) this).field_E >> -1306012816;
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
        int var2 = -115 / ((param0 - -53) / 59);
        return ng.a(-49, true, param1, 10);
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
            if ((param0 ^ -1) == -19) {
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
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_330_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_328_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 < -69) {
          L0: {
            var2 = ((ti) this).field_O << -143654544;
            var3 = ((ti) this).field_P << -1371553200;
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
                if ((((ti) this).field_X ^ -1) <= -1) {
                  break L1;
                } else {
                  if (((ti) this).field_z >= var2) {
                    break L1;
                  } else {
                    L2: {
                      var4 = 1;
                      if (((ti) this).field_S != -1) {
                        L3: {
                          if (-1 >= ((ti) this).field_S) {
                            break L3;
                          } else {
                            if (((ti) this).field_E <= var3) {
                              break L3;
                            } else {
                              stackOut_239_0 = 1;
                              stackIn_247_0 = stackOut_239_0;
                              break L2;
                            }
                          }
                        }
                        if (((ti) this).field_S < 0) {
                          if (var3 > ((ti) this).field_E) {
                            stackOut_245_0 = 1;
                            stackIn_247_0 = stackOut_245_0;
                            break L2;
                          } else {
                            stackOut_244_0 = 0;
                            stackIn_247_0 = stackOut_244_0;
                            break L2;
                          }
                        } else {
                          stackOut_242_0 = 0;
                          stackIn_247_0 = stackOut_242_0;
                          break L2;
                        }
                      } else {
                        stackOut_236_0 = 1;
                        stackIn_247_0 = stackOut_236_0;
                        break L2;
                      }
                    }
                    L4: {
                      var5 = stackIn_247_0;
                      if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                        break L4;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L4;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (var5 != 0) {
                          break L5;
                        } else {
                          ((ti) this).field_X = 0;
                          return false;
                        }
                      }
                    }
                    L6: {
                      if (var4 != 0) {
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 484587952;
                            ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                            break L6;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        ((ti) this).field_S = 0;
                        break L6;
                      }
                    }
                    return false;
                  }
                }
              }
              var4 = 0;
              if (((ti) this).field_S != 0) {
                if (-1 <= (((ti) this).field_S ^ -1)) {
                  L7: {
                    if (((ti) this).field_S >= 0) {
                      break L7;
                    } else {
                      if (var3 <= ((ti) this).field_E) {
                        break L7;
                      } else {
                        L8: {
                          var5 = 1;
                          if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                            break L8;
                          } else {
                            if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                              break L8;
                            } else {
                              var4 = 1;
                              var5 = 1;
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var4 == 0) {
                            if (var4 != 0) {
                              if (var4 == 0) {
                                break L9;
                              } else {
                                if (var5 != 0) {
                                  ((ti) this).field_E = ((ti) this).field_P << 484587952;
                                  ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                              ((ti) this).field_S = 0;
                              return false;
                            }
                          } else {
                            if (var5 == 0) {
                              ((ti) this).field_X = 0;
                              break L9;
                            } else {
                              L10: {
                                if (var4 != 0) {
                                  if (var4 == 0) {
                                    break L10;
                                  } else {
                                    if (var5 != 0) {
                                      ((ti) this).field_E = ((ti) this).field_P << 484587952;
                                      ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                                      break L10;
                                    }
                                  }
                                } else {
                                  ((ti) this).field_S = 0;
                                  break L10;
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
                  L11: {
                    var5 = 0;
                    if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
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
                      if (var4 != 0) {
                        if (var4 == 0) {
                          break L12;
                        } else {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 484587952;
                            ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                        ((ti) this).field_S = 0;
                        return false;
                      }
                    } else {
                      if (var5 == 0) {
                        ((ti) this).field_X = 0;
                        break L12;
                      } else {
                        if (var4 != 0) {
                          if (var4 == 0) {
                            return false;
                          } else {
                            if (var5 != 0) {
                              ((ti) this).field_E = ((ti) this).field_P << 484587952;
                              ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                          ((ti) this).field_S = 0;
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (((ti) this).field_E <= var3) {
                    L13: {
                      if (((ti) this).field_S < 0) {
                        if (var3 <= ((ti) this).field_E) {
                          stackOut_329_0 = 0;
                          stackIn_330_0 = stackOut_329_0;
                          break L13;
                        } else {
                          stackOut_328_0 = 1;
                          stackIn_330_0 = stackOut_328_0;
                          break L13;
                        }
                      } else {
                        stackOut_326_0 = 0;
                        stackIn_330_0 = stackOut_326_0;
                        break L13;
                      }
                    }
                    L14: {
                      var5 = stackIn_330_0;
                      if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                        break L14;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L14;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L14;
                        }
                      }
                    }
                    L15: {
                      L16: {
                        if (var4 == 0) {
                          break L16;
                        } else {
                          if (var5 == 0) {
                            ((ti) this).field_X = 0;
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (var4 != 0) {
                        if (var4 == 0) {
                          break L15;
                        } else {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 484587952;
                            ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                            break L15;
                          }
                        }
                      } else {
                        ((ti) this).field_S = 0;
                        break L15;
                      }
                    }
                    return false;
                  } else {
                    L17: {
                      var5 = 1;
                      if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                        break L17;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L17;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L17;
                        }
                      }
                    }
                    if (var4 == 0) {
                      if (var4 != 0) {
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 484587952;
                            ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                        } else {
                          return false;
                        }
                      } else {
                        ((ti) this).field_S = 0;
                        return false;
                      }
                    } else {
                      if (var5 != 0) {
                        L18: {
                          if (var4 != 0) {
                            if (var4 != 0) {
                              if (var5 != 0) {
                                ((ti) this).field_E = ((ti) this).field_P << 484587952;
                                ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                                break L18;
                              }
                            } else {
                              return false;
                            }
                          } else {
                            ((ti) this).field_S = 0;
                            break L18;
                          }
                        }
                        return false;
                      } else {
                        ((ti) this).field_X = 0;
                        return false;
                      }
                    }
                  }
                }
              } else {
                L19: {
                  var5 = 1;
                  if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                    break L19;
                  } else {
                    if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                      break L19;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L19;
                    }
                  }
                }
                if (var4 == 0) {
                  if (var4 != 0) {
                    if (var4 != 0) {
                      if (var5 != 0) {
                        ((ti) this).field_E = ((ti) this).field_P << 484587952;
                        ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                    } else {
                      return false;
                    }
                  } else {
                    ((ti) this).field_S = 0;
                    return false;
                  }
                } else {
                  if (var5 != 0) {
                    L20: {
                      if (var4 != 0) {
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 484587952;
                            ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                            break L20;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        ((ti) this).field_S = 0;
                        break L20;
                      }
                    }
                    return false;
                  } else {
                    ((ti) this).field_X = 0;
                    return false;
                  }
                }
              }
            } else {
              if (((ti) this).field_z <= var2) {
                L21: {
                  if ((((ti) this).field_X ^ -1) > -1) {
                    if (((ti) this).field_z >= var2) {
                      stackOut_201_0 = 0;
                      stackIn_202_0 = stackOut_201_0;
                      break L21;
                    } else {
                      stackOut_200_0 = 1;
                      stackIn_202_0 = stackOut_200_0;
                      break L21;
                    }
                  } else {
                    stackOut_198_0 = 0;
                    stackIn_202_0 = stackOut_198_0;
                    break L21;
                  }
                }
                L22: {
                  var4 = stackIn_202_0;
                  if (((ti) this).field_S != -1) {
                    L23: {
                      if (-1 >= ((ti) this).field_S) {
                        break L23;
                      } else {
                        if (((ti) this).field_E <= var3) {
                          break L23;
                        } else {
                          stackOut_206_0 = 1;
                          stackIn_214_0 = stackOut_206_0;
                          break L22;
                        }
                      }
                    }
                    if (((ti) this).field_S < 0) {
                      if (var3 > ((ti) this).field_E) {
                        stackOut_212_0 = 1;
                        stackIn_214_0 = stackOut_212_0;
                        break L22;
                      } else {
                        stackOut_211_0 = 0;
                        stackIn_214_0 = stackOut_211_0;
                        break L22;
                      }
                    } else {
                      stackOut_209_0 = 0;
                      stackIn_214_0 = stackOut_209_0;
                      break L22;
                    }
                  } else {
                    stackOut_203_0 = 1;
                    stackIn_214_0 = stackOut_203_0;
                    break L22;
                  }
                }
                L24: {
                  var5 = stackIn_214_0;
                  if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                    break L24;
                  } else {
                    if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                      break L24;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L24;
                    }
                  }
                }
                L25: {
                  if (var4 == 0) {
                    break L25;
                  } else {
                    if (var5 != 0) {
                      break L25;
                    } else {
                      ((ti) this).field_X = 0;
                      return false;
                    }
                  }
                }
                L26: {
                  if (var4 != 0) {
                    if (var4 != 0) {
                      if (var5 != 0) {
                        ((ti) this).field_E = ((ti) this).field_P << 484587952;
                        ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                        break L26;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    ((ti) this).field_S = 0;
                    break L26;
                  }
                }
                return false;
              } else {
                L27: {
                  var4 = 1;
                  if (((ti) this).field_S != -1) {
                    if (-1 >= ((ti) this).field_S) {
                      if (((ti) this).field_S < 0) {
                        if (var3 > ((ti) this).field_E) {
                          L28: {
                            var5 = 1;
                            if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                              break L28;
                            } else {
                              if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                                break L28;
                              } else {
                                var4 = 1;
                                var5 = 1;
                                break L28;
                              }
                            }
                          }
                          L29: {
                            if (var4 == 0) {
                              break L29;
                            } else {
                              if (var5 != 0) {
                                break L29;
                              } else {
                                ((ti) this).field_X = 0;
                                return false;
                              }
                            }
                          }
                          L30: {
                            if (var4 != 0) {
                              if (var4 != 0) {
                                if (var5 != 0) {
                                  ((ti) this).field_E = ((ti) this).field_P << 484587952;
                                  ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                                  break L30;
                                }
                              } else {
                                return false;
                              }
                            } else {
                              ((ti) this).field_S = 0;
                              break L30;
                            }
                          }
                          return false;
                        } else {
                          stackOut_157_0 = 0;
                          stackIn_178_0 = stackOut_157_0;
                          break L27;
                        }
                      } else {
                        stackOut_155_0 = 0;
                        stackIn_178_0 = stackOut_155_0;
                        break L27;
                      }
                    } else {
                      if (((ti) this).field_E <= var3) {
                        L31: {
                          if (((ti) this).field_S < 0) {
                            if (var3 <= ((ti) this).field_E) {
                              stackOut_134_0 = 0;
                              stackIn_135_0 = stackOut_134_0;
                              break L31;
                            } else {
                              stackOut_133_0 = 1;
                              stackIn_135_0 = stackOut_133_0;
                              break L31;
                            }
                          } else {
                            stackOut_131_0 = 0;
                            stackIn_135_0 = stackOut_131_0;
                            break L31;
                          }
                        }
                        L32: {
                          var5 = stackIn_135_0;
                          if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                            break L32;
                          } else {
                            if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                              break L32;
                            } else {
                              var4 = 1;
                              var5 = 1;
                              break L32;
                            }
                          }
                        }
                        L33: {
                          if (var4 == 0) {
                            break L33;
                          } else {
                            if (var5 != 0) {
                              break L33;
                            } else {
                              ((ti) this).field_X = 0;
                              return false;
                            }
                          }
                        }
                        L34: {
                          if (var4 != 0) {
                            if (var4 != 0) {
                              if (var5 != 0) {
                                ((ti) this).field_E = ((ti) this).field_P << 484587952;
                                ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                            } else {
                              return false;
                            }
                          } else {
                            ((ti) this).field_S = 0;
                            break L34;
                          }
                        }
                        return false;
                      } else {
                        stackOut_129_0 = 1;
                        stackIn_178_0 = stackOut_129_0;
                        break L27;
                      }
                    }
                  } else {
                    stackOut_126_0 = 1;
                    stackIn_178_0 = stackOut_126_0;
                    break L27;
                  }
                }
                L35: {
                  var5 = stackIn_178_0;
                  if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                    break L35;
                  } else {
                    if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                      break L35;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L35;
                    }
                  }
                }
                L36: {
                  if (var4 == 0) {
                    break L36;
                  } else {
                    if (var5 != 0) {
                      break L36;
                    } else {
                      ((ti) this).field_X = 0;
                      return false;
                    }
                  }
                }
                L37: {
                  if (var4 != 0) {
                    if (var4 != 0) {
                      if (var5 != 0) {
                        ((ti) this).field_E = ((ti) this).field_P << 484587952;
                        ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                        break L37;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    ((ti) this).field_S = 0;
                    break L37;
                  }
                }
                return false;
              }
            }
          } else {
            L38: {
              var4 = 1;
              if (((ti) this).field_S != -1) {
                if (-1 >= ((ti) this).field_S) {
                  if (((ti) this).field_S < 0) {
                    if (var3 > ((ti) this).field_E) {
                      L39: {
                        var5 = 1;
                        if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                          break L39;
                        } else {
                          if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                            break L39;
                          } else {
                            var4 = 1;
                            var5 = 1;
                            break L39;
                          }
                        }
                      }
                      L40: {
                        if (var4 == 0) {
                          break L40;
                        } else {
                          if (var5 != 0) {
                            break L40;
                          } else {
                            ((ti) this).field_X = 0;
                            return false;
                          }
                        }
                      }
                      L41: {
                        if (var4 != 0) {
                          if (var4 != 0) {
                            if (var5 != 0) {
                              ((ti) this).field_E = ((ti) this).field_P << 484587952;
                              ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                              break L41;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          ((ti) this).field_S = 0;
                          break L41;
                        }
                      }
                      return false;
                    } else {
                      stackOut_83_0 = 0;
                      stackIn_104_0 = stackOut_83_0;
                      break L38;
                    }
                  } else {
                    stackOut_81_0 = 0;
                    stackIn_104_0 = stackOut_81_0;
                    break L38;
                  }
                } else {
                  if (((ti) this).field_E <= var3) {
                    L42: {
                      if (((ti) this).field_S < 0) {
                        if (var3 <= ((ti) this).field_E) {
                          stackOut_60_0 = 0;
                          stackIn_61_0 = stackOut_60_0;
                          break L42;
                        } else {
                          stackOut_59_0 = 1;
                          stackIn_61_0 = stackOut_59_0;
                          break L42;
                        }
                      } else {
                        stackOut_57_0 = 0;
                        stackIn_61_0 = stackOut_57_0;
                        break L42;
                      }
                    }
                    L43: {
                      var5 = stackIn_61_0;
                      if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                        break L43;
                      } else {
                        if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                          break L43;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L43;
                        }
                      }
                    }
                    L44: {
                      if (var4 == 0) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L44;
                        } else {
                          ((ti) this).field_X = 0;
                          return false;
                        }
                      }
                    }
                    L45: {
                      if (var4 != 0) {
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((ti) this).field_E = ((ti) this).field_P << 484587952;
                            ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                            break L45;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        ((ti) this).field_S = 0;
                        break L45;
                      }
                    }
                    return false;
                  } else {
                    stackOut_55_0 = 1;
                    stackIn_104_0 = stackOut_55_0;
                    break L38;
                  }
                }
              } else {
                stackOut_52_0 = 1;
                stackIn_104_0 = stackOut_52_0;
                break L38;
              }
            }
            L46: {
              var5 = stackIn_104_0;
              if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
                break L46;
              } else {
                if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                  break L46;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L46;
                }
              }
            }
            L47: {
              if (var4 == 0) {
                break L47;
              } else {
                if (var5 != 0) {
                  break L47;
                } else {
                  ((ti) this).field_X = 0;
                  return false;
                }
              }
            }
            L48: {
              if (var4 != 0) {
                if (var4 != 0) {
                  if (var5 != 0) {
                    ((ti) this).field_E = ((ti) this).field_P << 484587952;
                    ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
                    break L48;
                  }
                } else {
                  return false;
                }
              } else {
                ((ti) this).field_S = 0;
                break L48;
              }
            }
            return false;
          }
        } else {
          L49: {
            ((ti) this).field_X = 119;
            var2 = ((ti) this).field_O << -143654544;
            var3 = ((ti) this).field_P << -1371553200;
            if (((ti) this).field_X != 0) {
              break L49;
            } else {
              if (((ti) this).field_S != 0) {
                break L49;
              } else {
                return false;
              }
            }
          }
          L50: {
            if (((ti) this).field_X != 0) {
              L51: {
                if (((ti) this).field_X <= 0) {
                  break L51;
                } else {
                  if (((ti) this).field_z <= var2) {
                    break L51;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_16_0 = stackOut_8_0;
                    break L50;
                  }
                }
              }
              if ((((ti) this).field_X ^ -1) > -1) {
                if (((ti) this).field_z < var2) {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L50;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_16_0 = stackOut_13_0;
                  break L50;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_16_0 = stackOut_11_0;
                break L50;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_16_0 = stackOut_5_0;
              break L50;
            }
          }
          L52: {
            var4 = stackIn_16_0;
            if (((ti) this).field_S != -1) {
              L53: {
                if (-1 >= ((ti) this).field_S) {
                  break L53;
                } else {
                  if (((ti) this).field_E <= var3) {
                    break L53;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_28_0 = stackOut_20_0;
                    break L52;
                  }
                }
              }
              if (((ti) this).field_S < 0) {
                if (var3 > ((ti) this).field_E) {
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L52;
                } else {
                  stackOut_25_0 = 0;
                  stackIn_28_0 = stackOut_25_0;
                  break L52;
                }
              } else {
                stackOut_23_0 = 0;
                stackIn_28_0 = stackOut_23_0;
                break L52;
              }
            } else {
              stackOut_17_0 = 1;
              stackIn_28_0 = stackOut_17_0;
              break L52;
            }
          }
          L54: {
            var5 = stackIn_28_0;
            if (Math.abs(-var2 + ((ti) this).field_z) >= wc.field_O) {
              break L54;
            } else {
              if (Math.abs(((ti) this).field_E + -var3) >= wc.field_O) {
                break L54;
              } else {
                var4 = 1;
                var5 = 1;
                break L54;
              }
            }
          }
          L55: {
            if (var4 == 0) {
              break L55;
            } else {
              if (var5 != 0) {
                break L55;
              } else {
                ((ti) this).field_X = 0;
                return false;
              }
            }
          }
          if (var4 != 0) {
            if (var4 != 0) {
              if (var5 != 0) {
                ((ti) this).field_E = ((ti) this).field_P << 484587952;
                ((ti) this).field_z = ((ti) this).field_O << 2020526896;
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
            } else {
              return false;
            }
          } else {
            ((ti) this).field_S = 0;
            return false;
          }
        }
    }

    public static void g(byte param0) {
        field_H = null;
        field_M = null;
        if (param0 < 23) {
            return;
        }
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param2 > -120) {
          L0: {
            ((ti) this).field_bb = -7;
            ((ti) this).field_S = param0;
            ((ti) this).field_X = param1;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (0 >= param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 3;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ti) this).field_F = stackIn_8_1;
          return;
        } else {
          L1: {
            ((ti) this).field_S = param0;
            ((ti) this).field_X = param1;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (0 >= param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ti) this).field_F = stackIn_4_1;
          return;
        }
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
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < ((ti) this).field_Q + 1) {
                L2: {
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (((ti) this).field_ab + 1 == gg.field_j[param1]) {
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
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < ((ti) this).field_Q + 1) {
                L5: {
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (((ti) this).field_ab + 1 == gg.field_j[param1]) {
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
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < ((ti) this).field_Q + 1) {
                L8: {
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (((ti) this).field_ab + 1 == gg.field_j[param1]) {
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
              ((ti) this).field_Q = ((ti) this).field_Q + 1;
              if (var3 < ((ti) this).field_Q + 1) {
                L11: {
                  ((ti) this).field_ab = ((ti) this).field_ab + 1;
                  if (((ti) this).field_ab + 1 == gg.field_j[param1]) {
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
