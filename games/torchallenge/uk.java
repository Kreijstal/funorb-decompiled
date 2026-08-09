/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk extends ic {
    private int field_F;
    private int field_M;
    private boolean field_R;
    static int field_L;
    private int field_S;
    private boolean field_T;
    static vi field_I;
    private int field_P;
    static String field_Q;
    static int field_G;
    static int[] field_U;
    static int field_H;
    static String field_K;
    static int field_J;
    static ka field_N;

    final void a(ee param0, int param1, byte param2, int param3) {
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_A instanceof ng)) {
                    break L3;
                  } else {
                    if (!((ng) ((Object) this.field_A)).field_F) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_z != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -this.field_P + kc.field_u - param1;
                    var6 = -this.field_F + ph.field_d - param3;
                    if (var5_int != this.field_m) {
                      break L4;
                    } else {
                      if (this.field_i == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_i = var6;
                  this.field_m = var5_int;
                  if (!(this.field_k instanceof hj)) {
                    break L1;
                  } else {
                    ((hj) ((Object) this.field_k)).a((uk) (this), param3, param1, 3091);
                    break L1;
                  }
                }
              }
              if (!this.field_T) {
                break L1;
              } else {
                L5: {
                  if (this.field_m == this.field_S) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_m + this.field_S;
                      stackIn_16_0 = this;

                      stackIn_16_1 = this.field_m;

                      if (-3 > (Math.abs(var5_int) ^ -1)) {
                        stackIn_17_0 = this;
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = var5_int >> -1243910207;
                        break L6;
                      } else {
                        stackIn_15_0 = this;

                        if (var5_int <= 0) {
                          stackIn_17_0 = this;
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = -1;
                          break L6;
                        } else {
                          stackIn_17_0 = this;
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((uk) (this)).field_m = stackIn_17_1 + stackIn_17_2;
                    break L5;
                  }
                }
                if (this.field_i == this.field_M) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_M - this.field_i;
                    stackIn_21_0 = this;

                    stackIn_21_1 = this.field_i;

                    if (-3 <= (Math.abs(var5_int) ^ -1)) {
                      stackIn_23_0 = this;

                      if ((var5_int ^ -1) >= -1) {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = -1;
                        break L7;
                      } else {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = 1;
                        break L7;
                      }
                    } else {
                      stackIn_24_0 = this;
                      stackIn_24_1 = stackIn_21_1;
                      stackIn_24_2 = var5_int >> 1421798561;
                      break L7;
                    }
                  }
                  ((uk) (this)).field_i = stackIn_24_1 + stackIn_24_2;
                  break L1;
                }
              }
            }
            L8: {
              super.a(param0, param1, (byte) -121, param3);
              if (param2 <= -97) {
                break L8;
              } else {
                field_U = (int[]) null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("uk.U(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param1 != -111) {
          field_U = (int[]) null;
          var2 = param0;
          if (var2 != 32) {
            L0: {
              if (160 != var2) {
                if (-96 == (var2 ^ -1)) {
                  break L0;
                } else {
                  if (var2 != 45) {
                    if (-92 == (var2 ^ -1)) {
                      return param0;
                    } else {
                      if ((var2 ^ -1) != -94) {
                        if (var2 != 35) {
                          L1: {
                            if (var2 == 224) {
                              break L1;
                            } else {
                              if ((var2 ^ -1) == -226) {
                                break L1;
                              } else {
                                if (var2 != 226) {
                                  if (var2 != 228) {
                                    if (227 == var2) {
                                      break L1;
                                    } else {
                                      if (-193 != (var2 ^ -1)) {
                                        if (193 != var2) {
                                          if ((var2 ^ -1) != -195) {
                                            if (196 != var2) {
                                              if (195 == var2) {
                                                break L1;
                                              } else {
                                                if (232 != var2) {
                                                  L2: {
                                                    if (233 == var2) {
                                                      break L2;
                                                    } else {
                                                      if (var2 == 234) {
                                                        break L2;
                                                      } else {
                                                        if (235 == var2) {
                                                          break L2;
                                                        } else {
                                                          if (-201 == (var2 ^ -1)) {
                                                            break L2;
                                                          } else {
                                                            if (-202 == (var2 ^ -1)) {
                                                              break L2;
                                                            } else {
                                                              if (var2 == 202) {
                                                                break L2;
                                                              } else {
                                                                if ((var2 ^ -1) != -204) {
                                                                  L3: {
                                                                    if (237 == var2) {
                                                                      break L3;
                                                                    } else {
                                                                      if (var2 != 238) {
                                                                        if ((var2 ^ -1) != -240) {
                                                                          if ((var2 ^ -1) == -206) {
                                                                            break L3;
                                                                          } else {
                                                                            if ((var2 ^ -1) == -207) {
                                                                              break L3;
                                                                            } else {
                                                                              if ((var2 ^ -1) == -208) {
                                                                                break L3;
                                                                              } else {
                                                                                L4: {
                                                                                  if (var2 == 242) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (243 == var2) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      if ((var2 ^ -1) == -245) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        if ((var2 ^ -1) == -247) {
                                                                                          break L4;
                                                                                        } else {
                                                                                          if (245 == var2) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            if (var2 != 210) {
                                                                                              if ((var2 ^ -1) != -212) {
                                                                                                if ((var2 ^ -1) == -213) {
                                                                                                  break L4;
                                                                                                } else {
                                                                                                  if (var2 == 214) {
                                                                                                    break L4;
                                                                                                  } else {
                                                                                                    if (-214 == (var2 ^ -1)) {
                                                                                                      break L4;
                                                                                                    } else {
                                                                                                      L5: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L5;
                                                                                                        } else {
                                                                                                          if (var2 == 250) {
                                                                                                            break L5;
                                                                                                          } else {
                                                                                                            if ((var2 ^ -1) == -252) {
                                                                                                              break L5;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) != -253) {
                                                                                                                if (217 == var2) {
                                                                                                                  break L5;
                                                                                                                } else {
                                                                                                                  if (218 == var2) {
                                                                                                                    break L5;
                                                                                                                  } else {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L5;
                                                                                                                    } else {
                                                                                                                      if (-221 == (var2 ^ -1)) {
                                                                                                                        break L5;
                                                                                                                      } else {
                                                                                                                        if (-232 != (var2 ^ -1)) {
                                                                                                                          if ((var2 ^ -1) == -200) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (255 != var2) {
                                                                                                                              if (-377 == (var2 ^ -1)) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (-242 == (var2 ^ -1)) {
                                                                                                                                  return 'n';
                                                                                                                                } else {
                                                                                                                                  if ((var2 ^ -1) != -210) {
                                                                                                                                    if (223 != var2) {
                                                                                                                                      return Character.toLowerCase(param0);
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
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            } else {
                                                                                              return 'o';
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          return 'i';
                                                                        }
                                                                      } else {
                                                                        return 'i';
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  return 'e';
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
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
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              }
                            }
                          }
                          return 'a';
                        } else {
                          return param0;
                        }
                      } else {
                        return param0;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param0;
          if (var2 != 32) {
            L6: {
              if (160 != var2) {
                if (-96 != (var2 ^ -1)) {
                  if (var2 != 45) {
                    if (-92 != (var2 ^ -1)) {
                      L7: {
                        if ((var2 ^ -1) != -94) {
                          if (var2 != 35) {
                            if (var2 != 224) {
                              L8: {
                                if ((var2 ^ -1) == -226) {
                                  break L8;
                                } else {
                                  if (var2 != 226) {
                                    if (var2 != 228) {
                                      if (227 == var2) {
                                        break L8;
                                      } else {
                                        if (-193 != (var2 ^ -1)) {
                                          if (193 != var2) {
                                            if ((var2 ^ -1) != -195) {
                                              if (196 != var2) {
                                                if (195 == var2) {
                                                  break L8;
                                                } else {
                                                  L9: {
                                                    if (232 != var2) {
                                                      if (233 == var2) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L9;
                                                        } else {
                                                          if (235 == var2) {
                                                            break L9;
                                                          } else {
                                                            if (-201 == (var2 ^ -1)) {
                                                              break L9;
                                                            } else {
                                                              if (-202 == (var2 ^ -1)) {
                                                                break L9;
                                                              } else {
                                                                if (var2 == 202) {
                                                                  break L9;
                                                                } else {
                                                                  if ((var2 ^ -1) != -204) {
                                                                    L10: {
                                                                      if (237 == var2) {
                                                                        break L10;
                                                                      } else {
                                                                        if (var2 != 238) {
                                                                          if ((var2 ^ -1) != -240) {
                                                                            if ((var2 ^ -1) == -206) {
                                                                              break L10;
                                                                            } else {
                                                                              if ((var2 ^ -1) == -207) {
                                                                                break L10;
                                                                              } else {
                                                                                if ((var2 ^ -1) == -208) {
                                                                                  break L10;
                                                                                } else {
                                                                                  L11: {
                                                                                    if (var2 == 242) {
                                                                                      break L11;
                                                                                    } else {
                                                                                      if (243 == var2) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if ((var2 ^ -1) == -245) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          if ((var2 ^ -1) == -247) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            if (245 == var2) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if (var2 != 210) {
                                                                                                if ((var2 ^ -1) != -212) {
                                                                                                  if ((var2 ^ -1) == -213) {
                                                                                                    break L11;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      if (-214 == (var2 ^ -1)) {
                                                                                                        break L11;
                                                                                                      } else {
                                                                                                        L12: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            if (var2 == 250) {
                                                                                                              break L12;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) == -252) {
                                                                                                                break L12;
                                                                                                              } else {
                                                                                                                if ((var2 ^ -1) != -253) {
                                                                                                                  if (217 == var2) {
                                                                                                                    break L12;
                                                                                                                  } else {
                                                                                                                    if (218 == var2) {
                                                                                                                      break L12;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) == -220) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (-221 == (var2 ^ -1)) {
                                                                                                                          break L12;
                                                                                                                        } else {
                                                                                                                          if (-232 != (var2 ^ -1)) {
                                                                                                                            if ((var2 ^ -1) == -200) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (255 != var2) {
                                                                                                                                if (-377 == (var2 ^ -1)) {
                                                                                                                                  return 'y';
                                                                                                                                } else {
                                                                                                                                  if (-242 == (var2 ^ -1)) {
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    if ((var2 ^ -1) != -210) {
                                                                                                                                      if (223 != var2) {
                                                                                                                                        return Character.toLowerCase(param0);
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
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L10;
                                                                          }
                                                                        } else {
                                                                          break L10;
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    break L9;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L8;
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              return 'a';
                            } else {
                              return 'a';
                            }
                          } else {
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                      return param0;
                    } else {
                      return param0;
                    }
                  } else {
                    break L6;
                  }
                } else {
                  return '_';
                }
              } else {
                break L6;
              }
            }
            return '_';
          } else {
            return '_';
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_R) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param0, param1, param3, -29991, param4)) {
              L2: {
                if (param5 == 1) {
                  this.field_P = param1 + -this.field_m - param4;
                  this.field_F = -this.field_i + param0 - param3;
                  gl.field_b = (uk) (this);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_z = param5;
              stackIn_10_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = var8_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("uk.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    public static void d(byte param0) {
        field_Q = null;
        field_I = null;
        field_U = null;
        field_K = null;
        if (param0 != 50) {
            return;
        }
        field_N = null;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        ee var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param0, param1, -127, param2)) {
                break L1;
              } else {
                this.a(param2, 20, param0, param1);
                this.a((byte) 98, param2, param0, param1);
                discarded$64 = param2.append(" revert=").append(this.field_T);
                if (this.field_S == 2147483647) {
                  break L1;
                } else {
                  if (2147483647 != this.field_M) {
                    discarded$65 = param2.append(" to ").append(this.field_S).append(',').append(this.field_M);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                var6 = (ee) null;
                this.a(-98, (byte) -61, (ee) null, -95, 42, 108);
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("uk.W(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        try {
            int var7_int = 56 % ((param1 - -29) / 39);
            super.a(param0, (byte) -127, param2, param3, param4, param5);
            this.field_z = 0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "uk.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ka[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var6_int = param5[0].field_q;
                  var7 = param5[2].field_q;
                  var8 = param5[param1].field_q;
                  param5[0].c(param2, param3, param0);
                  param5[2].c(param2 + (param4 - var7), param3, param0);
                  qg.a(bk.field_s);
                  qg.a(var6_int + param2, param3, param4 + param2 - var7, param3 - -param5[1].field_v);
                  var9 = var6_int + param2;
                  var10 = -var7 + param2 + param4;
                  param2 = var9;
                  L2: while (true) {
                    if (param2 >= var10) {
                      qg.b(bk.field_s);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param5[1].c(param2, param3, param0);
                      param2 = param2 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("uk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        super.a(103);
        this.field_A.a((byte) 117, 0, this.field_l, this.field_p, 0);
        this.field_S = this.field_m;
        this.field_M = this.field_i;
        int var2 = 48 % ((param0 - -45) / 48);
    }

    private uk(int param0, int param1, int param2, int param3, j param4, gg param5, ee param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_S = 2147483647;
        try {
            this.field_A = param6;
            this.field_R = param8 ? true : false;
            this.field_T = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "uk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_I = new vi();
        field_Q = "Go Back";
        field_J = 0;
        field_U = new int[]{5, 10, 15, 20, 25, -2};
        field_N = null;
        field_K = "Waiting for graphics";
    }
}
