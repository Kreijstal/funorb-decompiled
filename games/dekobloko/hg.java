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
        int var3 = 0;
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
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 59) {
                break L1;
              } else {
                hg.a(true, -112);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (null == gn.field_e) {
                    break L4;
                  } else {
                    if (gn.field_e.length <= te.field_w) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  var6_int = te.field_w * 2;
                  if (var6_int == 0) {
                    var6_int = 80;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7 = new int[var6_int];
                var8 = 0;
                L6: while (true) {
                  L7: {
                    if (te.field_w <= var8) {
                      break L7;
                    } else {
                      var7[var8] = gn.field_e[var8];
                      var8++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  gn.field_e = var7;
                  break L3;
                }
              }
              fieldTemp$10 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$10] = param2;
              fieldTemp$11 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$11] = param1;
              fieldTemp$12 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$12] = param5;
              fieldTemp$13 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$13] = param4;
              fieldTemp$14 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$14] = param3;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "hg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
