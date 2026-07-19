/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pa extends ek {
    int field_N;
    int field_W;
    int field_R;
    static cj field_O;
    int field_cb;
    static String field_bb;
    int field_Q;
    static ja field_T;
    static String field_Y;
    int field_ab;
    int field_db;
    private int field_U;
    boolean field_X;
    boolean field_Z;
    boolean field_S;
    int field_L;
    private int field_P;
    int field_V;
    int field_M;

    final boolean b(int param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_M = 1;
        if (param1 <= -14) {
          this.field_P = this.field_A.field_m.a((byte) 32, param0, 600);
          if (!(this instanceof lm)) {
            if ((this.field_Q ^ -1) != -6) {
              if (-8 != (this.field_Q ^ -1)) {
                if ((this.field_Q ^ -1) == -2) {
                  this.c(-60, this.field_M * 71680);
                  this.field_S = true;
                  return true;
                } else {
                  this.field_S = true;
                  return true;
                }
              } else {
                this.c(99, this.field_M * 57344);
                if (var4 != 0) {
                  L0: {
                    if ((this.field_Q ^ -1) == -2) {
                      this.c(-60, this.field_M * 71680);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  this.field_S = true;
                  return true;
                } else {
                  this.field_S = true;
                  return true;
                }
              }
            } else {
              this.c(-70, 28672 * this.field_M);
              if (var4 != 0) {
                if (-8 != (this.field_Q ^ -1)) {
                  if ((this.field_Q ^ -1) != -2) {
                    this.field_S = true;
                    return true;
                  } else {
                    this.c(-60, this.field_M * 71680);
                    this.field_S = true;
                    return true;
                  }
                } else {
                  L1: {
                    this.c(99, this.field_M * 57344);
                    if ((this.field_Q ^ -1) == -2) {
                      this.c(-60, this.field_M * 71680);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  this.field_S = true;
                  return true;
                }
              } else {
                this.field_S = true;
                return true;
              }
            }
          } else {
            this.field_P = this.field_P * 2;
            if ((this.field_Q ^ -1) != -6) {
              if (-8 != (this.field_Q ^ -1)) {
                if ((this.field_Q ^ -1) != -2) {
                  this.field_S = true;
                  return true;
                } else {
                  this.c(-60, this.field_M * 71680);
                  this.field_S = true;
                  return true;
                }
              } else {
                this.c(99, this.field_M * 57344);
                if (var4 != 0) {
                  L2: {
                    if ((this.field_Q ^ -1) == -2) {
                      this.c(-60, this.field_M * 71680);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_S = true;
                  return true;
                } else {
                  this.field_S = true;
                  return true;
                }
              }
            } else {
              this.c(-70, 28672 * this.field_M);
              if (var4 == 0) {
                this.field_S = true;
                return true;
              } else {
                L3: {
                  if (-8 != (this.field_Q ^ -1)) {
                    break L3;
                  } else {
                    this.c(99, this.field_M * 57344);
                    break L3;
                  }
                }
                L4: {
                  if ((this.field_Q ^ -1) == -2) {
                    this.c(-60, this.field_M * 71680);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_S = true;
                return true;
              }
            }
          }
        } else {
          pa.i((byte) -35);
          this.field_P = this.field_A.field_m.a((byte) 32, param0, 600);
          if (this instanceof lm) {
            this.field_P = this.field_P * 2;
            if ((this.field_Q ^ -1) == -6) {
              this.c(-70, 28672 * this.field_M);
              if (var4 != 0) {
                L5: {
                  if (-8 != (this.field_Q ^ -1)) {
                    break L5;
                  } else {
                    this.c(99, this.field_M * 57344);
                    break L5;
                  }
                }
                if ((this.field_Q ^ -1) != -2) {
                  this.field_S = true;
                  return true;
                } else {
                  this.c(-60, this.field_M * 71680);
                  this.field_S = true;
                  return true;
                }
              } else {
                this.field_S = true;
                return true;
              }
            } else {
              L6: {
                L7: {
                  if (-8 != (this.field_Q ^ -1)) {
                    break L7;
                  } else {
                    this.c(99, this.field_M * 57344);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if ((this.field_Q ^ -1) == -2) {
                  this.c(-60, this.field_M * 71680);
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_S = true;
              return true;
            }
          } else {
            L8: {
              L9: {
                if ((this.field_Q ^ -1) != -6) {
                  break L9;
                } else {
                  this.c(-70, 28672 * this.field_M);
                  if (var4 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (-8 != (this.field_Q ^ -1)) {
                  break L10;
                } else {
                  this.c(99, this.field_M * 57344);
                  if (var4 == 0) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
              if ((this.field_Q ^ -1) == -2) {
                this.c(-60, this.field_M * 71680);
                break L8;
              } else {
                break L8;
              }
            }
            this.field_S = true;
            return true;
          }
        }
    }

    final boolean c(byte param0, int param1) {
        boolean discarded$1 = false;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_M = 4;
        if (param0 == -68) {
          this.field_P = this.field_A.field_m.a((byte) 32, param1, 600);
          if (5 != this.field_Q) {
            if (this.field_Q != 7) {
              if ((this.field_Q ^ -1) != -2) {
                this.field_S = true;
                return true;
              } else {
                this.c(param0 ^ -31, this.field_M * 71680);
                this.field_S = true;
                return true;
              }
            } else {
              this.c(113, 57344 * this.field_M);
              if (var4 != 0) {
                L0: {
                  if ((this.field_Q ^ -1) == -2) {
                    this.c(param0 ^ -31, this.field_M * 71680);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                this.field_S = true;
                return true;
              } else {
                this.field_S = true;
                return true;
              }
            }
          } else {
            this.c(93, 28672 * this.field_M);
            if (var4 != 0) {
              if (this.field_Q != 7) {
                if ((this.field_Q ^ -1) != -2) {
                  this.field_S = true;
                  return true;
                } else {
                  this.c(param0 ^ -31, this.field_M * 71680);
                  this.field_S = true;
                  return true;
                }
              } else {
                L1: {
                  this.c(113, 57344 * this.field_M);
                  if ((this.field_Q ^ -1) == -2) {
                    this.c(param0 ^ -31, this.field_M * 71680);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_S = true;
                return true;
              }
            } else {
              this.field_S = true;
              return true;
            }
          }
        } else {
          discarded$1 = this.k(106);
          this.field_P = this.field_A.field_m.a((byte) 32, param1, 600);
          if (5 == this.field_Q) {
            this.c(93, 28672 * this.field_M);
            if (var4 != 0) {
              if (this.field_Q != 7) {
                if ((this.field_Q ^ -1) != -2) {
                  this.field_S = true;
                  return true;
                } else {
                  this.c(param0 ^ -31, this.field_M * 71680);
                  this.field_S = true;
                  return true;
                }
              } else {
                this.c(113, 57344 * this.field_M);
                if (var4 != 0) {
                  L2: {
                    if ((this.field_Q ^ -1) == -2) {
                      this.c(param0 ^ -31, this.field_M * 71680);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_S = true;
                  return true;
                } else {
                  this.field_S = true;
                  return true;
                }
              }
            } else {
              this.field_S = true;
              return true;
            }
          } else {
            if (this.field_Q != 7) {
              if ((this.field_Q ^ -1) != -2) {
                this.field_S = true;
                return true;
              } else {
                this.c(param0 ^ -31, this.field_M * 71680);
                this.field_S = true;
                return true;
              }
            } else {
              this.c(113, 57344 * this.field_M);
              if (var4 != 0) {
                L3: {
                  if ((this.field_Q ^ -1) == -2) {
                    this.c(param0 ^ -31, this.field_M * 71680);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_S = true;
                return true;
              } else {
                this.field_S = true;
                return true;
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_329_0 = 0;
        int stackIn_432_0 = 0;
        int stackOut_327_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_431_0 = 0;
        int stackOut_430_0 = 0;
        int stackOut_428_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_292_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_288_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 2) {
          var2 = this.field_N << -2141754256;
          var3 = this.field_ab << 272795408;
          if (0 != this.field_R) {
            if (this.field_R != 0) {
              if (0 >= this.field_R) {
                L0: {
                  if (0 <= this.field_R) {
                    break L0;
                  } else {
                    if (var2 <= this.field_G) {
                      break L0;
                    } else {
                      L1: {
                        var4 = 1;
                        if (this.field_W == 0) {
                          stackOut_327_0 = 1;
                          stackIn_329_0 = stackOut_327_0;
                          break L1;
                        } else {
                          L2: {
                            if (-1 <= (this.field_W ^ -1)) {
                              break L2;
                            } else {
                              if (var3 >= this.field_E) {
                                break L2;
                              } else {
                                stackOut_320_0 = 1;
                                stackIn_329_0 = stackOut_320_0;
                                break L1;
                              }
                            }
                          }
                          if (this.field_W < 0) {
                            if (var3 > this.field_E) {
                              stackOut_326_0 = 1;
                              stackIn_329_0 = stackOut_326_0;
                              break L1;
                            } else {
                              stackOut_325_0 = 0;
                              stackIn_329_0 = stackOut_325_0;
                              break L1;
                            }
                          } else {
                            stackOut_323_0 = 0;
                            stackIn_329_0 = stackOut_323_0;
                            break L1;
                          }
                        }
                      }
                      L3: {
                        var5 = stackIn_329_0;
                        if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                          break L3;
                        } else {
                          if (Math.abs(this.field_E + -var3) < ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        L5: {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            if (var5 != 0) {
                              break L5;
                            } else {
                              L6: {
                                if (-1 != (this.field_R ^ -1)) {
                                  this.field_S = true;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              this.field_R = 0;
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
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
                              L8: {
                                if (0 != this.field_W) {
                                  this.field_S = true;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              this.field_W = 0;
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L4;
                        } else {
                          if (var5 != 0) {
                            this.field_W = 0;
                            this.field_S = true;
                            this.field_G = this.field_N << -1095664624;
                            this.field_R = 0;
                            this.field_E = this.field_ab << 1342901968;
                            return true;
                          } else {
                            break L4;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                var4 = 0;
                if (this.field_W != 0) {
                  if (-1 <= (this.field_W ^ -1)) {
                    L9: {
                      if (this.field_W >= 0) {
                        break L9;
                      } else {
                        if (var3 <= this.field_E) {
                          break L9;
                        } else {
                          L10: {
                            var5 = 1;
                            if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                              break L10;
                            } else {
                              if (Math.abs(this.field_E + -var3) < ho.field_s) {
                                var5 = 1;
                                var4 = 1;
                                break L10;
                              } else {
                                L11: {
                                  L12: {
                                    if (var4 == 0) {
                                      break L12;
                                    } else {
                                      if (var5 != 0) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (-1 != (this.field_R ^ -1)) {
                                            this.field_S = true;
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        this.field_R = 0;
                                        if (var6 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var4 != 0) {
                                      break L14;
                                    } else {
                                      if (var5 == 0) {
                                        break L14;
                                      } else {
                                        L15: {
                                          if (0 != this.field_W) {
                                            this.field_S = true;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        this.field_W = 0;
                                        if (var6 == 0) {
                                          break L11;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  if (var4 == 0) {
                                    break L11;
                                  } else {
                                    if (var5 != 0) {
                                      this.field_W = 0;
                                      this.field_S = true;
                                      this.field_G = this.field_N << -1095664624;
                                      this.field_R = 0;
                                      this.field_E = this.field_ab << 1342901968;
                                      return true;
                                    } else {
                                      return false;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                          L16: {
                            L17: {
                              if (var4 == 0) {
                                break L17;
                              } else {
                                if (var5 != 0) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (-1 != (this.field_R ^ -1)) {
                                      this.field_S = true;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  this.field_R = 0;
                                  if (var6 == 0) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            L19: {
                              if (var4 != 0) {
                                break L19;
                              } else {
                                if (var5 == 0) {
                                  break L19;
                                } else {
                                  L20: {
                                    if (0 != this.field_W) {
                                      this.field_S = true;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  this.field_W = 0;
                                  if (var6 == 0) {
                                    break L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L16;
                            } else {
                              if (var5 != 0) {
                                this.field_W = 0;
                                this.field_S = true;
                                this.field_G = this.field_N << -1095664624;
                                this.field_R = 0;
                                this.field_E = this.field_ab << 1342901968;
                                return true;
                              } else {
                                return false;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                    L21: {
                      var5 = 0;
                      if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                        break L21;
                      } else {
                        if (Math.abs(this.field_E + -var3) < ho.field_s) {
                          var5 = 1;
                          var4 = 1;
                          break L21;
                        } else {
                          L22: {
                            L23: {
                              if (var4 == 0) {
                                break L23;
                              } else {
                                if (var5 != 0) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (-1 != (this.field_R ^ -1)) {
                                      this.field_S = true;
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  this.field_R = 0;
                                  if (var6 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
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
                                  L26: {
                                    if (0 != this.field_W) {
                                      this.field_S = true;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  this.field_W = 0;
                                  if (var6 == 0) {
                                    break L22;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L22;
                            } else {
                              if (var5 != 0) {
                                this.field_W = 0;
                                this.field_S = true;
                                this.field_G = this.field_N << -1095664624;
                                this.field_R = 0;
                                this.field_E = this.field_ab << 1342901968;
                                return true;
                              } else {
                                return false;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    }
                    L27: {
                      L28: {
                        if (var4 == 0) {
                          break L28;
                        } else {
                          if (var5 != 0) {
                            break L28;
                          } else {
                            L29: {
                              if (-1 != (this.field_R ^ -1)) {
                                this.field_S = true;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            this.field_R = 0;
                            if (var6 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      L30: {
                        if (var4 != 0) {
                          break L30;
                        } else {
                          if (var5 == 0) {
                            break L30;
                          } else {
                            L31: {
                              if (0 != this.field_W) {
                                this.field_S = true;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            this.field_W = 0;
                            if (var6 == 0) {
                              break L27;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L27;
                      } else {
                        if (var5 != 0) {
                          this.field_W = 0;
                          this.field_S = true;
                          this.field_G = this.field_N << -1095664624;
                          this.field_R = 0;
                          this.field_E = this.field_ab << 1342901968;
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                    return false;
                  } else {
                    if (var3 >= this.field_E) {
                      L32: {
                        if (this.field_W < 0) {
                          if (var3 <= this.field_E) {
                            stackOut_431_0 = 0;
                            stackIn_432_0 = stackOut_431_0;
                            break L32;
                          } else {
                            stackOut_430_0 = 1;
                            stackIn_432_0 = stackOut_430_0;
                            break L32;
                          }
                        } else {
                          stackOut_428_0 = 0;
                          stackIn_432_0 = stackOut_428_0;
                          break L32;
                        }
                      }
                      L33: {
                        var5 = stackIn_432_0;
                        if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                          break L33;
                        } else {
                          if (Math.abs(this.field_E + -var3) < ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L33;
                          } else {
                            L34: {
                              L35: {
                                if (var4 == 0) {
                                  break L35;
                                } else {
                                  if (var5 != 0) {
                                    break L35;
                                  } else {
                                    L36: {
                                      if (-1 != (this.field_R ^ -1)) {
                                        this.field_S = true;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    this.field_R = 0;
                                    if (var6 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                              L37: {
                                if (var4 != 0) {
                                  break L37;
                                } else {
                                  if (var5 == 0) {
                                    break L37;
                                  } else {
                                    L38: {
                                      if (0 != this.field_W) {
                                        this.field_S = true;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                    this.field_W = 0;
                                    if (var6 == 0) {
                                      break L34;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                              if (var4 == 0) {
                                break L34;
                              } else {
                                if (var5 != 0) {
                                  this.field_W = 0;
                                  this.field_S = true;
                                  this.field_G = this.field_N << -1095664624;
                                  this.field_R = 0;
                                  this.field_E = this.field_ab << 1342901968;
                                  return true;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                      L39: {
                        L40: {
                          if (var4 == 0) {
                            break L40;
                          } else {
                            if (var5 != 0) {
                              break L40;
                            } else {
                              L41: {
                                if (-1 != (this.field_R ^ -1)) {
                                  this.field_S = true;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              this.field_R = 0;
                              if (var6 == 0) {
                                break L39;
                              } else {
                                break L40;
                              }
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
                              L43: {
                                if (0 != this.field_W) {
                                  this.field_S = true;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                              this.field_W = 0;
                              if (var6 == 0) {
                                break L39;
                              } else {
                                break L42;
                              }
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L39;
                        } else {
                          if (var5 != 0) {
                            this.field_W = 0;
                            this.field_S = true;
                            this.field_G = this.field_N << -1095664624;
                            this.field_R = 0;
                            this.field_E = this.field_ab << 1342901968;
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                      return false;
                    } else {
                      L44: {
                        var5 = 1;
                        if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                          break L44;
                        } else {
                          if (Math.abs(this.field_E + -var3) < ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L44;
                          } else {
                            L45: {
                              L46: {
                                if (var4 == 0) {
                                  break L46;
                                } else {
                                  if (var5 != 0) {
                                    break L46;
                                  } else {
                                    L47: {
                                      if (-1 != (this.field_R ^ -1)) {
                                        this.field_S = true;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                    this.field_R = 0;
                                    if (var6 == 0) {
                                      break L45;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              L48: {
                                if (var4 != 0) {
                                  break L48;
                                } else {
                                  if (var5 == 0) {
                                    break L48;
                                  } else {
                                    L49: {
                                      if (0 != this.field_W) {
                                        this.field_S = true;
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                    this.field_W = 0;
                                    if (var6 == 0) {
                                      break L45;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                              }
                              if (var4 == 0) {
                                break L45;
                              } else {
                                if (var5 != 0) {
                                  this.field_W = 0;
                                  this.field_S = true;
                                  this.field_G = this.field_N << -1095664624;
                                  this.field_R = 0;
                                  this.field_E = this.field_ab << 1342901968;
                                  return true;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                      L50: {
                        L51: {
                          if (var4 == 0) {
                            break L51;
                          } else {
                            if (var5 != 0) {
                              break L51;
                            } else {
                              L52: {
                                if (-1 != (this.field_R ^ -1)) {
                                  this.field_S = true;
                                  break L52;
                                } else {
                                  break L52;
                                }
                              }
                              this.field_R = 0;
                              if (var6 == 0) {
                                break L50;
                              } else {
                                break L51;
                              }
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
                              L54: {
                                if (0 != this.field_W) {
                                  this.field_S = true;
                                  break L54;
                                } else {
                                  break L54;
                                }
                              }
                              this.field_W = 0;
                              if (var6 == 0) {
                                break L50;
                              } else {
                                break L53;
                              }
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L50;
                        } else {
                          if (var5 != 0) {
                            this.field_W = 0;
                            this.field_S = true;
                            this.field_G = this.field_N << -1095664624;
                            this.field_R = 0;
                            this.field_E = this.field_ab << 1342901968;
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                      return false;
                    }
                  }
                } else {
                  L55: {
                    var5 = 1;
                    if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                      break L55;
                    } else {
                      if (Math.abs(this.field_E + -var3) < ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L55;
                      } else {
                        L56: {
                          L57: {
                            if (var4 == 0) {
                              break L57;
                            } else {
                              if (var5 != 0) {
                                break L57;
                              } else {
                                L58: {
                                  if (-1 != (this.field_R ^ -1)) {
                                    this.field_S = true;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                                this.field_R = 0;
                                if (var6 == 0) {
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                          }
                          L59: {
                            if (var4 != 0) {
                              break L59;
                            } else {
                              if (var5 == 0) {
                                break L59;
                              } else {
                                L60: {
                                  if (0 != this.field_W) {
                                    this.field_S = true;
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                }
                                this.field_W = 0;
                                if (var6 == 0) {
                                  break L56;
                                } else {
                                  break L59;
                                }
                              }
                            }
                          }
                          if (var4 == 0) {
                            break L56;
                          } else {
                            if (var5 != 0) {
                              this.field_W = 0;
                              this.field_S = true;
                              this.field_G = this.field_N << -1095664624;
                              this.field_R = 0;
                              this.field_E = this.field_ab << 1342901968;
                              return true;
                            } else {
                              break L56;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  L61: {
                    L62: {
                      if (var4 == 0) {
                        break L62;
                      } else {
                        if (var5 != 0) {
                          break L62;
                        } else {
                          L63: {
                            if (-1 != (this.field_R ^ -1)) {
                              this.field_S = true;
                              break L63;
                            } else {
                              break L63;
                            }
                          }
                          this.field_R = 0;
                          if (var6 == 0) {
                            break L61;
                          } else {
                            break L62;
                          }
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
                          L65: {
                            if (0 != this.field_W) {
                              this.field_S = true;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                          this.field_W = 0;
                          if (var6 == 0) {
                            break L61;
                          } else {
                            break L64;
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L61;
                    } else {
                      if (var5 != 0) {
                        this.field_W = 0;
                        this.field_S = true;
                        this.field_G = this.field_N << -1095664624;
                        this.field_R = 0;
                        this.field_E = this.field_ab << 1342901968;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                  return false;
                }
              } else {
                if (this.field_G <= var2) {
                  L66: {
                    if (0 > this.field_R) {
                      if (var2 <= this.field_G) {
                        stackOut_281_0 = 0;
                        stackIn_282_0 = stackOut_281_0;
                        break L66;
                      } else {
                        stackOut_280_0 = 1;
                        stackIn_282_0 = stackOut_280_0;
                        break L66;
                      }
                    } else {
                      stackOut_278_0 = 0;
                      stackIn_282_0 = stackOut_278_0;
                      break L66;
                    }
                  }
                  L67: {
                    var4 = stackIn_282_0;
                    if (this.field_W == 0) {
                      stackOut_292_0 = 1;
                      stackIn_294_0 = stackOut_292_0;
                      break L67;
                    } else {
                      L68: {
                        if (-1 <= (this.field_W ^ -1)) {
                          break L68;
                        } else {
                          if (var3 >= this.field_E) {
                            break L68;
                          } else {
                            stackOut_285_0 = 1;
                            stackIn_294_0 = stackOut_285_0;
                            break L67;
                          }
                        }
                      }
                      if (this.field_W < 0) {
                        if (var3 > this.field_E) {
                          stackOut_291_0 = 1;
                          stackIn_294_0 = stackOut_291_0;
                          break L67;
                        } else {
                          stackOut_290_0 = 0;
                          stackIn_294_0 = stackOut_290_0;
                          break L67;
                        }
                      } else {
                        stackOut_288_0 = 0;
                        stackIn_294_0 = stackOut_288_0;
                        break L67;
                      }
                    }
                  }
                  L69: {
                    var5 = stackIn_294_0;
                    if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                      break L69;
                    } else {
                      if (Math.abs(this.field_E + -var3) < ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L69;
                      } else {
                        break L69;
                      }
                    }
                  }
                  L70: {
                    L71: {
                      if (var4 == 0) {
                        break L71;
                      } else {
                        if (var5 != 0) {
                          break L71;
                        } else {
                          L72: {
                            if (-1 != (this.field_R ^ -1)) {
                              this.field_S = true;
                              break L72;
                            } else {
                              break L72;
                            }
                          }
                          this.field_R = 0;
                          if (var6 == 0) {
                            break L70;
                          } else {
                            break L71;
                          }
                        }
                      }
                    }
                    L73: {
                      if (var4 != 0) {
                        break L73;
                      } else {
                        if (var5 == 0) {
                          break L73;
                        } else {
                          L74: {
                            if (0 != this.field_W) {
                              this.field_S = true;
                              break L74;
                            } else {
                              break L74;
                            }
                          }
                          this.field_W = 0;
                          if (var6 == 0) {
                            break L70;
                          } else {
                            break L73;
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L70;
                    } else {
                      if (var5 != 0) {
                        this.field_W = 0;
                        this.field_S = true;
                        this.field_G = this.field_N << -1095664624;
                        this.field_R = 0;
                        this.field_E = this.field_ab << 1342901968;
                        return true;
                      } else {
                        break L70;
                      }
                    }
                  }
                  return false;
                } else {
                  L75: {
                    var4 = 1;
                    if (this.field_W != 0) {
                      if (-1 <= (this.field_W ^ -1)) {
                        if (this.field_W < 0) {
                          if (var3 > this.field_E) {
                            L76: {
                              var5 = 1;
                              if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                                break L76;
                              } else {
                                if (Math.abs(this.field_E + -var3) < ho.field_s) {
                                  var5 = 1;
                                  var4 = 1;
                                  break L76;
                                } else {
                                  break L76;
                                }
                              }
                            }
                            L77: {
                              if (var4 == 0) {
                                break L77;
                              } else {
                                if (var5 != 0) {
                                  break L77;
                                } else {
                                  L78: {
                                    if (-1 != (this.field_R ^ -1)) {
                                      this.field_S = true;
                                      break L78;
                                    } else {
                                      break L78;
                                    }
                                  }
                                  this.field_R = 0;
                                  if (var6 != 0) {
                                    break L77;
                                  } else {
                                    return false;
                                  }
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
                                  L80: {
                                    if (0 != this.field_W) {
                                      this.field_S = true;
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  }
                                  this.field_W = 0;
                                  if (var6 != 0) {
                                    break L79;
                                  } else {
                                    return false;
                                  }
                                }
                              }
                            }
                            L81: {
                              if (var4 == 0) {
                                break L81;
                              } else {
                                if (var5 != 0) {
                                  this.field_W = 0;
                                  this.field_S = true;
                                  this.field_G = this.field_N << -1095664624;
                                  this.field_R = 0;
                                  this.field_E = this.field_ab << 1342901968;
                                  return true;
                                } else {
                                  break L81;
                                }
                              }
                            }
                            return false;
                          } else {
                            stackOut_231_0 = 0;
                            stackIn_256_0 = stackOut_231_0;
                            break L75;
                          }
                        } else {
                          stackOut_229_0 = 0;
                          stackIn_256_0 = stackOut_229_0;
                          break L75;
                        }
                      } else {
                        if (var3 >= this.field_E) {
                          L82: {
                            if (this.field_W < 0) {
                              if (var3 <= this.field_E) {
                                stackOut_203_0 = 0;
                                stackIn_204_0 = stackOut_203_0;
                                break L82;
                              } else {
                                stackOut_202_0 = 1;
                                stackIn_204_0 = stackOut_202_0;
                                break L82;
                              }
                            } else {
                              stackOut_200_0 = 0;
                              stackIn_204_0 = stackOut_200_0;
                              break L82;
                            }
                          }
                          L83: {
                            var5 = stackIn_204_0;
                            if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                              break L83;
                            } else {
                              if (Math.abs(this.field_E + -var3) < ho.field_s) {
                                var5 = 1;
                                var4 = 1;
                                break L83;
                              } else {
                                break L83;
                              }
                            }
                          }
                          L84: {
                            if (var4 == 0) {
                              break L84;
                            } else {
                              if (var5 != 0) {
                                break L84;
                              } else {
                                L85: {
                                  if (-1 != (this.field_R ^ -1)) {
                                    this.field_S = true;
                                    break L85;
                                  } else {
                                    break L85;
                                  }
                                }
                                this.field_R = 0;
                                if (var6 != 0) {
                                  break L84;
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                          L86: {
                            if (var4 != 0) {
                              break L86;
                            } else {
                              if (var5 == 0) {
                                break L86;
                              } else {
                                L87: {
                                  if (0 != this.field_W) {
                                    this.field_S = true;
                                    break L87;
                                  } else {
                                    break L87;
                                  }
                                }
                                this.field_W = 0;
                                if (var6 != 0) {
                                  break L86;
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 != 0) {
                              this.field_W = 0;
                              this.field_S = true;
                              this.field_G = this.field_N << -1095664624;
                              this.field_R = 0;
                              this.field_E = this.field_ab << 1342901968;
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          stackOut_198_0 = 1;
                          stackIn_256_0 = stackOut_198_0;
                          break L75;
                        }
                      }
                    } else {
                      stackOut_195_0 = 1;
                      stackIn_256_0 = stackOut_195_0;
                      break L75;
                    }
                  }
                  L88: {
                    var5 = stackIn_256_0;
                    if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                      break L88;
                    } else {
                      if (Math.abs(this.field_E + -var3) < ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                  }
                  L89: {
                    L90: {
                      if (var4 == 0) {
                        break L90;
                      } else {
                        if (var5 != 0) {
                          break L90;
                        } else {
                          L91: {
                            if (-1 != (this.field_R ^ -1)) {
                              this.field_S = true;
                              break L91;
                            } else {
                              break L91;
                            }
                          }
                          this.field_R = 0;
                          if (var6 == 0) {
                            break L89;
                          } else {
                            break L90;
                          }
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
                          L93: {
                            if (0 != this.field_W) {
                              this.field_S = true;
                              break L93;
                            } else {
                              break L93;
                            }
                          }
                          this.field_W = 0;
                          if (var6 == 0) {
                            break L89;
                          } else {
                            break L92;
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L89;
                    } else {
                      if (var5 != 0) {
                        this.field_W = 0;
                        this.field_S = true;
                        this.field_G = this.field_N << -1095664624;
                        this.field_R = 0;
                        this.field_E = this.field_ab << 1342901968;
                        return true;
                      } else {
                        break L89;
                      }
                    }
                  }
                  return false;
                }
              }
            } else {
              L94: {
                var4 = 1;
                if (this.field_W != 0) {
                  if (-1 <= (this.field_W ^ -1)) {
                    if (this.field_W < 0) {
                      if (var3 > this.field_E) {
                        L95: {
                          var5 = 1;
                          if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                            break L95;
                          } else {
                            if (Math.abs(this.field_E + -var3) < ho.field_s) {
                              var5 = 1;
                              var4 = 1;
                              break L95;
                            } else {
                              break L95;
                            }
                          }
                        }
                        L96: {
                          if (var4 == 0) {
                            break L96;
                          } else {
                            if (var5 != 0) {
                              break L96;
                            } else {
                              L97: {
                                if (-1 != (this.field_R ^ -1)) {
                                  this.field_S = true;
                                  break L97;
                                } else {
                                  break L97;
                                }
                              }
                              this.field_R = 0;
                              if (var6 != 0) {
                                break L96;
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                        L98: {
                          if (var4 != 0) {
                            break L98;
                          } else {
                            if (var5 == 0) {
                              break L98;
                            } else {
                              L99: {
                                if (0 != this.field_W) {
                                  this.field_S = true;
                                  break L99;
                                } else {
                                  break L99;
                                }
                              }
                              this.field_W = 0;
                              if (var6 != 0) {
                                break L98;
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                        if (var4 != 0) {
                          if (var5 != 0) {
                            this.field_W = 0;
                            this.field_S = true;
                            this.field_G = this.field_N << -1095664624;
                            this.field_R = 0;
                            this.field_E = this.field_ab << 1342901968;
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_142_0 = 0;
                        stackIn_168_0 = stackOut_142_0;
                        break L94;
                      }
                    } else {
                      stackOut_140_0 = 0;
                      stackIn_168_0 = stackOut_140_0;
                      break L94;
                    }
                  } else {
                    if (var3 >= this.field_E) {
                      L100: {
                        if (this.field_W < 0) {
                          if (var3 <= this.field_E) {
                            stackOut_114_0 = 0;
                            stackIn_115_0 = stackOut_114_0;
                            break L100;
                          } else {
                            stackOut_113_0 = 1;
                            stackIn_115_0 = stackOut_113_0;
                            break L100;
                          }
                        } else {
                          stackOut_111_0 = 0;
                          stackIn_115_0 = stackOut_111_0;
                          break L100;
                        }
                      }
                      L101: {
                        var5 = stackIn_115_0;
                        if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                          break L101;
                        } else {
                          if (Math.abs(this.field_E + -var3) < ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L101;
                          } else {
                            break L101;
                          }
                        }
                      }
                      L102: {
                        if (var4 == 0) {
                          break L102;
                        } else {
                          if (var5 != 0) {
                            break L102;
                          } else {
                            L103: {
                              if (-1 != (this.field_R ^ -1)) {
                                this.field_S = true;
                                break L103;
                              } else {
                                break L103;
                              }
                            }
                            this.field_R = 0;
                            if (var6 != 0) {
                              break L102;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      L104: {
                        if (var4 != 0) {
                          break L104;
                        } else {
                          if (var5 == 0) {
                            break L104;
                          } else {
                            L105: {
                              if (0 != this.field_W) {
                                this.field_S = true;
                                break L105;
                              } else {
                                break L105;
                              }
                            }
                            this.field_W = 0;
                            if (var6 != 0) {
                              break L104;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        if (var5 != 0) {
                          this.field_W = 0;
                          this.field_S = true;
                          this.field_G = this.field_N << -1095664624;
                          this.field_R = 0;
                          this.field_E = this.field_ab << 1342901968;
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      stackOut_109_0 = 1;
                      stackIn_168_0 = stackOut_109_0;
                      break L94;
                    }
                  }
                } else {
                  stackOut_106_0 = 1;
                  stackIn_168_0 = stackOut_106_0;
                  break L94;
                }
              }
              L106: {
                var5 = stackIn_168_0;
                if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                  break L106;
                } else {
                  if (Math.abs(this.field_E + -var3) < ho.field_s) {
                    var5 = 1;
                    var4 = 1;
                    break L106;
                  } else {
                    break L106;
                  }
                }
              }
              L107: {
                if (var4 == 0) {
                  break L107;
                } else {
                  if (var5 != 0) {
                    break L107;
                  } else {
                    L108: {
                      if (-1 != (this.field_R ^ -1)) {
                        this.field_S = true;
                        break L108;
                      } else {
                        break L108;
                      }
                    }
                    this.field_R = 0;
                    if (var6 != 0) {
                      break L107;
                    } else {
                      return false;
                    }
                  }
                }
              }
              L109: {
                if (var4 != 0) {
                  break L109;
                } else {
                  if (var5 == 0) {
                    break L109;
                  } else {
                    L110: {
                      if (0 != this.field_W) {
                        this.field_S = true;
                        break L110;
                      } else {
                        break L110;
                      }
                    }
                    this.field_W = 0;
                    if (var6 != 0) {
                      break L109;
                    } else {
                      return false;
                    }
                  }
                }
              }
              if (var4 != 0) {
                if (var5 != 0) {
                  this.field_W = 0;
                  this.field_S = true;
                  this.field_G = this.field_N << -1095664624;
                  this.field_R = 0;
                  this.field_E = this.field_ab << 1342901968;
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            if (0 != this.field_W) {
              L111: {
                if (this.field_R != 0) {
                  L112: {
                    if (0 >= this.field_R) {
                      break L112;
                    } else {
                      if (this.field_G <= var2) {
                        break L112;
                      } else {
                        stackOut_60_0 = 1;
                        stackIn_68_0 = stackOut_60_0;
                        break L111;
                      }
                    }
                  }
                  if (0 > this.field_R) {
                    if (var2 > this.field_G) {
                      stackOut_66_0 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      break L111;
                    } else {
                      stackOut_65_0 = 0;
                      stackIn_68_0 = stackOut_65_0;
                      break L111;
                    }
                  } else {
                    stackOut_63_0 = 0;
                    stackIn_68_0 = stackOut_63_0;
                    break L111;
                  }
                } else {
                  stackOut_57_0 = 1;
                  stackIn_68_0 = stackOut_57_0;
                  break L111;
                }
              }
              L113: {
                var4 = stackIn_68_0;
                if (this.field_W != 0) {
                  L114: {
                    if (-1 <= (this.field_W ^ -1)) {
                      break L114;
                    } else {
                      if (var3 >= this.field_E) {
                        break L114;
                      } else {
                        stackOut_72_0 = 1;
                        stackIn_80_0 = stackOut_72_0;
                        break L113;
                      }
                    }
                  }
                  if (this.field_W < 0) {
                    if (var3 > this.field_E) {
                      stackOut_78_0 = 1;
                      stackIn_80_0 = stackOut_78_0;
                      break L113;
                    } else {
                      stackOut_77_0 = 0;
                      stackIn_80_0 = stackOut_77_0;
                      break L113;
                    }
                  } else {
                    stackOut_75_0 = 0;
                    stackIn_80_0 = stackOut_75_0;
                    break L113;
                  }
                } else {
                  stackOut_69_0 = 1;
                  stackIn_80_0 = stackOut_69_0;
                  break L113;
                }
              }
              L115: {
                var5 = stackIn_80_0;
                if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
                  break L115;
                } else {
                  if (Math.abs(this.field_E + -var3) < ho.field_s) {
                    var5 = 1;
                    var4 = 1;
                    break L115;
                  } else {
                    break L115;
                  }
                }
              }
              L116: {
                if (var4 == 0) {
                  break L116;
                } else {
                  if (var5 != 0) {
                    break L116;
                  } else {
                    L117: {
                      if (-1 != (this.field_R ^ -1)) {
                        this.field_S = true;
                        break L117;
                      } else {
                        break L117;
                      }
                    }
                    this.field_R = 0;
                    if (var6 != 0) {
                      break L116;
                    } else {
                      return false;
                    }
                  }
                }
              }
              L118: {
                if (var4 != 0) {
                  break L118;
                } else {
                  if (var5 == 0) {
                    break L118;
                  } else {
                    L119: {
                      if (0 != this.field_W) {
                        this.field_S = true;
                        break L119;
                      } else {
                        break L119;
                      }
                    }
                    this.field_W = 0;
                    if (var6 != 0) {
                      break L118;
                    } else {
                      return false;
                    }
                  }
                }
              }
              if (var4 != 0) {
                if (var5 != 0) {
                  this.field_W = 0;
                  this.field_S = true;
                  this.field_G = this.field_N << -1095664624;
                  this.field_R = 0;
                  this.field_E = this.field_ab << 1342901968;
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
          }
        } else {
          L120: {
            this.field_W = 29;
            var2 = this.field_N << -2141754256;
            var3 = this.field_ab << 272795408;
            if (0 != this.field_R) {
              break L120;
            } else {
              if (0 == this.field_W) {
                return false;
              } else {
                break L120;
              }
            }
          }
          L121: {
            if (this.field_R != 0) {
              L122: {
                if (0 >= this.field_R) {
                  break L122;
                } else {
                  if (this.field_G <= var2) {
                    break L122;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_17_0 = stackOut_9_0;
                    break L121;
                  }
                }
              }
              if (0 > this.field_R) {
                if (var2 > this.field_G) {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L121;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_17_0 = stackOut_14_0;
                  break L121;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_17_0 = stackOut_12_0;
                break L121;
              }
            } else {
              stackOut_6_0 = 1;
              stackIn_17_0 = stackOut_6_0;
              break L121;
            }
          }
          L123: {
            var4 = stackIn_17_0;
            if (this.field_W != 0) {
              L124: {
                if (-1 <= (this.field_W ^ -1)) {
                  break L124;
                } else {
                  if (var3 >= this.field_E) {
                    break L124;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_29_0 = stackOut_21_0;
                    break L123;
                  }
                }
              }
              if (this.field_W < 0) {
                if (var3 > this.field_E) {
                  stackOut_27_0 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  break L123;
                } else {
                  stackOut_26_0 = 0;
                  stackIn_29_0 = stackOut_26_0;
                  break L123;
                }
              } else {
                stackOut_24_0 = 0;
                stackIn_29_0 = stackOut_24_0;
                break L123;
              }
            } else {
              stackOut_18_0 = 1;
              stackIn_29_0 = stackOut_18_0;
              break L123;
            }
          }
          L125: {
            var5 = stackIn_29_0;
            if (Math.abs(-var2 + this.field_G) >= ho.field_s) {
              break L125;
            } else {
              if (Math.abs(this.field_E + -var3) < ho.field_s) {
                var5 = 1;
                var4 = 1;
                break L125;
              } else {
                break L125;
              }
            }
          }
          L126: {
            if (var4 == 0) {
              break L126;
            } else {
              if (var5 != 0) {
                break L126;
              } else {
                L127: {
                  if (-1 != (this.field_R ^ -1)) {
                    this.field_S = true;
                    break L127;
                  } else {
                    break L127;
                  }
                }
                this.field_R = 0;
                if (var6 != 0) {
                  break L126;
                } else {
                  return false;
                }
              }
            }
          }
          L128: {
            if (var4 != 0) {
              break L128;
            } else {
              if (var5 == 0) {
                break L128;
              } else {
                L129: {
                  if (0 != this.field_W) {
                    this.field_S = true;
                    break L129;
                  } else {
                    break L129;
                  }
                }
                this.field_W = 0;
                if (var6 != 0) {
                  break L128;
                } else {
                  return false;
                }
              }
            }
          }
          if (var4 != 0) {
            if (var5 == 0) {
              return false;
            } else {
              this.field_W = 0;
              this.field_S = true;
              this.field_G = this.field_N << -1095664624;
              this.field_R = 0;
              this.field_E = this.field_ab << 1342901968;
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static hq g(byte param0) {
        int var1 = 0;
        if (hj.field_d == null) {
          hj.field_d = new hq(cp.field_H, 20, 0, 0, 0, 11579568, -1, 0, 0, cp.field_H.field_C, -1, 2147483647, true);
          var1 = -122 % ((53 - param0) / 62);
          return hj.field_d;
        } else {
          var1 = -122 % ((53 - param0) / 62);
          return hj.field_d;
        }
    }

    pa(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_Q = this instanceof lm ? 0 : 4;
        this.field_X = false;
        int discarded$0 = hp.a((byte) 105, g.field_a, 2);
        this.field_V = 0;
        this.field_Z = false;
        this.field_P = 400;
        this.field_L = 0;
        this.field_M = 2;
        this.field_cb = param3;
    }

    public static void i(byte param0) {
        field_O = null;
        if (param0 != -86) {
            return;
        }
        field_Y = null;
        field_T = null;
        field_bb = null;
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 >= -101) {
          this.field_db = -89;
          this.field_R = param2;
          this.field_W = param0;
          return;
        } else {
          this.field_R = param2;
          this.field_W = param0;
          return;
        }
    }

    final void h(byte param0) {
        this.field_E = this.field_E + this.field_W;
        this.field_G = this.field_G + this.field_R;
        this.d((byte) -117);
        if (param0 <= 27) {
            this.a(-4, (byte) -29);
        }
    }

    void j(int param0) {
        this.field_Z = true;
        this.a(true);
        if (param0 != 18) {
          this.field_N = -127;
          this.a(param0 + -4582);
          return;
        } else {
          this.a(param0 + -4582);
          return;
        }
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_S = true;
        this.field_db = param1;
        var3 = this.field_N + -this.e((byte) -112);
        var4 = this.field_ab + -this.g(1829947600);
        var5 = g.b(var3 * var3 + var4 * var4);
        if (-1 == (var5 ^ -1)) {
          if (-2 != (this.field_Q ^ -1)) {
            if ((this.field_Q ^ -1) != -6) {
              if (-7 != (this.field_Q ^ -1)) {
                if (7 != this.field_Q) {
                  if (this.field_Q != 8) {
                    this.a(0, (byte) -121, 0);
                    if (var7 != 0) {
                      var6 = param1 / var5;
                      this.a(var6 * var4, (byte) -127, var3 * var6);
                      var6 = 124 % ((19 - param0) / 63);
                      return;
                    } else {
                      var6 = 124 % ((19 - param0) / 63);
                      return;
                    }
                  } else {
                    L0: {
                      stackOut_35_0 = this;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (!(this instanceof lm)) {
                        stackOut_37_0 = this;
                        stackOut_37_1 = 4;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L0;
                      } else {
                        stackOut_36_0 = this;
                        stackOut_36_1 = 0;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L0;
                      }
                    }
                    L1: {
                      this.a(stackIn_38_1, (byte) -89);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        this.a(0, (byte) -121, 0);
                        var6 = param1 / var5;
                        this.a(var6 * var4, (byte) -127, var3 * var6);
                        break L1;
                      }
                    }
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  }
                } else {
                  L2: {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (!(this instanceof lm)) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 4;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      break L2;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = 0;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L2;
                    }
                  }
                  this.a(stackIn_30_1, (byte) -89);
                  if (var7 != 0) {
                    this.a(0, (byte) -121, 0);
                    var6 = param1 / var5;
                    this.a(var6 * var4, (byte) -127, var3 * var6);
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  } else {
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  }
                }
              } else {
                L3: {
                  stackOut_17_0 = this;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (!(this instanceof lm)) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 4;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L3;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L3;
                  }
                }
                this.a(stackIn_20_1, (byte) -89);
                if (var7 != 0) {
                  this.a(0, (byte) -121, 0);
                  if (var7 == 0) {
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  } else {
                    var6 = param1 / var5;
                    this.a(var6 * var4, (byte) -127, var3 * var6);
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  }
                } else {
                  var6 = 124 % ((19 - param0) / 63);
                  return;
                }
              }
            } else {
              L4: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!(this instanceof lm)) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 4;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L4;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 0;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L4;
                }
              }
              L5: {
                this.a(stackIn_13_1, (byte) -89);
                if (var7 == 0) {
                  break L5;
                } else {
                  this.a(0, (byte) -121, 0);
                  var6 = param1 / var5;
                  this.a(var6 * var4, (byte) -127, var3 * var6);
                  break L5;
                }
              }
              var6 = 124 % ((19 - param0) / 63);
              return;
            }
          } else {
            L6: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!(this instanceof lm)) {
                stackOut_5_0 = this;
                stackOut_5_1 = 4;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L6;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L6;
              }
            }
            L7: {
              this.a(stackIn_6_1, (byte) -89);
              if (var7 == 0) {
                break L7;
              } else {
                this.a(0, (byte) -121, 0);
                var6 = param1 / var5;
                this.a(var6 * var4, (byte) -127, var3 * var6);
                break L7;
              }
            }
            var6 = 124 % ((19 - param0) / 63);
            return;
          }
        } else {
          var6 = param1 / var5;
          this.a(var6 * var4, (byte) -127, var3 * var6);
          var6 = 124 % ((19 - param0) / 63);
          return;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        boolean discarded$17 = false;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int var3 = 0;
        L0: {
          if (this.field_V >= gg.field_j[param1]) {
            this.field_V = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var3 = gg.field_b[param1];
        if (param0 > 116) {
          L1: {
            if (2 <= this.field_M) {
              break L1;
            } else {
              var3 = var3 * 2;
              break L1;
            }
          }
          fieldTemp$15 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (fieldTemp$15 > var3) {
            fieldTemp$16 = this.field_V + 1;
            this.field_V = this.field_V + 1;
            if (fieldTemp$16 != gg.field_j[param1]) {
              this.field_L = 0;
              return;
            } else {
              this.field_V = 0;
              this.field_L = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          L2: {
            discarded$17 = this.b(55, -76);
            if (2 <= this.field_M) {
              break L2;
            } else {
              var3 = var3 * 2;
              break L2;
            }
          }
          fieldTemp$18 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (fieldTemp$18 > var3) {
            fieldTemp$19 = this.field_V + 1;
            this.field_V = this.field_V + 1;
            if (fieldTemp$19 != gg.field_j[param1]) {
              this.field_L = 0;
              return;
            } else {
              this.field_V = 0;
              this.field_L = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    void h(int param0) {
        if (this.field_Q != 21) {
          if ((this.field_P ^ -1) < -1) {
            this.field_P = this.field_P - 1;
            if (-1 == (this.field_P ^ -1)) {
              this.field_M = 2;
              this.c(-90, this.field_db / 2);
              if (param0 >= 30) {
                if (this.field_A.a((pa) (this), (byte) 105)) {
                  this.a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_U = -28;
                if (this.field_A.a((pa) (this), (byte) 105)) {
                  this.a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 >= 30) {
                if (this.field_A.a((pa) (this), (byte) 105)) {
                  this.a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_U = -28;
                if (this.field_A.a((pa) (this), (byte) 105)) {
                  this.a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 < 30) {
              this.field_U = -28;
              if (!this.field_A.a((pa) (this), (byte) 105)) {
                return;
              } else {
                this.a(21, (byte) -89);
                return;
              }
            } else {
              L0: {
                if (!this.field_A.a((pa) (this), (byte) 105)) {
                  break L0;
                } else {
                  this.a(21, (byte) -89);
                  break L0;
                }
              }
              return;
            }
          }
        } else {
          this.field_U = this.field_U - 4;
          if (this.field_U == 0) {
            this.a(true);
            this.a(-4564);
            this.field_E = 262144000;
            this.field_G = 262144000;
            return;
          } else {
            return;
          }
        }
    }

    final void b(boolean param0) {
        if ((this.field_M ^ -1) < -3) {
          this.field_db = this.field_db / (this.field_M / 2);
          this.field_M = 2;
          this.c(-48, this.field_db);
          if (param0) {
            return;
          } else {
            this.field_S = true;
            return;
          }
        } else {
          this.field_db = this.field_db * (2 / this.field_M);
          if (!ZombieDawnMulti.field_E) {
            this.field_M = 2;
            this.c(-48, this.field_db);
            if (param0) {
              return;
            } else {
              this.field_S = true;
              return;
            }
          } else {
            this.field_db = this.field_db / (this.field_M / 2);
            this.field_M = 2;
            this.c(-48, this.field_db);
            if (param0) {
              return;
            } else {
              this.field_S = true;
              return;
            }
          }
        }
    }

    void a(int param0, byte param1) {
        L0: {
          if (this.field_Q != 30) {
            break L0;
          } else {
            break L0;
          }
        }
        this.field_L = 0;
        this.field_V = 0;
        this.field_Q = param0;
        if (param1 != -89) {
          L1: {
            field_bb = (String) null;
            if ((param0 ^ -1) == -22) {
              this.a(-4564);
              this.field_U = 256;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if ((param0 ^ -1) == -22) {
              this.a(-4564);
              this.field_U = 256;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        field_bb = "Use this on a clueless human for instant zombification! The victim will become one of your zombies.";
        field_Y = "Unfortunately we are unable to create an account for you at this time.";
    }
}
