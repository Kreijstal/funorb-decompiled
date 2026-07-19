/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    static gh field_c;
    static int field_e;
    static String field_d;
    static int[][] field_b;
    static boolean field_f;
    static String field_a;

    final static int[][] a(int param0) {
        boolean discarded$0 = false;
        if (param0 != 45) {
            discarded$0 = iq.a((byte) -49, 120);
            return uf.field_b;
        }
        return uf.field_b;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 >= 0) {
          if (-1583 >= (param1 ^ -1)) {
            if (-1 != (param1 % 4 ^ -1)) {
              return false;
            } else {
              if (param1 % 100 != 0) {
                return true;
              } else {
                if (0 != param1 % 400) {
                  return false;
                } else {
                  if (param0 != 98) {
                    field_c = (gh) null;
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            }
          } else {
            L0: {
              if (0 != param1 % 4) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          L1: {
            if ((param1 + 1) % 4 != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0) {
        boolean discarded$1 = false;
        int[] var2 = null;
        L0: {
          pi.a(135, true, 170, true, new int[]{46, 40, 44, 3, 12, 13, 4, 50, 2, 14, 11}, 470, 1, 30);
          pi.a(118, true, 170, true, new int[]{1, 12, 13, 34, 47, 50, 3, 7}, 460, 2, 34);
          pi.a(430, false, 0, true, new int[]{15, 5}, 640, 3, 40);
          if (param0 <= -76) {
            break L0;
          } else {
            discarded$1 = iq.a((byte) -70, -75);
            break L0;
          }
        }
        pi.a(430, false, 30, true, new int[]{17, 6, 18}, 468, 4, 200);
        pi.a(430, false, 0, true, new int[]{15, 5}, 640, 5, 120);
        pi.a(430, false, 100, true, new int[]{2, 5}, 440, 6, 220);
        pi.a(200, true, 194, true, new int[]{15, 16}, 446, 7, 100);
        pi.a(400, false, 50, true, new int[]{5}, 288, 14, 40);
        pi.a(400, false, 50, true, new int[]{5}, 288, 8, 40);
        vk.a(new int[]{5, 39, 26, 27, 28, 29, 30, 31, 32, 33}, false, 9, 240, (byte) 123, new int[]{5, 39, 22, 23, 24, 25}, 400, 160, 428);
        var2 = (int[]) null;
        pi.a(310, false, 180, true, (int[]) null, 440, 10, 60);
        pi.a(0, true, 0, true, new int[]{}, 0, 11, 0);
        pi.a(0, true, 0, true, new int[]{19}, 0, 12, 0);
        pi.a(430, true, 170, true, new int[]{6}, 470, 13, 0);
        pi.a(430, false, 30, true, new int[]{45, 5}, 468, 15, 330);
    }

    public static void a(boolean param0) {
        field_b = (int[][]) null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (!param0) {
            iq.a(true);
        }
    }

    final static void a(int param0, byte param1) {
        int[][] discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 == 99) {
            break L0;
          } else {
            discarded$1 = iq.a(77);
            break L0;
          }
        }
        if ((param0 ^ -1) != 1) {
          if (21 != ai.field_b) {
            L1: {
              if (19 == ai.field_b) {
                break L1;
              } else {
                if (ai.field_b == 20) {
                  break L1;
                } else {
                  L2: {
                    if (-1 != param0) {
                      break L2;
                    } else {
                      ai.field_b = -1;
                      io.field_g = false;
                      ml.field_Jb = -1;
                      hg.field_rb = -1;
                      se.field_E = 0;
                      ma.field_d = -1;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (-1 < (param0 ^ -1)) {
                        break L4;
                      } else {
                        if ((param0 ^ -1) >= -22) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-14 == param0) {
                        break L5;
                      } else {
                        if (param0 == -3) {
                          io.field_g = false;
                          if (var3 != 0) {
                            break L5;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      if (hg.field_rb >= -1 + lm.field_pb) {
                        break L6;
                      } else {
                        df.a(param1 ^ -17403, 1 + hg.field_rb);
                        if (var3 != 0) {
                          break L6;
                        } else {
                          return;
                        }
                      }
                    }
                    io.field_g = false;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                  if (!io.field_g) {
                    df.a(param1 ^ -17403, 0);
                    if (var3 != 0) {
                      L7: {
                        var2 = hg.field_rb;
                        if (11 != (param0 ^ -1)) {
                          po.a((byte) -12, param0);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (0 == (param0 ^ -1)) {
                          w.field_m = 0;
                          df.a(-17306, 1);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (-1 == (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                          w.field_m = w.field_m & -9;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (-12 == param0) {
                          df.a(-17306, 0);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (hg.field_rb != 0) {
                          break L11;
                        } else {
                          if (gh.a(-3, param1 + 11554)) {
                            df.a(-17306, jh.field_ic);
                            break L11;
                          } else {
                            if ((param0 ^ -1) == 13) {
                              df.a(-17306, jh.field_ic);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L12: {
                        if (1 == hg.field_rb) {
                          if (4 != hg.field_rb) {
                            break L12;
                          } else {
                            if (!gh.a(-13, 11653)) {
                              break L12;
                            } else {
                              df.a(param1 ^ -17403, 5);
                              break L12;
                            }
                          }
                        } else {
                          if (4 != hg.field_rb) {
                            break L12;
                          } else {
                            if (!gh.a(-13, 11653)) {
                              break L12;
                            } else {
                              df.a(param1 ^ -17403, 5);
                              break L12;
                            }
                          }
                        }
                      }
                      L13: {
                        if (5 != hg.field_rb) {
                          break L13;
                        } else {
                          if (!gh.a(-4, 11653)) {
                            break L13;
                          } else {
                            L14: {
                              if (-1 > (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                                break L14;
                              } else {
                                df.a(param1 + -17405, 7);
                                if (var3 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            df.a(param1 ^ -17403, 6);
                            break L13;
                          }
                        }
                      }
                      L15: {
                        if (hg.field_rb != 6) {
                          break L15;
                        } else {
                          if (!gh.a(-6, 11653)) {
                            break L15;
                          } else {
                            df.a(-17306, 7);
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (-8 != (hg.field_rb ^ -1)) {
                          break L16;
                        } else {
                          if (gh.a(-5, 11653)) {
                            df.a(-17306, 6);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          if (6 == hg.field_rb) {
                            break L18;
                          } else {
                            if ((hg.field_rb ^ -1) != -8) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (!gh.a(-6, 11653)) {
                          break L17;
                        } else {
                          if (!gh.a(-5, 11653)) {
                            break L17;
                          } else {
                            df.a(-17306, 8);
                            break L17;
                          }
                        }
                      }
                      L19: {
                        if (8 != hg.field_rb) {
                          break L19;
                        } else {
                          if (!gh.a(-9, 11653)) {
                            break L19;
                          } else {
                            L20: {
                              df.a(param1 + -17405, 9);
                              if (-10 != (hg.field_rb ^ -1)) {
                                break L20;
                              } else {
                                if (gh.a(-10, 11653)) {
                                  df.a(-17306, 10);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              if ((hg.field_rb ^ -1) != -11) {
                                break L21;
                              } else {
                                if (!gh.a(-11, 11653)) {
                                  break L21;
                                } else {
                                  df.a(-17306, 11);
                                  break L21;
                                }
                              }
                            }
                            L22: {
                              if (hg.field_rb != 4) {
                                break L22;
                              } else {
                                if (gh.a(-3, param1 + 11554)) {
                                  break L22;
                                } else {
                                  df.a(-17306, 3);
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (hg.field_rb == var2) {
                                break L23;
                              } else {
                                L24: {
                                  if (io.field_g) {
                                    break L24;
                                  } else {
                                    if (-1 != (hg.field_rb ^ -1)) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                fb.field_e.c(true, hg.field_rb);
                                break L23;
                              }
                            }
                            return;
                          }
                        }
                      }
                      L25: {
                        if (-10 != (hg.field_rb ^ -1)) {
                          break L25;
                        } else {
                          if (gh.a(-10, 11653)) {
                            df.a(-17306, 10);
                            break L25;
                          } else {
                            L26: {
                              if ((hg.field_rb ^ -1) != -11) {
                                break L26;
                              } else {
                                if (!gh.a(-11, 11653)) {
                                  break L26;
                                } else {
                                  df.a(-17306, 11);
                                  break L26;
                                }
                              }
                            }
                            L27: {
                              if (hg.field_rb != 4) {
                                break L27;
                              } else {
                                if (gh.a(-3, param1 + 11554)) {
                                  break L27;
                                } else {
                                  df.a(-17306, 3);
                                  break L27;
                                }
                              }
                            }
                            L28: {
                              if (hg.field_rb == var2) {
                                break L28;
                              } else {
                                L29: {
                                  if (io.field_g) {
                                    break L29;
                                  } else {
                                    if (-1 != (hg.field_rb ^ -1)) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                fb.field_e.c(true, hg.field_rb);
                                break L28;
                              }
                            }
                            return;
                          }
                        }
                      }
                      L30: {
                        if ((hg.field_rb ^ -1) != -11) {
                          break L30;
                        } else {
                          if (!gh.a(-11, 11653)) {
                            break L30;
                          } else {
                            L31: {
                              df.a(-17306, 11);
                              if (hg.field_rb != 4) {
                                break L31;
                              } else {
                                if (gh.a(-3, param1 + 11554)) {
                                  break L31;
                                } else {
                                  df.a(-17306, 3);
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              if (hg.field_rb == var2) {
                                break L32;
                              } else {
                                L33: {
                                  if (io.field_g) {
                                    break L33;
                                  } else {
                                    if (-1 != (hg.field_rb ^ -1)) {
                                      break L32;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                fb.field_e.c(true, hg.field_rb);
                                break L32;
                              }
                            }
                            return;
                          }
                        }
                      }
                      L34: {
                        if (hg.field_rb != 4) {
                          break L34;
                        } else {
                          if (gh.a(-3, param1 + 11554)) {
                            break L34;
                          } else {
                            L35: {
                              df.a(-17306, 3);
                              if (hg.field_rb == var2) {
                                break L35;
                              } else {
                                L36: {
                                  if (io.field_g) {
                                    break L36;
                                  } else {
                                    if (-1 != (hg.field_rb ^ -1)) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                fb.field_e.c(true, hg.field_rb);
                                break L35;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (hg.field_rb != var2) {
                        if (!io.field_g) {
                          if (-1 != (hg.field_rb ^ -1)) {
                            return;
                          } else {
                            fb.field_e.c(true, hg.field_rb);
                            return;
                          }
                        } else {
                          fb.field_e.c(true, hg.field_rb);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            L37: {
              if ((param0 ^ -1) == 0) {
                break L37;
              } else {
                if (param0 == -14) {
                  L38: {
                    if (-1 + lm.field_pb > hg.field_rb) {
                      break L38;
                    } else {
                      L39: {
                        if (!pp.field_n) {
                          break L39;
                        } else {
                          pp.field_n = false;
                          we.field_g[7] = se.field_D;
                          break L39;
                        }
                      }
                      io.field_g = false;
                      if (var3 != 0) {
                        break L38;
                      } else {
                        return;
                      }
                    }
                  }
                  df.a(-17306, 1 + hg.field_rb);
                  if (var3 != 0) {
                    break L37;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            df.a(-17306, 0);
            if (var3 != 0) {
              L40: {
                if (-1 != param0) {
                  break L40;
                } else {
                  ai.field_b = -1;
                  io.field_g = false;
                  ml.field_Jb = -1;
                  hg.field_rb = -1;
                  se.field_E = 0;
                  ma.field_d = -1;
                  if (var3 != 0) {
                    break L40;
                  } else {
                    return;
                  }
                }
              }
              L41: {
                L42: {
                  if (-1 < (param0 ^ -1)) {
                    break L42;
                  } else {
                    if ((param0 ^ -1) >= -22) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
                L43: {
                  if (-14 == param0) {
                    break L43;
                  } else {
                    if (param0 == -3) {
                      io.field_g = false;
                      if (var3 != 0) {
                        break L43;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L44: {
                  if (hg.field_rb >= -1 + lm.field_pb) {
                    break L44;
                  } else {
                    df.a(param1 ^ -17403, 1 + hg.field_rb);
                    if (var3 != 0) {
                      break L44;
                    } else {
                      return;
                    }
                  }
                }
                io.field_g = false;
                if (var3 != 0) {
                  break L41;
                } else {
                  return;
                }
              }
              if (!io.field_g) {
                df.a(param1 ^ -17403, 0);
                if (var3 != 0) {
                  L45: {
                    var2 = hg.field_rb;
                    if (11 != (param0 ^ -1)) {
                      po.a((byte) -12, param0);
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  L46: {
                    if (0 == (param0 ^ -1)) {
                      w.field_m = 0;
                      df.a(-17306, 1);
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  L47: {
                    if (-1 == (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                      w.field_m = w.field_m & -9;
                      break L47;
                    } else {
                      break L47;
                    }
                  }
                  L48: {
                    if (-12 == param0) {
                      df.a(-17306, 0);
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    if (hg.field_rb != 0) {
                      break L49;
                    } else {
                      if (gh.a(-3, param1 + 11554)) {
                        df.a(-17306, jh.field_ic);
                        break L49;
                      } else {
                        if ((param0 ^ -1) == 13) {
                          df.a(-17306, jh.field_ic);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                    }
                  }
                  L50: {
                    if (1 != hg.field_rb) {
                      break L50;
                    } else {
                      if (gh.a(-8, 11653)) {
                        df.a(param1 ^ -17403, 2);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                  }
                  L51: {
                    if (2 != hg.field_rb) {
                      break L51;
                    } else {
                      if (!gh.a(-7, 11653)) {
                        break L51;
                      } else {
                        df.a(param1 + -17405, 3);
                        break L51;
                      }
                    }
                  }
                  L52: {
                    if ((hg.field_rb ^ -1) != -4) {
                      break L52;
                    } else {
                      if (gh.a(-3, 11653)) {
                        df.a(-17306, 4);
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                  }
                  L53: {
                    if (4 != hg.field_rb) {
                      break L53;
                    } else {
                      if (!gh.a(-13, 11653)) {
                        break L53;
                      } else {
                        df.a(param1 ^ -17403, 5);
                        break L53;
                      }
                    }
                  }
                  L54: {
                    if (5 != hg.field_rb) {
                      break L54;
                    } else {
                      if (!gh.a(-4, 11653)) {
                        break L54;
                      } else {
                        L55: {
                          if (-1 > (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                            break L55;
                          } else {
                            df.a(param1 + -17405, 7);
                            if (var3 == 0) {
                              break L54;
                            } else {
                              break L55;
                            }
                          }
                        }
                        df.a(param1 ^ -17403, 6);
                        break L54;
                      }
                    }
                  }
                  L56: {
                    if (hg.field_rb != 6) {
                      break L56;
                    } else {
                      if (!gh.a(-6, 11653)) {
                        break L56;
                      } else {
                        df.a(-17306, 7);
                        break L56;
                      }
                    }
                  }
                  L57: {
                    if (-8 != (hg.field_rb ^ -1)) {
                      break L57;
                    } else {
                      if (gh.a(-5, 11653)) {
                        df.a(-17306, 6);
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                  }
                  L58: {
                    L59: {
                      if (6 == hg.field_rb) {
                        break L59;
                      } else {
                        if ((hg.field_rb ^ -1) != -8) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    if (!gh.a(-6, 11653)) {
                      break L58;
                    } else {
                      if (!gh.a(-5, 11653)) {
                        break L58;
                      } else {
                        df.a(-17306, 8);
                        break L58;
                      }
                    }
                  }
                  L60: {
                    if (8 != hg.field_rb) {
                      break L60;
                    } else {
                      if (!gh.a(-9, 11653)) {
                        break L60;
                      } else {
                        L61: {
                          df.a(param1 + -17405, 9);
                          if (-10 != (hg.field_rb ^ -1)) {
                            break L61;
                          } else {
                            if (gh.a(-10, 11653)) {
                              df.a(-17306, 10);
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                        }
                        L62: {
                          if ((hg.field_rb ^ -1) != -11) {
                            break L62;
                          } else {
                            if (!gh.a(-11, 11653)) {
                              break L62;
                            } else {
                              df.a(-17306, 11);
                              break L62;
                            }
                          }
                        }
                        L63: {
                          if (hg.field_rb != 4) {
                            break L63;
                          } else {
                            if (gh.a(-3, param1 + 11554)) {
                              break L63;
                            } else {
                              df.a(-17306, 3);
                              break L63;
                            }
                          }
                        }
                        L64: {
                          if (hg.field_rb == var2) {
                            break L64;
                          } else {
                            L65: {
                              if (io.field_g) {
                                break L65;
                              } else {
                                if (-1 != (hg.field_rb ^ -1)) {
                                  break L64;
                                } else {
                                  break L65;
                                }
                              }
                            }
                            fb.field_e.c(true, hg.field_rb);
                            break L64;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L66: {
                    if (-10 != (hg.field_rb ^ -1)) {
                      break L66;
                    } else {
                      if (gh.a(-10, 11653)) {
                        df.a(-17306, 10);
                        break L66;
                      } else {
                        L67: {
                          if ((hg.field_rb ^ -1) != -11) {
                            break L67;
                          } else {
                            if (!gh.a(-11, 11653)) {
                              break L67;
                            } else {
                              df.a(-17306, 11);
                              break L67;
                            }
                          }
                        }
                        L68: {
                          if (hg.field_rb != 4) {
                            break L68;
                          } else {
                            if (gh.a(-3, param1 + 11554)) {
                              break L68;
                            } else {
                              df.a(-17306, 3);
                              break L68;
                            }
                          }
                        }
                        if (hg.field_rb != var2) {
                          L69: {
                            if (io.field_g) {
                              break L69;
                            } else {
                              if (-1 == (hg.field_rb ^ -1)) {
                                break L69;
                              } else {
                                return;
                              }
                            }
                          }
                          fb.field_e.c(true, hg.field_rb);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L70: {
                    if ((hg.field_rb ^ -1) != -11) {
                      break L70;
                    } else {
                      if (!gh.a(-11, 11653)) {
                        break L70;
                      } else {
                        L71: {
                          df.a(-17306, 11);
                          if (hg.field_rb != 4) {
                            break L71;
                          } else {
                            if (gh.a(-3, param1 + 11554)) {
                              break L71;
                            } else {
                              L72: {
                                df.a(-17306, 3);
                                if (hg.field_rb == var2) {
                                  break L72;
                                } else {
                                  if (io.field_g) {
                                    fb.field_e.c(true, hg.field_rb);
                                    return;
                                  } else {
                                    if (-1 != (hg.field_rb ^ -1)) {
                                      break L72;
                                    } else {
                                      fb.field_e.c(true, hg.field_rb);
                                      return;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        L73: {
                          if (hg.field_rb == var2) {
                            break L73;
                          } else {
                            if (io.field_g) {
                              fb.field_e.c(true, hg.field_rb);
                              return;
                            } else {
                              if (-1 != (hg.field_rb ^ -1)) {
                                break L73;
                              } else {
                                fb.field_e.c(true, hg.field_rb);
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L74: {
                    if (hg.field_rb != 4) {
                      break L74;
                    } else {
                      if (gh.a(-3, param1 + 11554)) {
                        break L74;
                      } else {
                        L75: {
                          df.a(-17306, 3);
                          if (hg.field_rb == var2) {
                            break L75;
                          } else {
                            if (io.field_g) {
                              fb.field_e.c(true, hg.field_rb);
                              return;
                            } else {
                              if (-1 != (hg.field_rb ^ -1)) {
                                break L75;
                              } else {
                                fb.field_e.c(true, hg.field_rb);
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L76: {
                    if (hg.field_rb == var2) {
                      break L76;
                    } else {
                      if (io.field_g) {
                        fb.field_e.c(true, hg.field_rb);
                        return;
                      } else {
                        if (-1 != (hg.field_rb ^ -1)) {
                          break L76;
                        } else {
                          fb.field_e.c(true, hg.field_rb);
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L77: {
              var2 = hg.field_rb;
              if (11 != (param0 ^ -1)) {
                po.a((byte) -12, param0);
                break L77;
              } else {
                break L77;
              }
            }
            L78: {
              if (0 == (param0 ^ -1)) {
                w.field_m = 0;
                df.a(-17306, 1);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              if (-1 == (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                w.field_m = w.field_m & -9;
                break L79;
              } else {
                break L79;
              }
            }
            L80: {
              if (-12 == param0) {
                df.a(-17306, 0);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              if (hg.field_rb != 0) {
                break L81;
              } else {
                if (gh.a(-3, param1 + 11554)) {
                  df.a(-17306, jh.field_ic);
                  break L81;
                } else {
                  if ((param0 ^ -1) == 13) {
                    df.a(-17306, jh.field_ic);
                    break L81;
                  } else {
                    break L81;
                  }
                }
              }
            }
            L82: {
              if (1 != hg.field_rb) {
                if (2 != hg.field_rb) {
                  break L82;
                } else {
                  if (!gh.a(-7, 11653)) {
                    break L82;
                  } else {
                    df.a(param1 + -17405, 3);
                    break L82;
                  }
                }
              } else {
                if (2 != hg.field_rb) {
                  break L82;
                } else {
                  if (!gh.a(-7, 11653)) {
                    break L82;
                  } else {
                    df.a(param1 + -17405, 3);
                    break L82;
                  }
                }
              }
            }
            L83: {
              if ((hg.field_rb ^ -1) != -4) {
                if (4 != hg.field_rb) {
                  break L83;
                } else {
                  if (!gh.a(-13, 11653)) {
                    break L83;
                  } else {
                    df.a(param1 ^ -17403, 5);
                    break L83;
                  }
                }
              } else {
                if (4 != hg.field_rb) {
                  break L83;
                } else {
                  if (!gh.a(-13, 11653)) {
                    break L83;
                  } else {
                    df.a(param1 ^ -17403, 5);
                    break L83;
                  }
                }
              }
            }
            L84: {
              if (5 == hg.field_rb) {
                if (gh.a(-4, 11653)) {
                  L85: {
                    if (-1 > (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                      break L85;
                    } else {
                      df.a(param1 + -17405, 7);
                      if (var3 != 0) {
                        break L85;
                      } else {
                        if (hg.field_rb != 6) {
                          break L84;
                        } else {
                          if (!gh.a(-6, 11653)) {
                            break L84;
                          } else {
                            df.a(-17306, 7);
                            break L84;
                          }
                        }
                      }
                    }
                  }
                  df.a(param1 ^ -17403, 6);
                  if (hg.field_rb != 6) {
                    break L84;
                  } else {
                    if (!gh.a(-6, 11653)) {
                      break L84;
                    } else {
                      df.a(-17306, 7);
                      break L84;
                    }
                  }
                } else {
                  if (hg.field_rb != 6) {
                    break L84;
                  } else {
                    if (!gh.a(-6, 11653)) {
                      break L84;
                    } else {
                      df.a(-17306, 7);
                      break L84;
                    }
                  }
                }
              } else {
                if (hg.field_rb != 6) {
                  break L84;
                } else {
                  if (!gh.a(-6, 11653)) {
                    break L84;
                  } else {
                    df.a(-17306, 7);
                    break L84;
                  }
                }
              }
            }
            L86: {
              if (-8 != (hg.field_rb ^ -1)) {
                break L86;
              } else {
                if (gh.a(-5, 11653)) {
                  df.a(-17306, 6);
                  break L86;
                } else {
                  break L86;
                }
              }
            }
            L87: {
              L88: {
                if (6 == hg.field_rb) {
                  break L88;
                } else {
                  if ((hg.field_rb ^ -1) != -8) {
                    break L87;
                  } else {
                    break L88;
                  }
                }
              }
              if (!gh.a(-6, 11653)) {
                break L87;
              } else {
                if (!gh.a(-5, 11653)) {
                  break L87;
                } else {
                  df.a(-17306, 8);
                  break L87;
                }
              }
            }
            L89: {
              if (8 != hg.field_rb) {
                break L89;
              } else {
                if (!gh.a(-9, 11653)) {
                  break L89;
                } else {
                  L90: {
                    df.a(param1 + -17405, 9);
                    if (-10 != (hg.field_rb ^ -1)) {
                      break L90;
                    } else {
                      if (gh.a(-10, 11653)) {
                        df.a(-17306, 10);
                        break L90;
                      } else {
                        break L90;
                      }
                    }
                  }
                  L91: {
                    if ((hg.field_rb ^ -1) != -11) {
                      break L91;
                    } else {
                      if (!gh.a(-11, 11653)) {
                        break L91;
                      } else {
                        df.a(-17306, 11);
                        break L91;
                      }
                    }
                  }
                  L92: {
                    if (hg.field_rb != 4) {
                      break L92;
                    } else {
                      if (gh.a(-3, param1 + 11554)) {
                        break L92;
                      } else {
                        df.a(-17306, 3);
                        break L92;
                      }
                    }
                  }
                  L93: {
                    if (hg.field_rb == var2) {
                      break L93;
                    } else {
                      L94: {
                        if (io.field_g) {
                          break L94;
                        } else {
                          if (-1 != (hg.field_rb ^ -1)) {
                            break L93;
                          } else {
                            break L94;
                          }
                        }
                      }
                      fb.field_e.c(true, hg.field_rb);
                      break L93;
                    }
                  }
                  return;
                }
              }
            }
            L95: {
              if (-10 != (hg.field_rb ^ -1)) {
                break L95;
              } else {
                if (gh.a(-10, 11653)) {
                  df.a(-17306, 10);
                  break L95;
                } else {
                  L96: {
                    if ((hg.field_rb ^ -1) != -11) {
                      break L96;
                    } else {
                      if (!gh.a(-11, 11653)) {
                        break L96;
                      } else {
                        df.a(-17306, 11);
                        break L96;
                      }
                    }
                  }
                  L97: {
                    if (hg.field_rb != 4) {
                      break L97;
                    } else {
                      if (gh.a(-3, param1 + 11554)) {
                        break L97;
                      } else {
                        df.a(-17306, 3);
                        break L97;
                      }
                    }
                  }
                  L98: {
                    if (hg.field_rb == var2) {
                      break L98;
                    } else {
                      L99: {
                        if (io.field_g) {
                          break L99;
                        } else {
                          if (-1 != (hg.field_rb ^ -1)) {
                            break L98;
                          } else {
                            break L99;
                          }
                        }
                      }
                      fb.field_e.c(true, hg.field_rb);
                      break L98;
                    }
                  }
                  return;
                }
              }
            }
            L100: {
              if ((hg.field_rb ^ -1) != -11) {
                break L100;
              } else {
                if (!gh.a(-11, 11653)) {
                  break L100;
                } else {
                  L101: {
                    df.a(-17306, 11);
                    if (hg.field_rb != 4) {
                      break L101;
                    } else {
                      if (gh.a(-3, param1 + 11554)) {
                        break L101;
                      } else {
                        df.a(-17306, 3);
                        break L101;
                      }
                    }
                  }
                  L102: {
                    if (hg.field_rb == var2) {
                      break L102;
                    } else {
                      L103: {
                        if (io.field_g) {
                          break L103;
                        } else {
                          if (-1 != (hg.field_rb ^ -1)) {
                            break L102;
                          } else {
                            break L103;
                          }
                        }
                      }
                      fb.field_e.c(true, hg.field_rb);
                      break L102;
                    }
                  }
                  return;
                }
              }
            }
            L104: {
              if (hg.field_rb != 4) {
                break L104;
              } else {
                if (gh.a(-3, param1 + 11554)) {
                  break L104;
                } else {
                  L105: {
                    df.a(-17306, 3);
                    if (hg.field_rb == var2) {
                      break L105;
                    } else {
                      L106: {
                        if (io.field_g) {
                          break L106;
                        } else {
                          if (-1 != (hg.field_rb ^ -1)) {
                            break L105;
                          } else {
                            break L106;
                          }
                        }
                      }
                      fb.field_e.c(true, hg.field_rb);
                      break L105;
                    }
                  }
                  return;
                }
              }
            }
            if (hg.field_rb != var2) {
              if (!io.field_g) {
                if (-1 == (hg.field_rb ^ -1)) {
                  fb.field_e.c(true, hg.field_rb);
                  return;
                } else {
                  return;
                }
              } else {
                fb.field_e.c(true, hg.field_rb);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          io.field_g = false;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                discarded$2 = iq.a(38, -116, 25);
                break L1;
              }
            }
            var3_int = 0;
            var4 = ce.field_k;
            L2: while (true) {
              L3: {
                if (var3_int >= hq.field_m.length) {
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  var5 = wd.field_Q[var3_int];
                  stackOut_5_0 = var5 ^ -1;
                  stackIn_15_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_6_0 > -1) {
                          break L5;
                        } else {
                          var6 = hn.a(0, hq.field_m[var3_int], true);
                          var7 = am.field_c + -(var6 >> -1877360671);
                          var4 = var4 + al.field_bb;
                          if (th.a(param0, var7 - no.field_Gb, param2, var6 - -(no.field_Gb << -1073271007), var4, (wk.field_G << -659720127) + me.field_h, -18)) {
                            stackOut_9_0 = var5;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var4 = var4 + (al.field_bb + (wk.field_G << -1187784735) + me.field_h);
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var4 = var4 + se.field_C;
                      break L4;
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "iq.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_e = 20;
        field_a = "Add friend";
        field_f = true;
        field_d = "You appear to be telling someone your password - please don't!";
    }
}
