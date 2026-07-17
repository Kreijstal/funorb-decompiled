/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bfb {
    static int field_h;
    private static boolean field_d;
    static int[] field_g;
    private static int[] field_e;
    private static int[] field_k;
    static int field_b;
    static int field_a;
    static int field_f;
    private static int[] field_c;
    static int field_j;
    private static int[] field_i;

    final static int c() {
        return field_g[0] % dma.field_g;
    }

    private final static void a() {
        field_f = field_a / 2;
        field_j = field_h / 2;
    }

    public static void b() {
        field_g = null;
        field_i = null;
        field_c = null;
        field_e = null;
        field_k = null;
    }

    final static int d() {
        return field_g[0] / dma.field_g;
    }

    final static void e() {
        bfb.a(dma.field_d, dma.field_c, dma.field_a, dma.field_f);
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!field_d) {
            break L0;
          } else {
            L1: {
              if (param5 <= field_a) {
                break L1;
              } else {
                param5 = field_a;
                break L1;
              }
            }
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = 0;
              break L0;
            }
          }
        }
        if (param4 < param5) {
          param1 = param1 + param4;
          param3 = param5 - param4 >> 2;
          if (field_b != 0) {
            L2: {
              if (field_b != 254) {
                var6 = field_b;
                var7 = 256 - field_b;
                param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
                L3: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L4: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        var8 = param0[param1];
                        int incrementValue$15 = param1;
                        param1++;
                        param0[incrementValue$15] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[param1];
                    int incrementValue$16 = param1;
                    param1++;
                    param0[incrementValue$16] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    int incrementValue$17 = param1;
                    param1++;
                    param0[incrementValue$17] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    int incrementValue$18 = param1;
                    param1++;
                    param0[incrementValue$18] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    int incrementValue$19 = param1;
                    param1++;
                    param0[incrementValue$19] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    continue L3;
                  }
                }
              } else {
                L5: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L6: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        int incrementValue$20 = param1;
                        param1++;
                        param0[incrementValue$20] = param0[param1];
                        continue L6;
                      }
                    }
                  } else {
                    int incrementValue$21 = param1;
                    param1++;
                    param0[incrementValue$21] = param0[param1];
                    int incrementValue$22 = param1;
                    param1++;
                    param0[incrementValue$22] = param0[param1];
                    int incrementValue$23 = param1;
                    param1++;
                    param0[incrementValue$23] = param0[param1];
                    int incrementValue$24 = param1;
                    param1++;
                    param0[incrementValue$24] = param0[param1];
                    continue L5;
                  }
                }
              }
            }
            return;
          } else {
            L7: while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                L8: while (true) {
                  param3--;
                  if (param3 < 0) {
                    return;
                  } else {
                    int incrementValue$25 = param1;
                    param1++;
                    param0[incrementValue$25] = param2;
                    continue L8;
                  }
                }
              } else {
                int incrementValue$26 = param1;
                param1++;
                param0[incrementValue$26] = param2;
                int incrementValue$27 = param1;
                param1++;
                param0[incrementValue$27] = param2;
                int incrementValue$28 = param1;
                param1++;
                param0[incrementValue$28] = param2;
                int incrementValue$29 = param1;
                param1++;
                param0[incrementValue$29] = param2;
                continue L7;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            if (param0 < 0) {
              break L1;
            } else {
              if (param0 > field_a) {
                break L1;
              } else {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 > field_a) {
                    break L1;
                  } else {
                    if (param2 < 0) {
                      break L1;
                    } else {
                      if (param2 <= field_a) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        field_d = stackIn_8_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var7 = 0;
          if (param1 == param0) {
            break L0;
          } else {
            var7 = (param4 - param3 << 16) / (param1 - param0);
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (param2 == param1) {
            break L1;
          } else {
            var8 = (param5 - param4 << 16) / (param2 - param1);
            break L1;
          }
        }
        L2: {
          var9 = 0;
          if (param2 == param0) {
            break L2;
          } else {
            var9 = (param3 - param5 << 16) / (param0 - param2);
            break L2;
          }
        }
        L3: {
          if (param0 > param1) {
            break L3;
          } else {
            if (param0 > param2) {
              break L3;
            } else {
              if (param0 < field_h) {
                L4: {
                  if (param1 <= field_h) {
                    break L4;
                  } else {
                    param1 = field_h;
                    break L4;
                  }
                }
                L5: {
                  if (param2 <= field_h) {
                    break L5;
                  } else {
                    param2 = field_h;
                    break L5;
                  }
                }
                if (param1 >= param2) {
                  L6: {
                    param3 = param3 << 16;
                    param4 = param3 << 16;
                    if (param0 >= 0) {
                      break L6;
                    } else {
                      param4 = param4 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    param5 = param5 << 16;
                    if (param2 >= 0) {
                      break L7;
                    } else {
                      param5 = param5 - var8 * param2;
                      param2 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      if (param0 == param2) {
                        break L9;
                      } else {
                        if (var9 < var7) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param0 != param2) {
                        break L10;
                      } else {
                        if (var8 <= var7) {
                          break L10;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = field_g[param0];
                    L11: while (true) {
                      param2--;
                      if (param2 < 0) {
                        param1--;
                        L12: while (true) {
                          if (param1 < 0) {
                            return;
                          } else {
                            bfb.a(dma.field_i, param0, param6, 0, param3 >> 16, param5 >> 16);
                            param5 = param5 + var8;
                            param3 = param3 + var7;
                            param0 = param0 + dma.field_g;
                            param1--;
                            continue L12;
                          }
                        }
                      } else {
                        bfb.a(dma.field_i, param0, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + dma.field_g;
                        continue L11;
                      }
                    }
                  }
                  param1 = param1 - param2;
                  param2 = param2 - param0;
                  param0 = field_g[param0];
                  L13: while (true) {
                    param2--;
                    if (param2 < 0) {
                      param1--;
                      L14: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          bfb.a(dma.field_i, param0, param6, 0, param5 >> 16, param3 >> 16);
                          param5 = param5 + var8;
                          param3 = param3 + var7;
                          param0 = param0 + dma.field_g;
                          param1--;
                          continue L14;
                        }
                      }
                    } else {
                      bfb.a(dma.field_i, param0, param6, 0, param4 >> 16, param3 >> 16);
                      param4 = param4 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + dma.field_g;
                      continue L13;
                    }
                  }
                } else {
                  L15: {
                    param3 = param3 << 16;
                    param5 = param3 << 16;
                    if (param0 >= 0) {
                      break L15;
                    } else {
                      param5 = param5 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L15;
                    }
                  }
                  L16: {
                    param4 = param4 << 16;
                    if (param1 >= 0) {
                      break L16;
                    } else {
                      param4 = param4 - var8 * param1;
                      param1 = 0;
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if (param0 == param1) {
                        break L18;
                      } else {
                        if (var9 < var7) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (param0 != param1) {
                        break L19;
                      } else {
                        if (var9 <= var8) {
                          break L19;
                        } else {
                          break L17;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = field_g[param0];
                    L20: while (true) {
                      param1--;
                      if (param1 < 0) {
                        param2--;
                        L21: while (true) {
                          if (param2 < 0) {
                            return;
                          } else {
                            bfb.a(dma.field_i, param0, param6, 0, param4 >> 16, param5 >> 16);
                            param5 = param5 + var9;
                            param4 = param4 + var8;
                            param0 = param0 + dma.field_g;
                            param2--;
                            continue L21;
                          }
                        }
                      } else {
                        bfb.a(dma.field_i, param0, param6, 0, param3 >> 16, param5 >> 16);
                        param5 = param5 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + dma.field_g;
                        continue L20;
                      }
                    }
                  }
                  param2 = param2 - param1;
                  param1 = param1 - param0;
                  param0 = field_g[param0];
                  L22: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param2--;
                      L23: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          bfb.a(dma.field_i, param0, param6, 0, param5 >> 16, param4 >> 16);
                          param5 = param5 + var9;
                          param4 = param4 + var8;
                          param0 = param0 + dma.field_g;
                          param2--;
                          continue L23;
                        }
                      }
                    } else {
                      bfb.a(dma.field_i, param0, param6, 0, param5 >> 16, param3 >> 16);
                      param5 = param5 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + dma.field_g;
                      continue L22;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        if (param1 > param2) {
          if (param2 < field_h) {
            L24: {
              if (param0 <= field_h) {
                break L24;
              } else {
                param0 = field_h;
                break L24;
              }
            }
            L25: {
              if (param1 <= field_h) {
                break L25;
              } else {
                param1 = field_h;
                break L25;
              }
            }
            if (param0 >= param1) {
              L26: {
                param5 = param5 << 16;
                param3 = param5 << 16;
                if (param2 >= 0) {
                  break L26;
                } else {
                  param3 = param3 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L26;
                }
              }
              L27: {
                param4 = param4 << 16;
                if (param1 >= 0) {
                  break L27;
                } else {
                  param4 = param4 - var7 * param1;
                  param1 = 0;
                  break L27;
                }
              }
              if (var8 >= var9) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_g[param2];
                L28: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L29: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param2, param6, 0, param5 >> 16, param4 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + dma.field_g;
                        param0--;
                        continue L29;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param2, param6, 0, param5 >> 16, param3 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + dma.field_g;
                    continue L28;
                  }
                }
              } else {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_g[param2];
                L30: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L31: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param2, param6, 0, param4 >> 16, param5 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + dma.field_g;
                        param0--;
                        continue L31;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param2, param6, 0, param3 >> 16, param5 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + dma.field_g;
                    continue L30;
                  }
                }
              }
            } else {
              L32: {
                param5 = param5 << 16;
                param4 = param5 << 16;
                if (param2 >= 0) {
                  break L32;
                } else {
                  param4 = param4 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L32;
                }
              }
              L33: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L33;
                } else {
                  param3 = param3 - var7 * param0;
                  param0 = 0;
                  break L33;
                }
              }
              if (var8 >= var9) {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_g[param2];
                L34: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L35: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param2, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + dma.field_g;
                        param1--;
                        continue L35;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param2, param6, 0, param5 >> 16, param4 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + dma.field_g;
                    continue L34;
                  }
                }
              } else {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_g[param2];
                L36: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L37: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param2, param6, 0, param4 >> 16, param3 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + dma.field_g;
                        param1--;
                        continue L37;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param2, param6, 0, param4 >> 16, param5 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + dma.field_g;
                    continue L36;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 < field_h) {
            L38: {
              if (param2 <= field_h) {
                break L38;
              } else {
                param2 = field_h;
                break L38;
              }
            }
            L39: {
              if (param0 <= field_h) {
                break L39;
              } else {
                param0 = field_h;
                break L39;
              }
            }
            if (param2 >= param0) {
              L40: {
                param4 = param4 << 16;
                param5 = param4 << 16;
                if (param1 >= 0) {
                  break L40;
                } else {
                  param5 = param5 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L40;
                }
              }
              L41: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L41;
                } else {
                  param3 = param3 - var9 * param0;
                  param0 = 0;
                  break L41;
                }
              }
              if (var7 >= var8) {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_g[param1];
                L42: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L43: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param1, param6, 0, param4 >> 16, param3 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + dma.field_g;
                        param2--;
                        continue L43;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param1, param6, 0, param4 >> 16, param5 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + dma.field_g;
                    continue L42;
                  }
                }
              } else {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_g[param1];
                L44: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L45: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param1, param6, 0, param3 >> 16, param4 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + dma.field_g;
                        param2--;
                        continue L45;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param1, param6, 0, param5 >> 16, param4 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + dma.field_g;
                    continue L44;
                  }
                }
              }
            } else {
              L46: {
                param4 = param4 << 16;
                param3 = param4 << 16;
                if (param1 >= 0) {
                  break L46;
                } else {
                  param3 = param3 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L46;
                }
              }
              L47: {
                param5 = param5 << 16;
                if (param2 >= 0) {
                  break L47;
                } else {
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L47;
                }
              }
              L48: {
                L49: {
                  if (param1 == param2) {
                    break L49;
                  } else {
                    if (var7 < var8) {
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                L50: {
                  if (param1 != param2) {
                    break L50;
                  } else {
                    if (var7 <= var9) {
                      break L50;
                    } else {
                      break L48;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = field_g[param1];
                L51: while (true) {
                  param2--;
                  if (param2 < 0) {
                    param0--;
                    L52: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        bfb.a(dma.field_i, param1, param6, 0, param5 >> 16, param3 >> 16);
                        param3 = param3 + var7;
                        param5 = param5 + var9;
                        param1 = param1 + dma.field_g;
                        param0--;
                        continue L52;
                      }
                    }
                  } else {
                    bfb.a(dma.field_i, param1, param6, 0, param4 >> 16, param3 >> 16);
                    param3 = param3 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + dma.field_g;
                    continue L51;
                  }
                }
              }
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = field_g[param1];
              L53: while (true) {
                param2--;
                if (param2 < 0) {
                  param0--;
                  L54: while (true) {
                    if (param0 < 0) {
                      return;
                    } else {
                      bfb.a(dma.field_i, param1, param6, 0, param3 >> 16, param5 >> 16);
                      param3 = param3 + var7;
                      param5 = param5 + var9;
                      param1 = param1 + dma.field_g;
                      param0--;
                      continue L54;
                    }
                  }
                } else {
                  bfb.a(dma.field_i, param1, param6, 0, param3 >> 16, param4 >> 16);
                  param3 = param3 + var7;
                  param4 = param4 + var8;
                  param1 = param1 + dma.field_g;
                  continue L53;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_a = param2 - param0;
        field_h = param3 - param1;
        bfb.a();
        if (field_g.length < field_h) {
            field_g = new int[hj.a(field_h, (byte) -105)];
        }
        int var4 = param1 * dma.field_g + param0;
        for (var5 = 0; var5 < field_h; var5++) {
            field_g[var5] = var4;
            var4 = var4 + dma.field_g;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = false;
        field_k = new int[2048];
        field_e = new int[2048];
        field_c = new int[2048];
        field_g = new int[1024];
        field_b = 0;
        field_i = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
            field_i[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_c[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_e[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_k[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
