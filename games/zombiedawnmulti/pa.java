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
        ((pa) this).field_M = 1;
        if (param1 <= -14) {
          ((pa) this).field_P = ((pa) this).field_A.field_m.a((byte) 32, param0, 600);
          if (!(this instanceof lm)) {
            if (((pa) this).field_Q != 5) {
              if (((pa) this).field_Q != 7) {
                if (((pa) this).field_Q == 1) {
                  ((pa) this).c(-60, ((pa) this).field_M * 71680);
                  ((pa) this).field_S = true;
                  return true;
                } else {
                  ((pa) this).field_S = true;
                  return true;
                }
              } else {
                ((pa) this).c(99, ((pa) this).field_M * 57344);
                ((pa) this).field_S = true;
                return true;
              }
            } else {
              ((pa) this).c(-70, 28672 * ((pa) this).field_M);
              ((pa) this).field_S = true;
              return true;
            }
          } else {
            ((pa) this).field_P = ((pa) this).field_P * 2;
            if (((pa) this).field_Q != 5) {
              if (((pa) this).field_Q != 7) {
                if (((pa) this).field_Q == 1) {
                  ((pa) this).c(-60, ((pa) this).field_M * 71680);
                  ((pa) this).field_S = true;
                  return true;
                } else {
                  ((pa) this).field_S = true;
                  return true;
                }
              } else {
                ((pa) this).c(99, ((pa) this).field_M * 57344);
                ((pa) this).field_S = true;
                return true;
              }
            } else {
              ((pa) this).c(-70, 28672 * ((pa) this).field_M);
              ((pa) this).field_S = true;
              return true;
            }
          }
        } else {
          pa.i((byte) -35);
          ((pa) this).field_P = ((pa) this).field_A.field_m.a((byte) 32, param0, 600);
          if (this instanceof lm) {
            ((pa) this).field_P = ((pa) this).field_P * 2;
            if (((pa) this).field_Q != 5) {
              if (((pa) this).field_Q != 7) {
                if (((pa) this).field_Q == 1) {
                  ((pa) this).c(-60, ((pa) this).field_M * 71680);
                  ((pa) this).field_S = true;
                  return true;
                } else {
                  ((pa) this).field_S = true;
                  return true;
                }
              } else {
                ((pa) this).c(99, ((pa) this).field_M * 57344);
                ((pa) this).field_S = true;
                return true;
              }
            } else {
              ((pa) this).c(-70, 28672 * ((pa) this).field_M);
              ((pa) this).field_S = true;
              return true;
            }
          } else {
            L0: {
              if (((pa) this).field_Q != 5) {
                if (((pa) this).field_Q != 7) {
                  if (((pa) this).field_Q == 1) {
                    ((pa) this).c(-60, ((pa) this).field_M * 71680);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((pa) this).c(99, ((pa) this).field_M * 57344);
                  break L0;
                }
              } else {
                ((pa) this).c(-70, 28672 * ((pa) this).field_M);
                break L0;
              }
            }
            ((pa) this).field_S = true;
            return true;
          }
        }
    }

    final boolean c(byte param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ((pa) this).field_M = 4;
        if (param0 == -68) {
          ((pa) this).field_P = ((pa) this).field_A.field_m.a((byte) 32, param1, 600);
          if (5 != ((pa) this).field_Q) {
            if (((pa) this).field_Q != 7) {
              if (((pa) this).field_Q != 1) {
                ((pa) this).field_S = true;
                return true;
              } else {
                ((pa) this).c(param0 ^ -31, ((pa) this).field_M * 71680);
                ((pa) this).field_S = true;
                return true;
              }
            } else {
              ((pa) this).c(113, 57344 * ((pa) this).field_M);
              ((pa) this).field_S = true;
              return true;
            }
          } else {
            ((pa) this).c(93, 28672 * ((pa) this).field_M);
            ((pa) this).field_S = true;
            return true;
          }
        } else {
          boolean discarded$1 = ((pa) this).k(106);
          ((pa) this).field_P = ((pa) this).field_A.field_m.a((byte) 32, param1, 600);
          if (5 != ((pa) this).field_Q) {
            if (((pa) this).field_Q != 7) {
              if (((pa) this).field_Q != 1) {
                ((pa) this).field_S = true;
                return true;
              } else {
                ((pa) this).c(param0 ^ -31, ((pa) this).field_M * 71680);
                ((pa) this).field_S = true;
                return true;
              }
            } else {
              ((pa) this).c(113, 57344 * ((pa) this).field_M);
              ((pa) this).field_S = true;
              return true;
            }
          } else {
            ((pa) this).c(93, 28672 * ((pa) this).field_M);
            ((pa) this).field_S = true;
            return true;
          }
        }
    }

    final boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_383_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_381_0 = 0;
        int stackOut_382_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 2) {
          var2 = ((pa) this).field_N << 16;
          var3 = ((pa) this).field_ab << 16;
          if (0 != ((pa) this).field_R) {
            if (((pa) this).field_R != 0) {
              if (0 >= ((pa) this).field_R) {
                L0: {
                  if (0 <= ((pa) this).field_R) {
                    break L0;
                  } else {
                    if (var2 <= ((pa) this).field_G) {
                      break L0;
                    } else {
                      L1: {
                        L2: {
                          var4 = 1;
                          if (((pa) this).field_W == 0) {
                            break L2;
                          } else {
                            L3: {
                              if (((pa) this).field_W <= 0) {
                                break L3;
                              } else {
                                if (var3 < ((pa) this).field_E) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (((pa) this).field_W >= 0) {
                                break L4;
                              } else {
                                if (var3 <= ((pa) this).field_E) {
                                  break L4;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            stackOut_280_0 = 0;
                            stackIn_281_0 = stackOut_280_0;
                            break L1;
                          }
                        }
                        stackOut_279_0 = 1;
                        stackIn_281_0 = stackOut_279_0;
                        break L1;
                      }
                      L5: {
                        var5 = stackIn_281_0;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L5;
                        } else {
                          if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var4 == 0) {
                            break L7;
                          } else {
                            if (var5 != 0) {
                              break L7;
                            } else {
                              L8: {
                                if (((pa) this).field_R != 0) {
                                  ((pa) this).field_S = true;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              ((pa) this).field_R = 0;
                              break L6;
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
                              L10: {
                                if (0 != ((pa) this).field_W) {
                                  ((pa) this).field_S = true;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              ((pa) this).field_W = 0;
                              break L6;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L6;
                        } else {
                          if (var5 != 0) {
                            ((pa) this).field_W = 0;
                            ((pa) this).field_S = true;
                            ((pa) this).field_G = ((pa) this).field_N << 16;
                            ((pa) this).field_R = 0;
                            ((pa) this).field_E = ((pa) this).field_ab << 16;
                            return true;
                          } else {
                            break L6;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                var4 = 0;
                if (((pa) this).field_W != 0) {
                  if (((pa) this).field_W <= 0) {
                    L11: {
                      if (((pa) this).field_W >= 0) {
                        break L11;
                      } else {
                        if (var3 <= ((pa) this).field_E) {
                          break L11;
                        } else {
                          L12: {
                            var5 = 1;
                            if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                              break L12;
                            } else {
                              if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                                var5 = 1;
                                var4 = 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            L14: {
                              if (var4 == 0) {
                                break L14;
                              } else {
                                if (var5 != 0) {
                                  break L14;
                                } else {
                                  L15: {
                                    if (((pa) this).field_R != 0) {
                                      ((pa) this).field_S = true;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  ((pa) this).field_R = 0;
                                  break L13;
                                }
                              }
                            }
                            L16: {
                              if (var4 != 0) {
                                break L16;
                              } else {
                                if (var5 == 0) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (0 != ((pa) this).field_W) {
                                      ((pa) this).field_S = true;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  ((pa) this).field_W = 0;
                                  return false;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L13;
                            } else {
                              if (var5 != 0) {
                                ((pa) this).field_W = 0;
                                ((pa) this).field_S = true;
                                ((pa) this).field_G = ((pa) this).field_N << 16;
                                ((pa) this).field_R = 0;
                                ((pa) this).field_E = ((pa) this).field_ab << 16;
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
                    L18: {
                      var5 = 0;
                      if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                        break L18;
                      } else {
                        if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                          var5 = 1;
                          var4 = 1;
                          break L18;
                        } else {
                          L19: {
                            if (var4 == 0) {
                              break L19;
                            } else {
                              if (var5 != 0) {
                                break L19;
                              } else {
                                L20: {
                                  if (((pa) this).field_R != 0) {
                                    ((pa) this).field_S = true;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                return false;
                              }
                            }
                          }
                          L21: {
                            if (var4 != 0) {
                              break L21;
                            } else {
                              if (var5 == 0) {
                                break L21;
                              } else {
                                L22: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                return false;
                              }
                            }
                          }
                          if (var4 == 0) {
                            return false;
                          } else {
                            if (var5 != 0) {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << 16;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 16;
                              return true;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                    L23: {
                      if (var4 == 0) {
                        break L23;
                      } else {
                        if (var5 != 0) {
                          break L23;
                        } else {
                          L24: {
                            if (((pa) this).field_R != 0) {
                              ((pa) this).field_S = true;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          ((pa) this).field_R = 0;
                          return false;
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
                            if (0 != ((pa) this).field_W) {
                              ((pa) this).field_S = true;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          ((pa) this).field_W = 0;
                          return false;
                        }
                      }
                    }
                    if (var4 == 0) {
                      return false;
                    } else {
                      if (var5 != 0) {
                        ((pa) this).field_W = 0;
                        ((pa) this).field_S = true;
                        ((pa) this).field_G = ((pa) this).field_N << 16;
                        ((pa) this).field_R = 0;
                        ((pa) this).field_E = ((pa) this).field_ab << 16;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    if (var3 >= ((pa) this).field_E) {
                      L27: {
                        L28: {
                          if (((pa) this).field_W >= 0) {
                            break L28;
                          } else {
                            if (var3 <= ((pa) this).field_E) {
                              break L28;
                            } else {
                              stackOut_381_0 = 1;
                              stackIn_383_0 = stackOut_381_0;
                              break L27;
                            }
                          }
                        }
                        stackOut_382_0 = 0;
                        stackIn_383_0 = stackOut_382_0;
                        break L27;
                      }
                      L29: {
                        var5 = stackIn_383_0;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L29;
                        } else {
                          if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        L31: {
                          if (var4 == 0) {
                            break L31;
                          } else {
                            if (var5 != 0) {
                              break L31;
                            } else {
                              L32: {
                                if (((pa) this).field_R != 0) {
                                  ((pa) this).field_S = true;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              ((pa) this).field_R = 0;
                              break L30;
                            }
                          }
                        }
                        L33: {
                          if (var4 != 0) {
                            break L33;
                          } else {
                            if (var5 == 0) {
                              break L33;
                            } else {
                              L34: {
                                if (0 != ((pa) this).field_W) {
                                  ((pa) this).field_S = true;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              ((pa) this).field_W = 0;
                              break L30;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L30;
                        } else {
                          if (var5 != 0) {
                            ((pa) this).field_W = 0;
                            ((pa) this).field_S = true;
                            ((pa) this).field_G = ((pa) this).field_N << 16;
                            ((pa) this).field_R = 0;
                            ((pa) this).field_E = ((pa) this).field_ab << 16;
                            return true;
                          } else {
                            break L30;
                          }
                        }
                      }
                      return false;
                    } else {
                      L35: {
                        var5 = 1;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L35;
                        } else {
                          if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L35;
                          } else {
                            L36: {
                              L37: {
                                if (var4 == 0) {
                                  break L37;
                                } else {
                                  if (var5 != 0) {
                                    break L37;
                                  } else {
                                    L38: {
                                      if (((pa) this).field_R != 0) {
                                        ((pa) this).field_S = true;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                    ((pa) this).field_R = 0;
                                    break L36;
                                  }
                                }
                              }
                              L39: {
                                if (var4 != 0) {
                                  break L39;
                                } else {
                                  if (var5 == 0) {
                                    break L39;
                                  } else {
                                    L40: {
                                      if (0 != ((pa) this).field_W) {
                                        ((pa) this).field_S = true;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    ((pa) this).field_W = 0;
                                    break L36;
                                  }
                                }
                              }
                              if (var4 == 0) {
                                break L36;
                              } else {
                                if (var5 != 0) {
                                  ((pa) this).field_W = 0;
                                  ((pa) this).field_S = true;
                                  ((pa) this).field_G = ((pa) this).field_N << 16;
                                  ((pa) this).field_R = 0;
                                  ((pa) this).field_E = ((pa) this).field_ab << 16;
                                  return true;
                                } else {
                                  break L36;
                                }
                              }
                            }
                            return false;
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
                            L42: {
                              if (((pa) this).field_R != 0) {
                                ((pa) this).field_S = true;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            ((pa) this).field_R = 0;
                            return false;
                          }
                        }
                      }
                      L43: {
                        if (var4 != 0) {
                          break L43;
                        } else {
                          if (var5 == 0) {
                            break L43;
                          } else {
                            L44: {
                              if (0 != ((pa) this).field_W) {
                                ((pa) this).field_S = true;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                            ((pa) this).field_W = 0;
                            return false;
                          }
                        }
                      }
                      if (var4 == 0) {
                        return false;
                      } else {
                        if (var5 != 0) {
                          ((pa) this).field_W = 0;
                          ((pa) this).field_S = true;
                          ((pa) this).field_G = ((pa) this).field_N << 16;
                          ((pa) this).field_R = 0;
                          ((pa) this).field_E = ((pa) this).field_ab << 16;
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                } else {
                  L45: {
                    var5 = 1;
                    if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                      break L45;
                    } else {
                      if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L45;
                      } else {
                        L46: {
                          L47: {
                            if (var4 == 0) {
                              break L47;
                            } else {
                              if (var5 != 0) {
                                break L47;
                              } else {
                                L48: {
                                  if (((pa) this).field_R != 0) {
                                    ((pa) this).field_S = true;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                break L46;
                              }
                            }
                          }
                          L49: {
                            if (var4 != 0) {
                              break L49;
                            } else {
                              if (var5 == 0) {
                                break L49;
                              } else {
                                L50: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L50;
                                  } else {
                                    break L50;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                break L46;
                              }
                            }
                          }
                          if (var4 == 0) {
                            break L46;
                          } else {
                            if (var5 != 0) {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << 16;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 16;
                              return true;
                            } else {
                              break L46;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  L51: {
                    if (var4 == 0) {
                      break L51;
                    } else {
                      if (var5 != 0) {
                        break L51;
                      } else {
                        L52: {
                          if (((pa) this).field_R != 0) {
                            ((pa) this).field_S = true;
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        ((pa) this).field_R = 0;
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
                        L54: {
                          if (0 != ((pa) this).field_W) {
                            ((pa) this).field_S = true;
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        ((pa) this).field_W = 0;
                        return false;
                      }
                    }
                  }
                  if (var4 == 0) {
                    return false;
                  } else {
                    if (var5 != 0) {
                      ((pa) this).field_W = 0;
                      ((pa) this).field_S = true;
                      ((pa) this).field_G = ((pa) this).field_N << 16;
                      ((pa) this).field_R = 0;
                      ((pa) this).field_E = ((pa) this).field_ab << 16;
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                if (~((pa) this).field_G >= ~var2) {
                  L55: {
                    L56: {
                      if (0 <= ((pa) this).field_R) {
                        break L56;
                      } else {
                        if (var2 <= ((pa) this).field_G) {
                          break L56;
                        } else {
                          stackOut_238_0 = 1;
                          stackIn_240_0 = stackOut_238_0;
                          break L55;
                        }
                      }
                    }
                    stackOut_239_0 = 0;
                    stackIn_240_0 = stackOut_239_0;
                    break L55;
                  }
                  L57: {
                    L58: {
                      var4 = stackIn_240_0;
                      if (((pa) this).field_W == 0) {
                        break L58;
                      } else {
                        L59: {
                          if (((pa) this).field_W <= 0) {
                            break L59;
                          } else {
                            if (var3 < ((pa) this).field_E) {
                              break L58;
                            } else {
                              break L59;
                            }
                          }
                        }
                        L60: {
                          if (((pa) this).field_W >= 0) {
                            break L60;
                          } else {
                            if (var3 <= ((pa) this).field_E) {
                              break L60;
                            } else {
                              break L58;
                            }
                          }
                        }
                        stackOut_248_0 = 0;
                        stackIn_249_0 = stackOut_248_0;
                        break L57;
                      }
                    }
                    stackOut_247_0 = 1;
                    stackIn_249_0 = stackOut_247_0;
                    break L57;
                  }
                  L61: {
                    var5 = stackIn_249_0;
                    if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                      break L61;
                    } else {
                      if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L61;
                      } else {
                        break L61;
                      }
                    }
                  }
                  L62: {
                    L63: {
                      if (var4 == 0) {
                        break L63;
                      } else {
                        if (var5 != 0) {
                          break L63;
                        } else {
                          L64: {
                            if (((pa) this).field_R != 0) {
                              ((pa) this).field_S = true;
                              break L64;
                            } else {
                              break L64;
                            }
                          }
                          ((pa) this).field_R = 0;
                          break L62;
                        }
                      }
                    }
                    L65: {
                      if (var4 != 0) {
                        break L65;
                      } else {
                        if (var5 == 0) {
                          break L65;
                        } else {
                          L66: {
                            if (0 != ((pa) this).field_W) {
                              ((pa) this).field_S = true;
                              break L66;
                            } else {
                              break L66;
                            }
                          }
                          ((pa) this).field_W = 0;
                          break L62;
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L62;
                    } else {
                      if (var5 != 0) {
                        ((pa) this).field_W = 0;
                        ((pa) this).field_S = true;
                        ((pa) this).field_G = ((pa) this).field_N << 16;
                        ((pa) this).field_R = 0;
                        ((pa) this).field_E = ((pa) this).field_ab << 16;
                        return true;
                      } else {
                        break L62;
                      }
                    }
                  }
                  return false;
                } else {
                  L67: {
                    L68: {
                      var4 = 1;
                      if (((pa) this).field_W == 0) {
                        break L68;
                      } else {
                        if (((pa) this).field_W <= 0) {
                          L69: {
                            if (((pa) this).field_W >= 0) {
                              break L69;
                            } else {
                              if (var3 <= ((pa) this).field_E) {
                                break L69;
                              } else {
                                L70: {
                                  var5 = 1;
                                  if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                                    break L70;
                                  } else {
                                    if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                                      var5 = 1;
                                      var4 = 1;
                                      break L70;
                                    } else {
                                      break L70;
                                    }
                                  }
                                }
                                L71: {
                                  L72: {
                                    if (var4 == 0) {
                                      break L72;
                                    } else {
                                      if (var5 != 0) {
                                        break L72;
                                      } else {
                                        L73: {
                                          if (((pa) this).field_R != 0) {
                                            ((pa) this).field_S = true;
                                            break L73;
                                          } else {
                                            break L73;
                                          }
                                        }
                                        ((pa) this).field_R = 0;
                                        break L71;
                                      }
                                    }
                                  }
                                  L74: {
                                    if (var4 != 0) {
                                      break L74;
                                    } else {
                                      if (var5 == 0) {
                                        break L74;
                                      } else {
                                        L75: {
                                          if (0 != ((pa) this).field_W) {
                                            ((pa) this).field_S = true;
                                            break L75;
                                          } else {
                                            break L75;
                                          }
                                        }
                                        ((pa) this).field_W = 0;
                                        break L71;
                                      }
                                    }
                                  }
                                  if (var4 == 0) {
                                    break L71;
                                  } else {
                                    if (var5 != 0) {
                                      ((pa) this).field_W = 0;
                                      ((pa) this).field_S = true;
                                      ((pa) this).field_G = ((pa) this).field_N << 16;
                                      ((pa) this).field_R = 0;
                                      ((pa) this).field_E = ((pa) this).field_ab << 16;
                                      return true;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                          stackOut_214_0 = 0;
                          stackIn_215_0 = stackOut_214_0;
                          break L67;
                        } else {
                          if (var3 < ((pa) this).field_E) {
                            break L68;
                          } else {
                            L76: {
                              L77: {
                                if (((pa) this).field_W >= 0) {
                                  break L77;
                                } else {
                                  if (var3 <= ((pa) this).field_E) {
                                    break L77;
                                  } else {
                                    stackOut_167_0 = 1;
                                    stackIn_169_0 = stackOut_167_0;
                                    break L76;
                                  }
                                }
                              }
                              stackOut_168_0 = 0;
                              stackIn_169_0 = stackOut_168_0;
                              break L76;
                            }
                            L78: {
                              var5 = stackIn_169_0;
                              if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                                break L78;
                              } else {
                                if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                                  var5 = 1;
                                  var4 = 1;
                                  break L78;
                                } else {
                                  break L78;
                                }
                              }
                            }
                            L79: {
                              L80: {
                                if (var4 == 0) {
                                  break L80;
                                } else {
                                  if (var5 != 0) {
                                    break L80;
                                  } else {
                                    L81: {
                                      if (((pa) this).field_R != 0) {
                                        ((pa) this).field_S = true;
                                        break L81;
                                      } else {
                                        break L81;
                                      }
                                    }
                                    ((pa) this).field_R = 0;
                                    break L79;
                                  }
                                }
                              }
                              L82: {
                                if (var4 != 0) {
                                  break L82;
                                } else {
                                  if (var5 == 0) {
                                    break L82;
                                  } else {
                                    L83: {
                                      if (0 != ((pa) this).field_W) {
                                        ((pa) this).field_S = true;
                                        break L83;
                                      } else {
                                        break L83;
                                      }
                                    }
                                    ((pa) this).field_W = 0;
                                    break L79;
                                  }
                                }
                              }
                              if (var4 == 0) {
                                break L79;
                              } else {
                                if (var5 != 0) {
                                  ((pa) this).field_W = 0;
                                  ((pa) this).field_S = true;
                                  ((pa) this).field_G = ((pa) this).field_N << 16;
                                  ((pa) this).field_R = 0;
                                  ((pa) this).field_E = ((pa) this).field_ab << 16;
                                  return true;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                    }
                    stackOut_213_0 = 1;
                    stackIn_215_0 = stackOut_213_0;
                    break L67;
                  }
                  L84: {
                    var5 = stackIn_215_0;
                    if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                      break L84;
                    } else {
                      if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L84;
                      } else {
                        break L84;
                      }
                    }
                  }
                  L85: {
                    L86: {
                      if (var4 == 0) {
                        break L86;
                      } else {
                        if (var5 != 0) {
                          break L86;
                        } else {
                          L87: {
                            if (((pa) this).field_R != 0) {
                              ((pa) this).field_S = true;
                              break L87;
                            } else {
                              break L87;
                            }
                          }
                          ((pa) this).field_R = 0;
                          break L85;
                        }
                      }
                    }
                    L88: {
                      if (var4 != 0) {
                        break L88;
                      } else {
                        if (var5 == 0) {
                          break L88;
                        } else {
                          L89: {
                            if (0 != ((pa) this).field_W) {
                              ((pa) this).field_S = true;
                              break L89;
                            } else {
                              break L89;
                            }
                          }
                          ((pa) this).field_W = 0;
                          break L85;
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L85;
                    } else {
                      if (var5 != 0) {
                        ((pa) this).field_W = 0;
                        ((pa) this).field_S = true;
                        ((pa) this).field_G = ((pa) this).field_N << 16;
                        ((pa) this).field_R = 0;
                        ((pa) this).field_E = ((pa) this).field_ab << 16;
                        return true;
                      } else {
                        break L85;
                      }
                    }
                  }
                  return false;
                }
              }
            } else {
              L90: {
                L91: {
                  var4 = 1;
                  if (((pa) this).field_W == 0) {
                    break L91;
                  } else {
                    if (((pa) this).field_W <= 0) {
                      L92: {
                        if (((pa) this).field_W >= 0) {
                          break L92;
                        } else {
                          if (var3 <= ((pa) this).field_E) {
                            break L92;
                          } else {
                            L93: {
                              var5 = 1;
                              if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                                break L93;
                              } else {
                                if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                                  var5 = 1;
                                  var4 = 1;
                                  break L93;
                                } else {
                                  break L93;
                                }
                              }
                            }
                            L94: {
                              L95: {
                                if (var4 == 0) {
                                  break L95;
                                } else {
                                  if (var5 != 0) {
                                    break L95;
                                  } else {
                                    L96: {
                                      if (((pa) this).field_R != 0) {
                                        ((pa) this).field_S = true;
                                        break L96;
                                      } else {
                                        break L96;
                                      }
                                    }
                                    ((pa) this).field_R = 0;
                                    break L94;
                                  }
                                }
                              }
                              L97: {
                                if (var4 != 0) {
                                  break L97;
                                } else {
                                  if (var5 == 0) {
                                    break L97;
                                  } else {
                                    L98: {
                                      if (0 != ((pa) this).field_W) {
                                        ((pa) this).field_S = true;
                                        break L98;
                                      } else {
                                        break L98;
                                      }
                                    }
                                    ((pa) this).field_W = 0;
                                    break L94;
                                  }
                                }
                              }
                              if (var4 == 0) {
                                break L94;
                              } else {
                                if (var5 != 0) {
                                  ((pa) this).field_W = 0;
                                  ((pa) this).field_S = true;
                                  ((pa) this).field_G = ((pa) this).field_N << 16;
                                  ((pa) this).field_R = 0;
                                  ((pa) this).field_E = ((pa) this).field_ab << 16;
                                  return true;
                                } else {
                                  break L94;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                      stackOut_138_0 = 0;
                      stackIn_139_0 = stackOut_138_0;
                      break L90;
                    } else {
                      if (var3 < ((pa) this).field_E) {
                        break L91;
                      } else {
                        L99: {
                          L100: {
                            if (((pa) this).field_W >= 0) {
                              break L100;
                            } else {
                              if (var3 <= ((pa) this).field_E) {
                                break L100;
                              } else {
                                stackOut_91_0 = 1;
                                stackIn_93_0 = stackOut_91_0;
                                break L99;
                              }
                            }
                          }
                          stackOut_92_0 = 0;
                          stackIn_93_0 = stackOut_92_0;
                          break L99;
                        }
                        L101: {
                          var5 = stackIn_93_0;
                          if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                            break L101;
                          } else {
                            if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                              var5 = 1;
                              var4 = 1;
                              break L101;
                            } else {
                              break L101;
                            }
                          }
                        }
                        L102: {
                          L103: {
                            if (var4 == 0) {
                              break L103;
                            } else {
                              if (var5 != 0) {
                                break L103;
                              } else {
                                L104: {
                                  if (((pa) this).field_R != 0) {
                                    ((pa) this).field_S = true;
                                    break L104;
                                  } else {
                                    break L104;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                break L102;
                              }
                            }
                          }
                          L105: {
                            if (var4 != 0) {
                              break L105;
                            } else {
                              if (var5 == 0) {
                                break L105;
                              } else {
                                L106: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L106;
                                  } else {
                                    break L106;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                break L102;
                              }
                            }
                          }
                          if (var4 == 0) {
                            break L102;
                          } else {
                            if (var5 != 0) {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << 16;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 16;
                              return true;
                            } else {
                              break L102;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                }
                stackOut_137_0 = 1;
                stackIn_139_0 = stackOut_137_0;
                break L90;
              }
              L107: {
                var5 = stackIn_139_0;
                if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                  break L107;
                } else {
                  if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                    var5 = 1;
                    var4 = 1;
                    break L107;
                  } else {
                    break L107;
                  }
                }
              }
              L108: {
                L109: {
                  if (var4 == 0) {
                    break L109;
                  } else {
                    if (var5 != 0) {
                      break L109;
                    } else {
                      L110: {
                        if (((pa) this).field_R != 0) {
                          ((pa) this).field_S = true;
                          break L110;
                        } else {
                          break L110;
                        }
                      }
                      ((pa) this).field_R = 0;
                      break L108;
                    }
                  }
                }
                L111: {
                  if (var4 != 0) {
                    break L111;
                  } else {
                    if (var5 == 0) {
                      break L111;
                    } else {
                      L112: {
                        if (0 != ((pa) this).field_W) {
                          ((pa) this).field_S = true;
                          break L112;
                        } else {
                          break L112;
                        }
                      }
                      ((pa) this).field_W = 0;
                      break L108;
                    }
                  }
                }
                if (var4 == 0) {
                  break L108;
                } else {
                  if (var5 != 0) {
                    ((pa) this).field_W = 0;
                    ((pa) this).field_S = true;
                    ((pa) this).field_G = ((pa) this).field_N << 16;
                    ((pa) this).field_R = 0;
                    ((pa) this).field_E = ((pa) this).field_ab << 16;
                    return true;
                  } else {
                    break L108;
                  }
                }
              }
              return false;
            }
          } else {
            L113: {
              if (0 == ((pa) this).field_W) {
                break L113;
              } else {
                L114: {
                  L115: {
                    if (((pa) this).field_R == 0) {
                      break L115;
                    } else {
                      L116: {
                        if (0 >= ((pa) this).field_R) {
                          break L116;
                        } else {
                          if (~((pa) this).field_G < ~var2) {
                            break L115;
                          } else {
                            break L116;
                          }
                        }
                      }
                      L117: {
                        if (0 <= ((pa) this).field_R) {
                          break L117;
                        } else {
                          if (var2 <= ((pa) this).field_G) {
                            break L117;
                          } else {
                            break L115;
                          }
                        }
                      }
                      stackOut_54_0 = 0;
                      stackIn_55_0 = stackOut_54_0;
                      break L114;
                    }
                  }
                  stackOut_53_0 = 1;
                  stackIn_55_0 = stackOut_53_0;
                  break L114;
                }
                L118: {
                  L119: {
                    var4 = stackIn_55_0;
                    if (((pa) this).field_W == 0) {
                      break L119;
                    } else {
                      L120: {
                        if (((pa) this).field_W <= 0) {
                          break L120;
                        } else {
                          if (var3 < ((pa) this).field_E) {
                            break L119;
                          } else {
                            break L120;
                          }
                        }
                      }
                      L121: {
                        if (((pa) this).field_W >= 0) {
                          break L121;
                        } else {
                          if (var3 <= ((pa) this).field_E) {
                            break L121;
                          } else {
                            break L119;
                          }
                        }
                      }
                      stackOut_63_0 = 0;
                      stackIn_64_0 = stackOut_63_0;
                      break L118;
                    }
                  }
                  stackOut_62_0 = 1;
                  stackIn_64_0 = stackOut_62_0;
                  break L118;
                }
                L122: {
                  var5 = stackIn_64_0;
                  if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                    break L122;
                  } else {
                    if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                      var5 = 1;
                      var4 = 1;
                      break L122;
                    } else {
                      break L122;
                    }
                  }
                }
                L123: {
                  if (var4 == 0) {
                    break L123;
                  } else {
                    if (var5 != 0) {
                      break L123;
                    } else {
                      L124: {
                        if (((pa) this).field_R != 0) {
                          ((pa) this).field_S = true;
                          break L124;
                        } else {
                          break L124;
                        }
                      }
                      ((pa) this).field_R = 0;
                      break L113;
                    }
                  }
                }
                L125: {
                  if (var4 != 0) {
                    break L125;
                  } else {
                    if (var5 == 0) {
                      break L125;
                    } else {
                      L126: {
                        if (0 != ((pa) this).field_W) {
                          ((pa) this).field_S = true;
                          break L126;
                        } else {
                          break L126;
                        }
                      }
                      ((pa) this).field_W = 0;
                      break L113;
                    }
                  }
                }
                if (var4 == 0) {
                  break L113;
                } else {
                  if (var5 != 0) {
                    ((pa) this).field_W = 0;
                    ((pa) this).field_S = true;
                    ((pa) this).field_G = ((pa) this).field_N << 16;
                    ((pa) this).field_R = 0;
                    ((pa) this).field_E = ((pa) this).field_ab << 16;
                    return true;
                  } else {
                    break L113;
                  }
                }
              }
            }
            return false;
          }
        } else {
          L127: {
            ((pa) this).field_W = 29;
            var2 = ((pa) this).field_N << 16;
            var3 = ((pa) this).field_ab << 16;
            if (0 != ((pa) this).field_R) {
              break L127;
            } else {
              if (0 == ((pa) this).field_W) {
                return false;
              } else {
                break L127;
              }
            }
          }
          L128: {
            L129: {
              if (((pa) this).field_R == 0) {
                break L129;
              } else {
                L130: {
                  if (0 >= ((pa) this).field_R) {
                    break L130;
                  } else {
                    if (~((pa) this).field_G < ~var2) {
                      break L129;
                    } else {
                      break L130;
                    }
                  }
                }
                L131: {
                  if (0 <= ((pa) this).field_R) {
                    break L131;
                  } else {
                    if (var2 <= ((pa) this).field_G) {
                      break L131;
                    } else {
                      break L129;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L128;
              }
            }
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L128;
          }
          L132: {
            L133: {
              var4 = stackIn_14_0;
              if (((pa) this).field_W == 0) {
                break L133;
              } else {
                L134: {
                  if (((pa) this).field_W <= 0) {
                    break L134;
                  } else {
                    if (var3 < ((pa) this).field_E) {
                      break L133;
                    } else {
                      break L134;
                    }
                  }
                }
                L135: {
                  if (((pa) this).field_W >= 0) {
                    break L135;
                  } else {
                    if (var3 <= ((pa) this).field_E) {
                      break L135;
                    } else {
                      break L133;
                    }
                  }
                }
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L132;
              }
            }
            stackOut_21_0 = 1;
            stackIn_23_0 = stackOut_21_0;
            break L132;
          }
          L136: {
            var5 = stackIn_23_0;
            if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
              break L136;
            } else {
              if (~Math.abs(((pa) this).field_E + -var3) > ~ho.field_s) {
                var5 = 1;
                var4 = 1;
                break L136;
              } else {
                break L136;
              }
            }
          }
          L137: {
            if (var4 == 0) {
              break L137;
            } else {
              if (var5 != 0) {
                break L137;
              } else {
                L138: {
                  if (((pa) this).field_R != 0) {
                    ((pa) this).field_S = true;
                    break L138;
                  } else {
                    break L138;
                  }
                }
                ((pa) this).field_R = 0;
                return false;
              }
            }
          }
          L139: {
            L140: {
              if (var4 != 0) {
                break L140;
              } else {
                if (var5 == 0) {
                  break L140;
                } else {
                  L141: {
                    if (0 != ((pa) this).field_W) {
                      ((pa) this).field_S = true;
                      break L141;
                    } else {
                      break L141;
                    }
                  }
                  ((pa) this).field_W = 0;
                  break L139;
                }
              }
            }
            if (var4 == 0) {
              break L139;
            } else {
              if (var5 != 0) {
                ((pa) this).field_W = 0;
                ((pa) this).field_S = true;
                ((pa) this).field_G = ((pa) this).field_N << 16;
                ((pa) this).field_R = 0;
                ((pa) this).field_E = ((pa) this).field_ab << 16;
                return true;
              } else {
                break L139;
              }
            }
          }
          return false;
        }
    }

    final static hq g(byte param0) {
        int var1 = 0;
        if (hj.field_d == null) {
          hj.field_d = new hq(cp.field_H, 20, 0, 0, 0, 11579568, -1, 0, 0, cp.field_H.field_C, -1, 2147483647, true);
          var1 = 0;
          return hj.field_d;
        } else {
          var1 = 0;
          return hj.field_d;
        }
    }

    pa(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        ((pa) this).field_Q = this instanceof lm ? 0 : 4;
        ((pa) this).field_X = false;
        int discarded$0 = hp.a((byte) 105, g.field_a, 2);
        ((pa) this).field_V = 0;
        ((pa) this).field_Z = false;
        ((pa) this).field_P = 400;
        ((pa) this).field_L = 0;
        ((pa) this).field_M = 2;
        ((pa) this).field_cb = param3;
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
          ((pa) this).field_db = -89;
          ((pa) this).field_R = param2;
          ((pa) this).field_W = param0;
          return;
        } else {
          ((pa) this).field_R = param2;
          ((pa) this).field_W = param0;
          return;
        }
    }

    final void h(byte param0) {
        ((pa) this).field_E = ((pa) this).field_E + ((pa) this).field_W;
        ((pa) this).field_G = ((pa) this).field_G + ((pa) this).field_R;
        ((pa) this).d((byte) -117);
        if (param0 <= 27) {
            ((pa) this).a(-4, (byte) -29);
        }
    }

    void j(int param0) {
        ((pa) this).field_Z = true;
        ((pa) this).a(true);
        ((pa) this).a(-4564);
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
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        ((pa) this).field_S = true;
        ((pa) this).field_db = param1;
        var3 = ((pa) this).field_N + -((pa) this).e((byte) -112);
        var4 = ((pa) this).field_ab + -((pa) this).g(1829947600);
        var5 = g.b(var3 * var3 + var4 * var4);
        if (-1 == var5) {
          if (-2 != ((pa) this).field_Q) {
            if (((pa) this).field_Q != 5) {
              if (((pa) this).field_Q != 6) {
                if (7 != ((pa) this).field_Q) {
                  if (((pa) this).field_Q == 8) {
                    L0: {
                      stackOut_24_0 = this;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (!(this instanceof lm)) {
                        stackOut_26_0 = this;
                        stackOut_26_1 = 4;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L0;
                      } else {
                        stackOut_25_0 = this;
                        stackOut_25_1 = 0;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        break L0;
                      }
                    }
                    ((pa) this).a(stackIn_27_1, (byte) -89);
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  } else {
                    this.a(0, (byte) -121, 0);
                    var6 = 124 % ((19 - param0) / 63);
                    return;
                  }
                } else {
                  L1: {
                    stackOut_18_0 = this;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (!(this instanceof lm)) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = 4;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L1;
                    } else {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L1;
                    }
                  }
                  ((pa) this).a(stackIn_21_1, (byte) -89);
                  var6 = 124 % ((19 - param0) / 63);
                  return;
                }
              } else {
                L2: {
                  stackOut_13_0 = this;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (!(this instanceof lm)) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 4;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L2;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L2;
                  }
                }
                ((pa) this).a(stackIn_16_1, (byte) -89);
                var6 = 124 % ((19 - param0) / 63);
                return;
              }
            } else {
              L3: {
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!(this instanceof lm)) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 4;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L3;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L3;
                }
              }
              ((pa) this).a(stackIn_11_1, (byte) -89);
              var6 = 124 % ((19 - param0) / 63);
              return;
            }
          } else {
            L4: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!(this instanceof lm)) {
                stackOut_5_0 = this;
                stackOut_5_1 = 4;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L4;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L4;
              }
            }
            ((pa) this).a(stackIn_6_1, (byte) -89);
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
        int var3 = 0;
        L0: {
          if (((pa) this).field_V >= gg.field_j[param1]) {
            ((pa) this).field_V = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var3 = gg.field_b[param1];
        if (param0 > 116) {
          L1: {
            if (2 <= ((pa) this).field_M) {
              break L1;
            } else {
              var3 = var3 * 2;
              break L1;
            }
          }
          int fieldTemp$15 = ((pa) this).field_L + 1;
          ((pa) this).field_L = ((pa) this).field_L + 1;
          if (fieldTemp$15 > var3) {
            int fieldTemp$16 = ((pa) this).field_V + 1;
            ((pa) this).field_V = ((pa) this).field_V + 1;
            if (fieldTemp$16 != gg.field_j[param1]) {
              ((pa) this).field_L = 0;
              return;
            } else {
              ((pa) this).field_V = 0;
              ((pa) this).field_L = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          L2: {
            boolean discarded$17 = ((pa) this).b(55, -76);
            if (2 <= ((pa) this).field_M) {
              break L2;
            } else {
              var3 = var3 * 2;
              break L2;
            }
          }
          int fieldTemp$18 = ((pa) this).field_L + 1;
          ((pa) this).field_L = ((pa) this).field_L + 1;
          if (fieldTemp$18 > var3) {
            int fieldTemp$19 = ((pa) this).field_V + 1;
            ((pa) this).field_V = ((pa) this).field_V + 1;
            if (fieldTemp$19 != gg.field_j[param1]) {
              ((pa) this).field_L = 0;
              return;
            } else {
              ((pa) this).field_V = 0;
              ((pa) this).field_L = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    void h(int param0) {
        if (((pa) this).field_Q != 21) {
          if (((pa) this).field_P > 0) {
            ((pa) this).field_P = ((pa) this).field_P - 1;
            if (((pa) this).field_P == 0) {
              ((pa) this).field_M = 2;
              ((pa) this).c(-90, ((pa) this).field_db / 2);
              if (param0 >= 30) {
                if (((pa) this).field_A.a((pa) this, (byte) 105)) {
                  ((pa) this).a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              } else {
                ((pa) this).field_U = -28;
                if (((pa) this).field_A.a((pa) this, (byte) 105)) {
                  ((pa) this).a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 >= 30) {
                if (((pa) this).field_A.a((pa) this, (byte) 105)) {
                  ((pa) this).a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              } else {
                ((pa) this).field_U = -28;
                if (((pa) this).field_A.a((pa) this, (byte) 105)) {
                  ((pa) this).a(21, (byte) -89);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 < 30) {
              ((pa) this).field_U = -28;
              if (!((pa) this).field_A.a((pa) this, (byte) 105)) {
                return;
              } else {
                ((pa) this).a(21, (byte) -89);
                return;
              }
            } else {
              L0: {
                if (!((pa) this).field_A.a((pa) this, (byte) 105)) {
                  break L0;
                } else {
                  ((pa) this).a(21, (byte) -89);
                  break L0;
                }
              }
              return;
            }
          }
        } else {
          ((pa) this).field_U = ((pa) this).field_U - 4;
          if (((pa) this).field_U == 0) {
            ((pa) this).a(true);
            ((pa) this).a(-4564);
            ((pa) this).field_E = 262144000;
            ((pa) this).field_G = 262144000;
            return;
          } else {
            return;
          }
        }
    }

    final void b(boolean param0) {
        if (((pa) this).field_M > 2) {
          ((pa) this).field_db = ((pa) this).field_db / (((pa) this).field_M / 2);
          ((pa) this).field_M = 2;
          ((pa) this).c(-48, ((pa) this).field_db);
          if (param0) {
            return;
          } else {
            ((pa) this).field_S = true;
            return;
          }
        } else {
          ((pa) this).field_db = ((pa) this).field_db * (2 / ((pa) this).field_M);
          ((pa) this).field_M = 2;
          ((pa) this).c(-48, ((pa) this).field_db);
          if (param0) {
            return;
          } else {
            ((pa) this).field_S = true;
            return;
          }
        }
    }

    void a(int param0, byte param1) {
        L0: {
          if (((pa) this).field_Q != 30) {
            break L0;
          } else {
            break L0;
          }
        }
        ((pa) this).field_L = 0;
        ((pa) this).field_V = 0;
        ((pa) this).field_Q = param0;
        if (param1 != -89) {
          L1: {
            field_bb = null;
            if (param0 == 21) {
              ((pa) this).a(-4564);
              ((pa) this).field_U = 256;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 21) {
              ((pa) this).a(-4564);
              ((pa) this).field_U = 256;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Use this on a clueless human for instant zombification! The victim will become one of your zombies.";
        field_Y = "Unfortunately we are unable to create an account for you at this time.";
    }
}
