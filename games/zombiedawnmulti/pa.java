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
            if (((pa) this).field_Q != -6) {
              if (-8 != ((pa) this).field_Q) {
                if ((((pa) this).field_Q ^ -1) != -2) {
                  ((pa) this).field_S = true;
                  return true;
                } else {
                  ((pa) this).c(-60, ((pa) this).field_M * 71680);
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
            if (((pa) this).field_Q != -6) {
              if (-8 != ((pa) this).field_Q) {
                if ((((pa) this).field_Q ^ -1) != -2) {
                  ((pa) this).field_S = true;
                  return true;
                } else {
                  ((pa) this).c(-60, ((pa) this).field_M * 71680);
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
            if (((pa) this).field_Q != -6) {
              if (-8 != ((pa) this).field_Q) {
                if ((((pa) this).field_Q ^ -1) != -2) {
                  ((pa) this).field_S = true;
                  return true;
                } else {
                  ((pa) this).c(-60, ((pa) this).field_M * 71680);
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
              if (((pa) this).field_Q != -6) {
                if (-8 != ((pa) this).field_Q) {
                  if ((((pa) this).field_Q ^ -1) == -2) {
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
              if ((((pa) this).field_Q ^ -1) != -2) {
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
              if ((((pa) this).field_Q ^ -1) != -2) {
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
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_426_0 = 0;
        int stackOut_316_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_425_0 = 0;
        int stackOut_424_0 = 0;
        int stackOut_422_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_268_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_273_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_276_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_67_0 = 0;
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
          var2 = ((pa) this).field_N << -2141754256;
          var3 = ((pa) this).field_ab << 272795408;
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
                        var4 = 1;
                        if (((pa) this).field_W == -1) {
                          stackOut_316_0 = 1;
                          stackIn_318_0 = stackOut_316_0;
                          break L1;
                        } else {
                          L2: {
                            if (-1 >= ((pa) this).field_W) {
                              break L2;
                            } else {
                              if (var3 >= ((pa) this).field_E) {
                                break L2;
                              } else {
                                stackOut_309_0 = 1;
                                stackIn_318_0 = stackOut_309_0;
                                break L1;
                              }
                            }
                          }
                          if (((pa) this).field_W < 0) {
                            if (var3 > ((pa) this).field_E) {
                              stackOut_315_0 = 1;
                              stackIn_318_0 = stackOut_315_0;
                              break L1;
                            } else {
                              stackOut_314_0 = 0;
                              stackIn_318_0 = stackOut_314_0;
                              break L1;
                            }
                          } else {
                            stackOut_312_0 = 0;
                            stackIn_318_0 = stackOut_312_0;
                            break L1;
                          }
                        }
                      }
                      L3: {
                        var5 = stackIn_318_0;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L3;
                        } else {
                          if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
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
                                if (-1 != (((pa) this).field_R ^ -1)) {
                                  ((pa) this).field_S = true;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              ((pa) this).field_R = 0;
                              break L4;
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
                                if (0 != ((pa) this).field_W) {
                                  ((pa) this).field_S = true;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              ((pa) this).field_W = 0;
                              break L4;
                            }
                          }
                        }
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((pa) this).field_W = 0;
                            ((pa) this).field_S = true;
                            ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                            ((pa) this).field_R = 0;
                            ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                            return true;
                          } else {
                            break L4;
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
                if (((pa) this).field_W != 0) {
                  if (-1 <= (((pa) this).field_W ^ -1)) {
                    L9: {
                      if (((pa) this).field_W >= 0) {
                        break L9;
                      } else {
                        if (var3 <= ((pa) this).field_E) {
                          break L9;
                        } else {
                          L10: {
                            var5 = 1;
                            if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                              break L10;
                            } else {
                              if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                                var5 = 1;
                                var4 = 1;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (var4 == 0) {
                              break L11;
                            } else {
                              if (var5 != 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (-1 != (((pa) this).field_R ^ -1)) {
                                    ((pa) this).field_S = true;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                return false;
                              }
                            }
                          }
                          L13: {
                            if (var4 != 0) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                break L13;
                              } else {
                                L14: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                return false;
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 == 0) {
                              return false;
                            } else {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                              return true;
                            }
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    L15: {
                      var5 = 0;
                      if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                        break L15;
                      } else {
                        if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                          var5 = 1;
                          var4 = 1;
                          break L15;
                        } else {
                          L16: {
                            if (var4 == 0) {
                              break L16;
                            } else {
                              if (var5 != 0) {
                                break L16;
                              } else {
                                L17: {
                                  if (-1 != (((pa) this).field_R ^ -1)) {
                                    ((pa) this).field_S = true;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                return false;
                              }
                            }
                          }
                          L18: {
                            if (var4 != 0) {
                              break L18;
                            } else {
                              if (var5 == 0) {
                                break L18;
                              } else {
                                L19: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                return false;
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 == 0) {
                              return false;
                            } else {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                              return true;
                            }
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    L20: {
                      if (var4 == 0) {
                        break L20;
                      } else {
                        if (var5 != 0) {
                          break L20;
                        } else {
                          L21: {
                            if (-1 != (((pa) this).field_R ^ -1)) {
                              ((pa) this).field_S = true;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          ((pa) this).field_R = 0;
                          return false;
                        }
                      }
                    }
                    L22: {
                      if (var4 != 0) {
                        break L22;
                      } else {
                        if (var5 == 0) {
                          break L22;
                        } else {
                          L23: {
                            if (0 != ((pa) this).field_W) {
                              ((pa) this).field_S = true;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          ((pa) this).field_W = 0;
                          return false;
                        }
                      }
                    }
                    if (var4 != 0) {
                      if (var5 != 0) {
                        ((pa) this).field_W = 0;
                        ((pa) this).field_S = true;
                        ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                        ((pa) this).field_R = 0;
                        ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    if (var3 >= ((pa) this).field_E) {
                      L24: {
                        if (((pa) this).field_W < 0) {
                          if (var3 <= ((pa) this).field_E) {
                            stackOut_425_0 = 0;
                            stackIn_426_0 = stackOut_425_0;
                            break L24;
                          } else {
                            stackOut_424_0 = 1;
                            stackIn_426_0 = stackOut_424_0;
                            break L24;
                          }
                        } else {
                          stackOut_422_0 = 0;
                          stackIn_426_0 = stackOut_422_0;
                          break L24;
                        }
                      }
                      L25: {
                        var5 = stackIn_426_0;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L25;
                        } else {
                          if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L26: {
                        L27: {
                          if (var4 == 0) {
                            break L27;
                          } else {
                            if (var5 != 0) {
                              break L27;
                            } else {
                              L28: {
                                if (-1 != (((pa) this).field_R ^ -1)) {
                                  ((pa) this).field_S = true;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              ((pa) this).field_R = 0;
                              break L26;
                            }
                          }
                        }
                        L29: {
                          if (var4 != 0) {
                            break L29;
                          } else {
                            if (var5 == 0) {
                              break L29;
                            } else {
                              L30: {
                                if (0 != ((pa) this).field_W) {
                                  ((pa) this).field_S = true;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              ((pa) this).field_W = 0;
                              break L26;
                            }
                          }
                        }
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((pa) this).field_W = 0;
                            ((pa) this).field_S = true;
                            ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                            ((pa) this).field_R = 0;
                            ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                            return true;
                          } else {
                            break L26;
                          }
                        } else {
                          return false;
                        }
                      }
                      return false;
                    } else {
                      L31: {
                        var5 = 1;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L31;
                        } else {
                          if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                            var5 = 1;
                            var4 = 1;
                            break L31;
                          } else {
                            L32: {
                              L33: {
                                if (var4 == 0) {
                                  break L33;
                                } else {
                                  if (var5 != 0) {
                                    break L33;
                                  } else {
                                    L34: {
                                      if (-1 != (((pa) this).field_R ^ -1)) {
                                        ((pa) this).field_S = true;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    ((pa) this).field_R = 0;
                                    break L32;
                                  }
                                }
                              }
                              L35: {
                                if (var4 != 0) {
                                  break L35;
                                } else {
                                  if (var5 == 0) {
                                    break L35;
                                  } else {
                                    L36: {
                                      if (0 != ((pa) this).field_W) {
                                        ((pa) this).field_S = true;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    ((pa) this).field_W = 0;
                                    break L32;
                                  }
                                }
                              }
                              if (var4 != 0) {
                                if (var5 != 0) {
                                  ((pa) this).field_W = 0;
                                  ((pa) this).field_S = true;
                                  ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                                  ((pa) this).field_R = 0;
                                  ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                                  return true;
                                } else {
                                  break L32;
                                }
                              } else {
                                return false;
                              }
                            }
                            return false;
                          }
                        }
                      }
                      L37: {
                        if (var4 == 0) {
                          break L37;
                        } else {
                          if (var5 != 0) {
                            break L37;
                          } else {
                            L38: {
                              if (-1 != (((pa) this).field_R ^ -1)) {
                                ((pa) this).field_S = true;
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            ((pa) this).field_R = 0;
                            return false;
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
                            return false;
                          }
                        }
                      }
                      if (var4 != 0) {
                        if (var5 == 0) {
                          return false;
                        } else {
                          ((pa) this).field_W = 0;
                          ((pa) this).field_S = true;
                          ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                          ((pa) this).field_R = 0;
                          ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  L41: {
                    var5 = 1;
                    if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                      break L41;
                    } else {
                      if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L41;
                      } else {
                        L42: {
                          L43: {
                            if (var4 == 0) {
                              break L43;
                            } else {
                              if (var5 != 0) {
                                break L43;
                              } else {
                                L44: {
                                  if (-1 != (((pa) this).field_R ^ -1)) {
                                    ((pa) this).field_S = true;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                break L42;
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
                                L46: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                break L42;
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 != 0) {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                              return true;
                            } else {
                              break L42;
                            }
                          } else {
                            return false;
                          }
                        }
                        return false;
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
                        L48: {
                          if (-1 != (((pa) this).field_R ^ -1)) {
                            ((pa) this).field_S = true;
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        ((pa) this).field_R = 0;
                        return false;
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
                        return false;
                      }
                    }
                  }
                  if (var4 != 0) {
                    if (var5 != 0) {
                      ((pa) this).field_W = 0;
                      ((pa) this).field_S = true;
                      ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                      ((pa) this).field_R = 0;
                      ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                if (((pa) this).field_G <= var2) {
                  L51: {
                    if (0 > ((pa) this).field_R) {
                      if (var2 <= ((pa) this).field_G) {
                        stackOut_269_0 = 0;
                        stackIn_270_0 = stackOut_269_0;
                        break L51;
                      } else {
                        stackOut_268_0 = 1;
                        stackIn_270_0 = stackOut_268_0;
                        break L51;
                      }
                    } else {
                      stackOut_266_0 = 0;
                      stackIn_270_0 = stackOut_266_0;
                      break L51;
                    }
                  }
                  L52: {
                    var4 = stackIn_270_0;
                    if (((pa) this).field_W == -1) {
                      stackOut_280_0 = 1;
                      stackIn_282_0 = stackOut_280_0;
                      break L52;
                    } else {
                      L53: {
                        if (-1 >= ((pa) this).field_W) {
                          break L53;
                        } else {
                          if (var3 >= ((pa) this).field_E) {
                            break L53;
                          } else {
                            stackOut_273_0 = 1;
                            stackIn_282_0 = stackOut_273_0;
                            break L52;
                          }
                        }
                      }
                      if (((pa) this).field_W < 0) {
                        if (var3 > ((pa) this).field_E) {
                          stackOut_279_0 = 1;
                          stackIn_282_0 = stackOut_279_0;
                          break L52;
                        } else {
                          stackOut_278_0 = 0;
                          stackIn_282_0 = stackOut_278_0;
                          break L52;
                        }
                      } else {
                        stackOut_276_0 = 0;
                        stackIn_282_0 = stackOut_276_0;
                        break L52;
                      }
                    }
                  }
                  L54: {
                    var5 = stackIn_282_0;
                    if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                      break L54;
                    } else {
                      if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                  }
                  L55: {
                    L56: {
                      if (var4 == 0) {
                        break L56;
                      } else {
                        if (var5 != 0) {
                          break L56;
                        } else {
                          L57: {
                            if (-1 != (((pa) this).field_R ^ -1)) {
                              ((pa) this).field_S = true;
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          ((pa) this).field_R = 0;
                          break L55;
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
                          L59: {
                            if (0 != ((pa) this).field_W) {
                              ((pa) this).field_S = true;
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                          ((pa) this).field_W = 0;
                          break L55;
                        }
                      }
                    }
                    if (var4 != 0) {
                      if (var5 != 0) {
                        ((pa) this).field_W = 0;
                        ((pa) this).field_S = true;
                        ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                        ((pa) this).field_R = 0;
                        ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                        return true;
                      } else {
                        break L55;
                      }
                    } else {
                      return false;
                    }
                  }
                  return false;
                } else {
                  L60: {
                    var4 = 1;
                    if (((pa) this).field_W != -1) {
                      if (-1 >= ((pa) this).field_W) {
                        if (((pa) this).field_W < 0) {
                          if (var3 > ((pa) this).field_E) {
                            L61: {
                              var5 = 1;
                              if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                                break L61;
                              } else {
                                if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
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
                                      if (-1 != (((pa) this).field_R ^ -1)) {
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
                              if (var4 != 0) {
                                if (var5 != 0) {
                                  ((pa) this).field_W = 0;
                                  ((pa) this).field_S = true;
                                  ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                                  ((pa) this).field_R = 0;
                                  ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                                  return true;
                                } else {
                                  break L62;
                                }
                              } else {
                                return false;
                              }
                            }
                            return false;
                          } else {
                            stackOut_219_0 = 0;
                            stackIn_243_0 = stackOut_219_0;
                            break L60;
                          }
                        } else {
                          stackOut_217_0 = 0;
                          stackIn_243_0 = stackOut_217_0;
                          break L60;
                        }
                      } else {
                        if (var3 >= ((pa) this).field_E) {
                          L67: {
                            if (((pa) this).field_W < 0) {
                              if (var3 <= ((pa) this).field_E) {
                                stackOut_193_0 = 0;
                                stackIn_194_0 = stackOut_193_0;
                                break L67;
                              } else {
                                stackOut_192_0 = 1;
                                stackIn_194_0 = stackOut_192_0;
                                break L67;
                              }
                            } else {
                              stackOut_190_0 = 0;
                              stackIn_194_0 = stackOut_190_0;
                              break L67;
                            }
                          }
                          L68: {
                            var5 = stackIn_194_0;
                            if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                              break L68;
                            } else {
                              if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                                var5 = 1;
                                var4 = 1;
                                break L68;
                              } else {
                                break L68;
                              }
                            }
                          }
                          L69: {
                            L70: {
                              if (var4 == 0) {
                                break L70;
                              } else {
                                if (var5 != 0) {
                                  break L70;
                                } else {
                                  L71: {
                                    if (-1 != (((pa) this).field_R ^ -1)) {
                                      ((pa) this).field_S = true;
                                      break L71;
                                    } else {
                                      break L71;
                                    }
                                  }
                                  ((pa) this).field_R = 0;
                                  break L69;
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
                                  L73: {
                                    if (0 != ((pa) this).field_W) {
                                      ((pa) this).field_S = true;
                                      break L73;
                                    } else {
                                      break L73;
                                    }
                                  }
                                  ((pa) this).field_W = 0;
                                  break L69;
                                }
                              }
                            }
                            if (var4 != 0) {
                              if (var5 != 0) {
                                ((pa) this).field_W = 0;
                                ((pa) this).field_S = true;
                                ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                                ((pa) this).field_R = 0;
                                ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                                return true;
                              } else {
                                break L69;
                              }
                            } else {
                              return false;
                            }
                          }
                          return false;
                        } else {
                          stackOut_188_0 = 1;
                          stackIn_243_0 = stackOut_188_0;
                          break L60;
                        }
                      }
                    } else {
                      stackOut_185_0 = 1;
                      stackIn_243_0 = stackOut_185_0;
                      break L60;
                    }
                  }
                  L74: {
                    var5 = stackIn_243_0;
                    if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                      break L74;
                    } else {
                      if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                        var5 = 1;
                        var4 = 1;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                  }
                  L75: {
                    L76: {
                      if (var4 == 0) {
                        break L76;
                      } else {
                        if (var5 != 0) {
                          break L76;
                        } else {
                          L77: {
                            if (-1 != (((pa) this).field_R ^ -1)) {
                              ((pa) this).field_S = true;
                              break L77;
                            } else {
                              break L77;
                            }
                          }
                          ((pa) this).field_R = 0;
                          break L75;
                        }
                      }
                    }
                    L78: {
                      if (var4 != 0) {
                        break L78;
                      } else {
                        if (var5 == 0) {
                          break L78;
                        } else {
                          L79: {
                            if (0 != ((pa) this).field_W) {
                              ((pa) this).field_S = true;
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          ((pa) this).field_W = 0;
                          break L75;
                        }
                      }
                    }
                    if (var4 != 0) {
                      if (var5 != 0) {
                        ((pa) this).field_W = 0;
                        ((pa) this).field_S = true;
                        ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                        ((pa) this).field_R = 0;
                        ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                        return true;
                      } else {
                        break L75;
                      }
                    } else {
                      return false;
                    }
                  }
                  return false;
                }
              }
            } else {
              L80: {
                var4 = 1;
                if (((pa) this).field_W != -1) {
                  if (-1 >= ((pa) this).field_W) {
                    if (((pa) this).field_W < 0) {
                      if (var3 > ((pa) this).field_E) {
                        L81: {
                          var5 = 1;
                          if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                            break L81;
                          } else {
                            if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                              var5 = 1;
                              var4 = 1;
                              break L81;
                            } else {
                              break L81;
                            }
                          }
                        }
                        L82: {
                          L83: {
                            if (var4 == 0) {
                              break L83;
                            } else {
                              if (var5 != 0) {
                                break L83;
                              } else {
                                L84: {
                                  if (-1 != (((pa) this).field_R ^ -1)) {
                                    ((pa) this).field_S = true;
                                    break L84;
                                  } else {
                                    break L84;
                                  }
                                }
                                ((pa) this).field_R = 0;
                                break L82;
                              }
                            }
                          }
                          L85: {
                            if (var4 != 0) {
                              break L85;
                            } else {
                              if (var5 == 0) {
                                break L85;
                              } else {
                                L86: {
                                  if (0 != ((pa) this).field_W) {
                                    ((pa) this).field_S = true;
                                    break L86;
                                  } else {
                                    break L86;
                                  }
                                }
                                ((pa) this).field_W = 0;
                                break L82;
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 != 0) {
                              ((pa) this).field_W = 0;
                              ((pa) this).field_S = true;
                              ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                              ((pa) this).field_R = 0;
                              ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                              return true;
                            } else {
                              break L82;
                            }
                          } else {
                            return false;
                          }
                        }
                        return false;
                      } else {
                        stackOut_136_0 = 0;
                        stackIn_160_0 = stackOut_136_0;
                        break L80;
                      }
                    } else {
                      stackOut_134_0 = 0;
                      stackIn_160_0 = stackOut_134_0;
                      break L80;
                    }
                  } else {
                    if (var3 >= ((pa) this).field_E) {
                      L87: {
                        if (((pa) this).field_W < 0) {
                          if (var3 <= ((pa) this).field_E) {
                            stackOut_110_0 = 0;
                            stackIn_111_0 = stackOut_110_0;
                            break L87;
                          } else {
                            stackOut_109_0 = 1;
                            stackIn_111_0 = stackOut_109_0;
                            break L87;
                          }
                        } else {
                          stackOut_107_0 = 0;
                          stackIn_111_0 = stackOut_107_0;
                          break L87;
                        }
                      }
                      L88: {
                        var5 = stackIn_111_0;
                        if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                          break L88;
                        } else {
                          if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
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
                                if (-1 != (((pa) this).field_R ^ -1)) {
                                  ((pa) this).field_S = true;
                                  break L91;
                                } else {
                                  break L91;
                                }
                              }
                              ((pa) this).field_R = 0;
                              break L89;
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
                                if (0 != ((pa) this).field_W) {
                                  ((pa) this).field_S = true;
                                  break L93;
                                } else {
                                  break L93;
                                }
                              }
                              ((pa) this).field_W = 0;
                              break L89;
                            }
                          }
                        }
                        if (var4 != 0) {
                          if (var5 != 0) {
                            ((pa) this).field_W = 0;
                            ((pa) this).field_S = true;
                            ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                            ((pa) this).field_R = 0;
                            ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                            return true;
                          } else {
                            break L89;
                          }
                        } else {
                          return false;
                        }
                      }
                      return false;
                    } else {
                      stackOut_105_0 = 1;
                      stackIn_160_0 = stackOut_105_0;
                      break L80;
                    }
                  }
                } else {
                  stackOut_102_0 = 1;
                  stackIn_160_0 = stackOut_102_0;
                  break L80;
                }
              }
              L94: {
                var5 = stackIn_160_0;
                if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                  break L94;
                } else {
                  if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                    var5 = 1;
                    var4 = 1;
                    break L94;
                  } else {
                    break L94;
                  }
                }
              }
              L95: {
                L96: {
                  if (var4 == 0) {
                    break L96;
                  } else {
                    if (var5 != 0) {
                      break L96;
                    } else {
                      L97: {
                        if (-1 != (((pa) this).field_R ^ -1)) {
                          ((pa) this).field_S = true;
                          break L97;
                        } else {
                          break L97;
                        }
                      }
                      ((pa) this).field_R = 0;
                      break L95;
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
                        if (0 != ((pa) this).field_W) {
                          ((pa) this).field_S = true;
                          break L99;
                        } else {
                          break L99;
                        }
                      }
                      ((pa) this).field_W = 0;
                      break L95;
                    }
                  }
                }
                if (var4 != 0) {
                  if (var5 != 0) {
                    ((pa) this).field_W = 0;
                    ((pa) this).field_S = true;
                    ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                    ((pa) this).field_R = 0;
                    ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                    return true;
                  } else {
                    break L95;
                  }
                } else {
                  return false;
                }
              }
              return false;
            }
          } else {
            if (0 != ((pa) this).field_W) {
              L100: {
                if (((pa) this).field_R != 0) {
                  L101: {
                    if (0 >= ((pa) this).field_R) {
                      break L101;
                    } else {
                      if (((pa) this).field_G <= var2) {
                        break L101;
                      } else {
                        stackOut_58_0 = 1;
                        stackIn_66_0 = stackOut_58_0;
                        break L100;
                      }
                    }
                  }
                  if (0 > ((pa) this).field_R) {
                    if (var2 > ((pa) this).field_G) {
                      stackOut_64_0 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      break L100;
                    } else {
                      stackOut_63_0 = 0;
                      stackIn_66_0 = stackOut_63_0;
                      break L100;
                    }
                  } else {
                    stackOut_61_0 = 0;
                    stackIn_66_0 = stackOut_61_0;
                    break L100;
                  }
                } else {
                  stackOut_55_0 = 1;
                  stackIn_66_0 = stackOut_55_0;
                  break L100;
                }
              }
              L102: {
                var4 = stackIn_66_0;
                if (((pa) this).field_W != -1) {
                  L103: {
                    if (-1 >= ((pa) this).field_W) {
                      break L103;
                    } else {
                      if (var3 >= ((pa) this).field_E) {
                        break L103;
                      } else {
                        stackOut_70_0 = 1;
                        stackIn_78_0 = stackOut_70_0;
                        break L102;
                      }
                    }
                  }
                  if (((pa) this).field_W < 0) {
                    if (var3 > ((pa) this).field_E) {
                      stackOut_76_0 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      break L102;
                    } else {
                      stackOut_75_0 = 0;
                      stackIn_78_0 = stackOut_75_0;
                      break L102;
                    }
                  } else {
                    stackOut_73_0 = 0;
                    stackIn_78_0 = stackOut_73_0;
                    break L102;
                  }
                } else {
                  stackOut_67_0 = 1;
                  stackIn_78_0 = stackOut_67_0;
                  break L102;
                }
              }
              L104: {
                var5 = stackIn_78_0;
                if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
                  break L104;
                } else {
                  if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
                    var5 = 1;
                    var4 = 1;
                    break L104;
                  } else {
                    break L104;
                  }
                }
              }
              L105: {
                L106: {
                  if (var4 == 0) {
                    break L106;
                  } else {
                    if (var5 != 0) {
                      break L106;
                    } else {
                      L107: {
                        if (-1 != (((pa) this).field_R ^ -1)) {
                          ((pa) this).field_S = true;
                          break L107;
                        } else {
                          break L107;
                        }
                      }
                      ((pa) this).field_R = 0;
                      break L105;
                    }
                  }
                }
                L108: {
                  if (var4 != 0) {
                    break L108;
                  } else {
                    if (var5 == 0) {
                      break L108;
                    } else {
                      L109: {
                        if (0 != ((pa) this).field_W) {
                          ((pa) this).field_S = true;
                          break L109;
                        } else {
                          break L109;
                        }
                      }
                      ((pa) this).field_W = 0;
                      break L105;
                    }
                  }
                }
                if (var4 != 0) {
                  if (var5 != 0) {
                    ((pa) this).field_W = 0;
                    ((pa) this).field_S = true;
                    ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                    ((pa) this).field_R = 0;
                    ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                    return true;
                  } else {
                    break L105;
                  }
                } else {
                  return false;
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          L110: {
            ((pa) this).field_W = 29;
            var2 = ((pa) this).field_N << -2141754256;
            var3 = ((pa) this).field_ab << 272795408;
            if (0 != ((pa) this).field_R) {
              break L110;
            } else {
              if (0 == ((pa) this).field_W) {
                return false;
              } else {
                break L110;
              }
            }
          }
          L111: {
            if (((pa) this).field_R != 0) {
              L112: {
                if (0 >= ((pa) this).field_R) {
                  break L112;
                } else {
                  if (((pa) this).field_G <= var2) {
                    break L112;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_17_0 = stackOut_9_0;
                    break L111;
                  }
                }
              }
              if (0 > ((pa) this).field_R) {
                if (var2 > ((pa) this).field_G) {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L111;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_17_0 = stackOut_14_0;
                  break L111;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_17_0 = stackOut_12_0;
                break L111;
              }
            } else {
              stackOut_6_0 = 1;
              stackIn_17_0 = stackOut_6_0;
              break L111;
            }
          }
          L113: {
            var4 = stackIn_17_0;
            if (((pa) this).field_W != -1) {
              L114: {
                if (-1 >= ((pa) this).field_W) {
                  break L114;
                } else {
                  if (var3 >= ((pa) this).field_E) {
                    break L114;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_29_0 = stackOut_21_0;
                    break L113;
                  }
                }
              }
              if (((pa) this).field_W < 0) {
                if (var3 > ((pa) this).field_E) {
                  stackOut_27_0 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  break L113;
                } else {
                  stackOut_26_0 = 0;
                  stackIn_29_0 = stackOut_26_0;
                  break L113;
                }
              } else {
                stackOut_24_0 = 0;
                stackIn_29_0 = stackOut_24_0;
                break L113;
              }
            } else {
              stackOut_18_0 = 1;
              stackIn_29_0 = stackOut_18_0;
              break L113;
            }
          }
          L115: {
            var5 = stackIn_29_0;
            if (Math.abs(-var2 + ((pa) this).field_G) >= ho.field_s) {
              break L115;
            } else {
              if (Math.abs(((pa) this).field_E + -var3) < ho.field_s) {
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
                  if (-1 != (((pa) this).field_R ^ -1)) {
                    ((pa) this).field_S = true;
                    break L117;
                  } else {
                    break L117;
                  }
                }
                ((pa) this).field_R = 0;
                return false;
              }
            }
          }
          L118: {
            L119: {
              if (var4 != 0) {
                break L119;
              } else {
                if (var5 == 0) {
                  break L119;
                } else {
                  L120: {
                    if (0 != ((pa) this).field_W) {
                      ((pa) this).field_S = true;
                      break L120;
                    } else {
                      break L120;
                    }
                  }
                  ((pa) this).field_W = 0;
                  break L118;
                }
              }
            }
            if (var4 != 0) {
              if (var5 != 0) {
                ((pa) this).field_W = 0;
                ((pa) this).field_S = true;
                ((pa) this).field_G = ((pa) this).field_N << -1095664624;
                ((pa) this).field_R = 0;
                ((pa) this).field_E = ((pa) this).field_ab << 1342901968;
                return true;
              } else {
                break L118;
              }
            } else {
              return false;
            }
          }
          return false;
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
        if (param0 != 18) {
          ((pa) this).field_N = -127;
          ((pa) this).a(param0 + -4582);
          return;
        } else {
          ((pa) this).a(param0 + -4582);
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
            if ((((pa) this).field_Q ^ -1) != -6) {
              if (-7 != (((pa) this).field_Q ^ -1)) {
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
          ((pa) this).field_L = ((pa) this).field_L + 1;
          if (((pa) this).field_L + 1 > var3) {
            ((pa) this).field_V = ((pa) this).field_V + 1;
            if (((pa) this).field_V + 1 != gg.field_j[param1]) {
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
            boolean discarded$7 = ((pa) this).b(55, -76);
            if (2 <= ((pa) this).field_M) {
              break L2;
            } else {
              var3 = var3 * 2;
              break L2;
            }
          }
          ((pa) this).field_L = ((pa) this).field_L + 1;
          if (((pa) this).field_L + 1 > var3) {
            ((pa) this).field_V = ((pa) this).field_V + 1;
            if (((pa) this).field_V + 1 != gg.field_j[param1]) {
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
          if ((((pa) this).field_P ^ -1) < -1) {
            ((pa) this).field_P = ((pa) this).field_P - 1;
            if (-1 == (((pa) this).field_P ^ -1)) {
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
        if ((((pa) this).field_M ^ -1) < -3) {
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
            if ((param0 ^ -1) == -22) {
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
            if ((param0 ^ -1) == -22) {
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
