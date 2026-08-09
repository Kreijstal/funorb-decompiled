/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static java.awt.Frame field_c;
    static nk field_e;
    static int field_b;
    static String field_d;
    static ck field_a;

    final static void a(boolean param0, int param1) {
        int var3;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (!param0) {
            if (null != cd.field_m) {
              L1: {
                L2: {
                  if (null == cd.field_m) {
                    break L2;
                  } else {
                    L3: {
                      if (0 < lg.field_W) {
                        break L3;
                      } else {
                        L4: {
                          if (0 < bf.field_r) {
                            break L4;
                          } else {
                            if (tg.field_e >= dl.field_M) {
                              break L1;
                            } else {
                              L5: {
                                if (tg.field_e == 0) {
                                  mg.b(0, false);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              tg.field_e = tg.field_e + 1;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        bf.field_r = bf.field_r - 1;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    lg.field_W = lg.field_W - 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L6: {
                  if (null == g.field_N) {
                    break L6;
                  } else {
                    L7: {
                      if (lg.field_W > 0) {
                        break L7;
                      } else {
                        L8: {
                          if ((tg.field_e ^ -1) < -1) {
                            break L8;
                          } else {
                            if (dl.field_M > bf.field_r) {
                              L9: {
                                if (0 != bf.field_r) {
                                  break L9;
                                } else {
                                  mg.b(param1 + 1843, true);
                                  break L9;
                                }
                              }
                              bf.field_r = bf.field_r + 1;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L8;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                        tg.field_e = tg.field_e - 1;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                    }
                    lg.field_W = lg.field_W - 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                }
                dn.field_k = false;
                if (-1 > (bf.field_r ^ -1)) {
                  bf.field_r = bf.field_r - 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    L10: {
                      L11: {
                        if (0 < lg.field_W) {
                          break L11;
                        } else {
                          L12: {
                            if ((bf.field_r ^ -1) < -1) {
                              break L12;
                            } else {
                              if (tg.field_e <= 0) {
                                break L10;
                              } else {
                                tg.field_e = tg.field_e - 1;
                                break L12;
                              }
                            }
                          }
                          bf.field_r = bf.field_r - 1;
                          if (var3 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      lg.field_W = lg.field_W - 1;
                      break L10;
                    }
                    L13: {
                      if (param1 == -1843) {
                        break L13;
                      } else {
                        field_b = -111;
                        break L13;
                      }
                    }
                    return;
                  }
                } else {
                  L14: {
                    if (tg.field_e > 0) {
                      break L14;
                    } else {
                      if (dl.field_M <= lg.field_W) {
                        break L1;
                      } else {
                        L15: {
                          if (-1 == (lg.field_W ^ -1)) {
                            tj.h((byte) -40);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        lg.field_W = lg.field_W + 1;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  tg.field_e = tg.field_e - 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    L16: {
                      L17: {
                        bf.field_r = bf.field_r - 1;
                        if (0 < lg.field_W) {
                          break L17;
                        } else {
                          L18: {
                            if ((bf.field_r ^ -1) < -1) {
                              break L18;
                            } else {
                              if (tg.field_e <= 0) {
                                break L16;
                              } else {
                                tg.field_e = tg.field_e - 1;
                                break L18;
                              }
                            }
                          }
                          bf.field_r = bf.field_r - 1;
                          if (var3 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      lg.field_W = lg.field_W - 1;
                      break L16;
                    }
                    L19: {
                      if (param1 == -1843) {
                        break L19;
                      } else {
                        field_b = -111;
                        break L19;
                      }
                    }
                    return;
                  }
                }
              }
              if (param1 != -1843) {
                field_b = -111;
                return;
              } else {
                return;
              }
            } else {
              dn.field_k = false;
              break L0;
            }
          } else {
            dn.field_k = false;
            break L0;
          }
        }
        L20: {
          if (param0) {
            if (0 < lg.field_W) {
              lg.field_W = lg.field_W - 1;
              if (param1 == -1843) {
                return;
              } else {
                field_b = -111;
                return;
              }
            } else {
              if ((bf.field_r ^ -1) < -1) {
                bf.field_r = bf.field_r - 1;
                if (var3 == 0) {
                  break L20;
                } else {
                  lg.field_W = lg.field_W - 1;
                  if (param1 == -1843) {
                    return;
                  } else {
                    field_b = -111;
                    return;
                  }
                }
              } else {
                if (tg.field_e <= 0) {
                  break L20;
                } else {
                  tg.field_e = tg.field_e - 1;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    bf.field_r = bf.field_r - 1;
                    lg.field_W = lg.field_W - 1;
                    if (param1 == -1843) {
                      return;
                    } else {
                      field_b = -111;
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (null != cd.field_m) {
              L21: {
                if (0 < lg.field_W) {
                  break L21;
                } else {
                  L22: {
                    if (0 < bf.field_r) {
                      break L22;
                    } else {
                      if (tg.field_e < dl.field_M) {
                        L23: {
                          if (tg.field_e == 0) {
                            mg.b(0, false);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        tg.field_e = tg.field_e + 1;
                        if (var3 != 0) {
                          break L22;
                        } else {
                          if (param1 != -1843) {
                            field_b = -111;
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (param1 != -1843) {
                          field_b = -111;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  bf.field_r = bf.field_r - 1;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              lg.field_W = lg.field_W - 1;
              if (var3 == 0) {
                break L20;
              } else {
                L24: {
                  if (null == g.field_N) {
                    break L24;
                  } else {
                    L25: {
                      if (lg.field_W > 0) {
                        break L25;
                      } else {
                        L26: {
                          if ((tg.field_e ^ -1) < -1) {
                            break L26;
                          } else {
                            if (dl.field_M > bf.field_r) {
                              L27: {
                                if (0 != bf.field_r) {
                                  break L27;
                                } else {
                                  mg.b(param1 + 1843, true);
                                  break L27;
                                }
                              }
                              bf.field_r = bf.field_r + 1;
                              if (var3 == 0) {
                                break L20;
                              } else {
                                break L26;
                              }
                            } else {
                              break L20;
                            }
                          }
                        }
                        tg.field_e = tg.field_e - 1;
                        if (var3 == 0) {
                          break L20;
                        } else {
                          break L25;
                        }
                      }
                    }
                    lg.field_W = lg.field_W - 1;
                    if (var3 == 0) {
                      break L20;
                    } else {
                      break L24;
                    }
                  }
                }
                dn.field_k = false;
                if (-1 > (bf.field_r ^ -1)) {
                  bf.field_r = bf.field_r - 1;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    L28: {
                      if (0 < lg.field_W) {
                        break L28;
                      } else {
                        L29: {
                          L30: {
                            if ((bf.field_r ^ -1) < -1) {
                              break L30;
                            } else {
                              if (tg.field_e <= 0) {
                                break L29;
                              } else {
                                tg.field_e = tg.field_e - 1;
                                break L30;
                              }
                            }
                          }
                          bf.field_r = bf.field_r - 1;
                          if (var3 == 0) {
                            break L29;
                          } else {
                            break L28;
                          }
                        }
                        if (param1 != -1843) {
                          field_b = -111;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                    L31: {
                      lg.field_W = lg.field_W - 1;
                      if (param1 == -1843) {
                        break L31;
                      } else {
                        field_b = -111;
                        break L31;
                      }
                    }
                    return;
                  }
                } else {
                  L32: {
                    if (tg.field_e > 0) {
                      break L32;
                    } else {
                      if (dl.field_M <= lg.field_W) {
                        break L20;
                      } else {
                        L33: {
                          if (-1 == (lg.field_W ^ -1)) {
                            tj.h((byte) -40);
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        lg.field_W = lg.field_W + 1;
                        if (var3 == 0) {
                          break L20;
                        } else {
                          break L32;
                        }
                      }
                    }
                  }
                  tg.field_e = tg.field_e - 1;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    L34: {
                      L35: {
                        bf.field_r = bf.field_r - 1;
                        if (0 < lg.field_W) {
                          break L35;
                        } else {
                          L36: {
                            if ((bf.field_r ^ -1) < -1) {
                              break L36;
                            } else {
                              if (tg.field_e <= 0) {
                                break L34;
                              } else {
                                tg.field_e = tg.field_e - 1;
                                break L36;
                              }
                            }
                          }
                          bf.field_r = bf.field_r - 1;
                          if (var3 == 0) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      lg.field_W = lg.field_W - 1;
                      break L34;
                    }
                    L37: {
                      if (param1 == -1843) {
                        break L37;
                      } else {
                        field_b = -111;
                        break L37;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              L38: {
                L39: {
                  if (null == g.field_N) {
                    break L39;
                  } else {
                    L40: {
                      if (lg.field_W > 0) {
                        break L40;
                      } else {
                        L41: {
                          if ((tg.field_e ^ -1) < -1) {
                            break L41;
                          } else {
                            if (dl.field_M > bf.field_r) {
                              L42: {
                                if (0 != bf.field_r) {
                                  break L42;
                                } else {
                                  mg.b(param1 + 1843, true);
                                  break L42;
                                }
                              }
                              bf.field_r = bf.field_r + 1;
                              if (var3 != 0) {
                                break L41;
                              } else {
                                if (param1 != -1843) {
                                  field_b = -111;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              break L38;
                            }
                          }
                        }
                        tg.field_e = tg.field_e - 1;
                        if (var3 != 0) {
                          break L40;
                        } else {
                          if (param1 != -1843) {
                            field_b = -111;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    lg.field_W = lg.field_W - 1;
                    if (var3 == 0) {
                      break L38;
                    } else {
                      break L39;
                    }
                  }
                }
                dn.field_k = false;
                if (-1 > (bf.field_r ^ -1)) {
                  bf.field_r = bf.field_r - 1;
                  if (var3 == 0) {
                    break L38;
                  } else {
                    L43: {
                      L44: {
                        if (0 < lg.field_W) {
                          break L44;
                        } else {
                          L45: {
                            if ((bf.field_r ^ -1) < -1) {
                              break L45;
                            } else {
                              if (tg.field_e <= 0) {
                                break L43;
                              } else {
                                tg.field_e = tg.field_e - 1;
                                break L45;
                              }
                            }
                          }
                          bf.field_r = bf.field_r - 1;
                          if (var3 == 0) {
                            break L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                      lg.field_W = lg.field_W - 1;
                      break L43;
                    }
                    L46: {
                      if (param1 == -1843) {
                        break L46;
                      } else {
                        field_b = -111;
                        break L46;
                      }
                    }
                    return;
                  }
                } else {
                  L47: {
                    if (tg.field_e > 0) {
                      break L47;
                    } else {
                      if (dl.field_M <= lg.field_W) {
                        break L38;
                      } else {
                        L48: {
                          if (-1 == (lg.field_W ^ -1)) {
                            tj.h((byte) -40);
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        lg.field_W = lg.field_W + 1;
                        if (var3 == 0) {
                          break L38;
                        } else {
                          break L47;
                        }
                      }
                    }
                  }
                  tg.field_e = tg.field_e - 1;
                  if (var3 == 0) {
                    break L38;
                  } else {
                    L49: {
                      L50: {
                        bf.field_r = bf.field_r - 1;
                        if (0 < lg.field_W) {
                          break L50;
                        } else {
                          L51: {
                            if ((bf.field_r ^ -1) < -1) {
                              break L51;
                            } else {
                              if (tg.field_e <= 0) {
                                break L49;
                              } else {
                                tg.field_e = tg.field_e - 1;
                                break L51;
                              }
                            }
                          }
                          bf.field_r = bf.field_r - 1;
                          if (var3 == 0) {
                            break L49;
                          } else {
                            break L50;
                          }
                        }
                      }
                      lg.field_W = lg.field_W - 1;
                      break L49;
                    }
                    L52: {
                      if (param1 == -1843) {
                        break L52;
                      } else {
                        field_b = -111;
                        break L52;
                      }
                    }
                    return;
                  }
                }
              }
              if (param1 != -1843) {
                field_b = -111;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param1 == -1843) {
          return;
        } else {
          field_b = -111;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 59) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        hg.a(true, -112);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == gn.field_e) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (gn.field_e.length <= te.field_w) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6_int = te.field_w * 2;
                        if (var6_int == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6_int = 80;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = new int[var6_int];
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (te.field_w <= var8) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7[var8] = gn.field_e[var8];
                        var8++;
                        if (var9 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        gn.field_e = var7;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        fieldTemp$5 = te.field_w;
                        te.field_w = te.field_w + 1;
                        gn.field_e[fieldTemp$5] = param2;
                        fieldTemp$6 = te.field_w;
                        te.field_w = te.field_w + 1;
                        gn.field_e[fieldTemp$6] = param1;
                        fieldTemp$7 = te.field_w;
                        te.field_w = te.field_w + 1;
                        gn.field_e[fieldTemp$7] = param5;
                        fieldTemp$8 = te.field_w;
                        te.field_w = te.field_w + 1;
                        gn.field_e[fieldTemp$8] = param4;
                        fieldTemp$9 = te.field_w;
                        te.field_w = te.field_w + 1;
                        gn.field_e[fieldTemp$9] = param3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) runtimeException), "hg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 87) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_d = "Activating Special Items";
    }
}
