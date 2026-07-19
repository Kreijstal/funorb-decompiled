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
        this.field_G = param0;
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = this.field_z >> 53387440;
        if (param1) {
          var5 = this.field_E >> -1306012816;
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
          if (this.field_G > 0) {
            this.field_G = this.field_G - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (-22 == (this.field_K ^ -1)) {
          this.field_N = this.field_N - 4;
          if (-1 == (this.field_N ^ -1)) {
            this.a(true);
            this.a(-4564);
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
          this.field_G = op.field_m.a((byte) 32, param0, var3);
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
            stackOut_0_0 = ng.a(-49, true, param1, 10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("ti.MA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void i(int param0) {
        this.field_E = this.field_E + this.field_S;
        this.field_z = this.field_z + this.field_X;
        if (param0 != 5197) {
            this.c(20, -102);
        }
    }

    void b(int param0, int param1) {
        if (this.field_K == 32) {
          return;
        } else {
          if (20 != this.field_K) {
            this.field_Q = 0;
            this.field_ab = 0;
            this.field_K = param0;
            if (param0 != 21) {
              if (param1 != -27655) {
                field_Z = (String) null;
                return;
              } else {
                return;
              }
            } else {
              this.a(-4564);
              this.field_N = 256;
              if (param1 != -27655) {
                field_Z = (String) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if ((param0 ^ -1) == -19) {
              this.field_Q = 0;
              this.field_ab = 0;
              this.field_K = param0;
              if (param0 == 21) {
                this.a(-4564);
                this.field_N = 256;
                if (param1 == -27655) {
                  return;
                } else {
                  field_Z = (String) null;
                  return;
                }
              } else {
                if (param1 != -27655) {
                  field_Z = (String) null;
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
        this.field_U = null;
        this.field_K = !(this instanceof gm) ? 4 : 0;
        this.field_F = 1 != hp.a((byte) 21, g.field_a, 2) ? 1 : 3;
        this.field_ab = 0;
        this.field_Q = 0;
        this.field_bb = param3;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -88 % ((param3 - -32) / 57);
        this.field_R = false;
        this.field_z = param0;
        this.field_O = param5;
        this.field_P = param2;
        this.field_E = param1;
        this.d(6, param4);
    }

    final boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_369_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_268_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_368_0 = 0;
        int stackOut_367_0 = 0;
        int stackOut_365_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_54_0 = 0;
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
            var2 = this.field_O << -143654544;
            var3 = this.field_P << -1371553200;
            if (this.field_X != 0) {
              break L0;
            } else {
              if (this.field_S != 0) {
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_X != 0) {
            if (this.field_X <= 0) {
              L1: {
                if ((this.field_X ^ -1) <= -1) {
                  break L1;
                } else {
                  if (this.field_z >= var2) {
                    break L1;
                  } else {
                    L2: {
                      var4 = 1;
                      if (this.field_S != 0) {
                        L3: {
                          if (-1 <= (this.field_S ^ -1)) {
                            break L3;
                          } else {
                            if (this.field_E <= var3) {
                              break L3;
                            } else {
                              stackOut_262_0 = 1;
                              stackIn_270_0 = stackOut_262_0;
                              break L2;
                            }
                          }
                        }
                        if (this.field_S < 0) {
                          if (var3 > this.field_E) {
                            stackOut_268_0 = 1;
                            stackIn_270_0 = stackOut_268_0;
                            break L2;
                          } else {
                            stackOut_267_0 = 0;
                            stackIn_270_0 = stackOut_267_0;
                            break L2;
                          }
                        } else {
                          stackOut_265_0 = 0;
                          stackIn_270_0 = stackOut_265_0;
                          break L2;
                        }
                      } else {
                        stackOut_259_0 = 1;
                        stackIn_270_0 = stackOut_259_0;
                        break L2;
                      }
                    }
                    L4: {
                      var5 = stackIn_270_0;
                      if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                        break L4;
                      } else {
                        if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                          break L4;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        if (var4 == 0) {
                          break L6;
                        } else {
                          if (var5 == 0) {
                            this.field_X = 0;
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (var5 == 0) {
                            break L7;
                          } else {
                            this.field_S = 0;
                            if (!ZombieDawnMulti.field_E) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (var5 != 0) {
                          this.field_E = this.field_P << 484587952;
                          this.field_z = this.field_O << 2020526896;
                          if (this.field_R) {
                            this.field_R = false;
                            this.field_O = this.field_V;
                            this.field_P = this.field_L;
                            this.d(6, this.field_T);
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              var4 = 0;
              if (this.field_S != 0) {
                if (-1 <= (this.field_S ^ -1)) {
                  L8: {
                    if (this.field_S >= 0) {
                      break L8;
                    } else {
                      if (var3 <= this.field_E) {
                        break L8;
                      } else {
                        L9: {
                          var5 = 1;
                          if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                            break L9;
                          } else {
                            if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                              break L9;
                            } else {
                              var4 = 1;
                              var5 = 1;
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var4 == 0) {
                            L11: {
                              if (var4 != 0) {
                                break L11;
                              } else {
                                if (var5 == 0) {
                                  break L11;
                                } else {
                                  this.field_S = 0;
                                  if (!ZombieDawnMulti.field_E) {
                                    break L10;
                                  } else {
                                    L12: {
                                      if (var4 == 0) {
                                        break L12;
                                      } else {
                                        if (var5 != 0) {
                                          this.field_E = this.field_P << 484587952;
                                          this.field_z = this.field_O << 2020526896;
                                          if (this.field_R) {
                                            this.field_R = false;
                                            this.field_O = this.field_V;
                                            this.field_P = this.field_L;
                                            this.d(6, this.field_T);
                                            return false;
                                          } else {
                                            return true;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    return false;
                                  }
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L10;
                            } else {
                              if (var5 != 0) {
                                this.field_E = this.field_P << 484587952;
                                this.field_z = this.field_O << 2020526896;
                                if (this.field_R) {
                                  this.field_R = false;
                                  this.field_O = this.field_V;
                                  this.field_P = this.field_L;
                                  this.d(6, this.field_T);
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
                              this.field_X = 0;
                              break L10;
                            } else {
                              L13: {
                                L14: {
                                  if (var4 != 0) {
                                    break L14;
                                  } else {
                                    this.field_S = 0;
                                    if (!ZombieDawnMulti.field_E) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (var4 == 0) {
                                  break L13;
                                } else {
                                  if (var5 != 0) {
                                    this.field_E = this.field_P << 484587952;
                                    this.field_z = this.field_O << 2020526896;
                                    if (this.field_R) {
                                      this.field_R = false;
                                      this.field_O = this.field_V;
                                      this.field_P = this.field_L;
                                      this.d(6, this.field_T);
                                      return false;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    break L13;
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
                  L15: {
                    var5 = 0;
                    if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                      break L15;
                    } else {
                      if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                        break L15;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (var4 == 0) {
                      L17: {
                        if (var4 != 0) {
                          break L17;
                        } else {
                          if (var5 == 0) {
                            break L17;
                          } else {
                            this.field_S = 0;
                            if (!ZombieDawnMulti.field_E) {
                              break L16;
                            } else {
                              if (var4 == 0) {
                                return false;
                              } else {
                                if (var5 != 0) {
                                  this.field_E = this.field_P << 484587952;
                                  this.field_z = this.field_O << 2020526896;
                                  if (this.field_R) {
                                    this.field_R = false;
                                    this.field_O = this.field_V;
                                    this.field_P = this.field_L;
                                    this.d(6, this.field_T);
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
                      }
                      if (var4 == 0) {
                        break L16;
                      } else {
                        if (var5 != 0) {
                          this.field_E = this.field_P << 484587952;
                          this.field_z = this.field_O << 2020526896;
                          if (this.field_R) {
                            this.field_R = false;
                            this.field_O = this.field_V;
                            this.field_P = this.field_L;
                            this.d(6, this.field_T);
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
                        this.field_X = 0;
                        break L16;
                      } else {
                        L18: {
                          if (var4 != 0) {
                            if (var4 == 0) {
                              break L18;
                            } else {
                              if (var5 != 0) {
                                this.field_E = this.field_P << 484587952;
                                this.field_z = this.field_O << 2020526896;
                                if (this.field_R) {
                                  this.field_R = false;
                                  this.field_O = this.field_V;
                                  this.field_P = this.field_L;
                                  this.d(6, this.field_T);
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                return false;
                              }
                            }
                          } else {
                            this.field_S = 0;
                            if (!ZombieDawnMulti.field_E) {
                              break L18;
                            } else {
                              L19: {
                                if (var4 == 0) {
                                  break L19;
                                } else {
                                  if (var5 != 0) {
                                    this.field_E = this.field_P << 484587952;
                                    this.field_z = this.field_O << 2020526896;
                                    if (this.field_R) {
                                      this.field_R = false;
                                      this.field_O = this.field_V;
                                      this.field_P = this.field_L;
                                      this.d(6, this.field_T);
                                      return false;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    break L19;
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
                  return false;
                } else {
                  if (this.field_E <= var3) {
                    L20: {
                      if (this.field_S < 0) {
                        if (var3 <= this.field_E) {
                          stackOut_368_0 = 0;
                          stackIn_369_0 = stackOut_368_0;
                          break L20;
                        } else {
                          stackOut_367_0 = 1;
                          stackIn_369_0 = stackOut_367_0;
                          break L20;
                        }
                      } else {
                        stackOut_365_0 = 0;
                        stackIn_369_0 = stackOut_365_0;
                        break L20;
                      }
                    }
                    L21: {
                      var5 = stackIn_369_0;
                      if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                        break L21;
                      } else {
                        if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                          break L21;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L21;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if (var4 == 0) {
                          break L23;
                        } else {
                          if (var5 == 0) {
                            this.field_X = 0;
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (var4 != 0) {
                          break L24;
                        } else {
                          if (var5 == 0) {
                            break L24;
                          } else {
                            this.field_S = 0;
                            if (!ZombieDawnMulti.field_E) {
                              break L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L22;
                      } else {
                        if (var5 != 0) {
                          this.field_E = this.field_P << 484587952;
                          this.field_z = this.field_O << 2020526896;
                          if (this.field_R) {
                            this.field_R = false;
                            this.field_O = this.field_V;
                            this.field_P = this.field_L;
                            this.d(6, this.field_T);
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    return false;
                  } else {
                    L25: {
                      var5 = 1;
                      if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                        break L25;
                      } else {
                        if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                          break L25;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (var4 == 0) {
                        L27: {
                          if (var4 != 0) {
                            break L27;
                          } else {
                            if (var5 == 0) {
                              break L27;
                            } else {
                              this.field_S = 0;
                              if (!ZombieDawnMulti.field_E) {
                                break L26;
                              } else {
                                L28: {
                                  if (var4 == 0) {
                                    break L28;
                                  } else {
                                    if (var5 != 0) {
                                      this.field_E = this.field_P << 484587952;
                                      this.field_z = this.field_O << 2020526896;
                                      if (this.field_R) {
                                        this.field_R = false;
                                        this.field_O = this.field_V;
                                        this.field_P = this.field_L;
                                        this.d(6, this.field_T);
                                        return false;
                                      } else {
                                        return true;
                                      }
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L26;
                        } else {
                          if (var5 != 0) {
                            this.field_E = this.field_P << 484587952;
                            this.field_z = this.field_O << 2020526896;
                            if (this.field_R) {
                              this.field_R = false;
                              this.field_O = this.field_V;
                              this.field_P = this.field_L;
                              this.d(6, this.field_T);
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
                          this.field_X = 0;
                          break L26;
                        } else {
                          L29: {
                            L30: {
                              if (var4 != 0) {
                                break L30;
                              } else {
                                this.field_S = 0;
                                if (!ZombieDawnMulti.field_E) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L29;
                            } else {
                              if (var5 != 0) {
                                this.field_E = this.field_P << 484587952;
                                this.field_z = this.field_O << 2020526896;
                                if (this.field_R) {
                                  this.field_R = false;
                                  this.field_O = this.field_V;
                                  this.field_P = this.field_L;
                                  this.d(6, this.field_T);
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
                  if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                    break L31;
                  } else {
                    if (Math.abs(this.field_E + -var3) >= wc.field_O) {
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
                          this.field_S = 0;
                          if (!ZombieDawnMulti.field_E) {
                            break L32;
                          } else {
                            L34: {
                              if (var4 == 0) {
                                break L34;
                              } else {
                                if (var5 != 0) {
                                  this.field_E = this.field_P << 484587952;
                                  this.field_z = this.field_O << 2020526896;
                                  if (this.field_R) {
                                    this.field_R = false;
                                    this.field_O = this.field_V;
                                    this.field_P = this.field_L;
                                    this.d(6, this.field_T);
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
                    }
                    if (var4 == 0) {
                      break L32;
                    } else {
                      if (var5 != 0) {
                        this.field_E = this.field_P << 484587952;
                        this.field_z = this.field_O << 2020526896;
                        if (this.field_R) {
                          this.field_R = false;
                          this.field_O = this.field_V;
                          this.field_P = this.field_L;
                          this.d(6, this.field_T);
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
                      this.field_X = 0;
                      break L32;
                    } else {
                      L35: {
                        L36: {
                          if (var4 != 0) {
                            break L36;
                          } else {
                            this.field_S = 0;
                            if (!ZombieDawnMulti.field_E) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L35;
                        } else {
                          if (var5 != 0) {
                            this.field_E = this.field_P << 484587952;
                            this.field_z = this.field_O << 2020526896;
                            if (this.field_R) {
                              this.field_R = false;
                              this.field_O = this.field_V;
                              this.field_P = this.field_L;
                              this.d(6, this.field_T);
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            break L35;
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
              if (this.field_z <= var2) {
                L37: {
                  if ((this.field_X ^ -1) > -1) {
                    if (this.field_z >= var2) {
                      stackOut_221_0 = 0;
                      stackIn_222_0 = stackOut_221_0;
                      break L37;
                    } else {
                      stackOut_220_0 = 1;
                      stackIn_222_0 = stackOut_220_0;
                      break L37;
                    }
                  } else {
                    stackOut_218_0 = 0;
                    stackIn_222_0 = stackOut_218_0;
                    break L37;
                  }
                }
                L38: {
                  var4 = stackIn_222_0;
                  if (this.field_S != 0) {
                    L39: {
                      if (-1 <= (this.field_S ^ -1)) {
                        break L39;
                      } else {
                        if (this.field_E <= var3) {
                          break L39;
                        } else {
                          stackOut_226_0 = 1;
                          stackIn_234_0 = stackOut_226_0;
                          break L38;
                        }
                      }
                    }
                    if (this.field_S < 0) {
                      if (var3 > this.field_E) {
                        stackOut_232_0 = 1;
                        stackIn_234_0 = stackOut_232_0;
                        break L38;
                      } else {
                        stackOut_231_0 = 0;
                        stackIn_234_0 = stackOut_231_0;
                        break L38;
                      }
                    } else {
                      stackOut_229_0 = 0;
                      stackIn_234_0 = stackOut_229_0;
                      break L38;
                    }
                  } else {
                    stackOut_223_0 = 1;
                    stackIn_234_0 = stackOut_223_0;
                    break L38;
                  }
                }
                L40: {
                  var5 = stackIn_234_0;
                  if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                    break L40;
                  } else {
                    if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                      break L40;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L40;
                    }
                  }
                }
                L41: {
                  if (var4 == 0) {
                    break L41;
                  } else {
                    if (var5 != 0) {
                      break L41;
                    } else {
                      this.field_X = 0;
                      return false;
                    }
                  }
                }
                L42: {
                  if (var4 != 0) {
                    break L42;
                  } else {
                    if (var5 == 0) {
                      break L42;
                    } else {
                      this.field_S = 0;
                      if (ZombieDawnMulti.field_E) {
                        break L42;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  if (var5 != 0) {
                    this.field_E = this.field_P << 484587952;
                    this.field_z = this.field_O << 2020526896;
                    if (this.field_R) {
                      this.field_R = false;
                      this.field_O = this.field_V;
                      this.field_P = this.field_L;
                      this.d(6, this.field_T);
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
                L43: {
                  var4 = 1;
                  if (this.field_S != 0) {
                    if (-1 <= (this.field_S ^ -1)) {
                      if (this.field_S < 0) {
                        if (var3 > this.field_E) {
                          L44: {
                            var5 = 1;
                            if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                              break L44;
                            } else {
                              if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                                break L44;
                              } else {
                                var4 = 1;
                                var5 = 1;
                                break L44;
                              }
                            }
                          }
                          L45: {
                            if (var4 == 0) {
                              break L45;
                            } else {
                              if (var5 != 0) {
                                break L45;
                              } else {
                                this.field_X = 0;
                                return false;
                              }
                            }
                          }
                          L46: {
                            if (var4 != 0) {
                              break L46;
                            } else {
                              if (var5 == 0) {
                                break L46;
                              } else {
                                this.field_S = 0;
                                if (ZombieDawnMulti.field_E) {
                                  break L46;
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 != 0) {
                              this.field_E = this.field_P << 484587952;
                              this.field_z = this.field_O << 2020526896;
                              if (this.field_R) {
                                this.field_R = false;
                                this.field_O = this.field_V;
                                this.field_P = this.field_L;
                                this.d(6, this.field_T);
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
                          stackOut_171_0 = 0;
                          stackIn_195_0 = stackOut_171_0;
                          break L43;
                        }
                      } else {
                        stackOut_169_0 = 0;
                        stackIn_195_0 = stackOut_169_0;
                        break L43;
                      }
                    } else {
                      if (this.field_E <= var3) {
                        L47: {
                          if (this.field_S < 0) {
                            if (var3 <= this.field_E) {
                              stackOut_145_0 = 0;
                              stackIn_146_0 = stackOut_145_0;
                              break L47;
                            } else {
                              stackOut_144_0 = 1;
                              stackIn_146_0 = stackOut_144_0;
                              break L47;
                            }
                          } else {
                            stackOut_142_0 = 0;
                            stackIn_146_0 = stackOut_142_0;
                            break L47;
                          }
                        }
                        L48: {
                          var5 = stackIn_146_0;
                          if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                            break L48;
                          } else {
                            if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                              break L48;
                            } else {
                              var4 = 1;
                              var5 = 1;
                              break L48;
                            }
                          }
                        }
                        L49: {
                          if (var4 == 0) {
                            break L49;
                          } else {
                            if (var5 != 0) {
                              break L49;
                            } else {
                              this.field_X = 0;
                              return false;
                            }
                          }
                        }
                        L50: {
                          if (var4 != 0) {
                            break L50;
                          } else {
                            if (var5 == 0) {
                              break L50;
                            } else {
                              this.field_S = 0;
                              if (ZombieDawnMulti.field_E) {
                                break L50;
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                        if (var4 != 0) {
                          if (var5 != 0) {
                            this.field_E = this.field_P << 484587952;
                            this.field_z = this.field_O << 2020526896;
                            if (this.field_R) {
                              this.field_R = false;
                              this.field_O = this.field_V;
                              this.field_P = this.field_L;
                              this.d(6, this.field_T);
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
                        stackOut_140_0 = 1;
                        stackIn_195_0 = stackOut_140_0;
                        break L43;
                      }
                    }
                  } else {
                    stackOut_137_0 = 1;
                    stackIn_195_0 = stackOut_137_0;
                    break L43;
                  }
                }
                L51: {
                  var5 = stackIn_195_0;
                  if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                    break L51;
                  } else {
                    if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                      break L51;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L51;
                    }
                  }
                }
                L52: {
                  if (var4 == 0) {
                    break L52;
                  } else {
                    if (var5 != 0) {
                      break L52;
                    } else {
                      this.field_X = 0;
                      return false;
                    }
                  }
                }
                L53: {
                  if (var4 != 0) {
                    break L53;
                  } else {
                    if (var5 == 0) {
                      break L53;
                    } else {
                      this.field_S = 0;
                      if (ZombieDawnMulti.field_E) {
                        break L53;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  if (var5 != 0) {
                    this.field_E = this.field_P << 484587952;
                    this.field_z = this.field_O << 2020526896;
                    if (this.field_R) {
                      this.field_R = false;
                      this.field_O = this.field_V;
                      this.field_P = this.field_L;
                      this.d(6, this.field_T);
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
            }
          } else {
            L54: {
              var4 = 1;
              if (this.field_S != 0) {
                if (-1 <= (this.field_S ^ -1)) {
                  if (this.field_S < 0) {
                    if (var3 > this.field_E) {
                      L55: {
                        var5 = 1;
                        if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                          break L55;
                        } else {
                          if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                            break L55;
                          } else {
                            var4 = 1;
                            var5 = 1;
                            break L55;
                          }
                        }
                      }
                      L56: {
                        if (var4 == 0) {
                          break L56;
                        } else {
                          if (var5 != 0) {
                            break L56;
                          } else {
                            this.field_X = 0;
                            return false;
                          }
                        }
                      }
                      L57: {
                        if (var4 != 0) {
                          break L57;
                        } else {
                          if (var5 == 0) {
                            break L57;
                          } else {
                            this.field_S = 0;
                            if (ZombieDawnMulti.field_E) {
                              break L57;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        if (var5 != 0) {
                          this.field_E = this.field_P << 484587952;
                          this.field_z = this.field_O << 2020526896;
                          if (this.field_R) {
                            this.field_R = false;
                            this.field_O = this.field_V;
                            this.field_P = this.field_L;
                            this.d(6, this.field_T);
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
                      stackOut_88_0 = 0;
                      stackIn_112_0 = stackOut_88_0;
                      break L54;
                    }
                  } else {
                    stackOut_86_0 = 0;
                    stackIn_112_0 = stackOut_86_0;
                    break L54;
                  }
                } else {
                  if (this.field_E <= var3) {
                    L58: {
                      if (this.field_S < 0) {
                        if (var3 <= this.field_E) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L58;
                        } else {
                          stackOut_61_0 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          break L58;
                        }
                      } else {
                        stackOut_59_0 = 0;
                        stackIn_63_0 = stackOut_59_0;
                        break L58;
                      }
                    }
                    L59: {
                      var5 = stackIn_63_0;
                      if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                        break L59;
                      } else {
                        if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                          break L59;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L59;
                        }
                      }
                    }
                    L60: {
                      if (var4 == 0) {
                        break L60;
                      } else {
                        if (var5 != 0) {
                          break L60;
                        } else {
                          this.field_X = 0;
                          return false;
                        }
                      }
                    }
                    L61: {
                      if (var4 != 0) {
                        break L61;
                      } else {
                        if (var5 == 0) {
                          break L61;
                        } else {
                          this.field_S = 0;
                          if (ZombieDawnMulti.field_E) {
                            break L61;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      if (var5 != 0) {
                        this.field_E = this.field_P << 484587952;
                        this.field_z = this.field_O << 2020526896;
                        if (this.field_R) {
                          this.field_R = false;
                          this.field_O = this.field_V;
                          this.field_P = this.field_L;
                          this.d(6, this.field_T);
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
                    stackOut_57_0 = 1;
                    stackIn_112_0 = stackOut_57_0;
                    break L54;
                  }
                }
              } else {
                stackOut_54_0 = 1;
                stackIn_112_0 = stackOut_54_0;
                break L54;
              }
            }
            L62: {
              var5 = stackIn_112_0;
              if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                break L62;
              } else {
                if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                  break L62;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L62;
                }
              }
            }
            L63: {
              if (var4 == 0) {
                break L63;
              } else {
                if (var5 != 0) {
                  break L63;
                } else {
                  this.field_X = 0;
                  return false;
                }
              }
            }
            L64: {
              if (var4 != 0) {
                break L64;
              } else {
                if (var5 == 0) {
                  break L64;
                } else {
                  this.field_S = 0;
                  if (ZombieDawnMulti.field_E) {
                    break L64;
                  } else {
                    return false;
                  }
                }
              }
            }
            if (var4 != 0) {
              if (var5 != 0) {
                this.field_E = this.field_P << 484587952;
                this.field_z = this.field_O << 2020526896;
                if (this.field_R) {
                  this.field_R = false;
                  this.field_O = this.field_V;
                  this.field_P = this.field_L;
                  this.d(6, this.field_T);
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
          L65: {
            this.field_X = 119;
            var2 = this.field_O << -143654544;
            var3 = this.field_P << -1371553200;
            if (this.field_X != 0) {
              break L65;
            } else {
              if (this.field_S != 0) {
                break L65;
              } else {
                return false;
              }
            }
          }
          L66: {
            if (this.field_X != 0) {
              L67: {
                if (this.field_X <= 0) {
                  break L67;
                } else {
                  if (this.field_z <= var2) {
                    break L67;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_16_0 = stackOut_8_0;
                    break L66;
                  }
                }
              }
              if ((this.field_X ^ -1) > -1) {
                if (this.field_z < var2) {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L66;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_16_0 = stackOut_13_0;
                  break L66;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_16_0 = stackOut_11_0;
                break L66;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_16_0 = stackOut_5_0;
              break L66;
            }
          }
          L68: {
            var4 = stackIn_16_0;
            if (this.field_S != 0) {
              L69: {
                if (-1 <= (this.field_S ^ -1)) {
                  break L69;
                } else {
                  if (this.field_E <= var3) {
                    break L69;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_28_0 = stackOut_20_0;
                    break L68;
                  }
                }
              }
              if (this.field_S < 0) {
                if (var3 > this.field_E) {
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L68;
                } else {
                  stackOut_25_0 = 0;
                  stackIn_28_0 = stackOut_25_0;
                  break L68;
                }
              } else {
                stackOut_23_0 = 0;
                stackIn_28_0 = stackOut_23_0;
                break L68;
              }
            } else {
              stackOut_17_0 = 1;
              stackIn_28_0 = stackOut_17_0;
              break L68;
            }
          }
          L70: {
            var5 = stackIn_28_0;
            if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
              break L70;
            } else {
              if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                break L70;
              } else {
                var4 = 1;
                var5 = 1;
                break L70;
              }
            }
          }
          L71: {
            if (var4 == 0) {
              break L71;
            } else {
              if (var5 != 0) {
                break L71;
              } else {
                this.field_X = 0;
                return false;
              }
            }
          }
          L72: {
            if (var4 != 0) {
              break L72;
            } else {
              if (var5 == 0) {
                break L72;
              } else {
                this.field_S = 0;
                if (ZombieDawnMulti.field_E) {
                  break L72;
                } else {
                  return false;
                }
              }
            }
          }
          if (var4 != 0) {
            if (var5 != 0) {
              this.field_E = this.field_P << 484587952;
              this.field_z = this.field_O << 2020526896;
              if (this.field_R) {
                this.field_R = false;
                this.field_O = this.field_V;
                this.field_P = this.field_L;
                this.d(6, this.field_T);
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
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var3 = this.field_O - this.g(param0 + 68);
          var4 = this.field_P + -this.h(-80);
          var5 = g.b(var3 * var3 + var4 * var4);
          if (param0 == 6) {
            break L0;
          } else {
            this.c(-72, 91);
            break L0;
          }
        }
        if (-1 == (var5 ^ -1)) {
          if (-2 != (this.field_K ^ -1)) {
            if (5 != this.field_K) {
              if (6 != this.field_K) {
                if (this.field_K == 7) {
                  L1: {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (!(this instanceof gm)) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 4;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      break L1;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = 0;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L1;
                    }
                  }
                  L2: {
                    this.b(stackIn_30_1, param0 + -27661);
                    if (!ZombieDawnMulti.field_E) {
                      break L2;
                    } else {
                      var6 = param1 / var5;
                      this.a(var6 * var4, var6 * var3, (byte) -121);
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  stackOut_19_0 = this;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (!(this instanceof gm)) {
                    stackOut_21_0 = this;
                    stackOut_21_1 = 4;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L3;
                  } else {
                    stackOut_20_0 = this;
                    stackOut_20_1 = 0;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L3;
                  }
                }
                L4: {
                  this.b(stackIn_22_1, param0 + -27661);
                  if (!ZombieDawnMulti.field_E) {
                    break L4;
                  } else {
                    var6 = param1 / var5;
                    this.a(var6 * var4, var6 * var3, (byte) -121);
                    break L4;
                  }
                }
                return;
              }
            } else {
              L5: {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (!(this instanceof gm)) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 4;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L5;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L5;
                }
              }
              L6: {
                this.b(stackIn_15_1, param0 + -27661);
                if (!ZombieDawnMulti.field_E) {
                  break L6;
                } else {
                  var6 = param1 / var5;
                  this.a(var6 * var4, var6 * var3, (byte) -121);
                  break L6;
                }
              }
              return;
            }
          } else {
            L7: {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (!(this instanceof gm)) {
                stackOut_7_0 = this;
                stackOut_7_1 = 4;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L7;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L7;
              }
            }
            L8: {
              this.b(stackIn_8_1, param0 + -27661);
              if (!ZombieDawnMulti.field_E) {
                break L8;
              } else {
                var6 = param1 / var5;
                this.a(var6 * var4, var6 * var3, (byte) -121);
                break L8;
              }
            }
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
            this.field_bb = -7;
            this.field_S = param0;
            this.field_X = param1;
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
          ((ti) (this)).field_F = stackIn_8_1;
          return;
        } else {
          L1: {
            this.field_S = param0;
            this.field_X = param1;
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
          ((ti) (this)).field_F = stackIn_4_1;
          return;
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var3 = 0;
        if (gg.field_j[param1] > this.field_ab) {
          if (param0 != 30818) {
            L0: {
              field_Y = 103;
              var3 = gg.field_b[param1];
              if (0 < this.field_G) {
                var3 = var3 * 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              fieldTemp$8 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$8) {
                L2: {
                  fieldTemp$9 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$9 == gg.field_j[param1]) {
                    this.field_ab = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_Q = 0;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L3: {
              var3 = gg.field_b[param1];
              if (0 < this.field_G) {
                var3 = var3 * 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              fieldTemp$10 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$10) {
                L5: {
                  fieldTemp$11 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$11 == gg.field_j[param1]) {
                    this.field_ab = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_Q = 0;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          this.field_ab = 0;
          if (param0 == 30818) {
            L6: {
              var3 = gg.field_b[param1];
              if (0 < this.field_G) {
                var3 = var3 * 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              fieldTemp$12 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$12) {
                L8: {
                  fieldTemp$13 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$13 == gg.field_j[param1]) {
                    this.field_ab = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                this.field_Q = 0;
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
              if (0 < this.field_G) {
                var3 = var3 * 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              fieldTemp$14 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$14) {
                L11: {
                  fieldTemp$15 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$15 == gg.field_j[param1]) {
                    this.field_ab = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.field_Q = 0;
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
        field_J = 3;
        field_Y = 0;
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_I = 10;
        field_Z = "Whisk your zombies across time and space. Well, maybe not time.";
        field_M = new String[]{"The Mall", "Power Plant", "Police Precinct", "White House"};
    }
}
