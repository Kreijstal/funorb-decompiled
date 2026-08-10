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
        int var4;
        int var5;
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
        int var3;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -115 / ((param0 - -53) / 59);
            stackIn_1_0 = ng.a(-49, true, param1, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("ti.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
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
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_341_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
                              stackIn_255_0 = 1;
                              break L2;
                            }
                          }
                        }
                        if (this.field_S < 0) {
                          if (var3 > this.field_E) {
                            stackIn_255_0 = 1;
                            break L2;
                          } else {
                            stackIn_255_0 = 0;
                            break L2;
                          }
                        } else {
                          stackIn_255_0 = 0;
                          break L2;
                        }
                      } else {
                        stackIn_255_0 = 1;
                        break L2;
                      }
                    }
                    L4: {
                      var5 = stackIn_255_0;
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
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (var5 != 0) {
                          break L5;
                        } else {
                          this.field_X = 0;
                          return false;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (var5 == 0) {
                            break L7;
                          } else {
                            this.field_S = 0;
                            break L6;
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
                          break L6;
                        }
                      } else {
                        return false;
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
                                  return false;
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
                              L12: {
                                if (var4 != 0) {
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
                                } else {
                                  this.field_S = 0;
                                  break L12;
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
                  L13: {
                    var5 = 0;
                    if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                      break L13;
                    } else {
                      if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                        break L13;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var4 == 0) {
                      L15: {
                        if (var4 != 0) {
                          break L15;
                        } else {
                          if (var5 == 0) {
                            break L15;
                          } else {
                            this.field_S = 0;
                            return false;
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L14;
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
                        break L14;
                      } else {
                        if (var4 != 0) {
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
                        } else {
                          this.field_S = 0;
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (this.field_E <= var3) {
                    L16: {
                      if (this.field_S < 0) {
                        if (var3 <= this.field_E) {
                          stackIn_341_0 = 0;
                          break L16;
                        } else {
                          stackIn_341_0 = 1;
                          break L16;
                        }
                      } else {
                        stackIn_341_0 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      var5 = stackIn_341_0;
                      if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                        break L17;
                      } else {
                        if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                          break L17;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L17;
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var5 == 0) {
                            this.field_X = 0;
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var4 != 0) {
                          break L20;
                        } else {
                          if (var5 == 0) {
                            break L20;
                          } else {
                            this.field_S = 0;
                            break L18;
                          }
                        }
                      }
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
                          break L18;
                        }
                      }
                    }
                    return false;
                  } else {
                    L21: {
                      var5 = 1;
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
                    if (var4 == 0) {
                      L22: {
                        if (var4 != 0) {
                          break L22;
                        } else {
                          if (var5 == 0) {
                            break L22;
                          } else {
                            this.field_S = 0;
                            return false;
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
                      if (var5 != 0) {
                        L23: {
                          if (var4 != 0) {
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
                                break L23;
                              }
                            } else {
                              return false;
                            }
                          } else {
                            this.field_S = 0;
                            break L23;
                          }
                        }
                        return false;
                      } else {
                        this.field_X = 0;
                        return false;
                      }
                    }
                  }
                }
              } else {
                L24: {
                  var5 = 1;
                  if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                    break L24;
                  } else {
                    if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                      break L24;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L24;
                    }
                  }
                }
                if (var4 == 0) {
                  L25: {
                    if (var4 != 0) {
                      break L25;
                    } else {
                      if (var5 == 0) {
                        break L25;
                      } else {
                        this.field_S = 0;
                        return false;
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
                  if (var5 != 0) {
                    L26: {
                      if (var4 != 0) {
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
                            break L26;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        this.field_S = 0;
                        break L26;
                      }
                    }
                    return false;
                  } else {
                    this.field_X = 0;
                    return false;
                  }
                }
              }
            } else {
              if (this.field_z <= var2) {
                L27: {
                  if ((this.field_X ^ -1) > -1) {
                    if (this.field_z >= var2) {
                      stackIn_209_0 = 0;
                      break L27;
                    } else {
                      stackIn_209_0 = 1;
                      break L27;
                    }
                  } else {
                    stackIn_209_0 = 0;
                    break L27;
                  }
                }
                L28: {
                  var4 = stackIn_209_0;
                  if (this.field_S != 0) {
                    L29: {
                      if (-1 <= (this.field_S ^ -1)) {
                        break L29;
                      } else {
                        if (this.field_E <= var3) {
                          break L29;
                        } else {
                          stackIn_221_0 = 1;
                          break L28;
                        }
                      }
                    }
                    if (this.field_S < 0) {
                      if (var3 > this.field_E) {
                        stackIn_221_0 = 1;
                        break L28;
                      } else {
                        stackIn_221_0 = 0;
                        break L28;
                      }
                    } else {
                      stackIn_221_0 = 0;
                      break L28;
                    }
                  } else {
                    stackIn_221_0 = 1;
                    break L28;
                  }
                }
                L30: {
                  var5 = stackIn_221_0;
                  if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                    break L30;
                  } else {
                    if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                      break L30;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L30;
                    }
                  }
                }
                L31: {
                  if (var4 == 0) {
                    break L31;
                  } else {
                    if (var5 != 0) {
                      break L31;
                    } else {
                      this.field_X = 0;
                      return false;
                    }
                  }
                }
                L32: {
                  L33: {
                    if (var4 != 0) {
                      break L33;
                    } else {
                      if (var5 == 0) {
                        break L33;
                      } else {
                        this.field_S = 0;
                        break L32;
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
                      break L32;
                    }
                  } else {
                    return false;
                  }
                }
                return false;
              } else {
                L34: {
                  var4 = 1;
                  if (this.field_S != 0) {
                    if (-1 <= (this.field_S ^ -1)) {
                      if (this.field_S < 0) {
                        if (var3 > this.field_E) {
                          L35: {
                            var5 = 1;
                            if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                              break L35;
                            } else {
                              if (Math.abs(this.field_E + -var3) >= wc.field_O) {
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
                                this.field_X = 0;
                                return false;
                              }
                            }
                          }
                          L37: {
                            L38: {
                              if (var4 != 0) {
                                break L38;
                              } else {
                                if (var5 == 0) {
                                  break L38;
                                } else {
                                  this.field_S = 0;
                                  break L37;
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
                                break L37;
                              }
                            } else {
                              return false;
                            }
                          }
                          return false;
                        } else {
                          stackIn_184_0 = 0;
                          break L34;
                        }
                      } else {
                        stackIn_184_0 = 0;
                        break L34;
                      }
                    } else {
                      if (this.field_E <= var3) {
                        L39: {
                          if (this.field_S < 0) {
                            if (var3 <= this.field_E) {
                              stackIn_139_0 = 0;
                              break L39;
                            } else {
                              stackIn_139_0 = 1;
                              break L39;
                            }
                          } else {
                            stackIn_139_0 = 0;
                            break L39;
                          }
                        }
                        L40: {
                          var5 = stackIn_139_0;
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
                          L43: {
                            if (var4 != 0) {
                              break L43;
                            } else {
                              if (var5 == 0) {
                                break L43;
                              } else {
                                this.field_S = 0;
                                break L42;
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
                              break L42;
                            }
                          } else {
                            return false;
                          }
                        }
                        return false;
                      } else {
                        stackIn_184_0 = 1;
                        break L34;
                      }
                    }
                  } else {
                    stackIn_184_0 = 1;
                    break L34;
                  }
                }
                L44: {
                  var5 = stackIn_184_0;
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
                  L47: {
                    if (var4 != 0) {
                      break L47;
                    } else {
                      if (var5 == 0) {
                        break L47;
                      } else {
                        this.field_S = 0;
                        break L46;
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
                      break L46;
                    }
                  } else {
                    return false;
                  }
                }
                return false;
              }
            }
          } else {
            L48: {
              var4 = 1;
              if (this.field_S != 0) {
                if (-1 <= (this.field_S ^ -1)) {
                  if (this.field_S < 0) {
                    if (var3 > this.field_E) {
                      L49: {
                        var5 = 1;
                        if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                          break L49;
                        } else {
                          if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                            break L49;
                          } else {
                            var4 = 1;
                            var5 = 1;
                            break L49;
                          }
                        }
                      }
                      L50: {
                        if (var4 == 0) {
                          break L50;
                        } else {
                          if (var5 != 0) {
                            break L50;
                          } else {
                            this.field_X = 0;
                            return false;
                          }
                        }
                      }
                      L51: {
                        L52: {
                          if (var4 != 0) {
                            break L52;
                          } else {
                            if (var5 == 0) {
                              break L52;
                            } else {
                              this.field_S = 0;
                              break L51;
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
                            break L51;
                          }
                        } else {
                          return false;
                        }
                      }
                      return false;
                    } else {
                      stackIn_107_0 = 0;
                      break L48;
                    }
                  } else {
                    stackIn_107_0 = 0;
                    break L48;
                  }
                } else {
                  if (this.field_E <= var3) {
                    L53: {
                      if (this.field_S < 0) {
                        if (var3 <= this.field_E) {
                          stackIn_62_0 = 0;
                          break L53;
                        } else {
                          stackIn_62_0 = 1;
                          break L53;
                        }
                      } else {
                        stackIn_62_0 = 0;
                        break L53;
                      }
                    }
                    L54: {
                      var5 = stackIn_62_0;
                      if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                        break L54;
                      } else {
                        if (Math.abs(this.field_E + -var3) >= wc.field_O) {
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
                          this.field_X = 0;
                          return false;
                        }
                      }
                    }
                    L56: {
                      L57: {
                        if (var4 != 0) {
                          break L57;
                        } else {
                          if (var5 == 0) {
                            break L57;
                          } else {
                            this.field_S = 0;
                            break L56;
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
                          break L56;
                        }
                      } else {
                        return false;
                      }
                    }
                    return false;
                  } else {
                    stackIn_107_0 = 1;
                    break L48;
                  }
                }
              } else {
                stackIn_107_0 = 1;
                break L48;
              }
            }
            L58: {
              var5 = stackIn_107_0;
              if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
                break L58;
              } else {
                if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                  break L58;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L58;
                }
              }
            }
            L59: {
              if (var4 == 0) {
                break L59;
              } else {
                if (var5 != 0) {
                  break L59;
                } else {
                  this.field_X = 0;
                  return false;
                }
              }
            }
            L60: {
              L61: {
                if (var4 != 0) {
                  break L61;
                } else {
                  if (var5 == 0) {
                    break L61;
                  } else {
                    this.field_S = 0;
                    break L60;
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
                  break L60;
                }
              } else {
                return false;
              }
            }
            return false;
          }
        } else {
          L62: {
            this.field_X = 119;
            var2 = this.field_O << -143654544;
            var3 = this.field_P << -1371553200;
            if (this.field_X != 0) {
              break L62;
            } else {
              if (this.field_S != 0) {
                break L62;
              } else {
                return false;
              }
            }
          }
          L63: {
            if (this.field_X != 0) {
              L64: {
                if (this.field_X <= 0) {
                  break L64;
                } else {
                  if (this.field_z <= var2) {
                    break L64;
                  } else {
                    stackIn_16_0 = 1;
                    break L63;
                  }
                }
              }
              if ((this.field_X ^ -1) > -1) {
                if (this.field_z < var2) {
                  stackIn_16_0 = 1;
                  break L63;
                } else {
                  stackIn_16_0 = 0;
                  break L63;
                }
              } else {
                stackIn_16_0 = 0;
                break L63;
              }
            } else {
              stackIn_16_0 = 1;
              break L63;
            }
          }
          L65: {
            var4 = stackIn_16_0;
            if (this.field_S != 0) {
              L66: {
                if (-1 <= (this.field_S ^ -1)) {
                  break L66;
                } else {
                  if (this.field_E <= var3) {
                    break L66;
                  } else {
                    stackIn_28_0 = 1;
                    break L65;
                  }
                }
              }
              if (this.field_S < 0) {
                if (var3 > this.field_E) {
                  stackIn_28_0 = 1;
                  break L65;
                } else {
                  stackIn_28_0 = 0;
                  break L65;
                }
              } else {
                stackIn_28_0 = 0;
                break L65;
              }
            } else {
              stackIn_28_0 = 1;
              break L65;
            }
          }
          L67: {
            var5 = stackIn_28_0;
            if (Math.abs(-var2 + this.field_z) >= wc.field_O) {
              break L67;
            } else {
              if (Math.abs(this.field_E + -var3) >= wc.field_O) {
                break L67;
              } else {
                var4 = 1;
                var5 = 1;
                break L67;
              }
            }
          }
          L68: {
            if (var4 == 0) {
              break L68;
            } else {
              if (var5 != 0) {
                break L68;
              } else {
                this.field_X = 0;
                return false;
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
                this.field_S = 0;
                return false;
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
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
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
                    stackIn_23_0 = this;

                    if (!(this instanceof gm)) {
                      stackIn_24_0 = this;
                      stackIn_24_1 = 4;
                      break L1;
                    } else {
                      stackIn_24_0 = this;
                      stackIn_24_1 = 0;
                      break L1;
                    }
                  }
                  this.b(stackIn_24_1, param0 + -27661);
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  stackIn_17_0 = this;

                  if (!(this instanceof gm)) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = 4;
                    break L2;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = 0;
                    break L2;
                  }
                }
                this.b(stackIn_18_1, param0 + -27661);
                return;
              }
            } else {
              L3: {
                stackIn_12_0 = this;

                if (!(this instanceof gm)) {
                  stackIn_13_0 = this;
                  stackIn_13_1 = 4;
                  break L3;
                } else {
                  stackIn_13_0 = this;
                  stackIn_13_1 = 0;
                  break L3;
                }
              }
              this.b(stackIn_13_1, param0 + -27661);
              return;
            }
          } else {
            L4: {
              stackIn_7_0 = this;

              if (!(this instanceof gm)) {
                stackIn_8_0 = this;
                stackIn_8_1 = 4;
                break L4;
              } else {
                stackIn_8_0 = this;
                stackIn_8_1 = 0;
                break L4;
              }
            }
            this.b(stackIn_8_1, param0 + -27661);
            return;
          }
        } else {
          var6 = param1 / var5;
          this.a(var6 * var4, var6 * var3, (byte) -121);
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param2 > -120) {
          L0: {
            this.field_bb = -7;
            this.field_S = param0;
            this.field_X = param1;
            stackIn_7_0 = this;

            if (0 >= param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 3;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((ti) (this)).field_F = stackIn_8_1;
          return;
        } else {
          L1: {
            this.field_S = param0;
            this.field_X = param1;
            stackIn_3_0 = this;

            if (0 >= param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 3;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((ti) (this)).field_F = stackIn_4_1;
          return;
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
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
              fieldTemp$0 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$0) {
                L2: {
                  fieldTemp$1 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$1 == gg.field_j[param1]) {
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
              fieldTemp$2 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$2) {
                L5: {
                  fieldTemp$3 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$3 == gg.field_j[param1]) {
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
              fieldTemp$4 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$4) {
                L8: {
                  fieldTemp$5 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$5 == gg.field_j[param1]) {
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
              fieldTemp$6 = this.field_Q + 1;
              this.field_Q = this.field_Q + 1;
              if (var3 < fieldTemp$6) {
                L11: {
                  fieldTemp$7 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$7 == gg.field_j[param1]) {
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
